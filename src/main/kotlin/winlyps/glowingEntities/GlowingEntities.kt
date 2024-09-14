package winlyps.glowingEntities

import org.bukkit.plugin.java.JavaPlugin

class GlowingEntities : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(GlowAllListener(this), this)

        logger.info("GlowingEntities plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("GlowingEntities plugin has been disabled.")
    }
}