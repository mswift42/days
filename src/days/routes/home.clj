(ns days.routes.home
  (:require [compojure.core :refer :all]
            [days.views.layout :as layout]))

(defn home [] 
  (layout/common "Days"
        (layout/home-html)))

(defn about []
  (layout/common "About"
                 (layout/about-html)))

(defroutes home-routes
  (GET "/" [] (home))
  (GET "/about" [] (about)))
