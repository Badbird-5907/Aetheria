
package net.mcreator.aetheria.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.aetheria.AetheriaElements;

@AetheriaElements.ModElement.Tag
public class RickrollItem extends AetheriaElements.ModElement {
	@ObjectHolder("aetheria:rickroll")
	public static final Item block = null;
	public RickrollItem(AetheriaElements instance) {
		super(instance, 326);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AetheriaElements.sounds.get(new ResourceLocation("aetheria:music.rickroll")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("rickroll");
		}
	}
}
