package com.ghostjob.rghostutil.items;

import com.ghostjob.rghostutil.Main;
import com.ghostjob.rghostutil.init.ModItems;
import com.ghostjob.rghostutil.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
	   setUnlocalizedName(name);
	   setRegistryName(name);
	   setCreativeTab(CreativeTabs.MISC);
	   
	   ModItems.ITEMS.add(this);
	   
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRederer(this, 0, "inventory");
		
		
	}

}
