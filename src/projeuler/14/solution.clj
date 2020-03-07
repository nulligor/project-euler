(ns projeuler.14.solution)

(def rng (range 1 1000000))

(def optimized-collatz
  (memoize #(if (even? %) (/ % 2) (/ (inc (* % 3)) 2))))

(defn optimized-collatz-len [n]
  (count (take-while #(> % 1) (iterate optimized-collatz n))))

(defn run []
  (first (->> (map #(list % (optimized-collatz-len %)) rng)
              (apply max-key second))))
