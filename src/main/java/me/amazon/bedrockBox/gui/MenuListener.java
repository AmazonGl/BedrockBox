package me.amazon.bedrockBox.gui;

import me.amazon.bedrockBox.gui.util.ColorUtil;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onClickHealthMenu (InventoryClickEvent event) {
        if (event.getInventory() == HealthMenu.instance.inventory) {
            event.setCancelled(true);

            if (event.getCurrentItem() != null) {
                String itemname = ((TextComponent) event.getCurrentItem().getItemMeta().displayName()).content();
                Player player = (Player) event.getWhoClicked();

                if (itemname.equals("Удалить сердце") && event.getSlot() == 4) {
                    ColorUtil.sendActionBar(player,"&7Вы удалили у себя сердце!");
                    player.playSound(player, Sound.UI_BUTTON_CLICK , 10, 1);
                    player.setMaxHealth(player.getMaxHealth() - 2);
                }

            }
        }

        if (event.getInventory() == HealthMenuOP.instance.inventory) {
            event.setCancelled(true);

            if (event.getCurrentItem() != null) {
                String itemname = ((TextComponent) event.getCurrentItem().getItemMeta().displayName()).content();
                Player player = (Player) event.getWhoClicked();

                if (itemname.equals("Добавить сердце") && event.getSlot() == 3) {
                    ColorUtil.sendActionBar(player,"&7Вы добавили себе сердце!");
                    player.playSound(player, Sound.UI_BUTTON_CLICK , 10, 1);
                    player.setMaxHealth(player.getMaxHealth() + 2);
                }

                if (itemname.equals("Удалить сердце") && event.getSlot() == 5) {
                    ColorUtil.sendActionBar(player,"&7Вы удалили у себя сердце!");
                    player.playSound(player, Sound.UI_BUTTON_CLICK , 10, 1);
                    player.setMaxHealth(player.getMaxHealth() - 2);
                    player.setFoodLevel(20);
                }

            }
        }
    }

    @EventHandler
    public void onClickTeamSelectionMenu(InventoryClickEvent event) {

    }
}
