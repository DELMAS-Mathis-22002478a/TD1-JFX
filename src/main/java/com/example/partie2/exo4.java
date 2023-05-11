package com.example.partie2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class exo4 extends Application {
    private String chooseColor;
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane border4 = new BorderPane();

        Label colors = new Label(chooseColor);
        VBox setColors = new VBox(colors);
        setColors.setAlignment(Pos.CENTER);

        border4.setTop(setColors);


        Pane midColor = new Pane();
        midColor.setStyle(chooseColor);





        Button vert = new Button("Vert");
        Button rouge = new Button("Rouge");
        Button bleu = new Button("Bleu");
        HBox buttons = new HBox(vert,rouge,bleu);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(10,10,10,10));


        border4.setBottom(buttons);





        // Création de la scene
        Scene scene = new Scene( border4 );

        // Ajout de la scene à la fenêtre
        primaryStage.setScene( scene );

        primaryStage.setTitle("Couleurs");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }

}
