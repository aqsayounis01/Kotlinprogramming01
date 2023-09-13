// return the value in the same line in which we declare the function
fun main(args:Array<String>)
{
    var a :Int = 9
    var b:Int =7
    var c=max(a,b)
    println(c)
}

fun max(a:Int,b:Int):Int = if (a>b) a else b