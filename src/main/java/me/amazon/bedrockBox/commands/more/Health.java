package me.amazon.bedrockBox.commands.more;

import me.amazon.bedrockBox.commands.AbstractCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Health extends AbstractCommand {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            Player targetPlayer;
            int hp = 0;

            if (args.length == 2) {
                targetPlayer = player;
                hp = Integer.parseInt(args[1]);
            } else {
                hp = Integer.parseInt(args[2]);
                targetPlayer = Bukkit.getPlayer(args[0]);
                if (targetPlayer == null) {
                    player.sendMessage("Игрок " + args[0] + " не найден.");
                    return false;
                }
            }

            if ("add".equals(args[1]) || "add".equals(args[0])) {
                targetPlayer.setMaxHealth(targetPlayer.getHealth() + (hp * 2));
                player.sendMessage("Вы добавили " + hp + " сердце(а)" + (targetPlayer == player ? " себе" : " игроку " + targetPlayer.getName()) + ".");
            }

            if ("remove".equals(args[1]) || "remove".equals(args[0])) {
                targetPlayer.setMaxHealth(targetPlayer.getHealth() - (hp * 2));
                player.sendMessage("Вы отняли " + hp + " сердце(а)" + (targetPlayer == player ? " у себя" : " у игрока " + targetPlayer.getName()) + ".");
            }

            if ("set".equals(args[1]) || "set".equals(args[0])) {
                targetPlayer.setMaxHealth(hp * 2);
                player.sendMessage("Вы установили " + hp + " сердце(а)" + (targetPlayer == player ? " себе" : " игроку " + targetPlayer.getName()) + ".");
            }

        }
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args.length == 1) {
            return List.of(
              "add", "remove", "set"
            );
        }

        return null;
    }
}
