package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.custom.FuelItem;
import com.example.examplemod.item.custom.MetalDetectorItem;
import com.example.examplemod.item.custom.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);


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
    static final RegistryObject<Item> METALL_DETECTOR  = ITEMS.register("metall_detector",

            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
 public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
