(ns day06)


(defn solve
  [input marker-size]
  (->>
    (partition marker-size 1 input)
    (map set)
    (map-indexed vector)
    (filter #(= (count (second %)) marker-size))
    first
    first
    (+ marker-size)))


(defn part-1
  [input]
  (solve input 4))


(defn part-2
  [input]
  (solve input 14))

