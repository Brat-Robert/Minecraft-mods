package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.custom.FuelItem;
import com.example.examplemod.item.custom.MetalDetectorItem;
import com.example.examplemod.item.custom.ModFoods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> ANCIENTSTONE = ITEMS.register("ancientstone",

            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",

            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELLSTONE = ITEMS.register("hellstone",

            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",

            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy",

            () -> new Item(new Item.Properties().food(ModFoods.CANDY)));
    public static final RegistryObject<Item> GRENADE = ITEMS.register("grenade",

            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",

            () -> new FuelItem(new Item.Properties(),400));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 9, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENTSTONE_SWORD = ITEMS.register("ancientstone_sword",
            () -> new SwordItem(ModToolTiers.ANCIENTSTONE, 9999999, 2, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENTSTONE_PICKAXE = ITEMS.register("ancientstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANCIENTSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENTSTONE_AXE = ITEMS.register("ancientstone_axe",
            () -> new AxeItem(ModToolTiers.ANCIENTSTONE, 99, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENTSTONE_SHOVEL = ITEMS.register("ancientstone_shovel",
            () -> new ShovelItem(ModToolTiers.ANCIENTSTONE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENTSTONE_HOE = ITEMS.register("ancientstone_hoe",
            () -> new HoeItem(ModToolTiers.ANCIENTSTONE, 0, 0, new Item.Properties()));



   //         () -> new MetalDetectorItem(new Item.Properties().durability(100)));
 public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
