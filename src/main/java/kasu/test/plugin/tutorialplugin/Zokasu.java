package kasu.test.plugin.tutorialplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Zokasu extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("onEnable呼び出され");
	
	}
	
	@Override
	public void onDisable(){
		getLogger().info("onDisable呼び出され");
		
	}
}
