package com.someoneday.autosprint;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.effect.MobEffects;

public final class AutoSprintManager {
	private static boolean enabled;

	private AutoSprintManager() {
	}

	public static boolean isEnabled() {
		return enabled;
	}

	public static boolean toggle() {
		enabled = !enabled;
		return enabled;
	}

	public static void tick(Minecraft client) {
		if (!enabled) {
			return;
		}

		LocalPlayer player = client.player;
		if (player == null || player.input == null) {
			return;
		}

		if (!shouldMoveForward(client, player)) {
			return;
		}

		if (!canSprint(player)) {
			return;
		}

		player.setSprinting(true);
	}

	private static boolean shouldMoveForward(Minecraft client, LocalPlayer player) {
		if (client.options.keyUp.isDown()) {
			return true;
		}

		return player.input.hasForwardImpulse();
	}

	private static boolean canSprint(LocalPlayer player) {
		if (player.isCrouching() || player.isFallFlying() || player.isPassenger()) {
			return false;
		}

		if (player.isUsingItem() && !player.isPassenger()) {
			return false;
		}

		if (player.hasEffect(MobEffects.BLINDNESS)) {
			return false;
		}

		if (player.getFoodData().getFoodLevel() <= 6 && !player.getAbilities().flying) {
			return false;
		}

		return true;
	}
}
