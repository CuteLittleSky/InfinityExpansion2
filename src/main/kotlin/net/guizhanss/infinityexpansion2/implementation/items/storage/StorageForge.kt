package net.guizhanss.infinityexpansion2.implementation.items.storage

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import net.guizhanss.infinityexpansion2.core.IERegistry
import net.guizhanss.infinityexpansion2.core.menu.MenuLayout
import net.guizhanss.infinityexpansion2.core.recipes.MachineRecipe
import net.guizhanss.infinityexpansion2.implementation.items.machines.abstracts.AbstractCraftingMachine
import org.bukkit.inventory.ItemStack

class StorageForge(
    itemGroup: ItemGroup,
    itemStack: SlimefunItemStack,
    recipeType: RecipeType,
    recipe: Array<out ItemStack?>,
) : AbstractCraftingMachine(itemGroup, itemStack, recipeType, recipe, MenuLayout.CRAFTING_DEFAULT) {

    override val recipes: List<MachineRecipe>
        get() = IERegistry.storageForgeRecipes

    override val strictIngredientCheck = false

    // TODO: upgrade storage unit
}
