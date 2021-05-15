package graphing.events;

import graphing.Graphing;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@EventBusSubscriber
public class GraphingEvents {
    
    // this is for registering  mod events
    @SubscribeEvent
    public void RegisterEvents(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Graphing::setup);
    }
}
