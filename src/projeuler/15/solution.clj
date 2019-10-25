(ns projeuler.15.solution
  (:require [projeuler.utils :as utils])
  (:use [clojure.math.numeric-tower :only [expt]]))

(def ^:const size 20)

(defn run []
  (/
   (utils/factorial (* 2 size))
   (expt (utils/factorial size) 2)))
