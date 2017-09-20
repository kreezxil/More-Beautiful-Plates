package com.kreezcraft.morebeautifulplates.blocks;

import com.kreezcraft.morebeautifulplates.MoreBeautifulPlates;
import com.kreezcraft.morebeautifulplates.client.IHasModel;
import com.kreezcraft.morebeautifulplates.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class StonePlate extends BlockPressurePlate implements IHasModel {
	
	protected String name;

	public StonePlate(String name) {
		super(Material.WOOD, BlockPressurePlate.Sensitivity.MOBS);
		this.name = name;
		setUnlocalizedName(MoreBeautifulPlates.MODID + "." + name);
		setCreativeTab(MoreBeautifulPlates.creativeTab);
		setHarvestLevel("pickaxe", 0);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		MoreBeautifulPlates.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	
}
