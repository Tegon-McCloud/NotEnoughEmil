package com.tegon.notenoughemil.blocks;

import com.tegon.notenoughemil.init.ModBlocks;
import com.tegon.notenoughemil.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.datafix.fixes.ItemIntIDToString;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid extends BlockFluidClassic {

	public BlockFluid(String name, Fluid f, Material m) {
		super(f, m);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.MOD_BLOCKS.add(this);
		ModItems.MOD_ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}
	
}
