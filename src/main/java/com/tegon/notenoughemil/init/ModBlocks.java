package com.tegon.notenoughemil.init;

import java.util.ArrayList;
import java.util.List;

import com.tegon.notenoughemil.blocks.BlockBase;
import com.tegon.notenoughemil.blocks.BlockCompressedEmil;
import com.tegon.notenoughemil.blocks.BlockEmil;
import com.tegon.notenoughemil.blocks.BlockFluid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> MOD_BLOCKS = new ArrayList<>();
	
	public static Block blockEmil;
	public static Block blockCompressedEmil;
	
	// fluid blocks
	public static Block moltenRmilBlock = new BlockFluid("molten_emil", ModFluids.fluidMoltenEmil, Material.LAVA);
	
	public static void init() {
		
		blockEmil = new BlockEmil("emil_block");
		blockCompressedEmil = new BlockCompressedEmil("compressed_emil_block");
		
		
	}
	
}
