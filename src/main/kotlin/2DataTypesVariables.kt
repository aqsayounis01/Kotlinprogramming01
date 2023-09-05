// Variables are declared using var and val
// var -> variables (mutable)
// val -> constants (immutable)
// value of var can be changed but DATA TYPE SHOULD BE SAME
//


fun main(args: Array<String>):Unit
{
    var n= 10
    var str= "this is a string "
    var f= 10.00
    var b = false
    var c= 'c'
    var f1= 10.0f   //if f is not written in the end then it will take DOUBLE by default

    var num:Int    // if you dont want to initialize
    num=0

    // modified
    num=0
    str="this is changed now"
    println(num)
    println(c)
    println(str)

    println("the value of str is ${str}")  // it is known as STRING INTERPOLATION
    val v="fixed"
//    v="try"    This cannit be done
}