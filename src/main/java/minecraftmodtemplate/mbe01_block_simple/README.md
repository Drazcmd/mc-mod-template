# MBE01_BLOCK_SIMPLE

This example is just a very simple block--an ordinary solid cube with the six faces numbered from 0-5.

It will show you:

1. how to create a Block class and register it
1. how to define and register the model for rendering the block
1. how to define and register the item corresponding to the block (i.e. when the block is shown in the inventory, or in your hand)

The pieces you need to understand are located in:

* `Startup`
* `BlockSimple`
* `resources\assets\minecraftmodtemplate\lang\en_US.lang` -- for the displayed name of the block
* `resources\assets\minecraftmodtemplate\blockstates\mbe01_block_simple` -- for the blockstate definition
* `resources\assets\minecraftmodtemplate\models\block\mbe01_block_simple_model` -- for the model used to render the block
* `resources\assets\minecraftmodtemplate\textures\blocks\mbe01_***.png` -- textures used for the faces of the block. The particle texture, used for the flying shards when the block is destroyed, is based on the vanilla lapis lazuli block texture.
* `resources\assets\minecraftmodtemplate\models\item\mbe01_block_simple_model` -- the model for rendering the block as an item (i.e. in your hand, in the inventory, when thrown on the ground)

The block will appear in the Blocks tab in the creative inventory.

For background information on:

* blocks: see [http://greyminecraftcoder.blogspot.com.au/2014/12/blocks-18.html](http://greyminecraftcoder.blogspot.com.au/2014/12/blocks-18.html)
* rendering blocks: see [http://greyminecraftcoder.blogspot.com.au/p/list-of-topics.html](http://greyminecraftcoder.blogspot.com.au/p/list-of-topics.html) (the topics under the Block Rendering heading)

Note: Forge has now introduced a new way to schedule when blocks are registered, using an event `RegistryEvent.Register<Block>`. I haven't updated the examples to use this method because I'm not sure it's better than the old way using proxies, but if you are interested, there is a helpful example here:
[https://github.com/LexManos/VoidUtils/blob/master/src/main/java/net/minecraftforge/lex/voidutils/VoidUtils.java](https://github.com/LexManos/VoidUtils/blob/master/src/main/java/net/minecraftforge/lex/voidutils/VoidUtils.java)

## Common errors

"Missing Model", "Missing texture", etc:

These are caused when you have specified a filename or path which is not correct, typically:

1. You've misspelled it
1. The upper/lower case doesn't match
1. You've forgotten the resource domain, eg `blockmodel` instead of `minecraftmodtemplate:blockmodel`
1. The folder structure of your assets folders is incorrect
1. If using IntelliJ 14--the assets aren't copied to the right place, you need to apply a fix to your `build.gradle`, see [http://www.minecraftforge.net/forum/index.php/topic,21354.0.html](http://www.minecraftforge.net/forum/index.php/topic,21354.0.html)
