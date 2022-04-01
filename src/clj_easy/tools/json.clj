(ns clj-easy.tools.json)

(defprotocol JSON
  "Function naming inspired by clojure.data.json"
  (read-str [s])
  (write-str [s]))
