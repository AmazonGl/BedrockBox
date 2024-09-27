package me.amazon.bedrockBox.commands.game;

import me.amazon.bedrockBox.BedrockBox;
import me.amazon.bedrockBox.gui.TeamSelection;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class SettingsListener implements Listener {

    @EventHandler
    public void onJoin (PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ItemStack itemStack = new ItemStack(Material.COMPASS);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§7Выбор команды");
        itemMeta.setLore(Arrays.asList("§6Выберите команду"));
        itemStack.setItemMeta(itemMeta);
        player.getInventory().setItem(0, itemStack);
    }

    @EventHandler
    public void onCompassClickTeamSelection(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        if (item != null && item.getType() == Material.COMPASS) {
            player.openInventory(TeamSelection.instance.inventory);
        }
    }
}
