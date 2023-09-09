// if else in kotlin is similar to c++
// when -> like switch case statement in c++
fun main(args:Array<String>)
{
    var a =1
    var b=2

    if (a>b)
    {
        println("a  is greater")
    }
    else if(a<b)
    {
        println("a is less than b, or b is greater then a ")
    }
    else
    {
        println("both are equal")
    }


    //if as an expression
    var max:Int = if(a>b)
                        {
        println("a is greater")
                            a   //a will be returned to max variable (last line)
    }
    else{
        println("b is greater")
        b
    }
    println(max)
}