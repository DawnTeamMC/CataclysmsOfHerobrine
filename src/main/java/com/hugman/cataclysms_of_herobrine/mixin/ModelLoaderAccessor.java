package com.hugman.cataclysms_of_herobrine.mixin;

import com.hugman.cataclysms_of_herobrine.util.Constants;
import com.hugman.cataclysms_of_herobrine.util.MathHelper;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ModelLoader.class)
public class ModelLoaderAccessor {
	@ModifyArg(method = "loadModelFromJson", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourceManager;getResource(Lnet/minecraft/util/Identifier;)Lnet/minecraft/resource/Resource;"), index = 0)
	private Identifier modifyId(Identifier id) {
		if(id.getPath().contains("block/cube_all")) return id;
		if(Constants.randomizeModels) {
			if(MathHelper.chance(10)) {
				return new Identifier(id.getNamespace(), "models/block/bedrock.json");
			}
		}
		return id;
	}
}
