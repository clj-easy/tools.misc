(ns clj-easy.tools.json.v0
  (:require [clojure.data.json :as json]))

(defn read-str
  ([s] (read-str s nil))
  ([s {:keys [key-fn]}] (json/read-str s :key-fn (or key-fn keyword))))

(defn write-str
  ([s] (write-str s nil))
  ([s _opts] (json/write-str s)))
