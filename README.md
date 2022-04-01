# tools.misc

Abstraction library for misc. tools.

## Status

The protocols in this library are here to collect feedback and may change any
time at this point, until we reach a community consensus on what is reasonable.

## Why

The goal of this project is that libraries can program against a protocol
without including a specific implementation. For example, a library which needs
JSON should not have to choose between Cheshire, clojure.data.json or jsonista
if they don't have very specific requirements that any of those libraries
offer. Instead the user can choose what they might be already using in their
applications to reduce the total number of dependencies.

In addition, this library _could_ give default implementations for popular
libraries that end-users could just use out of the box.

## `clj-easy.tools.json`

Provides the `JSON` protocol with functions:

``` clojure
(defprotocol JSON
  (read-str [s])
  (write-str [s]))
```

## `clj-easy.tools.http-client`

``` clojure
(defprotocol HttpClient
  (request [this request])
  (get [this request])
  (post [this request])
  (put [this request])
  (delete [this request]))
```
