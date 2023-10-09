// for loop
//forEach (it is a method)
// while loop - same as in c++
// do while - same as in c++


fun main(args:Array<String>)
{
    for (i in 1..5 step 2 )   // we can write downTo keyword also
    {
        println("hello ")
    }
    println()
    print("FOREACH")
    var a = arrayOf(1,2,3,4,5)
    a.forEach { print(it) }   //it represents the element of the array
    var i=1;
    while(i<=5)
    {
        println("hi")
        i++
    }
    do{
        println("do while")         // it will only print once because already the value of i=6
        i++
    }while(i<=5)
}