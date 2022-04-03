(ns clj-easy.tools.misc.json-test
  (:require [clj-easy.tools.json :as json]
            [clj-easy.tools.json.cheshire :as tools.cheshire]
            [clj-easy.tools.json.data-json :as tools.data.json]
            [clojure.test :refer [deftest is testing]]))

(tools.cheshire/reg-provider!)
(tools.data.json/reg-provider!)

(deftest read-str-test
  (doseq [provider '[cheshire/cheshire org.clojure/data.json]]
    (json/choose-provider! provider)
    (testing "read json"
      (is (= [1 2 3] (json/read-str "[1, 2, 3]")))
      (is (= {:a 1} (json/read-str "{\"a\": 1}")))
      (is (= {:a 1} (json/read-str "{\"a\": 1}" {:key-fn keyword})))
      (is (= {"a" 1} (json/read-str "{\"a\": 1}" {:key-fn str}))))
    (testing "read json"
      (is (= [1 2 3] (json/read-str (json/write-str [1 2 3]))))
      (is (= {:a 1} (json/read-str (json/write-str {:a 1})))))))
