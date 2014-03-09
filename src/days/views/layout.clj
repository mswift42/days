(ns days.views.layout
  (:require [hiccup.page :refer [html5 include-css]]
            [hiccup.core :refer [html]]))

(defn common [title & body]
  (html5
    [:head
     [:title title]
     (include-css "/css/bootstrap.min.css")
     (include-css "/css/days.css")]
    [:body body]))

(defn header
  "html for boostrap's navbar header."
  []
  (html
   [:div.navbar.navbar-fixed-top
    [:div.navbar-inner
     [:div.container-fluid
      [:ul.nav
       [:li.active
        [:a.brand {:href "/about"} "About"]]
       [:li.active
        [:a.brand {:href "/new"} "New Task"]]
       [:li.active
        [:a.brand {:href "/signin"} "Sign In"]]]]]]))

(defn home-html
  "html for home-page."
  []
  (html
   (header)
   [:h2.header "days"]))
