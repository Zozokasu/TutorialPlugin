package kasu.test.plugin.tutorialplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Zokasu extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("onEnable�Ăяo����");
	
	}
	
	@Override
	public void onDisable(){
		getLogger().info("onDisable�Ăяo����");
		
	}
}
