(ns day05
  (:require
    [clojure.string :as str]))


(defn transpose
  [matrix]
  (apply map vector matrix))


(defn solve [lifting-strategy input]
(let [[raw-stacks moves] (str/split input #"\n\n")
        raw-stack-without-numbers (butlast (str/split-lines raw-stacks))
        stacks (->>
                 raw-stack-without-numbers
                 transpose
                 (map (partial remove #{\space \[ \]}))
                 (remove empty?)
                 (map reverse)
                 (zipmap (iterate inc 1)))
        moves (map (comp (partial map parse-long) (partial re-seq #"\d+")) (str/split-lines moves))
        new-stacks (reduce (fn [stacks [n from to]]
                             (-> stacks
                                 (update to concat (lifting-strategy (take-last n (get stacks from))))
                                 (update from (partial drop-last n)))) stacks moves)]
    (->> (sort new-stacks)
         (map last)
         (map last)
         str/join))
)

(defn part-1
  [input]
  (solve reverse input))



(defn part-2
  [input]
  (solve identity input))

