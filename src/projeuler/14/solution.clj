(ns projeuler.14.solution)

;; NOTE: the way we do collatz here is probably a little too
;; specific to go into the utils module
(def optimized-collatz
  (memoize #(if (even? %) (/ % 2) (/ (inc (* % 3)) 2))))

(defn optimized-collatz-len [n]
  (count (take-while #(> % 1) (iterate optimized-collatz n))))

(defn run []
  (first (->> (map #(list % (optimized-collatz-len %)) (range 1 1000000))
              (apply max-key second))))
