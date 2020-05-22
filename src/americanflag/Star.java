package americanflag;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
    double xcord;
    double ycord;
    double r;
    double smallerR;

    public Star(Graphics g, double xcor, double ycor, double k) {
        /*
         * Mihir Rao
         */
        
        xcord = xcor;
        ycord = ycor;
        r = k / 2;
        smallerR = (r * 38.2) / 100;

        // An array of points of the x coordinates based of xcor.
        int[] starX = new int[10];
        // An array of points of the y coordinates based of ycor.
        int[] starY = new int[10];

        // The starting angle is 270 because the computer's (0, 0) is the top left corner(not the bottom left).
        int start = 270;
        // This variable is used to increment/decrement the value cos and sin are given.
        int count = 0;

        // for loop for outer 5 points
        for (int i = 0; i < 10; i += 2) {
            starX[i] = (int) (xcord + (r * Math.cos(Math.toRadians(start - (count * 72)))));
            starY[i] = (int) (ycord + (r * Math.sin(Math.toRadians(start - (count * 72)))));
            count++;
        }

        // Both these variables are reset accordingly for the next for loop.
        count = 0;
        start = 234;
        
        // for loop for inner 5 points
        for (int i = 1; i < 10; i += 2) {
            starX[i] = (int) (xcord + (smallerR * Math.cos(Math.toRadians(start - (count * 72)))));
            starY[i] = (int) (ycord + (smallerR * Math.sin(Math.toRadians(start - (count * 72)))));
            count++;
        }

        // Pretty obvious, sets the color to white.
        g.setColor(Color.WHITE);
        // fills star
        g.fillPolygon(starX, starY, 10);
    }

}
