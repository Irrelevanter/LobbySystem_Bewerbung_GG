// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.inventar;

import de.irrelevanter.lobbsystem.data.Data;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import de.irrelevanter.lobbsystem.main.Main;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class LobbySwitcher implements Listener
{
    public static ArrayList<Player> into;
    private Main pl;
    
    public LobbySwitcher(final Main Main) {
        this.pl = Main;
    }
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        try {
            if (e.getItem().getType() == Material.NETHER_STAR) {
                LobbySwitcher.into.add(p);
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
                p.openInventory(inv);
                LobbySwitcher.into.add(p);
            }
        }
        catch (Exception ex) {}
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClose(final InventoryCloseEvent e) {
        final Player p = (Player)e.getPlayer();
        LobbySwitcher.into.remove(p);
    }
    
    @EventHandler
    public void onClick(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aLobby-01§8 » §2Online")) {
            p.sendMessage(Data.Prefix + "§cDu befindest dich bereits auf dieser Lobby!");
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aLobby §8» §cWird bei Bedarf gestartet")) {
            p.sendMessage(Data.Prefix + "§cDiese Lobby ist Offline, kann jedoch bei Bedarf gestartet werden!");
        }
    }
    
    static {
        LobbySwitcher.into = new ArrayList<Player>();
    }
}
