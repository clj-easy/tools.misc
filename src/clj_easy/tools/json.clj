(ns clj-easy.tools.json)

;; Function naming inspired by clojure.data.json
(defprotocol JSON
  (read-str [s])
  (write-str [s]))
