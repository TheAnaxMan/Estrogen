package dev.mayaqq.estrogen.networking;

import com.teamresourceful.resourcefullib.common.networking.NetworkChannel;
import com.teamresourceful.resourcefullib.common.networking.base.NetworkDirection;
import dev.mayaqq.estrogen.Estrogen;
import dev.mayaqq.estrogen.networking.messages.c2s.DashPacket;
import dev.mayaqq.estrogen.networking.messages.c2s.SpawnHeartsPacket;
import dev.mayaqq.estrogen.networking.messages.s2c.StatusEffectPacket;

public class EstrogenNetworkManager {
    public static final NetworkChannel CHANNEL = new NetworkChannel(Estrogen.MOD_ID, 0, "main");

    public static void register() {
        // C2S
        CHANNEL.registerPacket(NetworkDirection.CLIENT_TO_SERVER, DashPacket.ID, DashPacket.HANDLER, DashPacket.class);
        CHANNEL.registerPacket(NetworkDirection.CLIENT_TO_SERVER, SpawnHeartsPacket.ID, SpawnHeartsPacket.HANDLER, SpawnHeartsPacket.class);

        // S2C
        CHANNEL.registerPacket(NetworkDirection.SERVER_TO_CLIENT, StatusEffectPacket.ID, StatusEffectPacket.HANDLER, StatusEffectPacket.class);
    }
}
