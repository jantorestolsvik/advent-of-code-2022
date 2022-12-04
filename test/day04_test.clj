(ns day04-test
  (:require
    [clojure.test :as t]
    [day04 :refer [part-1 part-2]]
    [utils :as u]))


(def test-data "2-4,6-8\n2-3,4-5\n5-7,7-9\n2-8,3-7\n6-6,4-6\n2-6,4-8")
(def puzzle-data (slurp "resources/day04_data.txt"))


(t/deftest part-1-test
  (t/are [expected input] (= expected (u/pprintr (part-1 input)))
    2 test-data
    500 puzzle-data))


(t/deftest part-2-test
  (t/are [expected input] (= expected (u/pprintr (part-2 input)))
    4 test-data
    815 puzzle-data))
