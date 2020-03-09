(ns projeuler.utils)

(def primes
  (let [primes-inner (atom [2N])]
    (iterate
     #(let [ps @primes-inner]
        (loop [n (inc %)]
          (if (loop [i 0]
                (let [p (nth ps i)]
                  (cond
                    (< n (* p p)) true
                    (zero? (mod n p)) false
                    :else (recur (inc i)))))
            (do (swap! primes-inner conj n) n)
            (recur (inc n)))))
     (first @primes-inner))))

(defn prime-factors-of
  ([n] (prime-factors-of 2 n))
  ([f n]
   (if (> n 1)
     (if (zero? (mod n f))
       (cons f (prime-factors-of f (/ n f)))
       (recur (inc f) n))
     [])))

(defn fib
  ([] (fib 0 1))
  ([a b]
   (lazy-seq (cons a (fib b (+ b a))))))

(defn tri*
  ([] (tri* 0 1))
  ([sum n]
   (let [new-sum (+ sum n)]
     (cons new-sum (lazy-seq (tri* new-sum (inc n)))))))
(def tri (tri*))

(defn num-divisors-of [^long n]
  (reduce * (map #(inc (second %))
                 (into []
                       (frequencies (prime-factors-of n))))))

(defn factorial [^long n]
  (reduce * (bigint 1) (range 1 (inc n))))

(defn split-number [n]
  (map int (loop [result (list), n n]
             (if (pos? n)
               (recur (conj result (rem n 10))
                      (quot n 10))
               result))))

(defn proper-divisors-of [n]
  (if (= n 1)
    []
    (filter #(= 0 (rem n %)) (range 1 n))))

(defn index-of [item coll]
  (count (take-while (partial not= item) coll)))
