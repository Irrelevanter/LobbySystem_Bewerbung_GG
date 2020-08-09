// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.commands;

import org.bukkit.event.EventHandler;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.io.IOException;
import de.irrelevanter.lobbsystem.data.Data;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.Listener;

public class SetSpawn implements Listener
{
    @EventHandler
    public void onPlayer(final PlayerCommandPreprocessEvent e) {
        final Player p = e.getPlayer();
        if (p.hasPermission("lobbysystem.setspawn")) {
            if (e.getMessage().equalsIgnoreCase("/setspawn")) {
                final Location loc = p.getLocation();
                Data.cfg.set("Spawn.X", (Object)loc.getX());
                Data.cfg.set("Spawn.Y", (Object)loc.getY());
                Data.cfg.set("Spawn.Z", (Object)loc.getZ());
                Data.cfg.set("Spawn.Yaw", (Object)loc.getYaw());
                Data.cfg.set("Spawn.Pitch", (Object)loc.getPitch());
                Data.cfg.set("Spawn.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr die Lobby gesetzt!");
            }
            if (e.getMessage().equalsIgnoreCase("/setspawn1")) {
                final Location loc = p.getLocation();
                Data.cfg.set("1.X", (Object)loc.getX());
                Data.cfg.set("1.Y", (Object)loc.getY());
                Data.cfg.set("1.Z", (Object)loc.getZ());
                Data.cfg.set("1.Yaw", (Object)loc.getYaw());
                Data.cfg.set("1.Pitch", (Object)loc.getPitch());
                Data.cfg.set("1.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn1 = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr 1 gesetzt!");
            }
            if (e.getMessage().equalsIgnoreCase("/setspawn2")) {
                final Location loc = p.getLocation();
                Data.cfg.set("2.X", (Object)loc.getX());
                Data.cfg.set("2.Y", (Object)loc.getY());
                Data.cfg.set("2.Z", (Object)loc.getZ());
                Data.cfg.set("2.Yaw", (Object)loc.getYaw());
                Data.cfg.set("2.Pitch", (Object)loc.getPitch());
                Data.cfg.set("2.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn2 = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr 2 gesetzt!");
            }
            if (e.getMessage().equalsIgnoreCase("/setspawn3")) {
                final Location loc = p.getLocation();
                Data.cfg.set("3.X", (Object)loc.getX());
                Data.cfg.set("3.Y", (Object)loc.getY());
                Data.cfg.set("3.Z", (Object)loc.getZ());
                Data.cfg.set("3.Yaw", (Object)loc.getYaw());
                Data.cfg.set("3.Pitch", (Object)loc.getPitch());
                Data.cfg.set("3.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn3 = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr 3 gesetzt!");
            }
            if (e.getMessage().equalsIgnoreCase("/setspawn4")) {
                final Location loc = p.getLocation();
                Data.cfg.set("4.X", (Object)loc.getX());
                Data.cfg.set("4.Y", (Object)loc.getY());
                Data.cfg.set("4.Z", (Object)loc.getZ());
                Data.cfg.set("4.Yaw", (Object)loc.getYaw());
                Data.cfg.set("4.Pitch", (Object)loc.getPitch());
                Data.cfg.set("4.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn4 = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr 4 gesetzt!");
            }
            if (e.getMessage().equalsIgnoreCase("/setspawn5")) {
                final Location loc = p.getLocation();
                Data.cfg.set("5.X", (Object)loc.getX());
                Data.cfg.set("5.Y", (Object)loc.getY());
                Data.cfg.set("5.Z", (Object)loc.getZ());
                Data.cfg.set("5.Yaw", (Object)loc.getYaw());
                Data.cfg.set("5.Pitch", (Object)loc.getPitch());
                Data.cfg.set("5.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn5 = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr 5 gesetzt!");
            }
            if (e.getMessage().equalsIgnoreCase("/setspawn6")) {
                final Location loc = p.getLocation();
                Data.cfg.set("6.X", (Object)loc.getX());
                Data.cfg.set("6.Y", (Object)loc.getY());
                Data.cfg.set("6.Z", (Object)loc.getZ());
                Data.cfg.set("6.Yaw", (Object)loc.getYaw());
                Data.cfg.set("6.Pitch", (Object)loc.getPitch());
                Data.cfg.set("6.WeltName", (Object)loc.getWorld().getName());
                try {
                    Data.cfg.save(Data.file);
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
                Data.spawn6 = loc;
                p.sendMessage(Data.Prefix + "§6Du hast den Spawn f\u00fcr 6 gesetzt!");
            }
        }
    }
}
