package com.tencent.warmli.servicecommons

fun curry(i: Int, pro: (Int) -> Int, s: (Int) -> Unit){
    pro(i)
    print(s)
}

class CurryingImpl(private val x: Int, private var y: Int) {
    val z: String by lazy {
        if (x == 1) "1" else "0"
    }
    fun test() {
        print(x)
        print(y)
        print(z)
    }
}

fun main() {
    val c = CurryingImpl(1, 2)
    print(c.z)
}

interface Currying {
    var x: Int
    var y: Int

}