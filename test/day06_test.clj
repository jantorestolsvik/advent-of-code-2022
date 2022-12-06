(ns day06-test
  (:require
    [clojure.test :as t]
    [day06 :refer [part-1 part-2]]
    [utils :as u]))


(def puzzle-data (slurp "resources/day06_data.txt"))


(t/deftest part-1-test
  (t/are [expected input] (= expected (u/pprintr (part-1 input)))
    7 "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
    5 "bvwbjplbgvbhsrlpgdmjqwftvncz"
    6 "nppdvjthqldpwncqszvftbrmjlhg"
    10 "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"
    11 "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"
    1802 puzzle-data))


(t/deftest part-2-test
  (t/are [expected input] (= expected (u/pprintr (part-2 input)))
    19 "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
    23 "bvwbjplbgvbhsrlpgdmjqwftvncz"
    23 "nppdvjthqldpwncqszvftbrmjlhg"
    29 "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"
    26 "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"
    3551 puzzle-data))
