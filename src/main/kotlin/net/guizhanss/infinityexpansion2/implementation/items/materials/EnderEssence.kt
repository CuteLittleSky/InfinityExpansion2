package net.guizhanss.infinityexpansion2.implementation.items.materials

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import net.guizhanss.infinityexpansion2.utils.bukkitext.ie2Key
import org.bukkit.World
import org.bukkit.block.Biome
import org.bukkit.inventory.ItemStack

class EnderEssence(
    itemGroup: ItemGroup,
    private val itemStack: SlimefunItemStack,
    recipeType: RecipeType,
    recipe: Array<out ItemStack?>
) : SimpleMaterial(itemGroup, itemStack, recipeType, recipe), GEOResource {

    init {
        register()
    }

    override fun getKey() = ie2Key(itemStack.itemId)

    override fun getDefaultSupply(environment: World.Environment, biome: Biome) = when {
        environment == World.Environment.THE_END -> 12
        biome == Biome.THE_VOID -> 8
        environment == World.Environment.NETHER -> 4
        else -> 0
    }

    override fun getMaxDeviation() = 4

    override fun getName() = itemName

    override fun isObtainableFromGEOMiner() = true
}
