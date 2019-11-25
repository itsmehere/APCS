;Suppose we define the procedure

(define (f g)
  (g 2))
;Then we have
(f square)
4

(f (lambda (z) (* z (+ z 1))))
6

;What happens if we (perversely) ask the interpreter to evaluate the combination (f f)? Explain.

;ANSWER: It would result in an error because (f f) calls (f 2) which calls (2 2) which will be an error.


