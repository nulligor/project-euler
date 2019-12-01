(defproject projeuler "0.1.0-SNAPSHOT"
  :description "Project Euler Clojure Solutions"
  :url "http://nulligor.github.io"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :plugins [[lein-cljfmt "0.6.3"]]
  :dependencies [[clj-time/clj-time "0.15.2"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [com.gfredericks/forty-two "1.0.0"]]
  :jvm-opts ["-Xmx2G"]
  :main ^:skip-aot projeuler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
