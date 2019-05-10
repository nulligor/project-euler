(ns projeuler.9.solution
  (:require [projeuler.utils :as utils]))

(def S 1000)

(defn run []
  (reduce *
    (reduce
      (fn [accum [a b]]
        (let [c  (- S a b)]
         (if (= (utils/exp c 2) (+ (utils/exp a 2) (utils/exp b 2) )) (reduced [a b c]) accum)))
      0
      (for [i (range (/ S 3)) j (range (/ S 2))] [i j]))))
