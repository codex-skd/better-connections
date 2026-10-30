package com.skd.betterconnections;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;

@Mod(BetterConnections.MODID)
public class BetterConnections {
    public static final String MODID = "better_connections";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BetterConnections() {
        LOGGER.info("Initializing Better Connections");
    }
}
