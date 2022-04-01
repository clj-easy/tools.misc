(ns clj-easy.tools.json)

(defprotocol JSONReader
  (read-str [s {:keys [key-fn]}]))

(defprotocol JSONWriter
  (write-str [s {:keys []}]))
