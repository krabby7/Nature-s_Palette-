package net.krabby7.natures_palette.item;

import net.krabby7.natures_palette.NaturesPalette;
import net.krabby7.natures_palette.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NaturesPalette.MOD_ID);

    public static final Supplier<CreativeModeTab> NATURES_PALETTE_TAB =
            CREATIVE_MODE_TABS.register("natures_palette_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.natures_palette.natures_palette_tab"))
                    .icon(() -> new ItemStack(ModBlocks.CHARTREUSE_WOOL.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.CHARTREUSE_WOOL);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}