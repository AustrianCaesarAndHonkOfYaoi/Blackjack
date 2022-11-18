package com.blackjack.main.Pages;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Casino implements Screen {
    private SpriteBatch spriteBatch;
    private ShapeRenderer shapeRenderer;
    private Texture backgroundTexture;


    //Todo Games |Deck Setting |Quit

    //create
    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();

        setTexture();
    }

    //Render
    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(backgroundTexture, 180, 0);
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


    private void setTexture() {
        backgroundTexture = new Texture("Pages\\Casino\\file-250072682.png");
    }

    private void goToDeck() {

    }

    private void goToGame() {
    }

    private void goToQuit() {
        Gdx.app.exit();
        System.exit(0);

    }
}
