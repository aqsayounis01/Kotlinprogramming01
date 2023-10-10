//interfaces are just like classes (abstract by default) (i.e does not has objects)
//as we know , classes in kotlin can only inherit one class, if we need to inherit more than one class then ->
//we inherit interfaces instead of class (using comma )
interface abc
{
    var a1:Int
    val a2:Int
    fun func1()
    {
        println("this is func1 (non abstract) inside interface" )
    }
     fun func2();
}
class Xyz : abc
{
    override var a1: Int =12
    override val a2: Int=123
    override fun func2() {
        println("this is func2 (abstract) inside class")
    }
}
fun main(args:Array<String>)
{
    var c =  Xyz()
    c.func2()
    c.func1()
    println(c.a1)
    println(c.a2)
    c.a1=0
    println(c.a1)
//    a2 is constant, so it cannot be reassigned
}