package com.mati.serverinfo;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new PingListener(), this);
	}
}
