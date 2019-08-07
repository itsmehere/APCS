(define (reverse lst)
  (if (equal? (length lst) 1)
      lst
       (apply append (list (reverse (cdr lst)) (list (car lst))))))