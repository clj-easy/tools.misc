(ns clj-easy.tools.http-client
  (:refer-clojure :exclude [get]))

(defprotocol HttpClient
  (request [this request])
  (get [this request])
  (post [this request])
  (put [this request])
  (delete [this request]))
