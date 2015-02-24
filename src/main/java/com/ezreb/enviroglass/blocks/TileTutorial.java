package com.ezreb.enviroglass.blocks;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileTutorial extends TileEntity {
	private String myString = null;

	public String getValue() {
	    return myString;
	}

	public void setValue(String value) {
	    myString = value;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound arg0) {
		// TODO Auto-generated method stub
		super.readFromNBT(arg0);
		setValue(arg0.getString("player"));
	}
	@Override
	public void writeToNBT(NBTTagCompound arg0) {
		// TODO Auto-generated method stub
		arg0.setString("player", getValue());
		super.writeToNBT(arg0);
	}
}

