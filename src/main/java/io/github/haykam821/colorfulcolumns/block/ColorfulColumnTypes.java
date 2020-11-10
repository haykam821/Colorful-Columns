package io.github.haykam821.colorfulcolumns.block;

import io.github.haykam821.colorfulcolumns.Main;
import io.github.haykam821.columns.block.ColumnBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum ColorfulColumnTypes {
	WHITE_CONCRETE("white_concrete", Blocks.WHITE_CONCRETE),
	ORANGE_CONCRETE("orange_concrete", Blocks.ORANGE_CONCRETE),
	MAGENTA_CONCRETE("magenta_concrete", Blocks.MAGENTA_CONCRETE),
	LIGHT_BLUE_CONCRETE("light_blue_concrete", Blocks.LIGHT_BLUE_CONCRETE),
	YELLOW_CONCRETE("yellow_concrete", Blocks.YELLOW_CONCRETE),
	LIME_CONCRETE("lime_concrete", Blocks.LIME_CONCRETE),
	PINK_CONCRETE("pink_concrete", Blocks.PINK_CONCRETE),
	GRAY_CONCRETE("gray_concrete", Blocks.GRAY_CONCRETE),
	LIGHT_GRAY_CONCRETE("light_gray_concrete", Blocks.LIGHT_GRAY_CONCRETE),
	CYAN_CONCRETE("cyan_concrete", Blocks.CYAN_CONCRETE),
	PURPLE_CONCRETE("purple_concrete", Blocks.PURPLE_CONCRETE),
	BLUE_CONCRETE("blue_concrete", Blocks.BLUE_CONCRETE),
	BROWN_CONCRETE("brown_concrete", Blocks.BROWN_CONCRETE),
	GREEN_CONCRETE("green_concrete", Blocks.GREEN_CONCRETE),
	RED_CONCRETE("red_concrete", Blocks.RED_CONCRETE),
	BLACK_CONCRETE("black_concrete", Blocks.BLACK_CONCRETE),
	TERRACOTTA("terracotta", Blocks.TERRACOTTA),
	WHITE_TERRACOTTA("white_terracotta", Blocks.WHITE_TERRACOTTA),
	ORANGE_TERRACOTTA("orange_terracotta", Blocks.ORANGE_TERRACOTTA),
	MAGENTA_TERRACOTTA("magenta_terracotta", Blocks.MAGENTA_TERRACOTTA),
	LIGHT_BLUE_TERRACOTTA("light_blue_terracotta", Blocks.LIGHT_BLUE_TERRACOTTA),
	YELLOW_TERRACOTTA("yellow_terracotta", Blocks.YELLOW_TERRACOTTA),
	LIME_TERRACOTTA("lime_terracotta", Blocks.LIME_TERRACOTTA),
	PINK_TERRACOTTA("pink_terracotta", Blocks.PINK_TERRACOTTA),
	GRAY_TERRACOTTA("gray_terracotta", Blocks.GRAY_TERRACOTTA),
	LIGHT_GRAY_TERRACOTTA("light_gray_terracotta", Blocks.LIGHT_GRAY_TERRACOTTA),
	CYAN_TERRACOTTA("cyan_terracotta", Blocks.CYAN_TERRACOTTA),
	PURPLE_TERRACOTTA("purple_terracotta", Blocks.PURPLE_TERRACOTTA),
	BLUE_TERRACOTTA("blue_terracotta", Blocks.BLUE_TERRACOTTA),
	BROWN_TERRACOTTA("brown_terracotta", Blocks.BROWN_TERRACOTTA),
	GREEN_TERRACOTTA("green_terracotta", Blocks.GREEN_TERRACOTTA),
	RED_TERRACOTTA("red_terracotta", Blocks.RED_TERRACOTTA),
	BLACK_TERRACOTTA("black_terracotta", Blocks.BLACK_TERRACOTTA);

	private final Identifier id;
	private final ColumnBlock block;
	private final BlockItem item;

	private ColorfulColumnTypes(String type, Block base) {
		this.id = new Identifier(Main.MOD_ID, type + "_column");
		this.block = new ColumnBlock(FabricBlockSettings.copy(base));
		this.item = new BlockItem(this.block, new Item.Settings().group(ItemGroup.DECORATIONS));
	}

	public ColumnBlock getBlock() {
		return this.block;
	}

	public BlockItem getItem() {
		return this.item;
	}

	public static void register() {
		for (ColorfulColumnTypes columnType : ColorfulColumnTypes.values()) {
			Registry.register(Registry.BLOCK, columnType.id, columnType.block);
			Registry.register(Registry.ITEM, columnType.id, columnType.item);
		}
	}
}