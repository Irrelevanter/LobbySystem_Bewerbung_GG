// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.inventar;

import org.bukkit.event.player.PlayerJoinEvent;
import java.util.Iterator;
import org.bukkit.Location;
import de.irrelevanter.lobbsystem.data.Data;
import org.bukkit.Effect;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.Sound;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class PlayerHider implements Listener
{
    static ArrayList<Player> hidden;
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        try {
            if (e.getItem().getType() == Material.BLAZE_ROD) {
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);
                final Inventory inv = Bukkit.createInventory((InventoryHolder)null, InventoryType.HOPPER, "§eSpieler Verstecken");
                final ItemStack i = new ItemStack(Material.INK_SACK, 1, (short)10);
                final ItemMeta im = i.getItemMeta();
                im.setDisplayName("§aSpieler anzeigen");
                i.setItemMeta(im);
                final ItemStack a = new ItemStack(Material.INK_SACK, 1, (short)1);
                final ItemMeta am = a.getItemMeta();
                am.setDisplayName("§cSpieler verstecken");
                a.setItemMeta(am);
                inv.setItem(1, i);
                inv.setItem(3, a);
                p.openInventory(inv);
            }
        }
        catch (Exception ex) {}
    }
    
    @EventHandler
    public void onClic(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getInventory().getName().equalsIgnoreCase("§eSpieler Verstecken")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aSpieler anzeigen")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 999999));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5, 999999));
                final Location loc = p.getLocation();
                final Location ent = p.getLocation();
                ent.setX(loc.getX() + 2.0);
                ent.setX(loc.getZ() + 2.0);
                loc.setY(loc.getY() + 2.0);
                p.playEffect(ent, Effect.LAVA_POP, 11);
                p.teleport(loc);
                for (final Player all : Bukkit.getOnlinePlayers()) {
                    p.showPlayer(all);
                    PlayerHider.hidden.remove(p);
                }
                p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Alle Spieler sind nun f\u00fcr dich §asichtbar§7!");
                p.closeInventory();
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cSpieler verstecken")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 999999));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5, 999999));
                final Location loc = p.getLocation();
                final Location ent = p.getLocation();
                ent.setX(loc.getX() + 2.0);
                ent.setX(loc.getZ() + 2.0);
                loc.setY(loc.getY() + 2.0);
                p.playEffect(ent, Effect.LAVA_POP, 11);
                p.teleport(loc);
                for (final Player all : Bukkit.getOnlinePlayers()) {
                    PlayerHider.hidden.add(p);
                    p.hidePlayer(all);
                }
                p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1.0f, 1.0f);
                p.sendMessage(Data.Prefix + "§7Alle Spieler sind nun f\u00fcr dich §cunsichtbar§7!");
                p.closeInventory();
            }
        }
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        for (final Player all : Bukkit.getOnlinePlayers()) {
            if (PlayerHider.hidden.contains(all)) {
                all.hidePlayer(p);
            }
        }
    }
    
    static {
        PlayerHider.hidden = new ArrayList<Player>();
    }
}
