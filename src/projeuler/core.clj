(ns projeuler.core
  (:require [projeuler.1.solution :as p1]
            [projeuler.2.solution :as p2]
            [projeuler.3.solution :as p3]
            [projeuler.4.solution :as p4]
            [projeuler.5.solution :as p5]
            [projeuler.6.solution :as p6]
            [projeuler.7.solution :as p7])
  (:gen-class))

(def problem-map
  [{:problem (p1/run) :index 1} {:problem (p2/run) :index 2}
   {:problem (p3/run) :index 3} {:problem (p4/run) :index 4}
   {:problem (p5/run) :index 5} {:problem (p6/run) :index 6}
   {:problem (p7/run) :index 7}])

(defn -main []
  (println "--------------------------------------------------")
  (println "Project Euler Solutions")
  (println "--------------------------------------------------")
  (dorun (map #(println (:index %) "-" (:problem %)) problem-map)))
