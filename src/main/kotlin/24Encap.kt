//encapsulation -> hiding the data

class Car
{
    var car:String?=null;
    private var model:String?=null;    //now this cannot be accessed outside this class

    constructor(a:String,b:String)
    {
        this.car=a
        this.model=b
    }
    fun dis()
    {
        println(car+" "+model)
    }

}

fun main(args:Array<String>)
{
    var c= Car("bmw","123");
//    c.car="car"
    println(c.car)
    c.dis()
//    println(c.model)  cannot be accessed
}