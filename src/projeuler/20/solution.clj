(ns projeuler.20.solution
  (:require [projeuler.utils :as utils]))

(defn run [] (reduce + (utils/split-number (utils/factorial 100))))
