(defproject nongrata "0.1.0-SNAPSHOT"
  :description "Mozilla Persona (BrowserID) example using Noir"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [javax.mail/mail "1.4.2"]
                 [noir "1.3.0-beta3"]]
  :dev-dependencies [[lein-eclipse "1.0.0"]]
  :jvm-opts ["-server -Xmx512m"] 
  :plugins [[lein-cljsbuild "0.1.8"]]
  :main nongrata.server
  :cljsbuild
  {:builds
  [{:source-path "src-cljs",
                 :compiler
                 {:output-to "resources/public/js/cljs.js",
                 :externs ["externs/jquery.js"],
                 :optimizations :simple,
                 :pretty-print true}}]})
