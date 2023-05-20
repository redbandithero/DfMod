package io.github.redbandithero.dfmod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DfMod implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        //get the client logger
        Logger logger = LogManager.getLogger("DfMod");
        //log a message
        logger.info("Hello Fabric world!");
    }
}