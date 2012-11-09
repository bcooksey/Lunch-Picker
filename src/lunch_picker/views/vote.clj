(ns lunch-picker.views.welcome
  (:require [lunch-picker.views.common :as common])
  (:use [noir.core :only [defpage]]))

(defpage "/vote" []
         (common/layout
           [:h1 "Place your vote!"]))
