package com.iliad.smokelesspowder.init;

import com.iliad.smokelesspowder.init.Init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Items;

public class ItemInit extends Init {
    public ItemInit() {
        super(ForgeRegistries.ITEMS);
    }

    // This adds a creative tab to the mod.
    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        // This is the icon for the creative tab.
        public ItemStack makeIcon() {
            return new ItemStack(Items.SKELETON_SKULL);
        }

        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length,
                "smokeless_powder_tab");

    }

}
