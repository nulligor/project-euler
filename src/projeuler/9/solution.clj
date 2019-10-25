(ns projeuler.9.solution
  (:use [clojure.math.numeric-tower :only [expt]]))

(def ^:const S 1000)

(defn run []
  (reduce *
          (reduce
           (fn [accum [a b]]
             (let [c  (- S a b)]
               (if (= (expt c 2)
                      (+ (expt a 2) (expt b 2)))
                 (reduced [a b c]) accum)))
           0
           (for [i (range (/ S 3)) j (range (/ S 2))] [i j]))))
