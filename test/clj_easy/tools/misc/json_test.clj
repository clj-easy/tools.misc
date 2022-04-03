(ns clj-easy.tools.misc.json-test
  (:require [clj-easy.tools.json :as json]
            [clj-easy.tools.json.cheshire :as tools.cheshire]
            [clj-easy.tools.json.data-json :as tools.data.json]
            [clojure.test :refer [deftest is]]))

(deftest read-str-test
  (tools.cheshire/reg-provider!)
  (json/choose-provider! 'cheshire/cheshire)
  (is (= [1 2 3] (json/read-str "[1, 2, 3]" nil)))
  (tools.data.json/reg-provider!)
  (json/choose-provider! 'org.clojure/data.json)
  (is (= [1 2 3] (json/read-str "[1, 2, 3]" nil))))
