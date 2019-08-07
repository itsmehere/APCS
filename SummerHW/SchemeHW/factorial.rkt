(define (factorial num)
  (if (<= num 1)
      1
      (* num (factorial (- num 1)))))