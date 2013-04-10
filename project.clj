(defproject clojure_course_task04a "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://task04-bpn.rhcloud.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "0.3.0"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1535"]
                 [hiccups "0.1.1"]
                 [webfui "0.2"]]
  :cljsbuild
	{:builds
 	[{:source-paths ["src/server"],
   	:compiler
  	{:output-dir "js",
    	:target :nodejs,
    	:output-to "js/main.js",
    	:optimizations :simple}}
  	{:source-paths ["src/client"],
   	:compiler {:output-dir "static/cljs", :output-to "static/cljs.js"}}]}

