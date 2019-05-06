(ns projeuler.3.solution)

(defn prime-factors-of
  ([n] (prime-factors-of 2 n))
  ([f n]
    (if (> n 1)
      (if (zero? (mod n f))
        (cons f (prime-factors-of f (/ n f)))
        (recur (inc f) n))
      [])))

(defn run []
  (apply max (prime-factors-of 600851475143)))
