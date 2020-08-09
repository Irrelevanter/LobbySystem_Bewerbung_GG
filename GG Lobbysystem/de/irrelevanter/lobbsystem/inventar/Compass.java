// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.inventar;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.meta.ItemMeta;
import de.irrelevanter.lobbsystem.data.Data;
import org.bukkit.plugin.Plugin;
import org.bukkit.Sound;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import de.irrelevanter.lobbsystem.main.Main;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class Compass implements Listener
{
    static ArrayList<Player> incd;
    static int cd;
    static int cdc;
    private Main pl;
    
    public Compass(final Main Main) {
        this.pl = Main;
    }
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        try {
            if (e.getItem().getType() == Material.COMPASS) {
                if (Compass.incd.isEmpty()) {
                    if (!Bukkit.getScheduler().isCurrentlyRunning(Compass.cd)) {
                        Compass.incd.add(p);
                        Compass.cdc = 0;
                        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 27, "§6Navigator");
                        final ItemStack a = new ItemStack(Material.EXP_BOTTLE);
                        final ItemMeta am = a.getItemMeta();
                        am.setDisplayName("§aEvent");
                        a.setItemMeta(am);
                        final ItemStack a2 = new ItemStack(Material.DIAMOND_SWORD);
                        final ItemMeta am2 = a2.getItemMeta();
                        am2.setDisplayName("§3FFA");
                        a2.setItemMeta(am2);
                        final ItemStack a3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                        final ItemMeta am3 = a3.getItemMeta();
                        am3.setDisplayName("§eComming Soon...");
                        a3.setItemMeta(am3);
                        final ItemStack a4 = new ItemStack(Material.ENDER_PEARL);
                        final ItemMeta am4 = a4.getItemMeta();
                        am4.setDisplayName("§cComming Soon...");
                        a4.setItemMeta(am4);
                        final ItemStack a5 = new ItemStack(Material.GOLDEN_APPLE);
                        final ItemMeta am5 = a5.getItemMeta();
                        am5.setDisplayName("§6Comming Soon...");
                        a5.setItemMeta(am5);
                        final ItemStack a6 = new ItemStack(Material.FISHING_ROD);
                        final ItemMeta am6 = a6.getItemMeta();
                        am6.setDisplayName("§bComming Soon...");
                        a6.setItemMeta(am6);
                        final ItemStack a7 = new ItemStack(Material.NETHER_STAR);
                        final ItemMeta am7 = a7.getItemMeta();
                        am7.setDisplayName("§6Spawn");
                        a7.setItemMeta(am7);
                        p.openInventory(inv);
                        Compass.cd = Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)this.pl, (Runnable)new Runnable() {
                            @Override
                            public void run() {
                                ++Compass.cdc;
                                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0f, 1.0f);
                                if (Compass.cdc == 1) {
                                    inv.setItem(9, a5);
                                    return;
                                }
                                if (Compass.cdc == 2) {
                                    inv.setItem(9, (ItemStack)null);
                                    inv.setItem(10, a5);
                                    inv.setItem(0, a6);
                                    inv.setItem(18, a6);
                                    return;
                                }
                                if (Compass.cdc == 3) {
                                    inv.setItem(10, (ItemStack)null);
                                    inv.setItem(0, (ItemStack)null);
                                    inv.setItem(18, (ItemStack)null);
                                    inv.setItem(11, a5);
                                    inv.setItem(1, a6);
                                    inv.setItem(19, a4);
                                    inv.setItem(9, a7);
                                    return;
                                }
                                if (Compass.cdc == 4) {
                                    inv.setItem(12, (ItemStack)null);
                                    inv.setItem(2, (ItemStack)null);
                                    inv.setItem(20, (ItemStack)null);
                                    inv.setItem(10, (ItemStack)null);
                                    inv.setItem(12, a5);
                                    inv.setItem(2, a6);
                                    inv.setItem(20, a4);
                                    inv.setItem(10, a7);
                                    inv.setItem(0, a);
                                    inv.setItem(18, a3);
                                    return;
                                }
                                if (Compass.cdc == 5) {
                                    inv.setItem(12, (ItemStack)null);
                                    inv.setItem(2, (ItemStack)null);
                                    inv.setItem(20, (ItemStack)null);
                                    inv.setItem(10, (ItemStack)null);
                                    inv.setItem(0, (ItemStack)null);
                                    inv.setItem(18, (ItemStack)null);
                                    inv.setItem(13, a5);
                                    inv.setItem(3, a6);
                                    inv.setItem(21, a4);
                                    inv.setItem(11, a7);
                                    inv.setItem(1, a);
                                    inv.setItem(19, a3);
                                    inv.setItem(9, a2);
                                    return;
                                }
                                if (Compass.cdc == 6) {
                                    inv.setItem(13, (ItemStack)null);
                                    inv.setItem(3, (ItemStack)null);
                                    inv.setItem(21, (ItemStack)null);
                                    inv.setItem(11, (ItemStack)null);
                                    inv.setItem(1, (ItemStack)null);
                                    inv.setItem(19, (ItemStack)null);
                                    inv.setItem(9, (ItemStack)null);
                                    inv.setItem(14, a5);
                                    inv.setItem(4, a6);
                                    inv.setItem(22, a4);
                                    inv.setItem(12, a7);
                                    inv.setItem(2, a);
                                    inv.setItem(20, a3);
                                    inv.setItem(10, a2);
                                    return;
                                }
                                if (Compass.cdc == 7) {
                                    inv.setItem(14, (ItemStack)null);
                                    inv.setItem(4, (ItemStack)null);
                                    inv.setItem(22, (ItemStack)null);
                                    inv.setItem(12, (ItemStack)null);
                                    inv.setItem(2, (ItemStack)null);
                                    inv.setItem(20, (ItemStack)null);
                                    inv.setItem(10, (ItemStack)null);
                                    inv.setItem(15, a5);
                                    inv.setItem(5, a6);
                                    inv.setItem(23, a4);
                                    inv.setItem(13, a7);
                                    inv.setItem(3, a);
                                    inv.setItem(21, a3);
                                    inv.setItem(11, a2);
                                    Bukkit.getScheduler().cancelTask(Compass.cd);
                                    Compass.incd.clear();
                                }
                                if (Compass.cdc == 8) {
                                    Bukkit.getScheduler().cancelTask(Compass.cd);
                                    Compass.incd.clear();
                                }
                            }
                        }, 1L, 1L);
                    }
                    else {
                        Bukkit.getScheduler().cancelTask(Compass.cd);
                        p.sendMessage(Data.Prefix + "§cEs ist ein Fehler aufgetreten! Bitte \u00f6ffne den Navigator erneut!");
                        p.closeInventory();
                    }
                }
                else {
                    p.sendMessage(Data.Prefix + "§cZu viele Spieler verwenden den Navigator gleichzeitig, bitte warte einen Moment!");
                }
            }
        }
        catch (Exception ex) {}
    }
    
    @EventHandler
    public void onClick(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getInventory().getName().equalsIgnoreCase("§6Navigator")) {
            if (e.getCurrentItem().getType() == Material.EXP_BOTTLE) {
                p.teleport(Data.spawn1);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Du hast dich zu §eKnockFFA §7teleportiert!");
                p.closeInventory();
            }
            if (e.getCurrentItem().getType() == Material.FISHING_ROD) {
                p.teleport(Data.spawn2);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Du hast dich zu §eComming Soon... §7teleportiert!");
                p.closeInventory();
            }
            if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
                p.teleport(Data.spawn3);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Du hast dich zu §eComming Soon... §7teleportiert!");
                p.closeInventory();
            }
            if (e.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
                p.teleport(Data.spawn4);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Du hast dich zu §eComming Soon.... §7teleportiert!");
                p.closeInventory();
            }
            if (e.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE) {
                p.teleport(Data.spawn5);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Du hast dich zu §eComming Soon... §7teleportiert!");
                p.closeInventory();
            }
            if (e.getCurrentItem().getType() == Material.ENDER_PEARL) {
                p.teleport(Data.spawn6);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§cDieser Spielmodus ist bislang nicht verf\u00fcgbar!");
                p.closeInventory();
            }
            if (e.getCurrentItem().getType() == Material.NETHER_STAR) {
                p.teleport(Data.spawn);
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Du hast dich zum §eSpawn §7teleportiert!");
                p.closeInventory();
            }
        }
    }
    
    static {
        Compass.incd = new ArrayList<Player>();
    }
}
