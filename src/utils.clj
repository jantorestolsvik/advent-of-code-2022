(ns utils
  (:require
    [clojure.pprint :refer [pprint]]
    [clojure.string :as str]))


(defn split-blank-line
  "Given an input string, returns a sequence of sub-strings, separated by a completely
  blank string. This function preserves any newlines between blank lines, and it filters
  out Windows' \"\r\" characters."
  [input]
  (-> (str/replace input "\r" "")
      (str/split #"\n\n")))


(defn pprintr
  [data]
  (pprint data)
  data)
