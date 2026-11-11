import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.input.*;
import javafx.scene.control.TextField;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
public class ShowCountdown extends Application{
   private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
   @Override
   public void start(Stage primaryStage){
       Media media = new Media(MEDIA_URL);
       MediaPlayer  mediaPlayer = new MediaPlayer(media);
       MediaView mediaView = new MediaView(mediaPlayer);
       TextField tf = new TextField("Enter Time");
       Timeline animation = new Timeline(new KeyFrame(Duration.seconds(1)));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
       tf.setOnKeyPressed(e -> {
           if (e.getCode() == KeyCode.ENTER){
            int num = Integer.parseInt(tf.getText());
                num = num - 1;
                //String.valueOf(num);
                tf.setText(num - 1 +"");
                animation.play();
            if (num -  1 <= 0){
                animation.pause();
                mediaPlayer.play();
            }
           }
       });

       Scene scene = new Scene(tf);
       primaryStage.setTitle("ShowCountdown");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
   public static void main(String[] args) {
    launch(args);
   }
}