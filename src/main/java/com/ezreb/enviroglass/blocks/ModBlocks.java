package com.ezreb.enviroglass.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block tutorialBlock;
	public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock(Material.iron), "tutorialBlock");
        GameRegistry.registerBlock(new BlockTileEntity(), "tutorialTE");
        GameRegistry.registerTileEntity(TileTutorial.class, "TileTutorial");
	}
}
