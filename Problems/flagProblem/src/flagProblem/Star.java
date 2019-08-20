package flagProblem;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
    double xcord;
    double ycord;
    double r;
    double smallerR;

    public Star(Graphics g, double xcor, double ycor, double k) {
        xcord = xcor;
        ycord = ycor;
        r = k / 2;
        smallerR = (r * 38.2) / 100;

        int[] starX = new int[10];
        int[] starY = new int[10];

        int start = 270;
        int count = 0;

        for (int i = 0; i < 10; i += 2) {
            starX[i] = (int) (xcord + (r * Math.cos(Math.toRadians(start - (count * 72)))));
            starY[i] = (int) (ycord + (r * Math.sin(Math.toRadians(start - (count * 72)))));
            count++;
        }

        count = 0;
        start = 234;

        for (int i = 1; i < 10; i += 2) {
            starX[i] = (int) (xcord + (smallerR * Math.cos(Math.toRadians(start - (count * 72)))));
            starY[i] = (int) (ycord + (smallerR * Math.sin(Math.toRadians(start - (count * 72)))));
            count++;
        }

        g.setColor(Color.WHITE);
        // fills star triangle.
        g.fillPolygon(starX, starY, 10);
    }

}
