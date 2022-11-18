package com.blackjack.main.Controller;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.blackjack.main.Pages.Casino;

public class MainController extends Game {

	
	@Override
	public void create () {
		setScreen(new Casino());

	}



}
