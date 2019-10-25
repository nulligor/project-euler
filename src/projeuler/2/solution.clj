(ns projeuler.2.solution
  (:require [projeuler.utils :as utils]))

(def ^:const number 4000000)

(defn even-fibonaccis-below [n]
  (take-while (partial >= n) (take-nth 3 (utils/fib))))

(defn run []
  (reduce + (even-fibonaccis-below number)))
