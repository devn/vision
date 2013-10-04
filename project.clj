(defproject devn/vision "1.0.0-SNAPSHOT"
  :description "OpenCV wrapper for Clojure."
  :url "https://github.com/devn/vision"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.incubator "0.1.3"]
                 [org.clojars.nakkaya/jna "3.2.7"]]
  :jvm-opts ["-Djna.library.path=resources/lib/"])
