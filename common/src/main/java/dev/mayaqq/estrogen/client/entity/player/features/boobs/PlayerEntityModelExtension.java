package dev.mayaqq.estrogen.client.entity.player.features.boobs;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.armortrim.ArmorTrim;
import org.jetbrains.annotations.Nullable;

public interface PlayerEntityModelExtension {
    public void estrogen$renderBoobs(PoseStack matrices, VertexConsumer vertices, int light, int overlay, AbstractClientPlayer player, float size);

    public void estrogen$renderBoobArmor(PoseStack matrices, MultiBufferSource vertexConsumers, int light, boolean glint, float red, float green, float blue, @Nullable String overlay, AbstractClientPlayer player, float size);

    public void estrogen$renderBoobArmorTrim(PoseStack matrices, MultiBufferSource vertexConsumers, int light, boolean bl, ArmorTrim armorTrim, ArmorMaterial armorMaterial, TextureAtlas armorTrimAtlas);

}
