(ns clj-easy.tools.json.v0
  (:require [cheshire.core :as cheshire]))

(defn read-str
  ([s] (read-str s nil))
  ([s {:keys [key-fn]}] (cheshire/parse-string s (or key-fn keyword))))

(defn write-str
  ([s] (write-str s nil))
  ([s _opts] (cheshire/generate-string s)))
