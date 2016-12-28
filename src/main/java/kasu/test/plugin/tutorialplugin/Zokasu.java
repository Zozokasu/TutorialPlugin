package kasu.test.plugin.tutorialplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.*;


public class Zokasu extends JavaPlugin {
	
	@Override
	public void onEnable(){
	    Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Test");
	    System.out.println("Test");
	}
	@Override
	public void onDisable(){
	    System.out.println("test");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    if(cmd.getName().equalsIgnoreCase("jf")){
	        sender.sendMessage("jfa");
	        return true;
	    }
	    return false;
	}
}
