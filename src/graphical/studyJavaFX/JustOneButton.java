package graphical.studyJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JustOneButton extends Application {
    private int counter = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();                                   // Създавам бутон
        button.setText("Experiment");                                   // Поставям надпис на бутона
        button.setOnAction(new EventHandler<ActionEvent>() {            // Обработвам събитие свързано с бутона
            @Override
            public void handle(ActionEvent event) {
                System.out.printf("Pressing %d%n", ++counter);
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 240, 60);

        primaryStage.setTitle("Just a button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
