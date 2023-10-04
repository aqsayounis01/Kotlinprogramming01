//secondary constructor-> inside the class using the constructor keyword

class Cars
{
    var name:String?=null
    var model:Int?=null
    constructor(n:String ,m:Int)
    {
        this.name=n;
        this.model=m;
    }
    fun dis()
    {
        println("name of the car is $name and model is $model")
    }
}

fun main(arg:Array<String>)
{
    var c =Cars("BMW",1)   // these values can be changed using the objects
    c.name="mercedes"
    c.dis()
}