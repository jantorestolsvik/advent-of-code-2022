(ns day01
  (:require
    [clojure.edn :as edn]
    [clojure.string :as str]))


(defn part-1
  [input]
  (->> (reduce
         (fn [list line]
           (if (= "" line)
             (conj list 0)
             (conj (rest list) (+ (first list) (edn/read-string line)))))
         [0]
         (str/split-lines input))
       (reduce max)))


(defn part-2
  [input]
  (->> (reduce
         (fn [list line]
           (if (= "" line)
             (conj list 0)
             (conj (rest list) (+ (first list) (edn/read-string line)))))
         [0]
         (str/split-lines input))
       sort
       reverse
       (take 3)
       (reduce +)))


(day01/part-2
  (slurp "resources/day01_data.txt"))
