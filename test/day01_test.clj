(ns day01-test
  (:require
    [clojure.test :as t]
    [day01 :as day01]))


(t/deftest part-1
  (t/is (= (day01/part-1
             (slurp "resources/day01_sample.txt")) 24000)))


(t/deftest part-2
  (t/is (= (day01/part-2
             (slurp "resources/day01_sample.txt")) 45000)))
