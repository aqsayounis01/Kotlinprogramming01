
fun main(args:Array<String>)
{
    var a :Int = 9
    var b:Int =7
    var c=max(a,b)
    println(c)
}

fun max(a:Int,b:Int):Int =
    if (a>b)
    {
        println("a is greater")
        a     //this is not be displayed or returned
        34
    } else
    {
        println("b is greater")
        b
    }