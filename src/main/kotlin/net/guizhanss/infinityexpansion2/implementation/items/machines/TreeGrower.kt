package net.guizhanss.infinityexpansion2.implementation.items.machines

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import net.guizhanss.guizhanlib.kt.minecraft.extensions.toItem
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class TreeGrower(
    itemGroup: ItemGroup,
    itemStack: SlimefunItemStack,
    recipeType: RecipeType,
    recipe: Array<out ItemStack?>,
    energyPerTick: Int,
    outputInterval: Int,
) : GrowingMachine(itemGroup, itemStack, recipeType, recipe, energyPerTick, outputInterval) {

    init {
        addRecipe(
            Material.OAK_SAPLING.toItem(), arrayOf(
                Material.OAK_LEAVES.toItem(16),
                Material.OAK_LOG.toItem(16),
                Material.STICK.toItem(2),
                Material.APPLE.toItem(2)
            )
        )

        addRecipe(
            Material.SPRUCE_SAPLING.toItem(), arrayOf(
                Material.SPRUCE_LEAVES.toItem(16),
                Material.SPRUCE_LOG.toItem(16),
                Material.STICK.toItem(4)
            )
        )

        addRecipe(
            Material.DARK_OAK_SAPLING.toItem(), arrayOf(
                Material.DARK_OAK_LEAVES.toItem(16),
                Material.DARK_OAK_LOG.toItem(16),
                Material.APPLE.toItem(2)
            )
        )

        addRecipe(
            Material.BIRCH_SAPLING.toItem(), arrayOf(
                Material.BIRCH_LEAVES.toItem(16),
                Material.BIRCH_LOG.toItem(16)
            )
        )

        addRecipe(
            Material.ACACIA_SAPLING.toItem(), arrayOf(
                Material.ACACIA_LEAVES.toItem(16),
                Material.ACACIA_LOG.toItem(16)
            )
        )

        addRecipe(
            Material.JUNGLE_SAPLING.toItem(), arrayOf(
                Material.JUNGLE_LEAVES.toItem(16),
                Material.JUNGLE_LOG.toItem(16),
                Material.COCOA_BEANS.toItem(3)
            )
        )

        addRecipe(
            Material.WARPED_FUNGUS.toItem(), arrayOf(
                Material.WARPED_HYPHAE.toItem(16),
                Material.WARPED_STEM.toItem(16),
                Material.SHROOMLIGHT.toItem(2)
            )
        )

        addRecipe(
            Material.CRIMSON_FUNGUS.toItem(), arrayOf(
                Material.CRIMSON_HYPHAE.toItem(16),
                Material.CRIMSON_STEM.toItem(16),
                Material.WEEPING_VINES.toItem(2)
            )
        )

        addRecipe(
            Material.MANGROVE_PROPAGULE.toItem(), arrayOf(
                Material.MANGROVE_LEAVES.toItem(16),
                Material.MANGROVE_LOG.toItem(16),
                Material.MANGROVE_ROOTS.toItem(8),
                Material.MUDDY_MANGROVE_ROOTS.toItem(4)
            )
        )

        addRecipe(
            Material.CHERRY_SAPLING.toItem(), arrayOf(
                Material.CHERRY_LEAVES.toItem(16),
                Material.CHERRY_LOG.toItem(16),
                Material.STICK.toItem(3)
            )
        )
    }
}
