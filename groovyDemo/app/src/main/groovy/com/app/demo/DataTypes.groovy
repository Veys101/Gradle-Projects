package com.app.demo

class DataTypes {

    DataTypes () {
        String s1 = 'Hello'
        println s1
        String s2 = "${s1} World"
        println s2

        String s3 = '''\tAll the power is with in you.\nYou can do anything and everything.
        '''
        println s3

        def emailPattern = /^[a-zA-Z0-9]+(?:\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\.[a-zA-Z0-9]+)*$/
        println 'test@@gmail.com'==~ emailPattern
    }

    void intType() {
        def a = 10
        println a
        println a.class
    }

    void floatType() {
        float a = 10.24F
        println a
        println a.class
    }

}