(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (Math/abs x))

(defn divides? [divisor n] (if (== (rem n divisor)0)true false))

(defn fizzbuzz [n]
  (if (= 0 (mod n 3))
    (if (= 0 (mod n 5)) "gotcha!"
      "fizz")
    (if (= 0 (mod n 5))
      "buzz"
      "")))

(defn teen? [age] (if age (<= age 19)))

(defn teen? [age]
(<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x] (cond (number? x) (* x 2)
                                     (empty? x) nil
                                     (or (list? x) (vector? x)) (* 2 (count x))
                                     :else true))

(defn leap-year? [year] (cond (zero? (mod year 400)) true
                              (zero? (mod year 100)) false
                              (zero? (mod year 4)) true
                              :default false))

; '_______'
