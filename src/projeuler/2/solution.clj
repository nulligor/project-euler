(ns projeuler.2.solution
  (:require [projeuler.utils :as utils]))

(defn even-fibonaccis-below [n]
  (take-while (partial >= n) (take-nth 3 (utils/fib))))

(defn sum-of-even-fibonaccis-below [n]
  (reduce + (even-fibonaccis-below n)))

(defn run []
  (sum-of-even-fibonaccis-below 4000000))
