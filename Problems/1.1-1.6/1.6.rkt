#|
Exercise 1.6

Since if is evaluated in normal order, it only evaluated what it has to. Cond on the other hand is evaluated in applicative order meaning the else is also run, thus it processes the arguments which calls itself which processes the arguments which calls itself. . .

|#