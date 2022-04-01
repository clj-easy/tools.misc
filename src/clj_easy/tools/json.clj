(ns clj-easy.tools.json)

(defprotocol JSONReader
  (read-str [this s {:keys [key-fn]}]))

(defprotocol JSONWriter
  (write-str [this s {:keys []}]))
