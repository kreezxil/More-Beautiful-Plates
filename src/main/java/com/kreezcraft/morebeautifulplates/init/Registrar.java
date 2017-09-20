package com.kreezcraft.morebeautifulplates.init;

import com.kreezcraft.morebeautifulplates.blocks.InitBlocks;
import com.kreezcraft.morebeautifulplates.client.IHasModel;
import com.kreezcraft.morebeautifulplates.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class Registrar {

	@SubscribeEvent
	public static void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(InitItems.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRegister(Register<Block> event) {
		event.getRegistry().registerAll(InitBlocks.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent e) {
		for (Item i : InitItems.ITEMS) {
			if (i instanceof IHasModel)
				((IHasModel) i).registerModels();
		}
		for (Block b : InitBlocks.BLOCKS) {
			if (b instanceof IHasModel)
				((IHasModel) b).registerModels();
		}
	}

 /*   @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
    	//remove the vanilla recipes for these plates else the new plates will not be formed
    	ResourceLocation WoodenPP = new ResourceLocation("minecraft:wooden_pressure_plate");
    	ResourceLocation StonePP = new ResourceLocation("minecraft:stone_pressure_plate");
    	ResourceLocation LWPP = new ResourceLocation("minecraft:light_weighted_pressure_plate");
    	ResourceLocation HWPP = new ResourceLocation("minecraft:heavy_weighted_pressure_plate");

    	IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        
    	modRegistry.remove(WoodenPP);
        modRegistry.remove(StonePP);
        modRegistry.remove(LWPP);
        modRegistry.remove(HWPP);
        
    }
*/}
