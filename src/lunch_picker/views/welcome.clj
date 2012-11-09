(ns lunch-picker.views.welcome
  (:require [lunch-picker.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to lunch-picker"]))
