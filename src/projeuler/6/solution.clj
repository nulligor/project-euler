(ns projeuler.6.solution
  (:use [clojure.math.numeric-tower :only [expt]]))

(def ^:const rng (range 1 101))

(defn square-sum [rng] (expt (reduce + rng) 2))

(defn sum-square [rng] (apply + (map #(expt % 2) rng)))

(defn run []
  (- (square-sum rng) (sum-square rng)))
