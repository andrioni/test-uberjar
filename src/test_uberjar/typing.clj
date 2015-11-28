 (ns test-uberjar.typing
     (:require [structural-typing.type :as type]
       [structural-typing.preds :as preds]))

(def type-repo
  (-> type/empty-type-repo
      (type/named :Point
             (type/requires :x :y)
             {:x integer? :y integer?})))