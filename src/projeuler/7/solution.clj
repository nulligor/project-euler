(ns projeuler.7.solution
  (:require [projeuler.utils :as utils]))

(def ^:const ^long size 10001)

(defn run []
  (last (take size utils/primes)))
