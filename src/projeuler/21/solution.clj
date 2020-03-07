(ns projeuler.21.solution
  (:require [projeuler.utils :as utils]))

(def rng (range 1 10000))

(defn d [n]
  (reduce + (utils/proper-divisors-of n)))

(defn amicable-set [rng]
  (->
   (reduce (fn [accum n]
             (if (and (= n (d (d n))) (not= n (d n)))
               (concat accum [(d n) (d (d n))]) accum))
           []
           rng)
   set))

(defn run []
  (reduce + (amicable-set rng)))
