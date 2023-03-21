package com.app.demo

class CollectionsDemo {
    CollectionsDemo() {
        def l = [1,2,3]
        println l
        println l.class

        LinkedList ll = [1,2,3]
        println ll
        println ll.class

        ll << 4
        println ll

        l=l+[5,6,7]
        println l

        l=l-[3,5,7]
        println l

        l.each {print it}

        l.reverseEach {print it}
        println ""
        l.eachPermutation{println it}
    }
}