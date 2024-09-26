package me.amazon.bedrockBox.game;

import me.amazon.bedrockBox.BedrockBox;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.util.Ticks;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    public static final Arena instance = new Arena();

    public List<Player> playerOnArena = new ArrayList<>();

    public void join(Player player) {
        playerOnArena.add(player);
        player.sendMessage("Вы присоединились к игре!");

        if (playerOnArena.size() >= 2) {
            startGame();
        }
    }

    public void startGame() {
        new BukkitRunnable() {

            int timer = 10;

            @Override
            public void run() {
                if (timer > 0) {
                    if (timer == 10) {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.showTitle(
                                    Title.title(
                                            Component.text("Приготовтесь!").color(TextColor.color(0xF0F000)),
                                            Component.text("С вас лайк и подписка").color(TextColor.color(0xF0F016)),
                                            Title.Times.times(Ticks.duration(10), Ticks.duration(25), Ticks.duration(25))));
                            player.playSound(player, Sound.UI_BUTTON_CLICK,100,1);
                        }
                    }
                    if (timer == 5) {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.sendMessage(ChatColor.YELLOW + "Игра начнётся через 5 секунд!");
                            player.showTitle(
                                    Title.title(
                                            Component.text("5").color(TextColor.color(0xF0F030)),
                                            Component.text(""),
                                            Title.Times.times(Ticks.duration(0), Ticks.duration(25), Ticks.duration(0))));
                            player.playSound(player, Sound.UI_BUTTON_CLICK,100,1);
                        }
                    }
                    if (timer == 4) {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.sendMessage(ChatColor.YELLOW + "Игра начнётся через 4 секунды!");
                            player.showTitle(
                                    Title.title(
                                            Component.text("4").color(TextColor.color(0xF0F030)),
                                            Component.text(""),
                                            Title.Times.times(Ticks.duration(0), Ticks.duration(25), Ticks.duration(0))));
                            player.playSound(player, Sound.UI_BUTTON_CLICK,100,1);
                        }
                    }
                    if (timer == 3) {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.sendMessage(ChatColor.YELLOW + "Игра начнётся через 3 секунды!");
                            player.showTitle(
                                    Title.title(
                                            Component.text("3").color(TextColor.color(0xF0F030)),
                                            Component.text(""),
                                            Title.Times.times(Ticks.duration(0), Ticks.duration(25), Ticks.duration(0))));
                            player.playSound(player, Sound.UI_STONECUTTER_TAKE_RESULT,100,1);
                        }
                    }
                    if (timer == 2) {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.sendMessage(ChatColor.YELLOW + "Игра начнётся через 2 секунды!");
                            player.showTitle(
                                    Title.title(
                                            Component.text("2").color(TextColor.color(0xF0F030)),
                                            Component.text(""),
                                            Title.Times.times(Ticks.duration(0), Ticks.duration(25), Ticks.duration(0))));
                            player.playSound(player, Sound.UI_STONECUTTER_TAKE_RESULT,100,1);
                        }
                    }
                    if (timer == 1) {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.sendMessage(ChatColor.YELLOW + "Игра начнётся через 1 секунду!");
                            player.showTitle(
                                    Title.title(
                                            Component.text("1").color(TextColor.color(0xF0F030)),
                                            Component.text(""),
                                            Title.Times.times(Ticks.duration(0), Ticks.duration(25), Ticks.duration(0))));
                            player.playSound(player, Sound.UI_STONECUTTER_TAKE_RESULT,100,1);
                        }
                    }
                    timer--;
                } else {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.showTitle(
                                Title.title(
                                        Component.text("Игра началась").color(TextColor.color(0xF0F034)),
                                        Component.text("Удачи!").color(TextColor.color(0xF0F024)),
                                        Title.Times.times(Ticks.duration(0), Ticks.duration(25), Ticks.duration(25))));
                        player.playSound(player, Sound.ITEM_GOAT_HORN_SOUND_2, 100, 1.9F);
                        player.setGameMode(GameMode.SURVIVAL);
                        ItemStack itemStack = new ItemStack(Material.WOODEN_PICKAXE);
                        player.getInventory().addItem(itemStack);
                        cancel();
                    }
                }
            }
        }.runTaskTimer(BedrockBox.instance(),0L, 20L);
    }
}
