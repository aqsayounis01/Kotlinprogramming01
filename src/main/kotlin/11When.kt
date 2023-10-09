//when - switch case in kotlin is WHEN
// we dont need break statement here in when
//when as expression (like if else)
fun main(args:Array<String>)
{
    var x=10
    var str=""
    str=when(x)     //when as expression ( but then the last statement in all the cases should be of the matching return type
    {
        0,4,5,1->"value of x is 1"   //1 or 0 or 4 or 5
//        2 -> {
//            println("value of x is 2")
//            println(ls
//            "Hello world")
//        }
       !in 1..3 ->"value of x is 10"
        else -> {
            println("Invalid Input")
            "invalid"
        }
    }
    println(str)
}

