package com.redgrapefruit.mythicaltowers.common.tool.weapon

import com.redgrapefruit.mythicaltowers.common.core.EffectConfig
import net.minecraft.item.ToolMaterial

/**
 * A double sword takes shorter to strike and hits harder
 */
class DoubleSwordItem(configs: List<EffectConfig>, material: ToolMaterial?, attackDamage: Int, attackSpeed: Float) :
    CustomSwordItem(configs, material, attackDamage, attackSpeed)