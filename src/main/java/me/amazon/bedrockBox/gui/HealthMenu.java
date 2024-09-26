package me.amazon.bedrockBox.gui;

import me.amazon.bedrockBox.gui.util.MenuUtil;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.Arrays;

public class HealthMenu {

    public static final HealthMenu instance = new HealthMenu();

    public final Inventory inventory = Bukkit.createInventory(null,9,"УДАЛИТЬ СЕРДЦА");

    HealthMenu(){

        inventory.setItem(4, MenuUtil.CreateItemStack(Material.RED_DYE, "Удалить сердце", TextColor.color(NamedTextColor.RED), Arrays.asList(
                Component.text("При нажатии, удаляет у вас 1 сердце.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы использовать").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));
    }
}
