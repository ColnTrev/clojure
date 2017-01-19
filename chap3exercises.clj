; this is a comment

(defn dec-maker
    "Solves Question 3"
    [dec-by]
    #(- % dec-by))

(defn mapset
    "Solves question 4"
    [f lst]
    (into #{} (map f lst)))