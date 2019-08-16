(ns projeuler.utils)

(def primes
  (concat
   [2]
   (lazy-seq
    (let [prime-inner
          (fn prime-inner [x table]
            (if (table x)
              (prime-inner (inc x)
                           (reduce #(update % (+ x %2) conj %2)
                                   (dissoc table x)
                                   (table x)))
              (lazy-seq (cons x (prime-inner (inc x) (assoc table (* x x) [x]))))))]
      (prime-inner 3 {4 [2]})))))

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

(defn exp [x pow]
  (apply * (repeat pow x)))
