(defproject net.clojars.everyday-chemist/clojure-lanterna "0.9.8"
  :description "A Clojure wrapper around the Lanterna terminal output library."
  :url "https://github.com/everyday-chemist/clojure-lanterna"
  :license {:name "LGPL"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.googlecode.lanterna/lanterna "2.1.7"]]
  :java-source-paths ["./java"]
  ; :repositories {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"}
  :repositories {"releases" {:url "https://clojars.org/repo"
                             :sign-releases false}})
