//if arg is passed then function will take it.
// else it will use default parameter

fun main(args:Array<String>)
{
    test(10,1)    //first priority
}

fun test(a:Int ,b:Int =20)
{
    println(a+b)
}

