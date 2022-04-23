(ns clj-easy.tools.json.v0
  (:require [cheshire.core :as cheshire])
  (:import (com.fasterxml.jackson.core.io JsonEOFException)))

(defn read-str
  ([s] (read-str s nil))
  ([s {:keys [key-fn]}]
   (try (cheshire/parse-string s (or key-fn keyword))
     (catch JsonEOFException e
       (throw (ex-info "Incomplete input" {} e))))))

(defn write-str
  ([s] (write-str s nil))
  ([s _opts] (cheshire/generate-string s)))
