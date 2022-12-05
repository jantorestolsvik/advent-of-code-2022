(ns day05-test
  (:require
    [clojure.test :as t]
    [day05 :refer [part-1 part-2]]
    [utils :as u]))


(def test-data "    [D]    \n[N] [C]    \n[Z] [M] [P]\n 1   2   3 \n\nmove 1 from 2 to 1\nmove 3 from 1 to 3\nmove 2 from 2 to 1\nmove 1 from 1 to 2")
(def puzzle-data (slurp "resources/day05_data.txt"))


(t/deftest part-1-test
  (t/are [expected input] (= expected (u/pprintr (part-1 input)))
    "CMZ" test-data
    "MQTPGLLDN" puzzle-data))


(t/deftest part-2-test
  (t/are [expected input] (= expected (u/pprintr (part-2 input)))
    "MCD" test-data
    "LVZPSTTCZ" puzzle-data))
