// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.listener;

import org.bukkit.entity.Player;
import de.irrelevanter.lobbsystem.data.Data;
import de.irrelevanter.lobbsystem.methods.Methods;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;

public class PlayerJoinListener implements Listener
{
    public void onJoin(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        e.setJoinMessage((String)null);
        Methods.setLobbyItems(p);
        p.setHealth(6.0);
        p.setFoodLevel(6);
        p.teleport(Data.spawn);
    }
}
