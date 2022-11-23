package com.blackjack.main.Pages;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.blackjack.main.Controller.MainController;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Deck implements Screen {
    //Todo Button für add Pack
    //Todo dynmamische Anzeige für Decks
    //Todo Auswahl des Decks
    //Todo Search
    //Todo Rename
    private SpriteBatch spriteBatch;
    private ShapeRenderer shapeRenderer;
    private AssetManager assetManager;
    private InputMultiplexer multiplexer;
    private MainController mainController;
    private Stage stage;
    private Texture backgroundTexture;

    private ImageButton back;
    private ImageButton forward;
    private ImageButton backToMenu;

    private ArrayList<ImageButton> decks = new ArrayList<>();
    private ArrayList<File> deckFolders = new ArrayList<>();

    @Override
    public void show() {
        Gdx.graphics.setWindowedMode(1920, 1080);

        getActualDecks(new File("assets\\Deck\\actualDecks\\"),deckFolders );
        for (int i = 0; i < deckFolders.size(); i++) {
            decks.add(new ImageButton());

        }
        spriteBatch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();
        assetManager = new AssetManager();
        stage = new Stage();

        multiplexer = new InputMultiplexer();
        multiplexer.addProcessor(stage);
        Gdx.input.setInputProcessor(multiplexer);


        backgroundTexture = new Texture("Pages\\Deck\\CardDeckBaseBG.png");
    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(backgroundTexture, 0, 0);
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

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private void setSkin() {
        assetManager.load("assets\\Pages\\Casino\\Json\\QuitButton.json", Skin.class);
        assetManager.finishLoading();
        mainGames = assetManager.get("assets\\Pages\\Casino\\Json\\GameGalleryButton.json", Skin.class);
    }

    private void setButton() {
        gameGallery = new ImageButton(mainGames);
        gameGallery.setBounds(537, height - 200, 537, 124);

        addListener();
        addActorToStage();
    }

    private void addActorToStage() {
    }

    private void addListener() {
        gameGallery.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                goToGame();
            }
        });

    }

    private void getActualDecks(File file, ArrayList<File> list) {

        if (file.isDirectory()) {
            File[] subFiles = file.listFiles();
            if (subFiles == null) {
                return;
            }
            for (File subFile : subFiles) {
                if (subFile.isDirectory()) {
                    list.add(subFile);
                }
            }
        }

    }
}
