// in case of kotlin , constructors becomes the class only
//we need to write var here while giving the parameter

class constructors(var name:String) {
    fun dis()
    {
        println("value of name is ${name}")
    }
}
fun main(args:Array<String>)
{
    var c1 = constructors("AnOnYmOuS")
    c1.dis()
}