(ns projeuler.core
  (:require [projeuler.1.solution :as p1] [projeuler.2.solution :as p2]
            [projeuler.3.solution :as p3] [projeuler.4.solution :as p4]
            [projeuler.5.solution :as p5] [projeuler.6.solution :as p6]
            [projeuler.7.solution :as p7] [projeuler.8.solution :as p8]
            [projeuler.9.solution :as p9] [projeuler.10.solution :as p10]
            [projeuler.11.solution :as p11] [projeuler.12.solution :as p12]
            [projeuler.13.solution :as p13] [projeuler.14.solution :as p14]
            [projeuler.15.solution :as p15] [projeuler.16.solution :as p16]
            [projeuler.17.solution :as p17] [projeuler.18.solution :as p18]
            [projeuler.19.solution :as p19] [projeuler.20.solution :as p20]
            [projeuler.21.solution :as p21])
  (:gen-class))

(def problems
  [{:n 1 :run (p1/run)}   {:n 2 :run (p2/run)}
   {:n 3 :run (p3/run)}   {:n 4 :run (p4/run)}
   {:n 5 :run (p5/run)}   {:n 6 :run (p6/run)}
   {:n 7 :run (p7/run)}   {:n 8 :run (p8/run)}
   {:n 9 :run (p9/run)}   {:n 10 :run (p10/run)}
   {:n 11 :run (p11/run)} {:n 12 :run (p12/run)}
   {:n 13 :run (p13/run)} {:n 14 :run (p14/run)}
   {:n 15 :run (p15/run)} {:n 16 :run (p16/run)}
   {:n 17 :run (p17/run)} {:n 18 :run (p18/run)}
   {:n 19 :run (p19/run)} {:n 20 :run (p20/run)}
   {:n 21 :run (p21/run)}])

(defn -main []
  (println "------------[ Project Euler Solutions (1-20)]------------")
  (do
    (run! println (pmap #(str (:n %) " - " (:run %)) problems))
    (shutdown-agents)))
