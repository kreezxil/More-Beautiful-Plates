package com.kreezcraft.morebeautifulplates.blocks;

import com.kreezcraft.morebeautifulplates.MoreBeautifulPlates;
import com.kreezcraft.morebeautifulplates.client.IHasModel;
import com.kreezcraft.morebeautifulplates.items.InitItems;

import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Light_Weighted_Plate extends BlockPressurePlateWeighted implements IHasModel {
	
	protected String name;

	public Light_Weighted_Plate(String name) {
		super(Material.WOOD, 7);
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