package com.redgrapefruit.mythicaltowers.common.item

import com.redgrapefruit.mythicaltowers.common.core.EffectConfig
import com.redgrapefruit.mythicaltowers.common.core.EffectEngine.onAmuletTicked
import com.redgrapefruit.mythicaltowers.common.registry.ItemGroupRegistry
import net.minecraft.entity.Entity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.world.World

/**
 * An amulet adds a passive effect everytime the amulet is inside of the player's inventory.<br></br>
 * After 3 seconds after the amulet leaves the inventory the effect disappears.<br></br>
 * Amulets don't use [EffectConfig]s, just constructor parameters.<br></br>
 * More info in wiki page 5
 */
class AmuletItem(
    /**
     * The passive [StatusEffect] applied
     */
    private val effect: StatusEffect,
    /**
     * The amplifier of this effect
     */
    private val amplifier: Int
) : Item(Settings().group(ItemGroupRegistry.AMULETS).maxCount(1)) {
    override fun inventoryTick(stack: ItemStack, world: World, entity: Entity, slot: Int, selected: Boolean) {
        super.inventoryTick(stack, world, entity, slot, selected)
        onAmuletTicked(effect, amplifier, entity)
    }
}