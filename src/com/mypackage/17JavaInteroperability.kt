// interoperability -> calling java function from kotlin code and vice versa

// class file that will be generated - _17JavainteroperabilityKt
@file:JvmName("kotlinfile")  //so that we dot have to write long name of this file in java file
package com.mypackage
import com.javapackage.java18


// so that you dont have to write the whole file name of java
fun main(args:Array<String>)
{
    var a =12
    var b=2
    var c= java18.area(a, b)
    println(c)

}
@JvmOverloads    // BECAUSE JAVA DOES NOT HAVE THE CONCEPT OF DEFAULT ARGUMENT
fun add2(a:Int,b:Int=2):Int
{
    return a+b
}