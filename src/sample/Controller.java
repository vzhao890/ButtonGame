package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller
{
    public Label points;
    public int score=0;
    public boolean count = true;

    public void addOne(ActionEvent actionEvent) {
        timer();
        score++;
        points.setText("Points: " + score);


    }
    public void timer()
    {
        long setTime = System.nanoTime() +10000000000L;
        new AnimationTimer() {
            @Override
            public void handle(long now)
            {
                while(setTime < now)
                {
                    count = true;
                }
                count = false;
            }
        }.start();
    }


}
