(defproject clojure_course_task05 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://coursetask05-bpn.rhcloud.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "0.3.0"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1535"]
                 [hiccups "0.1.1"]
                 [webfui "0.2"]
                 [org.bodil/cljs-noderepl "0.1.9"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :cljsbuild
	{:builds
 	[{:source-paths ["src/server"],
   	:compiler
  	{:output-dir "js",
    	:target :nodejs,
    	:output-to "js/main.js",
    	:optimizations :simple}}
  	{:source-paths ["src/client"],
   	:compiler {:output-dir "static/cljs", :output-to "static/cljs.js"}}]})

