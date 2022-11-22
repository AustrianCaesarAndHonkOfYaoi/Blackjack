package com.blackjack.main;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.blackjack.main.Controller.MainController;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(60);
        config.setTitle("Blackjack");
        config.setInitialBackgroundColor(Color.ROYAL);
        config.setMaximized(true);
        config.setResizable(false);
        new Lwjgl3Application(new MainController(), config);
    }
}
