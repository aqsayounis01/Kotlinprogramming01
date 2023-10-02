//set are much like arraylist but the difference is that here : if the element is repeated then it is simply ignored

fun main(args : Array<String>)
{
    var s= setOf<Any>(3,1,2,3,3,3)
    println(s.size)
    println(s.first())
    println(s.last())
}