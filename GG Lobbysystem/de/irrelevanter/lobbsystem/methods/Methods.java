// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.methods;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Methods
{
    public static void setLobbyItems(final Player p) {
        final ItemStack compass = new ItemStack(Material.COMPASS);
        final ItemMeta cm = compass.getItemMeta();
        cm.setDisplayName("§eNavigator");
        compass.setItemMeta(cm);
        final ItemStack spielerverstecken = new ItemStack(Material.BLAZE_ROD);
        final ItemMeta sv = spielerverstecken.getItemMeta();
        sv.setDisplayName("§aSpieler-Verstecken");
        spielerverstecken.setItemMeta(sv);
        final ItemStack lobbyswitch = new ItemStack(Material.NETHER_STAR);
        final ItemMeta ls = lobbyswitch.getItemMeta();
        ls.setDisplayName("§cLobby-Switcher");
        lobbyswitch.setItemMeta(ls);
        final ItemStack gadgets = new ItemStack(Material.CHEST);
        final ItemMeta gm = gadgets.getItemMeta();
        gm.setDisplayName("§bGadgets");
        gadgets.setItemMeta(gm);
        p.getInventory().clear();
        p.getInventory().setItem(0, compass);
        p.getInventory().setItem(1, spielerverstecken);
        p.getInventory().setItem(7, lobbyswitch);
        p.getInventory().setItem(8, gadgets);
        p.updateInventory();
    }
}
