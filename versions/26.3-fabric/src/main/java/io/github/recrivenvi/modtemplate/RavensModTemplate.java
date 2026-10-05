package io.github.recrivenvi.modtemplate;

import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;

public final class RavensModTemplate implements ModInitializer {
    @Override
    public void onInitialize() {
        LoggerFactory.getLogger(ModIdentity.ID).info("Raven's Mod Template loaded");
    }
}
