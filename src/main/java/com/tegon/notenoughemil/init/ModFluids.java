package com.tegon.notenoughemil.init;

import java.util.ArrayList;
import java.util.List;

import com.tegon.notenoughemil.fluids.FluidMoltenEmil;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
	
	public static List<Fluid> MOD_FLUIDS = new ArrayList<Fluid>();
	
	public static Fluid fluidMoltenEmil;
	
	public static void init() {
		fluidMoltenEmil = new FluidMoltenEmil("molten_emil", new ResourceLocation("notenoughemil:blocks/molten_emil_still"), new ResourceLocation("notenoughemil:blocks/molten_emil_flow"));
	}
	
	public static void registerFluids() {
		for(Fluid f : MOD_FLUIDS) {
			registerFluid(f);
		}
	}
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluidMoltenEmil);
	}
	
}
