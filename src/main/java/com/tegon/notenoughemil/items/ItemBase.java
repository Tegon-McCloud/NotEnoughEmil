package com.tegon.notenoughemil.items;

import com.tegon.notenoughemil.init.ModItems;
import com.tegon.notenoughemil.main.NotEnoughEmil;
import com.tegon.notenoughemil.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(NotEnoughEmil.creativeTab);
		
		ModItems.MOD_ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() {
		NotEnoughEmil.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
