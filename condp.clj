(print "Enter a number: ")
(flush)
(let [line (read-line)
      value (try
              (Integer/parseInt line)
              (catch NumberFormatException e line))]
(println
    (condp = value
        1 "one"
        2 "two"
        3 "three"
        (str "unexpected value")))
(println
    (condp instance? value
        Number (* value 2)
        String (* (count value) 2))))