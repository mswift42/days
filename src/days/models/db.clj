(ns days.models.db
  (:require [clojure.string :as str]
            [korma.db :as kd]
            [korma.core :as kc]
            [clojure.java.jdbc :as sql]))

(def db (kd/h2 {:db "resources/db/korma.db"}))

(declare users email  tasks title task scheduled done)

(kc/defentity users
  (kc/table :users))


(defn create-users-table []
  (sql/with-connection db
    (sql/create-table
      :users
      [:email "varchar(100)"]
      [:pass "varchar(100)"]
      [:id "timestamp"]
      [:title "varchar(100)"]
      [:task "blob"]
      [:scheduled "date"]
      [:done "boolean"])))














