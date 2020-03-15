(ns projeuler.10.solution
  (:require [projeuler.utils :as utils]))

(def ^:const ^long number 2000000)

(defn run []
  (reduce + (take-while #(< % number) utils/primes)))
