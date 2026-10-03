package com.darkfantasy;

import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class ModItems {
	// 3 original swords: balanced, heavy, fast
	public static final Item ASHEN_FANG = register("ashen_fang",
		p -> new Item(p.sword(ToolMaterial.IRON, 3.0f, -2.4f)));
	public static final Item GRAVEWAKE_BLADE = register("gravewake_blade",
		p -> new Item(p.sword(ToolMaterial.DIAMOND, 4.0f, -3.0f)));
	public static final Item DUSKTHORN = register("duskthorn",
		p -> new Item(p.sword(ToolMaterial.IRON, 2.0f, -1.6f)));

	private static Item register(String name, Function<Item.Properties, Item> factory) {
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM,
			Identifier.fromNamespaceAndPath(DarkFantasyMod.MOD_ID, name));
		return Registry.register(BuiltInRegistries.ITEM, key, factory.apply(new Item.Properties().setId(key)));
	}

	public static void init() {
	}
}
