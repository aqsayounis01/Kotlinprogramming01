//Abstract class -> that cannot have object
//Abstract function-> does not have defination
// Abstract variable-. cannot have value
//ABSTRACTION : it is used when we have common functions that will be implemented using different objects

abstract class V
{
    abstract var a:Int
    var b=12
    abstract fun func1()

    fun fun2()
    {
        println("this is a function")
    }
}
class C() :V() //inherit the class simply as you do, then got to error and click implement
//or simply override the abstract members 
{
    override fun func1() {
        println("this is func1 (abstract)")
    }

    override var a: Int=122


}
fun main(args:Array<String>)
{
    var c =C()
    println(c.a)
    c.func1()
    c.fun2()
    println(c.b)
}