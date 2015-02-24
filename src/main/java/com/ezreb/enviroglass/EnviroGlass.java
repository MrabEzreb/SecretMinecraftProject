package com.ezreb.enviroglass;

import com.ezreb.enviroglass.blocks.ModBlocks;
import com.ezreb.enviroglass.items.ModItems;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import enviromine.core.EM_Settings;

@Mod(modid = EnviroGlass.MODID, version = EnviroGlass.VERSION)
public class EnviroGlass {
    public static final String MODID = "EnviroGlass";
    public static final String VERSION = "-1.0";
    public static final boolean enviromineLoaded = Loader.isModLoaded("enviromine");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ModBlocks.init();
    	ModItems.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
		
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	System.out.println("Enviromine! Oh enviromine! Where are you!");
    	if(enviromineLoaded == true) {
    		System.out.println("Ah, there you are, do you want to hear a secret?");
    		System.out.println("You are a great mod! :D");
    	}
    	
    }

}
