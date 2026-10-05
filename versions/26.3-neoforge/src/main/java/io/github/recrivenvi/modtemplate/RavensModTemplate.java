package io.github.recrivenvi.modtemplate;

import net.neoforged.fml.common.Mod;
import org.slf4j.LoggerFactory;

@Mod(ModIdentity.ID)
public final class RavensModTemplate {
    public RavensModTemplate() {
        LoggerFactory.getLogger(ModIdentity.ID).info("Raven's Mod Template loaded");
    }
}
