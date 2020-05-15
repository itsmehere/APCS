;;; Exericse 1.3

(define (large-sum-squares x y z)
  (cond ((and (> x y) (> y z)) (+ (* x x) (* y y)))
        ((and (> x y) (> z y)) (+ (* x x) (* z z)))
        (else (+ (* z z) (* y y)))))
