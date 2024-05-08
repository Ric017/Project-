package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalorieCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels, text fields, and button
        Label bicyclingLabel = new Label("Hours Bicycling:");
        TextField bicyclingField = new TextField();
        
        Label joggingLabel = new Label("Hours Jogging:");
        TextField joggingField = new TextField();
        
        Label swimmingLabel = new Label("Hours Swimming:");
        TextField swimmingField = new TextField();
        
        Button calculateButton = new Button("Calculate");
        
        Label resultLabel = new Label();
        
        // Set action for the Calculate button
        calculateButton.setOnAction(e -> {
            // Get input values
            double hoursBicycling = Double.parseDouble(bicyclingField.getText());
            double hoursJogging = Double.parseDouble(joggingField.getText());
            double hoursSwimming = Double.parseDouble(swimmingField.getText());
            
            // Calculate total calories burned
            double totalCaloriesBurned = (hoursBicycling * 200) + (hoursJogging * 475) + (hoursSwimming * 275);
            
            // Calculate pounds worked off
            double poundsWorkedOff = totalCaloriesBurned / 3500;
            
            // Display result
            resultLabel.setText("You've worked off approximately " + poundsWorkedOff + " pounds.");
        });
        
        // Create grid pane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        
        // Add components to the grid pane
        gridPane.add(bicyclingLabel, 0, 0);
        gridPane.add(bicyclingField, 1, 0);
        
        gridPane.add(joggingLabel, 0, 1);
        gridPane.add(joggingField, 1, 1);
        
        gridPane.add(swimmingLabel, 0, 2);
        gridPane.add(swimmingField, 1, 2);
        
        gridPane.add(calculateButton, 0, 3);
        GridPane.setColumnSpan(calculateButton, 2);
        
        gridPane.add(resultLabel, 0, 4);
        GridPane.setColumnSpan(resultLabel, 2);
        
        // Create scene and set it on the stage
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calorie Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
