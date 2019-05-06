(ns projeuler.4.solution)

(defn delimiter
  [n]
  (+ 1 (read-string (apply str (take-last n (conj (repeat n 9) 9))))))

(defn build-range
  [n]
  (let [ beg  (delimiter (- n 1))
         end  (delimiter n)]
  (into [] (range beg end))))

(def f-sort  (comp sort set flatten))

(defn ispalindromic?
  [x]
  (= x (Integer. (clojure.string/reverse (str x)))))

(defn run
  []
  (apply max
    (filter ispalindromic?
      (f-sort
        (map
          (fn [x] (map (partial * x) (build-range 3)))
          (build-range 3))))))
