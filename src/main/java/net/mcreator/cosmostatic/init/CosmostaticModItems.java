
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cosmostatic.item.DarkmatterItem;
import net.mcreator.cosmostatic.item.DarkMatterScytheItem;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CosmostaticMod.MODID);
	public static final RegistryObject<Item> DARKMATTER = REGISTRY.register("darkmatter", () -> new DarkmatterItem());
	public static final RegistryObject<Item> DARKMATTERBLOCK = block(CosmostaticModBlocks.DARKMATTERBLOCK, null);
	public static final RegistryObject<Item> DARK_MATTER_SCYTHE = REGISTRY.register("dark_matter_scythe", () -> new DarkMatterScytheItem());
	public static final RegistryObject<Item> DARKMATTERWISP = REGISTRY.register("darkmatterwisp_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmostaticModEntities.DARKMATTERWISP, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PARTICLEACCELERATOR = block(CosmostaticModBlocks.PARTICLEACCELERATOR, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}