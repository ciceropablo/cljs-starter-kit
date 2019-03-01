(ns app.events
  (:require
   [clojure.walk :as walk]
   [re-frame.core :as rf]))

(rf/reg-event-fx :initialize
                 (fn [_ _]
                   {:db {:heading-content "CLJS Starter-Kit"
                         :description-content "Foo bar baz quux ..."}}))