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

        def s = ['java', 'js', 'python', 'js'] as Set 
        println s 
        println s.class

        def m = [courseName:'Gradle',rating:5,price:10]
        println m

        m.each {
            k,v->
            println("${k} -- ${v}")
        }

        println m.courseName
        println m['courseName']
        println m.get('courseName')

        m.review = 'its awesome'

        println m.get('review')
    }
}