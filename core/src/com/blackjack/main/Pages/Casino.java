package com.blackjack.main.Pages;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.blackjack.main.Controller.MainController;

public class Casino implements Screen {
    private SpriteBatch spriteBatch;
    private ShapeRenderer shapeRenderer;
    private AssetManager assetManager;
    private InputMultiplexer multiplexer;
    private MainController mainController;
    private Texture backgroundTexture;

    private Skin mainGames;
    private Skin deck;
    private Skin quit;

    private ImageButton gameGallery;
    private ImageButton deskS;
    private ImageButton quitB;

    private Stage stage;
    //Todo Games |Deck Setting |Quit

    //create
    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();
        assetManager = new AssetManager();
        stage = new Stage();

        setTexture();
        setSkin();
        setButton();

        multiplexer = new InputMultiplexer();
        multiplexer.addProcessor(stage);
        Gdx.input.setInputProcessor(multiplexer);
    }


    //Render
    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(backgroundTexture, 180, 0);
        spriteBatch.end();
        stage.draw();
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

    private void setSkin() {
        assetManager.load("assets\\Pages\\Casino\\Json\\GameGalleryButton.json", Skin.class);
        assetManager.load("assets\\Pages\\Casino\\Json\\DeckSettingButton.json", Skin.class);
        assetManager.load("assets\\Pages\\Casino\\Json\\QuitButton.json", Skin.class);
        assetManager.finishLoading();
        mainGames = assetManager.get("assets\\Pages\\Casino\\Json\\GameGalleryButton.json", Skin.class);
        deck = assetManager.get("assets\\Pages\\Casino\\Json\\DeckSettingButton.json", Skin.class);
        quit = assetManager.get("assets\\Pages\\Casino\\Json\\QuitButton.json", Skin.class);

    }

    private void setButton() {
        int height = Gdx.graphics.getHeight();

        gameGallery = new ImageButton(mainGames);
        gameGallery.setBounds(537, height - 200, 537, 124);


        deskS = new ImageButton(deck);
        deskS.setBounds(537, height - 200 - 124 - 100, 537, 124);


        quitB = new ImageButton(quit);
        quitB.setBounds(537, height - 200 - 248 - 200, 537, 124);

        addListener();
        addActorToStage();

    }

    private void addListener() {
        gameGallery.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                goToGame();
            }
        });
        deskS.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                goToDeck();
            }
        });
        quitB.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                goToQuit();
            }
        });
    }

    private void addActorToStage() {
        stage.addActor(gameGallery);
        stage.addActor(deskS);
        stage.addActor(quitB);
    }

    private void goToDeck() {
        mainController.goToDeck();
    }

    private void goToGame() {
    }

    private void goToQuit() {
        Gdx.app.exit();
        System.exit(0);

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
