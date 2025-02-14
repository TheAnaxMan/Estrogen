package dev.mayaqq.estrogen;

import dev.mayaqq.estrogen.networking.EstrogenNetworkManager;
import dev.mayaqq.estrogen.registry.*;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Estrogen {
    public static final String MOD_ID = "estrogen";

    public static final Logger LOGGER = LoggerFactory.getLogger("Estrogen");

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void init() {
        // Init all the different classes
        EstrogenAttributes.ATTRIBUTES.init();
        EstrogenFluids.FLUIDS.init();
        EstrogenBlocks.BLOCKS.init();
        EstrogenBlockEntities.BLOCK_ENTITIES.init();
        EstrogenFluidProperties.FLUID_PROPERTIES.initialize();
        EstrogenEffects.MOB_EFFECTS.init();
        EstrogenPotions.POTIONS.init();
        EstrogenEnchantments.ENCHANTMENTS.init();
        EstrogenItems.ITEMS.init();
        EstrogenRecipeRegistries.RECIPE_SERIALIZERS.init();
        EstrogenRecipeRegistries.RECIPE_TYPES.init();
        EstrogenSounds.SOUNDS.init();
        EstrogenRecipes.register();
        EstrogenProcessingRecipes.register();
        EstrogenCreativeTab.register();
        EstrogenNetworkManager.register();
        EstrogenItems.registerTooltips();
        EstrogenBlocks.registerExtraProperties();
    }
}