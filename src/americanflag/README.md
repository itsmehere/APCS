# Drawing Stars

A star's points are based on two circles. There is the outer circle, and the inner circle as shown below:
![image](https://upload.wikimedia.org/wikipedia/commons/9/9a/Pentagram_within_circle.svg)

## Degrees Between Two Neighboring Points
Each point on the star is evenly spaced apart from its neighboring points which means that the angle
between any two neighboring points is `360 / 5 = 72°` degrees.

## Deriving the Equations
The top point will always be at `90°`. If we go clockwise, the angles we get are:
1) `90°`
2) `18°`
3) `-54°`
4) `-126°`
5) `-198°`

![triangleImage](http://amsi.org.au/teacher_modules/D5/D5g1.png)

Let:  
`r` = radius  
`θ` = angle  
`p` = x value of star's center  
`q` = y value of star's center

With this information, we can calculate the coordinate pair of the point `(x,y)`.
In the above example, the radius is `1` so `cos(θ)` is already the `x` value. Since we don't know the radius, 
we have to multiply `cos(θ)` by `r` to get the length of the base. Then, we have to add `p` so the point 
is positioned correctly relative to the center of the star.

Same thing for the y value. We multiply `sin(θ)` by `r` and add the y value.

Yay! We have derived the equations that can be used to find the locations for all the points on the star given the center and the radius. 
 
Equations:
`x = cos(θ) * r + p` and `y = sin(θ) * r + q`.

### Assembled Star
Click [here](https://www.desmos.com/calculator/qvcp1jmwal) to view the entire star on desmos.
 





