package me.amazon.bedrockBox.commands.gui;

import me.amazon.bedrockBox.commands.AbstractCommand;
import me.amazon.bedrockBox.gui.HealthMenuOP;
import me.amazon.bedrockBox.gui.ShopMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HealthMenuOPCMD extends AbstractCommand {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.openInventory(HealthMenuOP.instance.inventory);
            return true;
        }
        else {
            sender.sendMessage("У вас нет прав");
        }
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return null;
    }
}
