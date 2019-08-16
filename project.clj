(defproject projeuler "0.1.0-SNAPSHOT"
  :description "Project Euler Clojure SOlutions"
  :url "http://ripfoghorn.github.io"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :plugins [[lein-cljfmt "0.6.3"]]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot projeuler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
