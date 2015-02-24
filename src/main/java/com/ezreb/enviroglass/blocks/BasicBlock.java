package com.ezreb.enviroglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {

	protected BasicBlock(Material arg0) {
		super(arg0);
		setBlockName("Basic Block").setBlockTextureName("enviroglass:tutorialBlock").setCreativeTab(CreativeTabs.tabRedstone);
	}

}
