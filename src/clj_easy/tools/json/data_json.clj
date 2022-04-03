(ns clj-easy.tools.json.data-json
  (:require [clj-easy.tools.json :as tools-json]
            [clojure.data.json :as json]))

(defn reg-provider! []
  (tools-json/reg-provider! 'org.clojure/data.json
                            {:read-str (fn [s _opts]
                                          (json/read-str s))
                             :write-str (fn [s _opts]
                                         (json/write-str s))}))
