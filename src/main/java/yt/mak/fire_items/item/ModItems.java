package yt.mak.fire_items.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import yt.mak.fire_items.Fire_Items;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Fire_Items.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> OGNIUM = ITEMS.register("ognium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> OGNIUM_FRESH = ITEMS.register("ognium_fresh",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB).stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(1f).alwaysEat().build()).rarity(Rarity.EPIC)));

    public static final RegistryObject<SwordItem> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new SwordItem(Tiers1.EXAMPLE, 10, 5, new Item.Properties().tab(ModCreativeModeTab.TAB).rarity(Rarity.EPIC)));

    public static final RegistryObject<AxeItem> FIRE_AXE = ITEMS.register("fire_axe",
            () -> new AxeItem(Tiers2.EXAMPLE, 10, 5, new Item.Properties().tab(ModCreativeModeTab.TAB).rarity(Rarity.EPIC)));

    public static final RegistryObject<HoeItem> FIRE_HOE = ITEMS.register("fire_hoe",
            () -> new HoeItem(Tiers3.EXAMPLE, 10, 5, new Item.Properties().tab(ModCreativeModeTab.TAB).rarity(Rarity.EPIC)));

    public static final RegistryObject<ShovelItem> FIRE_SHOVEL = ITEMS.register("fire_shovel",
            () -> new ShovelItem(Tiers4.EXAMPLE, 10, 5, new Item.Properties().tab(ModCreativeModeTab.TAB).rarity(Rarity.EPIC)));

    public static final RegistryObject<PickaxeItem> FIRE_PICKAXE = ITEMS.register("fire_pickaxe",
            () -> new PickaxeItem(Tiers5.EXAMPLE, 10, 5, new Item.Properties().tab(ModCreativeModeTab.TAB).rarity(Rarity.EPIC)));

    public static class Tiers1 {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                500,
                20,
                39,
                350,
                null,
                () -> Ingredient.of(ModItems.FIRE_SWORD.get())
        );
    }

    public static class Tiers2 {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                500,
                20,
                29,
                350,
                null,
                () -> Ingredient.of(ModItems.FIRE_AXE.get())
        );
    }

    public static class Tiers3 {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                500,
                20,
                9,
                350,
                null,
                () -> Ingredient.of(ModItems.FIRE_HOE.get())
        );
    }

    public static class Tiers4 {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                500,
                20,
                19,
                350,
                null,
                () -> Ingredient.of(ModItems.FIRE_SHOVEL.get())
        );
    }

    public static class Tiers5 {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                500,
                20,
                24,
                350,
                null,
                () -> Ingredient.of(ModItems.FIRE_PICKAXE.get())
        );
    }
}