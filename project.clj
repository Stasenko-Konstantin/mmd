(defproject mmd "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns mmd.core}
  :main ^:skip-aot mmd.core
  :profiles {:uberjar {:aot :all}}
  :aot :all)
