package com.tegon.notenoughemil.blocks;

import java.util.Random;

import com.tegon.notenoughemil.main.NotEnoughEmil;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StandardBlock extends Block {
	
	private ItemBlock itemBlock;
	private BlockRenderLayer renderLayer;
	
	public StandardBlock(Material m) {
		super(m);
		setCreativeTab(NotEnoughEmil.creativeTab);
	}
	
	public void setBlockRenderLayer(BlockRenderLayer renderLayer)
	{
		this.renderLayer = renderLayer;
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return itemBlock;
	}
	
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getRenderLayer() {
		return renderLayer;
	}
}
