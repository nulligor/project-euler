(ns projeuler.19.solution
  (:require [clj-time.core :as t]
            [clj-time.periodic :as p]))

(def ^:const beg (t/date-time 1901 01))
(def ^:const end (t/date-time 2000 12 31))

;; Refer to http://www.rkn.io/2014/02/13/clojure-cookbook-date-ranges/
(defn time-range [start end step]
  (let [inf-range (p/periodic-seq start step)
        below-end? #(t/within? (t/interval start end) %)]
    (take-while below-end? inf-range)))

(def m* (time-range beg end (t/months 1)))

(defn run []
  (count (filter #(= 7 (t/day-of-week %)) (take (count m*) m*))))
