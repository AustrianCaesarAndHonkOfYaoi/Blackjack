package com.blackjack.main.Controller;

import com.badlogic.gdx.Game;
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
		Deck deck = new Deck();
		deck.setMainController(this);
		setScreen(deck);
	}



}
