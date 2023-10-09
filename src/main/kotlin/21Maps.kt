//map- array of key value pairs (key becomes the index)
fun main(arg:Array<String>)
{
    var m = mapOf<Int,String>(2 to "code",3 to "program")   // cannot change it
    println(m[2])
    var mm = mutableMapOf<Int,String>(2 to "a",3 to "this")
    mm.put(4 ,"changed ")
    println(mm[4])


    for ( (i,j) in mm)
    {
        println(mm[i]   )
    }
}