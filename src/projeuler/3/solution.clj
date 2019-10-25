(ns projeuler.3.solution
  (:require [projeuler.utils :as utils]))

(def ^:const number 600851475143)

(defn run []
  (apply max (utils/prime-factors-of number)))
