package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static sample.Gui.bp;

/**
 * Created by zfz on 16/10/25.
 */
public class Main extends Application{
    public void start(Stage primaryStage){
        Scene scene = new Scene(bp,600,600);
        primaryStage.setTitle("六子棋");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String args[]){

    }
}
