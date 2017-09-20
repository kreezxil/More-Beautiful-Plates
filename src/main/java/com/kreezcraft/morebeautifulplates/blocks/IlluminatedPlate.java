package com.kreezcraft.morebeautifulplates.blocks;

import com.kreezcraft.morebeautifulplates.MoreBeautifulPlates;
import com.kreezcraft.morebeautifulplates.client.IHasModel;
import com.kreezcraft.morebeautifulplates.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class IlluminatedPlate extends BlockPressurePlate implements IHasModel {
	
	protected String name;

	public IlluminatedPlate(String name) {
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

	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
		return 15;
	}

	
}
