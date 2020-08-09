// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.main;

import org.bukkit.inventory.Inventory;
import java.util.Iterator;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.entity.Player;
import java.util.List;
import java.util.ArrayList;
import org.bukkit.Material;
import de.irrelevanter.lobbsystem.data.Data;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import de.irrelevanter.lobbsystem.commands.SetSpawn;
import de.irrelevanter.lobbsystem.listener.MainListener;
import de.irrelevanter.lobbsystem.inventar.LobbySwitcher;
import de.irrelevanter.lobbsystem.listener.LobbyProtection;
import de.irrelevanter.lobbsystem.inventar.PlayerHider;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import de.irrelevanter.lobbsystem.inventar.Compass;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    static int i;
    public static ItemStack OnlineLobby;
    public static ItemStack OfflineLobby;
    
    public void onEnable() {
        Main.i = 0;
        Bukkit.getConsoleSender().sendMessage("§6LobbySystem wird aktiviert...");
        Bukkit.getPluginManager().registerEvents((Listener)new Compass(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerHider(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new LobbyProtection(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new LobbySwitcher(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new MainListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new SetSpawn(), (Plugin)this);
        this.updateLobbys();
        this.load1();
        this.load2();
        this.load3();
        this.load4();
        this.load5();
        this.load6();
        this.loadLocations();
    }
    
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§6LobbySystem wird deaktiviert...");
    }
    
    public void loadLocations() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("Spawn.WeltName");
        final double x = cfg.getDouble("Spawn.X");
        final double y = cfg.getDouble("Spawn.Y");
        final double z = cfg.getDouble("Spawn.Z");
        final double yaw = cfg.getDouble("Spawn.Yaw");
        final double pitch = cfg.getDouble("Spawn.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn = loc;
    }
    
    public void load1() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("1.WeltName");
        final double x = cfg.getDouble("1.X");
        final double y = cfg.getDouble("1.Y");
        final double z = cfg.getDouble("1.Z");
        final double yaw = cfg.getDouble("1.Yaw");
        final double pitch = cfg.getDouble("1.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn1 = loc;
    }
    
    public void load2() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("2.WeltName");
        final double x = cfg.getDouble("2.X");
        final double y = cfg.getDouble("2.Y");
        final double z = cfg.getDouble("2.Z");
        final double yaw = cfg.getDouble("2.Yaw");
        final double pitch = cfg.getDouble("2.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn2 = loc;
    }
    
    public void load3() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("3.WeltName");
        final double x = cfg.getDouble("3.X");
        final double y = cfg.getDouble("3.Y");
        final double z = cfg.getDouble("3.Z");
        final double yaw = cfg.getDouble("3.Yaw");
        final double pitch = cfg.getDouble("3.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn3 = loc;
    }
    
    public void load4() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("4.WeltName");
        final double x = cfg.getDouble("4.X");
        final double y = cfg.getDouble("4.Y");
        final double z = cfg.getDouble("4.Z");
        final double yaw = cfg.getDouble("4.Yaw");
        final double pitch = cfg.getDouble("4.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn4 = loc;
    }
    
    public void load5() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("5.WeltName");
        final double x = cfg.getDouble("5.X");
        final double y = cfg.getDouble("5.Y");
        final double z = cfg.getDouble("5.Z");
        final double yaw = cfg.getDouble("5.Yaw");
        final double pitch = cfg.getDouble("5.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn5 = loc;
    }
    
    public void load6() {
        final File file = new File("plugins//LobbySystem//spawns.yml");
        final YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        final String w = cfg.getString("6.WeltName");
        final double x = cfg.getDouble("6.X");
        final double y = cfg.getDouble("6.Y");
        final double z = cfg.getDouble("6.Z");
        final double yaw = cfg.getDouble("6.Yaw");
        final double pitch = cfg.getDouble("6.Pitch");
        final Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn6 = loc;
    }
    
    public void updateLobbys() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)this, (Runnable)new Runnable() {
            @Override
            public void run() {
                if (Main.i == 0) {
                    final ItemStack online = new ItemStack(Material.STAINED_CLAY, Bukkit.getOnlinePlayers().size(), (short)5);
                    final ItemMeta om = online.getItemMeta();
                    om.setDisplayName("§aLobby-01§8 » §2Online");
                    final ArrayList<String> list = new ArrayList<String>();
                    list.add("§7§m------------------------");
                    list.add("§6Online§8 » §3" + Bukkit.getOnlinePlayers().size());
                    list.add("§6Status §8» §2Online");
                    list.add("§6Aktualisieren:");
                    list.add("§7§m------------------------");
                    om.setLore((List)list);
                    online.setItemMeta(om);
                    final ItemStack offline = new ItemStack(Material.STAINED_CLAY, 0, (short)14);
                    final ItemMeta ofm = offline.getItemMeta();
                    ofm.setDisplayName("§aLobby §8» §cWird bei Bedarf gestartet");
                    final ArrayList<String> list2 = new ArrayList<String>();
                    list2.add("§7§m------------------------");
                    list2.add("§6Online§8 » §30");
                    list2.add("§6Status §8» §cOffline");
                    list2.add("§6Aktualisieren:");
                    list2.add("§7§m------------------------");
                    ofm.setLore((List)list2);
                    offline.setItemMeta(ofm);
                    Main.OfflineLobby = offline;
                    Main.OnlineLobby = online;
                }
                ++Main.i;
                for (final Player all : Bukkit.getOnlinePlayers()) {
                    if (LobbySwitcher.into.contains(all)) {
                        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 9, "§6Lobby Switcher");
                        inv.setItem(0, Main.OnlineLobby);
                        inv.setItem(1, Main.OfflineLobby);
                        inv.setItem(2, Main.OfflineLobby);
                        inv.setItem(3, Main.OfflineLobby);
                        inv.setItem(4, Main.OfflineLobby);
                        inv.setItem(5, Main.OfflineLobby);
                        inv.setItem(6, Main.OfflineLobby);
                        inv.setItem(7, Main.OfflineLobby);
                        inv.setItem(8, Main.OfflineLobby);
                        LobbySwitcher.into.remove(all);
                        all.openInventory(inv);
                        LobbySwitcher.into.add(all);
                    }
                }
                if (Main.i == 1) {
                    final ItemStack online = new ItemStack(Material.STAINED_CLAY, Bukkit.getOnlinePlayers().size(), (short)5);
                    final ItemMeta om = online.getItemMeta();
                    om.setDisplayName("§aLobby-01§8 » §2Online");
                    final ArrayList<String> list = new ArrayList<String>();
                    list.add("§7§m------------------------");
                    list.add("§6Online§8 » §3" + Bukkit.getOnlinePlayers().size());
                    list.add("§6Status §8» §2Online");
                    list.add("§6Aktualisieren: §a\u2022");
                    list.add("§7§m------------------------");
                    om.setLore((List)list);
                    online.setItemMeta(om);
                    final ItemStack offline = new ItemStack(Material.STAINED_CLAY, 0, (short)14);
                    final ItemMeta ofm = offline.getItemMeta();
                    ofm.setDisplayName("§aLobby §8» §cWird bei Bedarf gestartet");
                    final ArrayList<String> list2 = new ArrayList<String>();
                    list2.add("§7§m------------------------");
                    list2.add("§6Online§8 » §30");
                    list2.add("§6Status §8» §cOffline");
                    list2.add("§6Aktualisieren: §a\u2022");
                    list2.add("§7§m------------------------");
                    ofm.setLore((List)list2);
                    offline.setItemMeta(ofm);
                    Main.OfflineLobby = offline;
                    Main.OnlineLobby = online;
                }
                if (Main.i == 2) {
                    final ItemStack online = new ItemStack(Material.STAINED_CLAY, Bukkit.getOnlinePlayers().size(), (short)5);
                    final ItemMeta om = online.getItemMeta();
                    om.setDisplayName("§aLobby-01§8 » §2Online");
                    final ArrayList<String> list = new ArrayList<String>();
                    list.add("§7§m------------------------");
                    list.add("§6Online§8 » §3" + Bukkit.getOnlinePlayers().size());
                    list.add("§6Status §8» §2Online");
                    list.add("§6Aktualisieren: §a\u2022 §e\u2022");
                    list.add("§7§m------------------------");
                    om.setLore((List)list);
                    online.setItemMeta(om);
                    final ItemStack offline = new ItemStack(Material.STAINED_CLAY, 0, (short)14);
                    final ItemMeta ofm = offline.getItemMeta();
                    ofm.setDisplayName("§aLobby §8» §cWird bei Bedarf gestartet");
                    final ArrayList<String> list2 = new ArrayList<String>();
                    list2.add("§7§m------------------------");
                    list2.add("§6Online§8 » §30");
                    list2.add("§6Status §8» §cOffline");
                    list2.add("§6Aktualisieren: §a\u2022 §e\u2022");
                    list2.add("§7§m------------------------");
                    ofm.setLore((List)list2);
                    offline.setItemMeta(ofm);
                    Main.OfflineLobby = offline;
                    Main.OnlineLobby = online;
                }
                if (Main.i == 3) {
                    final ItemStack online = new ItemStack(Material.STAINED_CLAY, Bukkit.getOnlinePlayers().size(), (short)5);
                    final ItemMeta om = online.getItemMeta();
                    om.setDisplayName("§aLobby-01§8 » §2Online");
                    final ArrayList<String> list = new ArrayList<String>();
                    list.add("§7§m------------------------");
                    list.add("§6Online§8 » §3" + Bukkit.getOnlinePlayers().size());
                    list.add("§6Status §8» §2Online");
                    list.add("§6Aktualisieren: §a\u2022 §e\u2022 §c\u2022");
                    list.add("§7§m------------------------");
                    om.setLore((List)list);
                    online.setItemMeta(om);
                    final ItemStack offline = new ItemStack(Material.STAINED_CLAY, 0, (short)14);
                    final ItemMeta ofm = offline.getItemMeta();
                    ofm.setDisplayName("§aLobby §8» §cWird bei Bedarf gestartet");
                    final ArrayList<String> list2 = new ArrayList<String>();
                    list2.add("§7§m------------------------");
                    list2.add("§6Online§8 » §30");
                    list2.add("§6Status §8» §cOffline");
                    list2.add("§6Aktualisieren: §a\u2022 §e\u2022 §c\u2022");
                    list2.add("§7§m------------------------");
                    ofm.setLore((List)list2);
                    offline.setItemMeta(ofm);
                    Main.OfflineLobby = offline;
                    Main.OnlineLobby = online;
                }
                if (Main.i == 4) {
                    Main.i = 0;
                }
            }
        }, 20L, 10L);
    }
}
