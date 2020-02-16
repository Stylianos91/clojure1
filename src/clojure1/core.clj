(ns clojure1.core)
(require '[clojure.repl :refer :all])
;(doc =)
;(apropos "+")
(do
  (println "Hello")
  '(123)
  (println "World")
  (println (+ 8 3 4)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
