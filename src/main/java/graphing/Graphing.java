package graphing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import graphing.events.GraphingEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;


@Mod("devgraph")
public class Graphing {
    
    public static final Logger LOGGER = LogManager.getLogger();
    public GraphingEvents events = new GraphingEvents();

    public Graphing(){
        events.RegisterEvents();
    }
    public static void setup(final FMLCommonSetupEvent event) {
       LOGGER.warn("Hewwo, Graphing is setting up");
    }

    public static void doClientStuff(final FMLClientSetupEvent event) { }

}
