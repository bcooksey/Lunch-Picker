(ns lunch-picker.views.welcome
  (:require [lunch-picker.views.common :as common])
  (:use [noir.core :only [defpage]]))

(defpage "/" []
         (def types ["mexican" "chinese" "american" "italian"])
         (common/layout
            [:p "Welcome to Lunch Picker"]
               [:div 
                (for [x types] x 
;                  [:label {:for x} x]
;                  [:input {:type "radio" :name "type" :value x}]         
                )
              ]
         )
)
