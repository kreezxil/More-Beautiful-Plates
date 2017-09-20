package com.kreezcraft.morebeautifulplates;

import com.kreezcraft.morebeautifulplates.client.MoreBeautifulPlatesTab;
import com.kreezcraft.morebeautifulplates.proxy.CommonProxy;
import com.kreezcraft.morebeautifulplates.recipes.ModRecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreBeautifulPlates.MODID, name = MoreBeautifulPlates.NAME, version = MoreBeautifulPlates.VERSION)
public class MoreBeautifulPlates {

	public static final String MODID = "morebeautifulplates";
	public static final String NAME = "More Beautiful Plates";
	public static final String VERSION = "1.12.2-1.0.3";

	@Mod.Instance(MODID)
	public static MoreBeautifulPlates instance;

	public static final MoreBeautifulPlatesTab creativeTab = new MoreBeautifulPlatesTab("More Beautiful Plates");
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@SidedProxy(serverSide = "com.kreezcraft.morebeautifulplates.proxy.CommonProxy", clientSide = "com.kreezcraft.morebeautifulplates.proxy.ClientProxy")
	public static CommonProxy proxy;

}