(define (odds lst)
  (if (empty? lst)
      0
      (if (odd? (car lst))
          (+ 1 (odds (cdr lst)))
          (odds (cdr lst)))))