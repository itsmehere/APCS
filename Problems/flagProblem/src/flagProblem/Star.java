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

        // Used to fill the inner pentagon of the star.
        int[] innerPolyX = new int[5];
        int[] innerPolyY = new int[5];

        int start = 270;

        for (int i = 0; i < 10; i += 2) {
            starX[i] = (int) (xcord + (r * Math.cos(Math.toRadians(start - (i * 72)))));
            starY[i] = (int) (ycord + (r * Math.sin(Math.toRadians(start - (i * 72)))));
        }

        start = 234;

        for (int i = 1; i < 10; i += 2) {
            starX[i] = (int) (xcord + (smallerR * Math.cos(Math.toRadians(start - ((i - 5) * 72)))));
            starY[i] = (int) (ycord + (smallerR * Math.sin(Math.toRadians(start - ((i - 5) * 72)))));
        }
        for (int i = 0; i < 5; i++) {
            innerPolyX[i] = (int) (xcord + (smallerR * Math.cos(Math.toRadians(start - ((i - 5) * 72)))));
            innerPolyY[i] = (int) (ycord + (smallerR * Math.sin(Math.toRadians(start - ((i - 5) * 72)))));
        }

        g.setColor(Color.WHITE);
        // fills star triangle.
        g.fillPolygon(starX, starY, 10);
        // fills star pentagon.
        g.fillPolygon(innerPolyX, innerPolyY, 5);
    }

}
