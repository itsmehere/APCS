(define (safe-divider x)
  (lambda (y) (if (equal? y 0) 'cow (/ x y))))