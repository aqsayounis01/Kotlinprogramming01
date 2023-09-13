//in case of returning nothing (void) - :Unit or dont wrute anything

fun main(args:Array<String>)
{
    var a= readln().toInt()
    var b =readln().toInt()
    println(add(a,b))

}
fun add(a:Int,b:Int):Int
{
    return a + b
}