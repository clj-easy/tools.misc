(ns clj-easy.tools.json.cheshire
  (:require [cheshire.core :as cheshire]
            [clj-easy.tools.json :as tools-json]))

(defn reg-provider! []
  (tools-json/reg-provider! 'cheshire/cheshire
                            {:read-str (fn [s {:keys [key-fn]}]
                                         (cheshire/parse-string s (or key-fn keyword)))
                             :write-str (fn [s _opts]
                                          (cheshire/generate-string s))}))
