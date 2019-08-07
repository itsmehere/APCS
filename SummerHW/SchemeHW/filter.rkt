(define (filter pred lst)
  (if (empty? lst)
      lst
      (if (pred (car lst))
          (cons (car lst) (filter pred (cdr lst)))
          (filter pred (cdr lst)))))
