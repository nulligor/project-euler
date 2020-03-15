(ns projeuler.23.solution
  (:require [clojure.set :as s]
            [projeuler.utils :as utils]))

(def ^:const ^int limit 28123)

(def ^vec nums (range 1 (inc limit)))
(def ^set nums-set (set nums))

(^boolean defn abundant [n]
               (< n (reduce + (utils/proper-divisors-of n))))

(def ^vec abundants (vec (filter abundant nums)))
(def ^vec abundant-sums
  (mapcat
   #(let [index (utils/index-of % abundants)
          sub   (subvec abundants index)]
      (map (partial + %) sub))
   abundants))
(def ^set abundant-sunset (set abundant-sums))

(defn run []
  (reduce + (s/difference nums-set abundant-sunset)))
