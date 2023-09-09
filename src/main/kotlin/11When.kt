//when - switch case in kotlin is WHEN
// we dont need break statement here in when
//when as expression (like if else)
fun main(args:Array<String>)
{
    var x=2
    when(x)
    {
        0,4,5,1->println("value of x is 1")   //1 or 0 or 4 or 5
//        2 -> {
//            println("value of x is 2")
//            println(ls
//            "Hello world")
//        }
       !in 1..3 -> println("value of x is 3")
        else -> println("Invalid Input")
    }
}

