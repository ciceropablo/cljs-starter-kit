(ns app.core
  (:require
   [devtools.core :as devtools]
   [app.view :as view]
   [app.events]
   [app.subs]
   [reagent.core :as r]
   [re-frame.core :as rf]))

(devtools/install!)
(enable-console-print!) ;; `println` as `console.log`

(defn render
  []
  (r/render [view/show] (js/document.getElementById "root")))

(defn init
  []
  (rf/dispatch-sync [:initialize])
  (render))
