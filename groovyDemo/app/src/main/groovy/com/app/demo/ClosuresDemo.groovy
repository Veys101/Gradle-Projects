package com.app.demo

class ClosuresDemo {

    ClosuresDemo() {
        def c1 = {
            println("Closures are super simple.")
        }

        c1.call()

        def c2 = {
            n=10 -> println(n*2)
        }
        c2.call()
        c2.call(5)

        4.times {n -> print n}
        print ' -- '
        3.times { print it}
    }

}