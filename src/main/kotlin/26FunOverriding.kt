//fun overiding -> function will have same name and signature (i.e parameters and their datatype)
//But different function defination
//This can be done by: open the overridden function & override the overriding function
//fun overloading-> function has same name but diffrent parameters
//------------
//for using the different function name but same defination: we use the super keyword (super.old_functionname)

open class Veh
{
    open fun start()
    {
        println("Vehicle has started")
    }
    fun stop()
    {
        println("the vehicle has stopped")
    }

}

class CR : Veh()
{
    override
    fun start()
    {
        println("Car has started")
    }
    fun carStopped()
    {
        super.stop()
    }

}
fun main(arg:Array<String>)
{
    var v = Veh()
    var c = CR()
    c.start()
//    v.start()
    c.carStopped()
}