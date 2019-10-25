(ns projeuler.4.solution
  (:require [clojure.string :as s]))

(defn palindromic [n] (= n (Integer. (s/reverse (str n)))))

(def ^:const rng (range 1000))

(def f-sort  (comp sort set flatten))

(defn run []
  (->>
   (f-sort  (map (fn [n] (map (partial * n) rng)) rng))
   (filter palindromic)
   (apply max)))
