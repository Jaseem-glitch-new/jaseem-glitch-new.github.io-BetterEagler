package net.minecraft.init;

import net.eaglerforge.api.BaseData;
import net.eaglerforge.api.ModData;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

/**+
 * This portion of EaglercraftX contains deobfuscated Minecraft 1.8 source code.
 * 
 * Minecraft 1.8.8 bytecode is (c) 2015 Mojang AB. "Do not distribute!"
 * Mod Coder Pack v9.18 deobfuscation configs are (c) Copyright by the MCP Team
 * 
 * EaglercraftX 1.8 patch files (c) 2022-2024 lax1dude, ayunami2000. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class Blocks extends ModData {
	public static Block air;
	public static Block stone;
	public static BlockGrass grass;
	public static Block dirt;
	public static Block cobblestone;
	public static Block planks;
	public static Block sapling;
	public static Block bedrock;
	public static BlockDynamicLiquid flowing_water;
	public static BlockStaticLiquid water;
	public static BlockDynamicLiquid flowing_lava;
	public static BlockStaticLiquid lava;
	public static BlockSand sand;
	public static Block gravel;
	public static Block gold_ore;
	public static Block iron_ore;
	public static Block coal_ore;
	public static Block log;
	public static Block log2;
	public static BlockLeaves leaves;
	public static BlockLeaves leaves2;
	public static Block sponge;
	public static Block glass;
	public static Block lapis_ore;
	public static Block lapis_block;
	public static Block dispenser;
	public static Block sandstone;
	public static Block noteblock;
	public static Block bed;
	public static Block golden_rail;
	public static Block detector_rail;
	public static BlockPistonBase sticky_piston;
	public static Block web;
	public static BlockTallGrass tallgrass;
	public static BlockDeadBush deadbush;
	public static BlockPistonBase piston;
	public static BlockPistonExtension piston_head;
	public static Block wool;
	public static BlockPistonMoving piston_extension;
	public static BlockFlower yellow_flower;
	public static BlockFlower red_flower;
	public static BlockBush brown_mushroom;
	public static BlockBush red_mushroom;
	public static Block gold_block;
	public static Block iron_block;
	public static BlockSlab double_stone_slab;
	public static BlockSlab stone_slab;
	public static Block brick_block;
	public static Block tnt;
	public static Block bookshelf;
	public static Block mossy_cobblestone;
	public static Block obsidian;
	public static Block torch;
	public static BlockFire fire;
	public static Block mob_spawner;
	public static Block oak_stairs;
	public static BlockChest chest;
	public static BlockRedstoneWire redstone_wire;
	public static Block diamond_ore;
	public static Block diamond_block;
	public static Block crafting_table;
	public static Block wheat;
	public static Block farmland;
	public static Block furnace;
	public static Block lit_furnace;
	public static Block standing_sign;
	public static Block oak_door;
	public static Block spruce_door;
	public static Block birch_door;
	public static Block jungle_door;
	public static Block acacia_door;
	public static Block dark_oak_door;
	public static Block ladder;
	public static Block rail;
	public static Block stone_stairs;
	public static Block wall_sign;
	public static Block lever;
	public static Block stone_pressure_plate;
	public static Block iron_door;
	public static Block wooden_pressure_plate;
	public static Block redstone_ore;
	public static Block lit_redstone_ore;
	public static Block unlit_redstone_torch;
	public static Block redstone_torch;
	public static Block stone_button;
	public static Block snow_layer;
	public static Block ice;
	public static Block snow;
	public static BlockCactus cactus;
	public static Block clay;
	public static BlockReed reeds;
	public static Block jukebox;
	public static Block oak_fence;
	public static Block spruce_fence;
	public static Block birch_fence;
	public static Block jungle_fence;
	public static Block dark_oak_fence;
	public static Block acacia_fence;
	public static Block pumpkin;
	public static Block netherrack;
	public static Block soul_sand;
	public static Block glowstone;
	public static BlockPortal portal;
	public static Block lit_pumpkin;
	public static Block cake;
	public static BlockRedstoneRepeater unpowered_repeater;
	public static BlockRedstoneRepeater powered_repeater;
	public static Block trapdoor;
	public static Block monster_egg;
	public static Block stonebrick;
	public static Block brown_mushroom_block;
	public static Block red_mushroom_block;
	public static Block iron_bars;
	public static Block glass_pane;
	public static Block melon_block;
	public static Block pumpkin_stem;
	public static Block melon_stem;
	public static Block vine;
	public static Block oak_fence_gate;
	public static Block spruce_fence_gate;
	public static Block birch_fence_gate;
	public static Block jungle_fence_gate;
	public static Block dark_oak_fence_gate;
	public static Block acacia_fence_gate;
	public static Block brick_stairs;
	public static Block stone_brick_stairs;
	public static BlockMycelium mycelium;
	public static Block waterlily;
	public static Block nether_brick;
	public static Block nether_brick_fence;
	public static Block nether_brick_stairs;
	public static Block nether_wart;
	public static Block enchanting_table;
	public static Block brewing_stand;
	public static BlockCauldron cauldron;
	public static Block end_portal;
	public static Block end_portal_frame;
	public static Block end_stone;
	public static Block dragon_egg;
	public static Block redstone_lamp;
	public static Block lit_redstone_lamp;
	public static BlockSlab double_wooden_slab;
	public static BlockSlab wooden_slab;
	public static Block cocoa;
	public static Block sandstone_stairs;
	public static Block emerald_ore;
	public static Block ender_chest;
	public static BlockTripWireHook tripwire_hook;
	public static Block tripwire;
	public static Block emerald_block;
	public static Block spruce_stairs;
	public static Block birch_stairs;
	public static Block jungle_stairs;
	public static Block command_block;
	public static BlockBeacon beacon;
	public static Block cobblestone_wall;
	public static Block flower_pot;
	public static Block carrots;
	public static Block potatoes;
	public static Block wooden_button;
	public static BlockSkull skull;
	public static Block anvil;
	public static Block trapped_chest;
	public static Block light_weighted_pressure_plate;
	public static Block heavy_weighted_pressure_plate;
	public static BlockRedstoneComparator unpowered_comparator;
	public static BlockRedstoneComparator powered_comparator;
	public static BlockDaylightDetector daylight_detector;
	public static BlockDaylightDetector daylight_detector_inverted;
	public static Block redstone_block;
	public static Block quartz_ore;
	public static BlockHopper hopper;
	public static Block quartz_block;
	public static Block quartz_stairs;
	public static Block activator_rail;
	public static Block dropper;
	public static Block stained_hardened_clay;
	public static Block barrier;
	public static Block iron_trapdoor;
	public static Block hay_block;
	public static Block carpet;
	public static Block hardened_clay;
	public static Block coal_block;
	public static Block packed_ice;
	public static Block acacia_stairs;
	public static Block dark_oak_stairs;
	public static Block slime_block;
	public static BlockDoublePlant double_plant;
	public static BlockStainedGlass stained_glass;
	public static BlockStainedGlassPane stained_glass_pane;
	public static Block prismarine;
	public static Block sea_lantern;
	public static Block standing_banner;
	public static Block wall_banner;
	public static Block red_sandstone;
	public static Block red_sandstone_stairs;
	public static BlockSlab double_stone_slab2;
	public static BlockSlab stone_slab2;

	/**+
	 * Returns the Block in the blockRegistry with the specified
	 * name.
	 */
	private static Block getRegisteredBlock(String parString1) {
		return (Block) Block.blockRegistry.getObject(new ResourceLocation(parString1));
	}

	public static ModData makeModData() {
		ModData data = new ModData();
		Map<ResourceLocation, Block> blockMap = Block.blockRegistry.registryObjects;
		for (Map.Entry<ResourceLocation, Block> entry : blockMap.entrySet()) {
			if (entry.getKey().resourceName != null && entry.getValue() != null) {
				data.set(entry.getKey().resourceName, entry.getValue().makeModData());
			}
		}
		return data;
	}

	static void doBootstrap() {
		if (!Bootstrap.isRegistered()) {
			throw new RuntimeException("Accessed Blocks before Bootstrap!");
		} else {
			air = getRegisteredBlock("air");
			stone = getRegisteredBlock("stone");
			grass = (BlockGrass) getRegisteredBlock("grass");
			dirt = getRegisteredBlock("dirt");
			cobblestone = getRegisteredBlock("cobblestone");
			planks = getRegisteredBlock("planks");
			sapling = getRegisteredBlock("sapling");
			bedrock = getRegisteredBlock("bedrock");
			flowing_water = (BlockDynamicLiquid) getRegisteredBlock("flowing_water");
			water = (BlockStaticLiquid) getRegisteredBlock("water");
			flowing_lava = (BlockDynamicLiquid) getRegisteredBlock("flowing_lava");
			lava = (BlockStaticLiquid) getRegisteredBlock("lava");
			sand = (BlockSand) getRegisteredBlock("sand");
			gravel = getRegisteredBlock("gravel");
			gold_ore = getRegisteredBlock("gold_ore");
			iron_ore = getRegisteredBlock("iron_ore");
			coal_ore = getRegisteredBlock("coal_ore");
			log = getRegisteredBlock("log");
			log2 = getRegisteredBlock("log2");
			leaves = (BlockLeaves) getRegisteredBlock("leaves");
			leaves2 = (BlockLeaves) getRegisteredBlock("leaves2");
			sponge = getRegisteredBlock("sponge");
			glass = getRegisteredBlock("glass");
			lapis_ore = getRegisteredBlock("lapis_ore");
			lapis_block = getRegisteredBlock("lapis_block");
			dispenser = getRegisteredBlock("dispenser");
			sandstone = getRegisteredBlock("sandstone");
			noteblock = getRegisteredBlock("noteblock");
			bed = getRegisteredBlock("bed");
			golden_rail = getRegisteredBlock("golden_rail");
			detector_rail = getRegisteredBlock("detector_rail");
			sticky_piston = (BlockPistonBase) getRegisteredBlock("sticky_piston");
			web = getRegisteredBlock("web");
			tallgrass = (BlockTallGrass) getRegisteredBlock("tallgrass");
			deadbush = (BlockDeadBush) getRegisteredBlock("deadbush");
			piston = (BlockPistonBase) getRegisteredBlock("piston");
			piston_head = (BlockPistonExtension) getRegisteredBlock("piston_head");
			wool = getRegisteredBlock("wool");
			piston_extension = (BlockPistonMoving) getRegisteredBlock("piston_extension");
			yellow_flower = (BlockFlower) getRegisteredBlock("yellow_flower");
			red_flower = (BlockFlower) getRegisteredBlock("red_flower");
			brown_mushroom = (BlockBush) getRegisteredBlock("brown_mushroom");
			red_mushroom = (BlockBush) getRegisteredBlock("red_mushroom");
			gold_block = getRegisteredBlock("gold_block");
			iron_block = getRegisteredBlock("iron_block");
			double_stone_slab = (BlockSlab) getRegisteredBlock("double_stone_slab");
			stone_slab = (BlockSlab) getRegisteredBlock("stone_slab");
			brick_block = getRegisteredBlock("brick_block");
			tnt = getRegisteredBlock("tnt");
			bookshelf = getRegisteredBlock("bookshelf");
			mossy_cobblestone = getRegisteredBlock("mossy_cobblestone");
			obsidian = getRegisteredBlock("obsidian");
			torch = getRegisteredBlock("torch");
			fire = (BlockFire) getRegisteredBlock("fire");
			mob_spawner = getRegisteredBlock("mob_spawner");
			oak_stairs = getRegisteredBlock("oak_stairs");
			chest = (BlockChest) getRegisteredBlock("chest");
			redstone_wire = (BlockRedstoneWire) getRegisteredBlock("redstone_wire");
			diamond_ore = getRegisteredBlock("diamond_ore");
			diamond_block = getRegisteredBlock("diamond_block");
			crafting_table = getRegisteredBlock("crafting_table");
			wheat = getRegisteredBlock("wheat");
			farmland = getRegisteredBlock("farmland");
			furnace = getRegisteredBlock("furnace");
			lit_furnace = getRegisteredBlock("lit_furnace");
			standing_sign = getRegisteredBlock("standing_sign");
			oak_door = getRegisteredBlock("wooden_door");
			spruce_door = getRegisteredBlock("spruce_door");
			birch_door = getRegisteredBlock("birch_door");
			jungle_door = getRegisteredBlock("jungle_door");
			acacia_door = getRegisteredBlock("acacia_door");
			dark_oak_door = getRegisteredBlock("dark_oak_door");
			ladder = getRegisteredBlock("ladder");
			rail = getRegisteredBlock("rail");
			stone_stairs = getRegisteredBlock("stone_stairs");
			wall_sign = getRegisteredBlock("wall_sign");
			lever = getRegisteredBlock("lever");
			stone_pressure_plate = getRegisteredBlock("stone_pressure_plate");
			iron_door = getRegisteredBlock("iron_door");
			wooden_pressure_plate = getRegisteredBlock("wooden_pressure_plate");
			redstone_ore = getRegisteredBlock("redstone_ore");
			lit_redstone_ore = getRegisteredBlock("lit_redstone_ore");
			unlit_redstone_torch = getRegisteredBlock("unlit_redstone_torch");
			redstone_torch = getRegisteredBlock("redstone_torch");
			stone_button = getRegisteredBlock("stone_button");
			snow_layer = getRegisteredBlock("snow_layer");
			ice = getRegisteredBlock("ice");
			snow = getRegisteredBlock("snow");
			cactus = (BlockCactus) getRegisteredBlock("cactus");
			clay = getRegisteredBlock("clay");
			reeds = (BlockReed) getRegisteredBlock("reeds");
			jukebox = getRegisteredBlock("jukebox");
			oak_fence = getRegisteredBlock("fence");
			spruce_fence = getRegisteredBlock("spruce_fence");
			birch_fence = getRegisteredBlock("birch_fence");
			jungle_fence = getRegisteredBlock("jungle_fence");
			dark_oak_fence = getRegisteredBlock("dark_oak_fence");
			acacia_fence = getRegisteredBlock("acacia_fence");
			pumpkin = getRegisteredBlock("pumpkin");
			netherrack = getRegisteredBlock("netherrack");
			soul_sand = getRegisteredBlock("soul_sand");
			glowstone = getRegisteredBlock("glowstone");
			portal = (BlockPortal) getRegisteredBlock("portal");
			lit_pumpkin = getRegisteredBlock("lit_pumpkin");
			cake = getRegisteredBlock("cake");
			unpowered_repeater = (BlockRedstoneRepeater) getRegisteredBlock("unpowered_repeater");
			powered_repeater = (BlockRedstoneRepeater) getRegisteredBlock("powered_repeater");
			trapdoor = getRegisteredBlock("trapdoor");
			monster_egg = getRegisteredBlock("monster_egg");
			stonebrick = getRegisteredBlock("stonebrick");
			brown_mushroom_block = getRegisteredBlock("brown_mushroom_block");
			red_mushroom_block = getRegisteredBlock("red_mushroom_block");
			iron_bars = getRegisteredBlock("iron_bars");
			glass_pane = getRegisteredBlock("glass_pane");
			melon_block = getRegisteredBlock("melon_block");
			pumpkin_stem = getRegisteredBlock("pumpkin_stem");
			melon_stem = getRegisteredBlock("melon_stem");
			vine = getRegisteredBlock("vine");
			oak_fence_gate = getRegisteredBlock("fence_gate");
			spruce_fence_gate = getRegisteredBlock("spruce_fence_gate");
			birch_fence_gate = getRegisteredBlock("birch_fence_gate");
			jungle_fence_gate = getRegisteredBlock("jungle_fence_gate");
			dark_oak_fence_gate = getRegisteredBlock("dark_oak_fence_gate");
			acacia_fence_gate = getRegisteredBlock("acacia_fence_gate");
			brick_stairs = getRegisteredBlock("brick_stairs");
			stone_brick_stairs = getRegisteredBlock("stone_brick_stairs");
			mycelium = (BlockMycelium) getRegisteredBlock("mycelium");
			waterlily = getRegisteredBlock("waterlily");
			nether_brick = getRegisteredBlock("nether_brick");
			nether_brick_fence = getRegisteredBlock("nether_brick_fence");
			nether_brick_stairs = getRegisteredBlock("nether_brick_stairs");
			nether_wart = getRegisteredBlock("nether_wart");
			enchanting_table = getRegisteredBlock("enchanting_table");
			brewing_stand = getRegisteredBlock("brewing_stand");
			cauldron = (BlockCauldron) getRegisteredBlock("cauldron");
			end_portal = getRegisteredBlock("end_portal");
			end_portal_frame = getRegisteredBlock("end_portal_frame");
			end_stone = getRegisteredBlock("end_stone");
			dragon_egg = getRegisteredBlock("dragon_egg");
			redstone_lamp = getRegisteredBlock("redstone_lamp");
			lit_redstone_lamp = getRegisteredBlock("lit_redstone_lamp");
			double_wooden_slab = (BlockSlab) getRegisteredBlock("double_wooden_slab");
			wooden_slab = (BlockSlab) getRegisteredBlock("wooden_slab");
			cocoa = getRegisteredBlock("cocoa");
			sandstone_stairs = getRegisteredBlock("sandstone_stairs");
			emerald_ore = getRegisteredBlock("emerald_ore");
			ender_chest = getRegisteredBlock("ender_chest");
			tripwire_hook = (BlockTripWireHook) getRegisteredBlock("tripwire_hook");
			tripwire = getRegisteredBlock("tripwire");
			emerald_block = getRegisteredBlock("emerald_block");
			spruce_stairs = getRegisteredBlock("spruce_stairs");
			birch_stairs = getRegisteredBlock("birch_stairs");
			jungle_stairs = getRegisteredBlock("jungle_stairs");
			command_block = getRegisteredBlock("command_block");
			beacon = (BlockBeacon) getRegisteredBlock("beacon");
			cobblestone_wall = getRegisteredBlock("cobblestone_wall");
			flower_pot = getRegisteredBlock("flower_pot");
			carrots = getRegisteredBlock("carrots");
			potatoes = getRegisteredBlock("potatoes");
			wooden_button = getRegisteredBlock("wooden_button");
			skull = (BlockSkull) getRegisteredBlock("skull");
			anvil = getRegisteredBlock("anvil");
			trapped_chest = getRegisteredBlock("trapped_chest");
			light_weighted_pressure_plate = getRegisteredBlock("light_weighted_pressure_plate");
			heavy_weighted_pressure_plate = getRegisteredBlock("heavy_weighted_pressure_plate");
			unpowered_comparator = (BlockRedstoneComparator) getRegisteredBlock("unpowered_comparator");
			powered_comparator = (BlockRedstoneComparator) getRegisteredBlock("powered_comparator");
			daylight_detector = (BlockDaylightDetector) getRegisteredBlock("daylight_detector");
			daylight_detector_inverted = (BlockDaylightDetector) getRegisteredBlock("daylight_detector_inverted");
			redstone_block = getRegisteredBlock("redstone_block");
			quartz_ore = getRegisteredBlock("quartz_ore");
			hopper = (BlockHopper) getRegisteredBlock("hopper");
			quartz_block = getRegisteredBlock("quartz_block");
			quartz_stairs = getRegisteredBlock("quartz_stairs");
			activator_rail = getRegisteredBlock("activator_rail");
			dropper = getRegisteredBlock("dropper");
			stained_hardened_clay = getRegisteredBlock("stained_hardened_clay");
			barrier = getRegisteredBlock("barrier");
			iron_trapdoor = getRegisteredBlock("iron_trapdoor");
			hay_block = getRegisteredBlock("hay_block");
			carpet = getRegisteredBlock("carpet");
			hardened_clay = getRegisteredBlock("hardened_clay");
			coal_block = getRegisteredBlock("coal_block");
			packed_ice = getRegisteredBlock("packed_ice");
			acacia_stairs = getRegisteredBlock("acacia_stairs");
			dark_oak_stairs = getRegisteredBlock("dark_oak_stairs");
			slime_block = getRegisteredBlock("slime");
			double_plant = (BlockDoublePlant) getRegisteredBlock("double_plant");
			stained_glass = (BlockStainedGlass) getRegisteredBlock("stained_glass");
			stained_glass_pane = (BlockStainedGlassPane) getRegisteredBlock("stained_glass_pane");
			prismarine = getRegisteredBlock("prismarine");
			sea_lantern = getRegisteredBlock("sea_lantern");
			standing_banner = getRegisteredBlock("standing_banner");
			wall_banner = getRegisteredBlock("wall_banner");
			red_sandstone = getRegisteredBlock("red_sandstone");
			red_sandstone_stairs = getRegisteredBlock("red_sandstone_stairs");
			double_stone_slab2 = (BlockSlab) getRegisteredBlock("double_stone_slab2");
			stone_slab2 = (BlockSlab) getRegisteredBlock("stone_slab2");
		}
	}

}