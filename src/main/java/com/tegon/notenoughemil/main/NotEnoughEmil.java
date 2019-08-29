package com.tegon.notenoughemil.main;

import com.tegon.notenoughemil.proxy.CommonProxy;
import com.tegon.notenoughemil.util.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION)
public class NotEnoughEmil
{
	
	@Instance(Reference.MOD_ID)
	public static NotEnoughEmil instance;
	
	@SidedProxy(clientSide = Reference.PROXY_CLIENT_CLASS, serverSide = Reference.PROXY_COMMON_CLASS)
	public static CommonProxy proxy;
	
	
	public static final CreativeTabs creativeTab = new NEETab("not_enough_emil");
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		RegistryHandler.preInitRegistries(e);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		// some example code
		System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	
}
