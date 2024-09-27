package yt.mak.fire_items.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yt.mak.fire_items.Fire_Items;
import yt.mak.fire_items.item.ModItems;

@Mod.EventBusSubscriber(modid = Fire_Items.MOD_ID)
public class ModLootTableModifiers {
    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("minecraft", "chests/nether_bridge"))) {
            LootPool pool = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(3))
                    .add(LootItem.lootTableItem(ModItems.OGNIUM.get()))
                    .build();
            event.getTable().addPool(pool);
        }
    }
}