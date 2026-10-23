import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
public class ShowPolygon extends Application{
   @Override
   public void start(Stage primaryStage){
       Scene scene = new Scene(new MyPolygon(), 400, 400);
       primaryStage.setTitle("ShowPolygon");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
   public static void main(String[] args) {
       launch(args);
   }
}
class MyPolygon extends StackPane{
   private void paint(){
       Polygon polygon = new Polygon();
       Label label = new Label("STOP");
       label.setFont(Font.font("Times New Roman", 90));
       label.setStyle("-fx-text-fill: white;");
       polygon.setFill(Color.RED);
       polygon.setStroke(Color.WHITE);
       ObservableList<Double> list = polygon.getPoints();
       double centerX = getWidth() / 2, centerY = getHeight() / 2;
       double radius = Math.min(getWidth(), getHeight() * 0.4);
       polygon.setRotate(22.5);
       int s = 8;
       for (int i = 0; i < s; i++){
           list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
           list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
       }
       getChildren().clear();
       getChildren().add(polygon);
       getChildren().add(label);
   }
   @Override
   public void setWidth(double width){
       super.setWidth(width);
       paint();
   }
   @Override
   public void setHeight(double height){
       super.setHeight(height);
       paint();
   }
}