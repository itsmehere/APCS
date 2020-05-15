;;; Exercise 1.8

(define (cuberoot x)
  (define (good-enough? guess)
    (< (abs (- (cube guess) x)) 0.0000000000001))
  (define (improve guess)
    (/ (+ (/ x (square guess)) (* 2 guess)) 3))
  (define (cbrt-iter guess)
    (if (good-enough? guess)
        guess
        (cbrt-iter (improve guess))))
  (cbrt-iter 1.0))

(define (cube x)
  (* x x x))

(define (square x)
  (* x x))

(define (average x y)
  (/ (+ x y) 2))
