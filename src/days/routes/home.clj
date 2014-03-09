(ns days.routes.home
  (:require [compojure.core :refer :all]
            [days.views.layout :as layout]))

(defn home [] 
  (layout/common "Days"
        (layout/home-html)))

(defroutes home-routes
  (GET "/" [] (home)))
