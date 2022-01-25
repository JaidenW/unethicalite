package dev.hoot.bot.managers.interaction;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("interaction")
public interface InteractionConfig extends Config
{
	@ConfigSection(
			name = "Interaction manager",
			description = "Interaction settings",
			position = 0
	)
	String interactionManager = "Interaction manager";

	@ConfigItem(
			keyName = "clickSwap",
			name = "Click-swap",
			description = "Swaps the menuaction after clicking (may be slower)",
			section = interactionManager,
			position = 1
	)
	default boolean clickSwap()
	{
		return true;
	}

	@ConfigItem(
			keyName = "naturalMouse",
			name = "Natural mouse",
			description = "Uses the 'natural mouse' algorithm to move and click",
			section = interactionManager,
			position = 2
	)
	default boolean naturalMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "interactType",
			name = "Interact click type",
			description = "Type of clicks to send to the server",
			section = interactionManager,
			position = 3
	)
	default InteractType interactType()
	{
		return InteractType.CLICKBOXES;
	}

	@ConfigItem(
			keyName = "drawMouse",
			name = "Draw mouse events",
			description = "Draws the sent mouse events on screen",
			section = interactionManager,
			position = 4
	)
	default boolean drawMouse()
	{
		return false;
	}
}
