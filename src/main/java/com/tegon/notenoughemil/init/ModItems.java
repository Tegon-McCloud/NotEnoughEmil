package com.tegon.notenoughemil.init;

import java.util.ArrayList;
import java.util.List;

import com.tegon.notenoughemil.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> MOD_ITEMS = new ArrayList<>();
	
	static {
		new ItemBase("emil");
	}
	
	
}
