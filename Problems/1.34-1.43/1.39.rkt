(define (tan-cf x k)
  (define (tan-cf-helper count)
    (if (= count k)
        1.0
        (/ (getX count x) (- (- (* 2 count) 1) (tan-cf-helper (+ count 1))))))
  (tan-cf-helper 1))

(define (getX count x)
  (if (= count 1)
      x
      (* x x)))
