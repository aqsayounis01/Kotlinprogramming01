//Inheritance -> it is used where ever there is  a is-a relationship between the classes
//classes cannot be overwritten
//as we know that the classes are final in kotlin , so we need to open the class that is to be inherited
open class Vehicle
{
    var model:String?="123"
    var type :String?="BMW"

    fun dis()
    {
        println(model)
        println(type)
    }
}
class Car1 : Vehicle()
{

}
fun main(args:Array<String>)
{
    var o = Vehicle()
    o.dis()

    var obj=Car1()
    obj.type="car type"
    obj.dis()           // only this will be changed

    println()
    o.dis()
}