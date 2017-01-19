(defn fizzbuzz
    [num]
    (cond
        (zero? (mod num 15)) "fizzbuzz"
        (zero? (mod num 3)) "fizz"
        (zero? (mod num 5)) "buzz"
        :else num))