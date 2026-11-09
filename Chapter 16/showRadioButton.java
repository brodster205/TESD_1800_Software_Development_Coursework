import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
public class showRadioButton extends Application{
   @Override
   public void start(Stage primaryStage){
    BorderPane pane = new BorderPane();
    Text text1 = new Text(150, 100, "Programming is fun");
    pane.getChildren().add(text1);
       HBox paneForRadioButtons = new HBox(20);
       HBox paneForButtons = new HBox(10);
       paneForRadioButtons.setPadding(new Insets(10, 10, 10, 10));
       paneForButtons.setPadding(new Insets(5, 5, 5, 5));
       RadioButton rbRed = new RadioButton("Red");
       RadioButton rbYellow = new RadioButton("Yellow");
       RadioButton rbBlack = new RadioButton("Black");
       RadioButton rbOrange = new RadioButton("Orange");
       RadioButton rbGreen = new RadioButton("Green");
       Button btLeft = new Button("<=");
       Button btRight = new Button("=>");
       paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
       paneForButtons.getChildren().addAll(btLeft, btRight);
       pane.setTop(paneForRadioButtons);
       pane.setBottom(paneForButtons);
       ToggleGroup group = new ToggleGroup();
       rbRed.setToggleGroup(group);
       rbYellow.setToggleGroup(group);
       rbBlack.setToggleGroup(group);
       rbOrange.setToggleGroup(group);
       rbGreen.setToggleGroup(group);
       rbRed.setOnAction(e -> {
        if (rbRed.isSelected()){
            text1.setFill(Color.RED);
        }
       });
       rbYellow.setOnAction(e -> {
        if (rbYellow.isSelected()){
            text1.setFill(Color.YELLOW);
        }
       });
       rbBlack.setOnAction(e -> {
        if (rbBlack.isSelected()){
            text1.setFill(Color.BLACK);
        }
       });
       rbOrange.setOnAction(e -> {
        if (rbOrange.isSelected()){
            text1.setFill(Color.ORANGE);
        }
       });
       rbGreen.setOnAction(e -> {
        if (rbGreen.isSelected()){
            text1.setFill(Color.GREEN);
        }
       });
       btLeft.setOnMouseClicked(e -> {
        if (e.getButton() == MouseButton.PRIMARY){
            if (text1.getX() < 40){
                text1.setX(0);
            }
        else{
            text1.setX(text1.getX() - 25);
        }
        }
       });
       btRight.setOnMouseClicked(e -> {
        if (e.getButton() == MouseButton.PRIMARY){
            if (text1.getX() > 260){
                text1.setX(260);
            }
            else{
                text1.setX(text1.getX() + 25);
            }
        }
       });
       Scene scene = new Scene(pane, 400, 200);
       primaryStage.setTitle("showRadioButton");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
   public static void main(String[] args) {
    launch(args);
   }
}