package me.amazon.bedrockBox.gui.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static ItemStack CreateItemStack (Material material, String name, TextColor color) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta meta = itemStack.getItemMeta();
        Component displayname = Component.text(name).color(color);
        meta.displayName(displayname);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack CreateItemStack (Material material, String name, TextColor color, List<TextComponent> lore) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta meta = itemStack.getItemMeta();
        Component displayname = Component.text(name).color(color).decoration(TextDecoration.ITALIC, false);
        meta.displayName(displayname);
        meta.lore(new ArrayList<>(lore));

        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack CreateItemStack (Material material, String name, TextColor color, TextDecoration textDecoration, List<TextComponent> lore) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta meta = itemStack.getItemMeta();
        Component displayname = Component.text(name).color(color).decoration(TextDecoration.ITALIC, false).decorate(textDecoration);
        meta.displayName(displayname);
        meta.lore(new ArrayList<>(lore));

        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
