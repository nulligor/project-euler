(ns projeuler.core
  (:require [projeuler.1.solution :as p1]
            [projeuler.2.solution :as p2]
            [projeuler.3.solution :as p3]
            [projeuler.4.solution :as p4])
  (:gen-class))

(defn -main []
  (println "--------------------------------------------------")
  (println "Project Euler Solutions")
  (println "--------------------------------------------------")
  (println (format "1 : %d" (p1/run)))
  (println (format "2 : %d" (p2/run)))
  (println (format "3 : %d" (p3/run)))
  (println (format "4 : %d" (p4/run))))
