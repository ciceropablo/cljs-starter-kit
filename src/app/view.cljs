(ns app.view
  (:require
   [re-frame.core :as rf]
   [reagent.core :as r]))

(defn heading
  [hc]
  [:h1 hc])

(defn description
  [dc]
  [:p dc])

(defn show
  []
  (let [hc @(rf/subscribe [:heading-content])
        dc @(rf/subscribe [:description-content])]
    [:div
     [heading hc]
     [description dc]]))