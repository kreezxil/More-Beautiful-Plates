package com.kreezcraft.morebeautifulplates.client;

import com.kreezcraft.morebeautifulplates.MoreBeautifulPlates;
import com.kreezcraft.morebeautifulplates.blocks.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreBeautifulPlatesTab extends CreativeTabs {

	public MoreBeautifulPlatesTab(String label) {
		super(MoreBeautifulPlates.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitBlocks.CYAN_GLAZED_TERRACOTTA_PLATE);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}
