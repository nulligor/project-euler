(ns projeuler.3.solution
  (:require [projeuler.utils :as utils]))

(defn run []
  (apply max (utils/prime-factors-of 600851475143)))
