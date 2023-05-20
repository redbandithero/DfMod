package io.github.redbandithero.dfmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.debug.PathfindingDebugRenderer;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class DFModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MinecraftClient client = MinecraftClient.getInstance();
    }

    public static void tick() {
        MinecraftClient client = MinecraftClient.getInstance();
        assert client.player != null;
        client.inGameHud.vignetteDarkness = 20.0F;
        client.fpsDebugString = "first person shooter: " + client.fpsDebugString;
    }
}