(ns day02
  (:require
    [clojure.string :as str]))


(defn score-round-part-1
  []
  (map (fn [[opponent _ me]]
         (cond
           (= opponent \A)
           (cond
             (= me \X) (+ 1 3)
             (= me \Y) (+ 2 6)
             (= me \Z) (+ 3 0))
           (= opponent \B)
           (cond
             (= me \X) (+ 1 0)
             (= me \Y) (+ 2 3)
             (= me \Z) (+ 3 6))
           (= opponent \C)
           (cond
             (= me \X) (+ 1 6)
             (= me \Y) (+ 2 0)
             (= me \Z) (+ 3 3))))))

(defn score-round-part-2
  []
  (map (fn [[opponent _ me]]
         (cond
           (= opponent \A)
           (cond
             (= me \X) (+ 3 0)
             (= me \Y) (+ 1 3)
             (= me \Z) (+ 2 6))
           (= opponent \B)
           (cond
             (= me \X) (+ 1 0)
             (= me \Y) (+ 2 3)
             (= me \Z) (+ 3 6))
           (= opponent \C)
           (cond
             (= me \X) (+ 2 0)
             (= me \Y) (+ 3 3)
             (= me \Z) (+ 1 6))))))


(defn part-1
  [input]
  (transduce (score-round-part-1) + (str/split-lines input)))

(defn part-2
  [input]
  (transduce (score-round-part-2) + (str/split-lines input)))

