import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
public class showCircle extends Application{
  @Override
  public void start(Stage primaryStage){
     Circle circle = new Circle(200, 175, 50);

     BorderPane pane = new BorderPane();
     HBox hBox = new HBox();
     hBox.setSpacing(70);
     pane.setBottom(hBox);
     pane.getChildren().add(circle);
     Button btLeft = new Button("Left");
     Button btRight = new Button("Right");
     Button btUp = new Button("up");
     Button btDown = new Button("Down");
     hBox.getChildren().add(btLeft);
     hBox.getChildren().add(btRight);
     hBox.getChildren().add(btUp);
     hBox.getChildren().add(btDown);
     btLeft.setOnMouseClicked(e-> {
        if (e.getButton() == MouseButton.PRIMARY){
         if(circle.getCenterX() == 0){
            circle.setCenterX(0);
         }
         else{
            circle.setCenterX(circle.getCenterX() - 25);
         }
        }
     });
     btRight.setOnMouseClicked(e-> {
      if (e.getButton() == MouseButton.PRIMARY){
         if(circle.getCenterX() == 400){
            circle.setCenterX(400);
         }
         else{
            circle.setCenterX(circle.getCenterX() + 25);
         }
      }
     });
     btUp.setOnMouseClicked(e-> {
      if (e.getButton() == MouseButton.PRIMARY){
         if(circle.getCenterY() == 0){
            circle.setCenterY(0);
         }
         else{
            circle.setCenterY(circle.getCenterY() - 25);
         }
      }
     });
     btDown.setOnMouseClicked(e-> {
      if (e.getButton() == MouseButton.PRIMARY){
         if(circle.getCenterY() == 325){
            circle.setCenterY(325);
         }
         else{
            circle.setCenterY(circle.getCenterY() + 25);
         }
      }
     });
     Scene scene = new Scene(pane, 400, 400);
     primaryStage.setTitle("showCircle");
     primaryStage.setScene(scene);
     primaryStage.show();
  }
  public static void main(String[] args) {
      launch(args);
  }
}