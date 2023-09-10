// labeled break
//name@   before the loop  is the label
// break@name
fun main(args:Array<String>)
{
    for (i in 1..4)
    {
        for (j in 1..4)
        {
            if (j==3 && i==3)
            {
                break      // will only come out of one loop
            }
            println("$i $j")
        }
    }
    println()

    out@ for (i in 1..3)
    {
        for (j in 1..3)
        {
            println("$i $j")
            if (i==2 && j==2)
            {
                break@out
            }
        }
    }


}