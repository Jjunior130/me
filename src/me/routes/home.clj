(ns me.routes.home
  (:require [compojure.core :refer :all]
            [me.views.layout :as layout]
            [hiccup.element :refer [image link-to] :as elem]))

(defn home []
  (layout/common [:div.box
                  [:h1 "Junior Brito"]
                  [:p "Web Developer"]
                  [:p [:em "Student"]]
                  [:br]
                  [:br]
                  [:br]
                  (elem/link-to "http://github.com/Jjunior130"
                                (elem/image "img/48_github-128.png"))]))

(defroutes home-routes
  (GET "/" [] (home)))
