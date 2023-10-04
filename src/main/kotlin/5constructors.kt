// in case of kotlin , constructors becomes the class only (primary constructor)
//we need to write var here while giving the parameter
//Primary constructor -> class class_name constructor(variables){init{ }}  or like the one that is defined
//below
//secondary constructor -> inside the  class it is defined



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