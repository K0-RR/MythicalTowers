package com.redgrapefruit.mythicaltowers.common.armor;

import com.redgrapefruit.mythicaltowers.common.init.MythicalItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

/**
 * A custom chestplate with special effects when on
 */
public class ChestplateItem extends ArmorItem {
    /**
     * The {@link StatusEffect} applied when put on
     */
    private final StatusEffect effect;
    /**
     * The amplifier of the effect
     */
    private final int amplifier;

    public ChestplateItem(ArmorMaterial material, StatusEffect effect, int amplifier) {
        super(material, EquipmentSlot.CHEST, new Item.Settings().group(MythicalItemGroups.ARMOR));

        this.effect = effect;
        this.amplifier = amplifier;
    }

    public StatusEffect getEffect() {
        return effect;
    }

    public int getAmplifier() {
        return amplifier;
    }
}