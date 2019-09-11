;;; Exercise 1.31(a)

; Iterative:

(define (product a term next b)
  (define (product-iter a result)
    (if (> a b)
        result
        (product-iter (next a) (* result a))))
  (product-iter a 1))

; Recursive:

(define (product2 term a next b)
  (if (> a b)
      1
      (* (term a)
         (product2 term (next a) next b))))

; Next Procedure:

(define (1+ x) (+ x 1))

; Factorial:

(define (identity x) x)
(define (1+ x) (+ x 1))

(define (factorial x)
  (product * 1 1+ x))

; Wallis Pi:

(define (wallis n)
  (define (term n)
    (/ (* 4 n n)
       (- (* 4 n n) 1)))
  (product term 1.0 1+ n))
