# scala-util

[![Join the chat at https://gitter.im/varwise/scala-util](https://badges.gitter.im/varwise/scala-util.svg)](https://gitter.im/varwise/scala-util?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status](https://travis-ci.org/varwise/scala-util.svg?branch=master)](https://travis-ci.org/varwise/scala-util)
[![codecov](https://codecov.io/gh/varwise/scala-util/branch/master/graph/badge.svg)](https://codecov.io/gh/varwise/scala-util)

A collections of random Scala utilities

```
"com.varwise" %% "scala-util" % "0.2.3"
```

You might need to also add our repository:



# What's included:
#### URI Matches for scalatest
A simple matcher that provides more custom matching rules for URIs, for example: matching URIs without looking at the ordering of query parameters (which wouldn't work if you just compare `String`s)

#### Std{Err,Out}Filter
A logback filter that redirects `ERROR` and `WARN` logs to `stderr` and, `TRACE`, `DEBUG`, `INFO` are redirected to `stdout`

#### AirbrakeService
A simple wrapper that is used to send notifications about errors to Airbrake

#### OptionConversions
A collection of utilities for converting `Option`s
