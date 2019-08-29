package com.tegon.notenoughemil.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCompressedEmil extends BlockBase {

	public BlockCompressedEmil(String name) {
		super(name, Material.IRON);
		
		setSoundType(SoundType.SLIME);
		setHarvestLevel("pickaxe", 3);
		setHardness(6f);
	}
	
	
	
}
