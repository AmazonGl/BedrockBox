package me.amazon.bedrockBox;

import me.amazon.bedrockBox.commands.game.JoinCMD;
import me.amazon.bedrockBox.commands.gui.HealthMenuCMD;
import me.amazon.bedrockBox.commands.gui.HealthMenuOPCMD;
import me.amazon.bedrockBox.commands.more.Attack;
import me.amazon.bedrockBox.commands.more.Health;
import me.amazon.bedrockBox.commands.more.Vanish;
import me.amazon.bedrockBox.commands.gui.MenuShopCMD;
import me.amazon.bedrockBox.gui.MenuListener;
import me.amazon.bedrockBox.item.Pickaxe3x3;
import me.amazon.bedrockBox.item.PickaxeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedrockBox extends JavaPlugin{

    private static BedrockBox instance;

    public static BedrockBox instance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        new MenuShopCMD().register(this, "shop");
        new HealthMenuCMD().register(this, "health");
        new HealthMenuOPCMD().register(this, "healthop");
        new Attack().register(this, "attack");
        new JoinCMD().register(this,"join");
        new Vanish().register(this,"vanish");
        new Health().register(this,"hp");
        new Pickaxe3x3().register(this, "getpickaxe:");

        Bukkit.getPluginManager().registerEvents(new MenuListener(), this);
        Bukkit.getPluginManager().registerEvents(new PickaxeListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
