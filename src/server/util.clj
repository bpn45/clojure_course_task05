(ns tbd.util)

(defmacro env [name]
  `(~(symbol (str ".-" name)) (.-env js/process)))