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

public class TeamSelection {
    public static final TeamSelection instance = new TeamSelection();

    public final Inventory inventory = Bukkit.createInventory(null,27,"ВЫБОР КОМАНДЫ");

    TeamSelection() {

        inventory.setItem(10, MenuUtil.CreateItemStack(Material.RED_WOOL, "Красная команда", TextColor.color(NamedTextColor.RED), Arrays.asList(
                Component.text("ИГРОКИ").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать команду").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(12, MenuUtil.CreateItemStack(Material.YELLOW_WOOL, "Желтая команда", TextColor.color(NamedTextColor.YELLOW), Arrays.asList(
                Component.text("ИГРОКИ").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать команду").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(14, MenuUtil.CreateItemStack(Material.BLUE_WOOL, "Синяя команда", TextColor.color(NamedTextColor.BLUE), Arrays.asList(
                Component.text("ИГРОКИ").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать команду").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(16, MenuUtil.CreateItemStack(Material.GREEN_WOOL, "Зеленая команда", TextColor.color(NamedTextColor.GREEN), Arrays.asList(
                Component.text("ИГРОКИ").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать команду").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));
    }
}
