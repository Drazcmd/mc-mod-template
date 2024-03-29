package minecraftmodtemplate;

import net.minecraft.entity.player.EntityPlayer;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {

  /**
   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
   */
  public void preInit()
  {
	  // note how we read config first
	  minecraftmodtemplate.mbe70_configuration.StartupCommon.preInitCommon();
      minecraftmodtemplate.mbe01_block_simple.StartupCommon.preInitCommon();
  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init()
  {
	minecraftmodtemplate.mbe70_configuration.StartupCommon.initCommon();
    minecraftmodtemplate.mbe01_block_simple.StartupCommon.initCommon();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
	minecraftmodtemplate.mbe70_configuration.StartupCommon.postInitCommon();
    minecraftmodtemplate.mbe01_block_simple.StartupCommon.postInitCommon();

  }

  // helper to determine whether the given player is in creative mode
  //  not necessary for most examples
  abstract public boolean playerIsInCreativeMode(EntityPlayer player);

  /**
   * is this a dedicated server?
   * @return true if this is a dedicated server, false otherwise
   */
  abstract public boolean isDedicatedServer();
}
