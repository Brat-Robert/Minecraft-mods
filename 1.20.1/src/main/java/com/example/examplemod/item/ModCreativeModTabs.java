package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);
             DeferredRegister.create(Registries.ANTIENT_RUNE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ANTIENT_RUNE_TAB = CREATIVE_MODE_TABS.register("ancient_rune_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANCIENT_RUNE.get()))
                    .title(Component.translatable("creativetab.ancient_rune_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.ANCIENTSTONE.get());
                    }

    public static final RegistryObject<CreativeModeTab> EXAMPLEMOD_TAB = CREATIVE_MODE_TABS.register("examplemod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.examplemod_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METALL_DETECTOR.get());
                        pOutput.accept(ModItems.CANDY.get());
                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.GRENADE.get());


                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.FIREWORK.get());

                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(ModItems.HELLSTONE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.HELLSTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                    })

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
        ANTIENT_RUNE_TAB.register(eventBus);
    }
}
