package org.example;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Point d'entrée de l'application JavaFX.
 */
public final class Main extends Application {

    /**
     * Méthode principale de JavaFX, appelée au démarrage de l'application.
     *
     * @param primaryStage La fenêtre principale de l'application.
     */
    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Mon Application JavaFX");
        primaryStage.show();
    }


    /**
     * Point d'entrée de l'application.
     * Cette méthode lance l'application JavaFX.
     *
     * @param args Arguments de la ligne de commande.
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
