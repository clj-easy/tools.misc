# tools.misc

Tools library similar to `clojure.tools.logging` but for misc. tools.

## Status

At this point, tools.misc is the result of a 15 minute braindump. The protocols
in this library are here to collect
[feedback](https://github.com/clj-easy/tools.misc/discussions) and may change
any time until we reach a community consensus on what is
reasonable.

## Why

The goal of this project is that libraries can program against a protocol
without including a specific implementation. For example, a library which needs
JSON should not have to choose between Cheshire, clojure.data.json or jsonista
if they don't have very specific requirements that any of those libraries
offer. Instead the end-user can choose what they might be already using in their
applications to reduce the total number of dependencies.

In addition, this library _could_ give default implementations for popular
libraries that end-users could just use out of the box and library authors can
use in their tests.

## Contributing

Use [Github Discussions](https://github.com/clj-easy/tools.misc/discussions) to
join the conversation.

## `clj-easy.tools.json`

See [here](https://github.com/clj-easy/tools.misc/blob/main/src/clj_easy/tools/json.clj).

## `clj-easy.tools.http-client`

See [here](https://github.com/clj-easy/tools.misc/blob/main/src/clj_easy/tools/http_client.clj).
