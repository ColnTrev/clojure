(print "Enter a number: ")
(flush)
(let[rnd (rand-int 10)
     guess (Integer/parseInt (read-line))]
(cond
    (= rnd guess)(println "You got my guess right!")
    :else (println "Sorry...guess again")))