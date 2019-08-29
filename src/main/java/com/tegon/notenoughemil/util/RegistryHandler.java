package com.tegon.notenoughemil.util;

import com.tegon.notenoughemil.init.ModBlocks;
import com.tegon.notenoughemil.init.ModItems;
import com.tegon.notenoughemil.init.ModOreDict;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(Register<Item> e) {
		ModItems.init();
		
		e.getRegistry().registerAll(ModItems.MOD_ITEMS.toArray(new Item[0]));
		ModOreDict.init();
	}
	
	@SubscribeEvent
	public static void onBlockRegister(Register<Block> e) {
		ModBlocks.init();
		
		e.getRegistry().registerAll(ModBlocks.MOD_BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent e) {
		for(Item i : ModItems.MOD_ITEMS) {
			if(i instanceof IHasModel) {
				((IHasModel)i).registerModels();
			}
		}
		
		for(Block b : ModBlocks.MOD_BLOCKS) {
			if(b instanceof IHasModel) {
				((IHasModel)b).registerModels();
			}
		}
		
	}
	
}
