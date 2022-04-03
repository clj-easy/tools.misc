(ns clj-easy.tools.json)

(def ^:private read-str-impl (volatile! nil))

(defn read-str [s opts]
  (@read-str-impl s opts))

(def ^:private write-str-impl (volatile! nil))

(defn write-str [s opts]
  (@write-str-impl s opts))

(def ^:private provider-impl
  (volatile! nil))

(defn provider []
  @provider-impl)

(def ^:private provider-impls (volatile! {}))

(defn reg-provider!  [id opts]
  (vswap! provider-impls assoc id opts))

(defn choose-provider! [id]
  (let [{read-str-provider :read-str
         write-str-provider :write-str} (get @provider-impls id)]
    (when-let [impl @provider-impl]
      (binding [*out* *err*]
        (println "WARNING: json provider was already set to:" impl "and is now set to:" id)))
    (vreset! read-str-impl read-str-provider)
    (vreset! write-str-impl write-str-provider)
    (vreset! provider-impl id)))
