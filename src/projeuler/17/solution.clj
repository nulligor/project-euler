(ns projeuler.17.solution
  (:require [clojure.string :as s])
  (:use [com.gfredericks.forty-two :only [words]]))

(def ^:const size 1000)

(defn run []
  (->> (range 1 (inc size))
       (map #(count (s/replace (words %) #"[-\s]" "")))
       (reduce +)))
