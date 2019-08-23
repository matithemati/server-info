package com.mati.serverinfo;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class PingListener implements Listener {
	
	@EventHandler
	public void onPing(ServerListPingEvent e) {
		e.setMaxPlayers(10);
		e.setMotd(ChatColor.GOLD + "Serwer dla prawdziwych kotów." + "\n" + ChatColor.DARK_PURPLE + "Mrau Mrau Mrau.");
		try {
			e.setServerIcon(Bukkit.loadServerIcon(new File("icon.png")));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
