(ns project-a.core
  (:require
    [lib-a.core :as lib-a]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(foo "I say: ")
(foo "I say again: ")

(lib-a/foo "They say: ")
(lib-a/foo "They say again: ")
