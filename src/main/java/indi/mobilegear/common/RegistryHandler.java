package indi.mobilegear.common;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = "mobilegear")
public class RegistryHandler {
  public static List<Block> BLOCKS = new ArrayList<>();
  
  public static List<Item> ITEMS = new ArrayList<>();
  
  public static List<IRecipe> RECIPES = new ArrayList<>();
  
  public static List<EntityEntry> ENTITIES = new ArrayList<>();
  
  public static int ENTITYID = 0;
  
  @SubscribeEvent
  public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {}
  
  @SubscribeEvent
  public static void onBlockRegister(RegistryEvent.Register<Block> event) {
    event.getRegistry().registerAll((IForgeRegistryEntry[])BLOCKS.toArray((Object[])new Block[0]));
  }
  
  @SubscribeEvent
  public static void onItemRegister(RegistryEvent.Register<Item> event) {
    event.getRegistry().registerAll((IForgeRegistryEntry[])ITEMS.toArray((Object[])new Item[0]));
  }
  
  @SubscribeEvent
  public static void onModelRegister(ModelRegistryEvent event) {
    for (Item item : ITEMS)
      ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "invenroty")); 
    for (Block block : BLOCKS);
  }
}
