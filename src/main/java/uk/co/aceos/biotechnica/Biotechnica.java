package uk.co.aceos.biotechnica;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.aceos.biotechnica.proxy.CommonProxy;
import uk.co.aceos.biotechnica.tab.CreativeTabBiotechnica;

@Mod(modid = Biotechnica.MODID, version = Biotechnica.VERSION, name = Biotechnica.NAME)
public class Biotechnica {
    public static final String MODID = "biotechnica";
    public static final String VERSION = "1.0";
    public static final String NAME = "Biotechnica";

    @SidedProxy(clientSide = "uk.co.aceos.biotechnica.proxy.ClientProxy;", serverSide = "uk.co.aceos.biotechnica.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Biotechnica instance;

    public static CreativeTabBiotechnica tabBiotechnica;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabBiotechnica = new CreativeTabBiotechnica(CreativeTabs.getNextID(), "tab_biotechnica");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}
