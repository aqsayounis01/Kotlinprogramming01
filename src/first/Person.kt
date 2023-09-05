package first

class Person
{
    var name:String=""   // datamenbers should be initialized
    var f= 12.00
    fun display(dis:String,disint:Int,f:Float)
    {
        println(dis+" "+disint)
        println(f)              // if f was not passed in the function , then it would take the value of f initialized above
    }
}