(ns me.server
  (:require [me.handler :refer :all]
        [ring.adapter.jetty :as jetty]))

(defn -main [port]
  (jetty/run-jetty app {:port (Integer. port)}))
