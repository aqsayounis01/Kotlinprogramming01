//Named Prameters are only in kotlin, we cannot use it in java

fun main(args:Array<String>)
{
    lbh(b=0,l=9)
}
fun lbh(l:Int,b:Int,h:Int=90)
{
    println(l)
    println(b)
    println(h)
}