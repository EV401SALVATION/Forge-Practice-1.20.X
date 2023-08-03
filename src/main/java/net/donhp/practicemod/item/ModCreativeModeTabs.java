package net.donhp.practicemod.item;

import net.donhp.practicemod.PracticeMod;
import net.donhp.practicemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MINERALS_TAB = CREATIVE_MODE_TABS.register("minerals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.minerals_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());
                    }))
                    .build());

    public static final RegistryObject<CreativeModeTab> HIVE_TAB = CREATIVE_MODE_TABS.register("hive_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SILK_BLOCK.get()))
                    .title(Component.translatable("creativetab.hive_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.SILK_BLOCK.get());
                        pOutput.accept(ModBlocks.SILK_FLOOR.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
