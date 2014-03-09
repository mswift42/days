(defproject days "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]
                 [korma "0.3.0-RC5"]
                 [com.h2database/h2 "1.3.170"]
                 [kerodon "0.3.0"]
                 [ring-server "0.3.0"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler days.handler/app
         :init days.handler/init
         :destroy days.handler/destroy}
  :aot :all
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.0"]]}})
