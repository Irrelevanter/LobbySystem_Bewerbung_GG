// 
// Decompiled by Procyon v0.5.36
// 

package de.irrelevanter.lobbsystem.data;

import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;

public class Data
{
    public static String Prefix;
    public static String NoPerm;
    public static File file;
    public static YamlConfiguration cfg;
    public static Location spawn;
    public static Location spawn1;
    public static Location spawn2;
    public static Location spawn3;
    public static Location spawn4;
    public static Location spawn5;
    public static Location spawn6;
    
    static {
        Data.Prefix = "§8[§cLobby§8] ";
        Data.NoPerm = Data.Prefix + "§cDu hast keine Rechte um dies zu tun!";
        Data.file = new File("plugins//LobbySystem//spawns.yml");
        Data.cfg = YamlConfiguration.loadConfiguration(Data.file);
    }
}
