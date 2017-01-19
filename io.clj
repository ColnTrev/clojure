(defn print-test
    "This function takes a string and prints it."
    []
    (print "Enter something: ")
    (flush)
    (let [line (read-line)]
         (println line)))