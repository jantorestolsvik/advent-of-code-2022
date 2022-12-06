### Day 1

I learned about transducers, and that we create them by just calling map with 1 argument. Comp runs left to right on transducers, where normal comp runs right to left.

### Day 2

({:a 1} :a) does the same as (:a {:a 1})

(juxt) came up again ((juxt a b c) x) => [(a x) (b x) (c x)]

### Day 4 

(re-seq #"\d+" "1 2 3")

### Day 5

(map vector [1 2 3] ["a" "b" "c"]) ([1 "a"] [2 "b"] [3 "c"])
(zipmap (iterate inc 1) ["a" "b" "c"]) {1 "a" 2 "b" 3 "c"}

(->> (str "[" puzzle-data "]")
read-string)

Treats the input as a list, and reads the strings and makes tokens. 