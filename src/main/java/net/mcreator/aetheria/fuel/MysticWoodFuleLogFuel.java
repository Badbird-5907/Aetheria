
package net.mcreator.aetheria.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.aetheria.block.MysticallogBlock;
import net.mcreator.aetheria.AetheriaElements;

@AetheriaElements.ModElement.Tag
public class MysticWoodFuleLogFuel extends AetheriaElements.ModElement {
	public MysticWoodFuleLogFuel(AetheriaElements instance) {
		super(instance, 63);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(MysticallogBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
