(ns app.subs
  (:require
   [re-frame.core :as rf]))

(rf/reg-sub :heading-content
            (fn [db]
              (:heading-content db)))

(rf/reg-sub :description-content
            (fn [db]
              (:description-content db)))