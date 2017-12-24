(ns precept.todomvc.session
  (:require
   [precept.rules :refer-macros [define defsub session rule]]
   [precept.todomvc.schema]
   [precept.todomvc.rules]))

(session app-session
  'precept.todomvc.rules
  :db-schema precept.todomvc.schema/db-schema
  :client-schema precept.todomvc.schema/client-schema)
 
 
