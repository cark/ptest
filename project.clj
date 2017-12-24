(defproject ptest "0.0.0"
  :url          "https://github.com/CoNarrative/precept.git"
  :license      {:name "MIT"
                 :url "https://github.com/CoNarrative/precept/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [precept "0.4.0-alpha"]
                 [reagent "0.8.0-alpha2"]
                 [secretary "1.2.3"]]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :source-paths ["src/cljs" "dev/cljs"]

  :resource-paths ["resources" "target/cljsbuild"]

  :figwheel
  {:http-server-root "public"
   :nrepl-port 7002
   :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :profiles
  {:dev
   {:dependencies [[com.cemerick/piggieback "0.2.2"]
                   [figwheel-sidecar "0.5.15-SNAPSHOT"]
                   [binaryage/devtools "0.9.8"]]

    :plugins      [[lein-figwheel "0.5.14"]]

    :repl-options {:init-ns user}

    :source-paths ["dev/clj"]

    :cljsbuild
    {:builds
     {:app
      {:source-paths ["src/cljs" "dev/cljs"]
       :compiler
                     {:main "precept.todomvc.app"
                      :asset-path "/js/out"
                      :output-to "target/cljsbuild/public/js/app.js"
                      :output-dir "target/cljsbuild/public/js/out"
                      :preloads [devtools.preload]
                      :source-map true
                      :optimizations :none
                      :cache-analysis false
                      :pretty-print true}}}}}})
