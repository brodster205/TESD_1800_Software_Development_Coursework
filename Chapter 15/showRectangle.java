import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseButton;
import javafx.animation.Timeline;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.collections.ObservableList;
public class showRectangle extends Application{
   @Override
   public void start(Stage primatyStage){
       Pane pane = new Pane();
       Rectangle rectangle = new Rectangle(0, 0, 25, 50);
       rectangle.setFill(Color.WHITE);
       rectangle.setStroke(Color.BLACK);
       Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        polygon.setRotate(200);
        ObservableList<Double> list = polygon.getPoints();
        double centerX = 250 / 2, centerY = 250 / 2;
        double radius = Math.min(150, 150) * 0.4;
        int s = 5;
        for (int i = 0; i < s; i++){
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
        }
        pane.getChildren().clear();
        pane.getChildren().add(polygon);
       pane.getChildren().add(rectangle);
       PathTransition pt = new PathTransition();
       pt.setDuration(Duration.millis(4000));
       pt.setPath(polygon);
       pt.setNode(rectangle);
       pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
       pt.setCycleCount(Timeline.INDEFINITE);
       pt.play();
       FadeTransition ft = new FadeTransition(Duration.millis(4000), rectangle);
       ft.setFromValue(1.0);
       ft.setToValue(0.0);
       ft.setCycleCount(Timeline.INDEFINITE);
       ft.play();
       pane.setOnMouseClicked(e-> {
        if (e.getButton() == MouseButton.PRIMARY){
            pt.pause();
            ft.pause();
        }
        else{
            pt.play();
            ft.play();
        }
       });
       Scene scene = new Scene(pane, 250, 250);
       primatyStage.setTitle("showRectangle");
       primatyStage.setScene(scene);
       primatyStage.show();
   }
   public static void main(String[] args) {
       launch(args);
   }
}