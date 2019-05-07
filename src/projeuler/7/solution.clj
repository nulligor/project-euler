(ns projeuler.7.solution
  (:require [projeuler.utils :as utils]))

(defn run []
  (last (take 10001 utils/primes)))
