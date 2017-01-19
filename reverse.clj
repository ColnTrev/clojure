(defn reverse-number
    ([num]
        (reverse-number num 0))
    ([num accum]
        (if (= 0 num)
            accum
            (recur (quot num 10) (+(rem num 10) (* accum 10))))))
    