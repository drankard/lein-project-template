(ns {{name}}.handler
  (:gen-class
   :main true
   :methods [^:static [handle [Object com.amazonaws.services.lambda.runtime.Context] Object]])
  (:require [{{name}}.handler.impl :as impl]))

(defn handle [event context]
  (impl/{{name}} event))
