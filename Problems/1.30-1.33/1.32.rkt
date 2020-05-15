;;; Exercise 1.32

(define (accumulate combiner null-value term a next b)
  (define (accu-iter a result)
    (if (> a b)
        result
        (accu-iter (next a) (combiner (term a) result))))
  (accu-iter a null-value))

(define (1+ x) (+ x 1))
(define (identity x) x)

; SUM:
(accumulate + 0 identity a 1+ b)

; PRODUCT:
(accumulate * 1 identity a 1+ b)
