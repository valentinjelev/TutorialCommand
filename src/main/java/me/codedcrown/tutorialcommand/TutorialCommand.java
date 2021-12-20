package me.codedcrown.tutorialcommand;

import me.codedcrown.tutorialcommand.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        if (!new AdvancedLicense("I20G-F1TA-2P0U-J6NC", "https://hell-license.cooking/verify.php", this).register())
            return;
        this.getLogger().info("TutorialCommand е стартиран успешно!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("TutorialCommand е изключен успешно!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("tutorial") || label.equalsIgnoreCase("welcome") || label.equalsIgnoreCase("tut") || label.equalsIgnoreCase("tutori")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                String name = player.getName();
                if (player.hasPermission("tutorial.use")) {
                    player.sendMessage("                                                 ");
                    player.sendMessage("                                                 ");
                    player.sendMessage(Utils.chat("                  &f✴ &7&l(&f&lBunny&d&lCraft&7&l) &f✴"));
                    player.sendMessage("                                                 ");
                    Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> {
                        player.sendMessage(Utils.chat("                &fНачално Ръководство"));
                        player.sendMessage("                                                 ");
                        player.sendMessage("                                                 ");
                    }, 30L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> {
                        player.sendMessage(Utils.chat("  &7➥ &fТекст 1"));
                        player.sendMessage("                                                 ");
                    }, 80L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> {
                        player.sendMessage(Utils.chat("  &7➥ &fТекст 2"));
                        player.sendMessage("                                                 ");
                    }, 120L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> {
                        player.sendMessage(Utils.chat("  &7➥ &fТекст 3"));
                        player.sendMessage("                                                 ");
                    }, 170L);
                    Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> {
                        player.sendMessage(Utils.chat("  &7➥ &fТекст 4"));
                        player.sendMessage("                                                 ");
                        player.sendMessage(Utils.chat("&7&m----------------------------------------------"));
                    }, 220L);
                    return true;
                }
                player.sendMessage(Utils.chat("&cНямате право да използвате тази команда!"));
                return true;
            }
        }

        return false;
    }
}

