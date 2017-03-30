(ns gerkings.core-test
  (:require [clojure.test :refer :all]
            [gerkings.core :refer :all])
  (:use [leiningen.cucumber])
  (:import [cucumber.api.cli Main]))

(deftest run-cukes
  (. cucumber.api.cli.Main (main (into-array ["-p" "json"  "--glue" "test" "test/features"]))))

