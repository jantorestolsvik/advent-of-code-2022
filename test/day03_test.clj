(ns day03-test
  (:require
    [clojure.test :as t]
    [day03 :refer [part-1 part-2]]
    [utils :as u]))


(def test-data "vJrwpWtwJgWrhcsFMMfFFhFp\njqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\nPmmdzqPrVvPwwTWBwg\nwMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\nttgJtRGJQctTZtZT\nCrZsJsPPZsGzwwsLwLmpwMDw")
(def puzzle-data (slurp "resources/day03_data.txt"))


(t/deftest part-1-test
  (t/are [expected input] (= expected (u/pprintr (part-1 input)))
    157 test-data
    7691 puzzle-data))


(t/deftest part-2-test
  (t/is (= 2508 (part-2 puzzle-data)))
  (t/is (= 70 (part-2 test-data))))
