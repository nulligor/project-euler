(ns projeuler.6.solution
  (:require [projeuler.utils :as utils]))

(def rng (range 1 101))

(defn square-sum [rng]
  (utils/exp (reduce + rng) 2))

(defn sum-square [rng]
  (apply + (map #(utils/exp % 2) rng)))

(defn run []
  (- (square-sum rng) (sum-square rng)))
