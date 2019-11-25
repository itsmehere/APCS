(define (reduce2 op lyst)
  (cond ((= (length lyst) 1) (car lyst))
        ((null? lyst) '())
        (else (reduce2 op (cons (op (car lyst) (cadr lyst))
                                (cddr lyst))))))

(define (avgnums x z . y)
  (define (avgnums-helper sum lyst)
    (if (null? lyst)
        (* 1.0 (/ sum (+ 2 (length y))))
        (avgnums-helper (+ (car lyst) sum) (cdr lyst))))
  (avgnums-helper (+ x z) y))
  
(define (minheight bst)
  (if (empty-tree? bst)
      0
      (+ 1 (min (cond ((empty-tree? (right bst)) (minheight (left bst)))
                      ((empty-tree? (left bst)) (minheight (right bst)))
                      (else (minheight (left bst))))
                (cond ((empty-tree? (right bst)) (minheight (left bst)))
                      ((empty-tree? (left bst)) (minheight (right bst)))
                      (else (minheight (right bst))))))))

(define (leaflyst bst)
  (cond ((empty-tree? bst) '())
        ((leaf? bst) (list (datum bst)))
        (else (append (leaflyst (left bst)) (leaflyst (right bst))))))

(define (depthlyst bst)
  (cond ((empty-tree? bst) '())
        ((leaf? bst) (cons 1 '()))
        (else (add1 (append (depthlyst (left bst)) (depthlyst (right bst)))))))

(define (add1 lyst)
  (if (null? lyst)
      '()
      (cons (+ 1 (car lyst)) (add1 (cdr lyst)))))
        

(define (min-height tree)
  (if (leaf? tree) 1
      (+ 1 (min (if (empty-tree? (right tree)) +inf.0 (min-height (right tree)))
                (if (empty-tree? (left tree)) +inf.0 (min-height (left tree)))))))
        
(define (snum bt)
  (define (snum-helper bt2)
    (if (empty-tree? bt2)
        '()
        (append (snum-helper (left bt2)) (list (datum bt2)) (snum-helper (right bt2)))))
  (minum (snum-helper bt)))

(define (minum lyst)
  (define (minum-helper num newlyst)
    (cond ((null? newlyst) num)
          ((< (car newlyst) num) (minum-helper (car newlyst) (cdr newlyst)))
          (else (minum-helper num (cdr newlyst)))))
  (minum-helper (car lyst) lyst))

  
(define (averagetree bst)
  (define (sumtree bst2)
    (if (empty-tree? bst2)
        0
        (+ (datum bst2) (sumtree (right bst2)) (sumtree (left bst2)))))
  (* 1.0 (/ (sumtree bst) (numdatums bst))))

(define (numdatums bst)
  (if (empty-tree? bst)
      0
      (+ 1 (numdatums (right bst)) (numdatums (left bst)))))

(define (contains? num bst)
  (cond ((empty-tree? bst) #f)
        ((< (datum bst) num) (contains? num (right bst)))
        ((> (datum bst) num) (contains? num (left bst)))
        (else (equal? (datum bst) num) #t)))

(define (make-bintree datum left right)
  (lambda (msg)
    (cond ((= msg 0) datum)
          ((= msg 1) left)
          ((= msg 2) right))))

(define (datum bintree) (bintree 0))
(define (left bintree) (bintree 1))
(define (right bintree) (bintree 2))

(define tet 'toasterhead)
(define (empty-tree? tree) 
  (eq? tree tet))
(define (leaf? bintree)
  (and (not (empty-tree? bintree))
       (empty-tree? (left bintree))
       (empty-tree? (right bintree))))


(define bst
  (make-bintree 15
     (make-bintree 6
        (make-bintree 2 tet tet)
        tet)
     (make-bintree 22
        (make-bintree 17
           (make-bintree 16 tet tet)
           (make-bintree 19 tet tet))
        (make-bintree 24 tet tet))))
           