(ns projeuler.12.solution
  (:require [projeuler.utils :as utils]))

(defn run []
  (first
   (filter #(>= (utils/num-divisors-of %) 500)
           (take 15000 utils/tri))))

