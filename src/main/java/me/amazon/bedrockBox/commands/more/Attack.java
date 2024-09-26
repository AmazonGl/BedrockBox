package me.amazon.bedrockBox.commands.more;

import me.amazon.bedrockBox.BedrockBox;
import me.amazon.bedrockBox.commands.AbstractCommand;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Attack extends AbstractCommand {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.isOp()) {
            if ("all".equals(args[0])) {
                for (Player player : BedrockBox.instance().getServer().getOnlinePlayers()) {
                    player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(9999);
                };
            }
            if ("clear".equals(args[0])) {
                for (Player player : BedrockBox.instance().getServer().getOnlinePlayers()) {
                    player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4);
                };
            }
        }
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 1) {
           return List.of("all", "clear");
        }

        return null;
    }
}
