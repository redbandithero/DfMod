package io.github.redbandithero.dfmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class DFModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("DfModClient has been initialized!");
    }
}