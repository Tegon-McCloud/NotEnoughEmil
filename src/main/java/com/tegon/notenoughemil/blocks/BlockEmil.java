package com.tegon.notenoughemil.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class BlockEmil extends BlockBase {

	public BlockEmil(String name) {
		super(name, Material.IRON);

		setSoundType(SoundType.SLIME);
		setHarvestLevel("pickaxe", 3);
		setHardness(3f);		
	}

}

