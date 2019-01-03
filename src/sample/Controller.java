package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller
{
    public Label points;
    public int score=0;

    long time = System.nanoTime();
    public void addOne(ActionEvent actionEvent) {
        if (((System.nanoTime() - time)/(100000000))!=10.0) {
            score++;
            points.setText("Points: " + score);
        }
    }


}
