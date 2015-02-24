package com.ezreb.enviroglass.blocks;

import com.ezreb.enviroglass.tiles.GetImplant;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block tutorialBlock;
	public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock(Material.iron), "tutorialBlock");
        GameRegistry.registerBlock(new BlockTileEntity(), "tutorialTE");
        GameRegistry.registerTileEntity(TileTutorial.class, "TileTutorial");
        GameRegistry.registerBlock(new BlockScannerTE(), "ImplantScanner");
        GameRegistry.registerTileEntity(GetImplant.class, "GetImplant");
	}
}
