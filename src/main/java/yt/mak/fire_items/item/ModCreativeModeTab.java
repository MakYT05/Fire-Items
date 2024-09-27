package yt.mak.fire_items.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB = new CreativeModeTab("FIRE") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OGNIUM.get());
        }
    };
}