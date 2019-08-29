package com.tegon.notenoughemil.blocks;

import com.tegon.notenoughemil.init.ModBlocks;
import com.tegon.notenoughemil.init.ModItems;
import com.tegon.notenoughemil.main.NotEnoughEmil;
import com.tegon.notenoughemil.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material m) {
		super(m);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(NotEnoughEmil.creativeTab);
		
		ModBlocks.MOD_BLOCKS.add(this);
		ModItems.MOD_ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		NotEnoughEmil.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
