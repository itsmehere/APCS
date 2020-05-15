(define (e-euler k)
  (+ 2 (cont-frac (lambda (x) 1.0) (lambda (x) (deuler x)) k)))

(define (deuler i)
  (if (= (modulo i 3) 2)
      (* 2(/ (+ i 1) 3))
      1))
