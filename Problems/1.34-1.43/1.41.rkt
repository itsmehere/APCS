(define (double func)
  (lambda (x) (func (func x))))

(define (inc x)
  (+ x 1))

(((double (double double)) inc) 5)

;21