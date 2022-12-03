(ns day03
  (:require
    [clojure.set :as set]
    [clojure.string :as str]))


(defn priority
  [char]
  (if (> (int char) 96)
    (- (int char) 96)
    (- (int char) 38)))


(defn treat-line
  [line]
  (let [[a b] (map set (split-at (/ (count line) 2) line))]
    (priority (first (set/intersection a b)))))


(defn treat-group
  [group]
  (priority (first (apply set/intersection (map set group)))))


(defn part-1
  [input]
  (transduce (map treat-line) + (str/split-lines input)))


(defn part-2
  [input]
  (transduce (map treat-group) + (partition 3 (str/split-lines input))))

