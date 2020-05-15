(define (cont-frac n d k)
  (define (cont-frac-iter count)
    (if (= count k)
        1
        (/ (n count) (+ (d count) (cont-frac-iter (+ count 1))))))
  (cont-frac-iter 1))
