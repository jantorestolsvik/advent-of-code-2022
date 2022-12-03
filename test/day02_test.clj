(ns day02-test
  (:require
    [clojure.test :as t]
    [day02 :refer :all]
    [utils :as u]))


(def test-data "A Y\nB X\nC Z")
(def puzzle-data (slurp "resources/day02_data.txt"))


(t/deftest part-1-test
  (t/are [expected input] (= expected (u/pprintr (part-1 input)))
    15 test-data
    12586 puzzle-data))


(t/deftest part-2-test
  (t/are [expected input] (= expected (u/pprintr (part-2 input)))
    12 test-data
    13193 puzzle-data))
