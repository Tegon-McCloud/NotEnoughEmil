package com.tegon.notenoughemil.proxy;

import com.tegon.notenoughemil.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

	public void onPreInitialization(FMLPreInitializationEvent event) {}
	
	public void onInitialization(FMLInitializationEvent event) {}
	
	public void onPostInitialization(FMLPostInitializationEvent event) {}

	public void spawnCustomParticle(String particleName, World world, double x, double y, double z, double vecX, double vecY, double vecZ) {}

	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
}