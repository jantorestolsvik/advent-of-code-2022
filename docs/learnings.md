### Day 1

I learned about transducers, and that we create them by just calling map with 1 argument. Comp runs left to right on transducers, where normal comp runs right to left.

### Day 2

({:a 1} :a) does the same as (:a {:a 1})

(juxt) came up again ((juxt a b c) x) => [(a x) (b x) (c x)]