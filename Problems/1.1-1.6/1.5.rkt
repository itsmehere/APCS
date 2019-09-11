#|
Exercise 1.5

With an interpreter that uses applicative-order evaluation, Ben will see that this program goes into an infinite loop. Even though Ben passed in 0 to x and the if statement should be returning 0, everything is evaluated before hand. This means that y is also evaluated before hand. Since y is calling (p), it goes into an infinite loop.  With an interpreter that used normal order, 0 will be returned because the if statement is satisfied.

|#