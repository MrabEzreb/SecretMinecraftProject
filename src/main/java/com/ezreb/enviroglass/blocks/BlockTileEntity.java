package com.ezreb.enviroglass.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BlockTileEntity extends BlockContainer {

    public BlockTileEntity() {
        super(Material.iron);
        this.setBlockName("tutorialTE");
        this.setBlockTextureName("enviroglass:tutorialBlock");
        this.setHardness(12.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
    	TileTutorial t = new TileTutorial();
        return t;
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote && world.getTileEntity(x,y,z) != null && world.getTileEntity(x,y,z) instanceof TileTutorial) {
            if(((TileTutorial)world.getTileEntity(x,y,z)).getValue() == null) {
            	((TileTutorial)world.getTileEntity(x,y,z)).setValue(player.getDisplayName());
            	player.addChatMessage(new ChatComponentText("Set the owner of this block to "+((TileTutorial)world.getTileEntity(x,y,z)).getValue()));
            } else if(player.getDisplayName().equals(((TileTutorial)world.getTileEntity(x,y,z)).getValue()) && player.isSneaking() == true) {
            	((TileTutorial)world.getTileEntity(x,y,z)).setValue(null);
            	player.addChatMessage(new ChatComponentText("You are no longer the owner of this block"));
            } else {
            	player.addChatMessage(new ChatComponentText("This block belongs to "+((TileTutorial)world.getTileEntity(x,y,z)).getValue()));
            }
        }
        return true;
    }
}
