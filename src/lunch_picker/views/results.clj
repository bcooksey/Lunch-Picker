(ns lunch-picker.views.welcome
  (:require [lunch-picker.views.common :as common])
  (:use [noir.core :only [defpage]]))

(defpage "/results" []
         (common/layout
           [:h1 "Results"]))
