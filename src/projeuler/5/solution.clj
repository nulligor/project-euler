(ns projeuler.5.solution)

(def ^:const ^long anchor 232792560)

(defn find-x [x r]
  (if (every? zero? (map #(mod x %) r))
    x
    (recur (inc x) r)))

;; NOTE: recurring straight to 20 took a while, so we start with (inc 15) and move on
;; 232792560 is the equivalent of (find-x 1 (range 1 (inc 19))) that we popped on (inc 20)
(defn run []
  (find-x anchor (range 1 (inc 20))))
