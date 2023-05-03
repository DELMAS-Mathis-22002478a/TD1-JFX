package exercice1;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class first extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Création du conteneur principal
        BorderPane borderPane1 = new BorderPane();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");

        MenuItem m1 = new MenuItem("menu item 1");
        MenuItem m2 = new MenuItem("menu item 2");
        MenuItem m3 = new MenuItem("menu item 3");

        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu2.getItems().add(m3);




        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        borderPane1.setTop(menuBar);
        //borderPane.setCenter(appContent);
        //borderPane.setBottom(statusbar);

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
