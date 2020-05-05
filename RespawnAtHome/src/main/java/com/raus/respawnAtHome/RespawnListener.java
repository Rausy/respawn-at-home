package com.raus.respawnAtHome;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.User;

public class RespawnListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onRespawn(PlayerRespawnEvent event) throws Exception
	{
		// Get essentials plugin
		Essentials ess = (Essentials) Bukkit.getPluginManager().getPlugin("Essentials");
		
		// Get essentials user
		User user = ess.getUser(event.getPlayer().getUniqueId());
		
		// Check if user has a home
		Location loc = user.getHome("home");
		if (loc != null)
		{
			// Respawn them there
			event.setRespawnLocation(loc);
		}
	}
}