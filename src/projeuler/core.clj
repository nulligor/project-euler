(ns projeuler.core)

(defn run-problem [n]
  (let [run   (list (symbol "run"))
        scope (symbol (str "projeuler." n ".solution"))]
    (use (vec (list scope :only run)))
    (eval run)))

(defn -main [& args]
  (if (and args (= 1 (count args)))
    (println (time (run-problem (Integer/parseInt (first args)))))
    (println "Usage: lein run [number]")))
