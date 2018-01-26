(ns {{name}}.handler
  (:gen-class
    :main true
    :methods [^:static [handle [Object com.amazonaws.services.lambda.runtime.Context] Object]])
  (:require [{{name}}.handler.impl :as impl])
  (:import [java.util UUID]
           [com.amazonaws.services.lambda.runtime Context RequestHandler RequestStreamHandler]))

(defn -handle [event context]
  (do (impl/{{name}} event)
    (str "OK")))
