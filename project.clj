(defproject gerkings "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[com.siili/lein-cucumber "1.0.7"]]
  :cucumber-feature-paths ["test/features/"]
  :cucumber ["-p json"]
  :test-paths ["test/features" "test" "test/features/step_definitions"]
  :profiles
  {:dev
   {:dependencies [[com.siili/lein-cucumber "1.0.7"]]}}
  )
