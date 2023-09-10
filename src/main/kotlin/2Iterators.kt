// for loop
// while loop - same as in c++
// do while - same as in c++


fun main(args:Array<String>)
{
    for (i in 1..5 step 2 )   // we can write downTo keyword also
    {
        println("hello ")
    }
    var i=1;
    while(i<=5)
    {
        println("hi")
        i++
    }
    do{
        println("do while")         // it will only print once because alreday the value of i=6
        i++
    }while(i<=5)
}