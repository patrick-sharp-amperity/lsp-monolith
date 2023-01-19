(ns project-a.core
  (:require
    [lein-monolith.example/lib-a :as lib-a]))

(defn bar [x] (lib-a/foo x))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
