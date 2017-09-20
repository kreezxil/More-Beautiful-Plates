package com.kreezcraft.morebeautifulplates.items;

import com.kreezcraft.morebeautifulplates.MoreBeautifulPlates;
import com.kreezcraft.morebeautifulplates.client.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(MoreBeautifulPlates.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
	}

	public void registerItemModel() {
		MoreBeautifulPlates.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		MoreBeautifulPlates.proxy.registerItemRenderer(this, 0, "inventory");
	}

}