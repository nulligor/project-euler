(ns projeuler.6.solution)

(def rng (range 1 101))

(defn exp [x pow]
  (apply * (repeat pow x)))

(defn square-sum [rng]
  (exp (reduce + rng) 2))

(defn sum-square [rng]
  (apply + (map #(exp % 2) rng)))

(defn run []
  (- (square-sum rng) (sum-square rng)))
