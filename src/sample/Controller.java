package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller
{
    public Label points;
    public int score=0;

    long time = System.nanoTime();
    public void addOne(ActionEvent actionEvent) {
        if (timer() == 0) {
            score++;
            points.setText("Points: " + score);
        }
    }

    public int timer()
    {
        double a=(double)(System.nanoTime() - time)/(100000000);
        if(a==10.0) {
            return -1;
        }
        return 0;
    }
}
