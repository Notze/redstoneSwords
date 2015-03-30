package io.github.notze.mc_redstoneSwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class Values{
		
	static Material scrollMaterial = Material.PAPER;
	static String scrollFireballName = "Scroll of Fireball";
	static String scrollCropName = "Scroll of Growth";
	
	static Material swordMaterial = RedstoneSwords.swordMaterial;
	static String swordName = "Redstone Sword";
	
	static String redstoneLore = "Redstone: ";
	static String expLore = "Experience: ";
	@SuppressWarnings("serial")
	static HashMap<Integer,String> lores = new HashMap<Integer,String>(){{
		put(0,redstoneLore);
		put(1,expLore);
	}};
	static int loreLength = lores.size();
	
	
	public static ItemStack getScrollFireball(){
		ItemStack scroll = new ItemStack(scrollMaterial);
		ItemMeta im = scroll.getItemMeta();
		
		im.setDisplayName(scrollFireballName);
		
		scroll.setItemMeta(im);
		return scroll;
	}
	
	public static ItemStack getScrollCrop(){
		ItemStack scroll = new ItemStack(scrollMaterial);
		ItemMeta im = scroll.getItemMeta();
		
		im.setDisplayName(scrollCropName);
		
		scroll.setItemMeta(im);
		return scroll;
	}
	
	public static ItemStack getInitSword(){
		ItemStack sword = new ItemStack(swordMaterial);
		ItemMeta initMeta = sword.getItemMeta();
		
		initMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		initMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		initMeta.setDisplayName(swordName);
		
		List<String> outputLores = new ArrayList<String>();
		for(int i=0; i<loreLength; i++){
			outputLores.add(lores.get(i)+"0");
		}
		
		initMeta.setLore(outputLores);
		sword.setItemMeta(initMeta);
		
		return sword;
	}

}