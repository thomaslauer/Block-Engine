package com.base.game;

import com.base.core.AbstractGame;
import com.base.core.GameObject;
import com.base.core.components.*;

/**
 * Game class
 * Handles all the game stuff
 */
public class Game extends AbstractGame{
	public void init()
	{
		rootObject.addObject(new GameObject("world").setPosition(0, 0, 0)
				.addComponent(new KeyboardMoveComponent()).addComponent(new TextureRenderComponent("photo", 100, 100))
				.addComponent(new SlideComponent(80, 0, 0)));
	}
}
