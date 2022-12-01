(ns day01
  (:require
    [clojure.string :as str]
    [utils :as u]))


(defn parse-calories
  [s]
  (transduce (map parse-long) + (str/split-lines s)))


(defn solve
  [n input]
  (->> (u/split-blank-line input)
       (map parse-calories)
       (sort >)
       (take n)
       (reduce +)))


(def part-1 (partial solve 1))
(def part-2 (partial solve 3))
