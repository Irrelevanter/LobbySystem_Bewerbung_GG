// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.listener;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.entity.Player;
import org.bukkit.GameMode;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.Listener;

public class LobbyProtection implements Listener
{
    @EventHandler
    public void onEntityDamage(final EntityDamageEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onEntityDamage(final EntityDamageByBlockEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onEntityDamage(final EntityDamageByEntityEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.CREATIVE) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onIn(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (p.getGameMode() == GameMode.CREATIVE) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onDro(final PlayerDropItemEvent e) {
        final Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.CREATIVE) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onDdd(final FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onBlock(final BlockPlaceEvent e) {
        final Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("lobbysystem.build")) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onBlockBreak(final BlockBreakEvent e) {
        final Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.CREATIVE && p.hasPermission("lobbysystem.build")) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
}
