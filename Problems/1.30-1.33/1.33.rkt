;;; Exercise 1.33

(define (fil-accumulate combiner null-value term a next b pred)
  (define (accu-iter a result)
    (if (> a b)
        result
        (accu-iter (next a) (combiner (term (pred a)) result))))
  (accu-iter a null-value))

(define (1+ x) (+ x 1))
(define (identity x) x)
(define (square x) (* x x))
(define (oddnum? x) (if (equal? (remainder x 2) 0) 0 x))

