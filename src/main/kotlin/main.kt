package org.example

fun main() {


    val hello = HelloWorld.Hello1.newBuilder()
        .setMessage1("hello world")
        .build()

    println(hello.toByteString())


}
