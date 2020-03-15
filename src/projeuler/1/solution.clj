(ns projeuler.1.solution)

(defn multiples-of-til [operands rng]
  (reduce
   (fn [accum val]
     (def check (some-fn #(zero? (mod val %))))

     (if (some true? (into [] (map check operands)))
       (+ accum val) accum)) 0 (range 1 rng)))

(defn run []
  (multiples-of-til [3 5] 1000))
