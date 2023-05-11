package exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class first extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Création du conteneur principal
        BorderPane borderPane1 = new BorderPane();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");

        MenuItem m1 = new MenuItem("New");
        MenuItem m2 = new MenuItem("Open");
        MenuItem m3 = new MenuItem("Save");
        MenuItem m4 = new MenuItem("Close");

        MenuItem m5 = new MenuItem("Cut");
        MenuItem m6 = new MenuItem("Copy");
        MenuItem m7 = new MenuItem("Paste");

        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m4);

        menu2.getItems().add(m5);
        menu2.getItems().add(m6);
        menu2.getItems().add(m7);


        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        borderPane1.setTop(menuBar);
        //borderPane.setCenter(appContent);
        //borderPane.setBottom(statusbar);
        Label label = new Label("Butons :");
        label.setAlignment(Pos.CENTER);
        Button button1 = new Button("Bouton 1");
        Button button2 = new Button("Bouton 2");
        Button button3 = new Button("Bouton 3");


        VBox vButtons = new VBox(label,button1,button2,button3);
        vButtons.setAlignment(Pos.CENTER_LEFT);
        vButtons.setSpacing(10);

        Separator separator = new Separator(Orientation.VERTICAL);
        HBox hbox = new HBox(vButtons, separator);




        borderPane1.setLeft(hbox);

        VBox cent = new VBox();

        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        Label name = new Label("Name :");
        Label email = new Label("Email :");
        Label password = new Label("Password :");

        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextField passwordField = new TextField();

        gridpane.add(name,0,0);
        gridpane.add(email, 0,1);
        gridpane.add(password, 0 ,2);

        gridpane.add(nameField,1,0);
        gridpane.add(emailField, 1,1);
        gridpane.add(passwordField, 1 ,2);

        HBox btns = new HBox();
        btns.setSpacing(10);

        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");

        btns.getChildren().addAll(submit, cancel);
        btns.setAlignment(Pos.CENTER);

        cent.getChildren().addAll(gridpane,btns);
        cent.setAlignment(Pos.CENTER);
        cent.setSpacing(10);

        borderPane1.setCenter(cent);


        VBox msg = new VBox();

        Separator sepbot = new Separator(Orientation.HORIZONTAL);
        Label msgbot = new Label("Ceci est un label de bas de page");
        msg.setAlignment(Pos.CENTER);
        msg.getChildren().addAll(msgbot);
        VBox sepp = new VBox(sepbot,msg);
        borderPane1.setBottom(sepp);

        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderPane1);


        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        stage.setScene( scene );
        stage.setWidth( 800 );
        stage.setHeight( 600 );
        stage.setTitle("FirstApply");

        // Affichage de la fenêtre
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
