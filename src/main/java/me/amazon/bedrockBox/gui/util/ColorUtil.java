package me.amazon.bedrockBox.gui.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.entity.Player;

public class ColorUtil {
    public static void sendMessage(Player player, String msg) {
        //player.sendMessage(prefix.append(msg));
        Component messageComponent = LegacyComponentSerializer.legacyAmpersand().deserialize(msg);
        player.sendMessage(messageComponent);
    }

    public static void sendActionBar(Player player, String msg) {
        //player.sendMessage(prefix.append(msg));
        Component messageComponent = LegacyComponentSerializer.legacyAmpersand().deserialize(msg);
        player.sendActionBar(messageComponent);
    }
}
