(ns rules-engine.entities.fact)

; name: string containing fact's name
; args: list of strings containing args names
(defrecord Fact [name args])