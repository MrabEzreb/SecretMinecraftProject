package com.ezreb.enviroglass.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class Implant extends Item {
	
	public enum ImplantType {
		
		DATA("Data");
		
		public String name;
		private ImplantType(String name) {
			this.name = name;
		}
		
	}
	public ImplantType type;
	public NBTTagCompound data = new NBTTagCompound();
	public Implant(ImplantType type) {
		this.type = type;
		setUnlocalizedName("implant"+type.name);
	}
	public void setData() {
		data.setString("ImplantType", this.type.name);
	}
}
