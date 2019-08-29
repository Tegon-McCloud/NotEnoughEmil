package com.tegon.notenoughemil.fluids;

import net.minecraft.util.ResourceLocation;

public class FluidMoltenEmil extends FluidBase{

	public FluidMoltenEmil(String name, ResourceLocation still, ResourceLocation flow) {
		super(name, still, flow);
		
		setViscosity(1000);
		setLuminosity(10);
	}
	
}
