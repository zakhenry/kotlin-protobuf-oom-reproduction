# Simple reproduction of steps to reproduce out of memory error with compiling large protobuf definition with Kotlin protoc plugin

```
~/repos/kotlin-protobuf-oom-reproduction
➜ ./gradlew build
> Task :compileKotlin FAILEDG [3m 22s]
e: java.lang.OutOfMemoryError: Java heap space


FAILURE: Build failed with an exception.

* What went wrong:
  Execution failed for task ':compileKotlin'.
> Internal compiler error. See log for more details

* Try:
  Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 9m 54s
4 actionable tasks: 4 executed
```


## Steps to reproduce

1. Run `./gradlew build`
2. See that it runs out of memory (or uses a lot of memory depending on system setup?)

If you change the number of messages in `src/main/proto/hello_world.proto` you can find a threshold where the size is ok.


# Compare with Java protos

1. `git checkout java-api-only`
2. Run `./gradlew build`

For me this completes in 13s from cold build (`rm -rf ./build`). Compare with crashing out of memory after nearly 
10 minutes with Kotlin protos
