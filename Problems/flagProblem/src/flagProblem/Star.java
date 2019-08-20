package flagProblem;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
    double xcord;
    double ycord;
    double r;
    double smallerR;

    public Star(Graphics g, double xcor, double ycor, double k) {
        /* GENERAL WALKTHROUGH:
         * 
         * After graphing a right side up star in desmos using basic trigonometric functions,
         * I realized that the orientation of the computer canvas was different. Rather than
         * (0, 0) being at the bottom left of the screen, it was at the top right. This meant
         * that in desmos, the star had to appear upside down for it to be right side up in
         * code. I changed the starting values of cos and sin and could achieve this pretty easily.
         * 
         * HOW THE STAR WORKS:
         * After learning basic basic and I mean BASIC trig functions, I was able to apply them in
         * this problem. Using the unit circle, I found out that the x coordinate of an outer point
         * would be centerX + cos(n), where 0<=n<=360. This would tell us the starting point and we could
         * use the same unit circle principle that centerY + sin(q) would the y coordinate of that point
         * (0<=q<=260). This concept also helped tremendously because I could now load the array using a for
         * loop with much less effort.
         * 
         * -Mihir Rao
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
