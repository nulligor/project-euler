(ns projeuler.16.solution
  (:require [projeuler.utils :as utils])
  (:use [clojure.math.numeric-tower :only [expt]]))

(def ^:const base 2)
(def ^:const power 1000)

(defn run [] (reduce + (utils/split-number (expt base power))))
