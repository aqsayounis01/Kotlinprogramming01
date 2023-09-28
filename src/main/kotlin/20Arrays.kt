//arrayOf(1,2,3,4,5)
//Array<Int>(5){0}
//array_name[index] -  to access the elements
//.size - no of elements present in the array
fun main(args:Array<String>)
{
    var a = arrayOf(1,2,3,4,5, "hi")
    println(a[5])
    println(a[0])
    println(a.get(0))
    a.set(4,20)
    println(a[4])
    println(a.size)
    println()


    //second way
    var b=Array<Int>(3){0}
    for(i in 0..2)
    {
        b[i]= readln().toInt()
    }
    for(i in 0..2)
    {
        print(" "+ b[i])
    }


}