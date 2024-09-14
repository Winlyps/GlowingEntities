package winlyps.glowingEntities

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntitySpawnEvent

class GlowAllListener(private val plugin: GlowingEntities) : Listener {

    @EventHandler
    fun onEntitySpawn(event: EntitySpawnEvent) {
        val entity = event.entity
        entity.isGlowing = true
    }
}