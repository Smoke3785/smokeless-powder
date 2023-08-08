package com.iliad.smokelesspowder.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit extends Init {
    public BlockInit() {
        super(ForgeRegistries.BLOCKS);
    }

    // This listens for the register event for blocks, and registers a block item
    // for each block.
    @SubscribeEvent
    public void onRegisterItems(final RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.ITEMS)) {
            super.getRegister().getEntries().forEach((blockRegistryObject) -> {
                Block block = (Block) blockRegistryObject.get();
                Item.Properties properties = new Item.Properties()
                        .tab(ItemInit.ModCreativeTab.instance);
                Supplier<Item> blockItemFactory = () -> new BlockItem(block, properties);

                event.register(ForgeRegistries.Keys.ITEMS, blockRegistryObject.getId(),
                        blockItemFactory);
            });
        }
    }

}
