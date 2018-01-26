(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :aot :all
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0" :exclusions [joda-time]]
                 [com.amazonaws/aws-lambda-java-events "1.3.0" :exclusions [commons-logging]]
		 [cheshire "5.8.0"]])
