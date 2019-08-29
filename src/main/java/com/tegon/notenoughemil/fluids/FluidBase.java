package com.tegon.notenoughemil.fluids;

import com.tegon.notenoughemil.init.ModFluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid {

	public FluidBase(String name, ResourceLocation still, ResourceLocation flow) {
		super(name, still, flow);
		
		setUnlocalizedName(name);
		
		ModFluids.MOD_FLUIDS.add(this);
	}
	
	
}
