package com.tegon.notenoughemil.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	
	public static void init() {
		
		addOre(ModBlocks.blockEmil, 0, "blockEmil");
		
	}
	
    private static void addOre(Item item, int meta, String name) {
        addOre(new ItemStack(item, 1, meta), name);
    }

    private static void addOre(Item item, String name) {
        addOre(item, 0, name);
    }

    private static void addOre(Block block, int meta, String name) {
        addOre(new ItemStack(block, 1, meta), name);
    }

    private static void addOre(ItemStack stack, String name) {
        OreDictionary.registerOre(name, stack);
    }
	
}
