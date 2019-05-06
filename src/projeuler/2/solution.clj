(ns projeuler.2.solution)

(defn fib
  ([] (fib 0 1))
  ([a b]
    (lazy-seq (cons a (fib b (+ b a))))))

(defn even-fibonaccis-below [n]
  (take-while (partial >= n) (take-nth 3 (fib))))

(defn sum-of-even-fibonaccis-below [n]
  (reduce + (even-fibonaccis-below n)))

(defn run []
  (sum-of-even-fibonaccis-below 4000000))
