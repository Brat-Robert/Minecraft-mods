package com.example.examplemod.item;


import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(ExampleMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ANCIENTSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 9988, 6f, 9f, 37,
                    ModTags.Blocks.NEEDS_ANCIENTSTONE_TOOL, () -> Ingredient.of(ModItems.ANCIENTSTONE.get())),
            new ResourceLocation(ExampleMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());


}
