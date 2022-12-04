(ns day04
  (:require
    [clojure.string :as str]))


(defn parse-pair
  [pair]
  (map parse-long (str/split pair #"-")))


(defn treat-line
  [matcher line]
  (let [[[a b] [c d]] (map parse-pair (str/split line #","))]
    (matcher a b c d)))


(defn solve
  [input matcher]
  (->> (map (partial treat-line matcher) (str/split-lines input))
       (filter identity)
       count))


(defn part-1
  [input]
  (solve
    input
    (fn [a b c d]
      (or
        (<= a c d b)
        (<= c a b d)))))


(defn part-2
  [input]
  (solve
    input
    (fn [a b c d]
      (or
        (<= a c b)
        (<= a d b)
        (<= c a d)
        (<= c b d)))))

