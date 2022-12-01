(ns day01-test
  (:require
    [clojure.test :as t]
    [day01 :as day01]))


(def test-data "1000\n2000\n3000\n\n4000\n\n5000\n6000\n\n7000\n8000\n9000\n\n10000")
(def puzzle-data (slurp "resources/day01_data.txt"))


(t/deftest part-1-test
  (t/are [expected input] (= expected (day01/part-1 input))
    24000 test-data
    72478 puzzle-data))


(t/deftest part-2-test
  (t/are [expected input] (= expected (day01/part-2 input))
    45000 test-data
    210367 puzzle-data))
