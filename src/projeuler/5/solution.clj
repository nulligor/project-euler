(ns projeuler.5.solution)

(defn find-x 
  [x r]
  (if (every? zero? (map #(mod x %) r)) x (recur (inc x) r)))

; bellow, recurring straight to 20 took a while, so we start with (inc 15) and move on
; 232792560 is the equivalent of (find-x 1 (range 1 (inc 19))) that we popped on (inc 20)
(defn run 
  []
  (find-x 232792560 (range 1 (inc 20))))
