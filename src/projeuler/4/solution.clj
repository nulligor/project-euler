(ns projeuler.4.solution)

(defn build-rng 
    [n]
    (let [ beg  (->> (repeat "9")
                     (take (- n 1))
                     (clojure.string/join)
                     (read-string)
                     (inc)) 
           end  (->> (repeat "9")
                     (take n)
                     (clojure.string/join)
                     (read-string))]
    (into [] (range beg end))))

(defn ispalindromic? 
  [x]
  (= x (Integer. (clojure.string/reverse (str x)))))

(defn run 
  []
  (apply max 
    (filter ispalindromic? (sort (set (flatten 
        (map (fn [x] 
            (map (partial * x) (build-rng 3))) (build-rng 3))))))))