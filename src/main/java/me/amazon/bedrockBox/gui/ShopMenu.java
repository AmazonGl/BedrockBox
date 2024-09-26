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

public class ShopMenu {
    public static final ShopMenu instance = new ShopMenu();

    public final Inventory inventory = Bukkit.createInventory(null,45,"ВЫБОР ИВЕНТА");

    ShopMenu(){

        inventory.setItem(10, MenuUtil.CreateItemStack(Material.LAVA_BUCKET, "Горячая штучка", TextColor.color(NamedTextColor.GOLD), Arrays.asList(
                Component.text("Под игроком появится лава, 3x3 блока.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(12, MenuUtil.CreateItemStack(Material.DIAMOND_SWORD, "Любимая рука", TextColor.color(NamedTextColor.WHITE), Arrays.asList(
                Component.text("Выбранный предмет игрока, будет перемещаться").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text("в левую руку, в течении 1 минуты.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(14, MenuUtil.CreateItemStack(Material.CHORUS_FRUIT, "Смещение во времени", TextColor.color(NamedTextColor.AQUA), Arrays.asList(
                Component.text("Игрок будет вращаться, в течении 10 секунд.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(16, MenuUtil.CreateItemStack(Material.TNT, "БУМ", TextColor.color(NamedTextColor.RED), Arrays.asList(
                Component.text("Подрывает игрока, с определенной мощью.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(28, MenuUtil.CreateItemStack(Material.FIREWORK_ROCKET, "Новый год", TextColor.color(NamedTextColor.GREEN), Arrays.asList(
                Component.text("Игроку призывается фейерверк.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(30, MenuUtil.CreateItemStack(Material.STONE, "Большая дыра", TextColor.color(NamedTextColor.BLUE), Arrays.asList(
                Component.text("Под игроком появится яма, 3x3x5 блока.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(32, MenuUtil.CreateItemStack(Material.EMERALD_ORE, "Удачная руда", TextColor.color(NamedTextColor.DARK_AQUA), Arrays.asList(
                Component.text("Игрок, копая различную руду, будет превращать").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text("её в камень, в течении 30 секунд.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(34, MenuUtil.CreateItemStack(Material.CARVED_PUMPKIN, "Зрение +3000%", TextColor.color(NamedTextColor.DARK_GREEN), Arrays.asList(
                Component.text("У игрока появится тыква, которую нельзя").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text("будет снять, в течении 30 секунд.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы выбрать ивент").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));

        inventory.setItem(44, MenuUtil.CreateItemStack(Material.LIME_DYE, "Далее", TextColor.color(NamedTextColor.LIGHT_PURPLE), Arrays.asList(
                Component.text("Следующая страница.").color(TextColor.color(NamedTextColor.GRAY)).decoration(TextDecoration.ITALIC, false),
                Component.text(""),
                Component.text("Нажмите, чтобы переключиться").color(TextColor.color(NamedTextColor.LIGHT_PURPLE)).decoration(TextDecoration.ITALIC, false)
        )));
    }
}
