package com.tegon.notenoughemil.init;

import java.util.ArrayList;
import java.util.List;

import com.tegon.notenoughemil.items.ItemBase;
import com.tegon.notenoughemil.items.ItemEmil;

import net.minecraft.item.Item;
import net.minecraft.item.ItemEgg;

public class ModItems {
	
	public static final List<Item> MOD_ITEMS = new ArrayList<>();
	
	public static Item itemEmil;
	
	public static void init() {
		itemEmil = new ItemEmil("emil");
	}
	
}
