package com.blackjack.main.Controller;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.blackjack.main.Pages.Casino;
import com.blackjack.main.Pages.Deck;


public class MainController extends Game {

	
	@Override
	public void create () {
		 Casino casino = new Casino();
		 casino.setMainController(this);
		setScreen(casino);

	}
	public void goToDeck(){
		setScreen(new Deck());
	}



}
