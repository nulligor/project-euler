(ns projeuler.24.solution
  (:require [clojure.math.combinatorics :as combo]
            [clojure.string :as s]))

(defn run []
  (s/join "" (last (take 1000000 (combo/permutations [0 1 2 3 4 5 6 7 8 9])))))
