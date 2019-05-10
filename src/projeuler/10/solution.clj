(ns projeuler.10.solution
  (:require [projeuler.utils :as utils]))

(defn run []
  (reduce + (take-while #(< % 2000000) utils/primes)))
