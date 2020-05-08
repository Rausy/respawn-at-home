package com.raus.respawnAtHome;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		// Listeners
		getServer().getPluginManager().registerEvents(new RespawnListener(), this);
	}
	
	@Override
	public void onDisable()
	{
		
	}
}