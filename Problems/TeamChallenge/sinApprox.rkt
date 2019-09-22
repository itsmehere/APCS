;;; Taylor Series Sin approximation

(define (sine x)
  (define (sine-iter counter result)
    (cond ((= x 0) 0)
          ((= counter 200) (* result 1.0))
          (else (sine-iter (+ counter 1) (modifier x counter result)))))
  (sine-iter 2 x))

(define (modifier x counter result)
  (if (even? counter)
      (- result (/ (expo x (- (* counter 2) 1)) (factorial (- (* counter 2) 1))))
      (+ result (/ (expo x (- (* counter 2) 1)) (factorial (- (* counter 2) 1))))))

(define (expo x exp)
  (define (expo-iter result counter)
    (if (= counter exp)
        result
        (expo-iter (* result x) (+ counter 1))))
  (expo-iter x 1))

(define (factorial num)
  (if (= num 1)
      num
      (* num (factorial (- num 1)))))