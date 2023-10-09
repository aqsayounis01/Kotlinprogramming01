// labeled break and simple break
//name@   before the loop  is the label
// break@name

// continue - skips the rest of the code in the loop and goes to the NEXT ITERATION
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


    println()

    for (i in 1..4)
    {
        if(i==3)
        {
            continue    // 3  will be skipped
        }
        println(i)
    }
    println()

    for (i in 1..5)
    {
        for(j in 1..5)
        {
            if (i ==3 && j ==4)
            {
                continue
            }
            println("$i $j")
        }
    }
    println()

    cout@ for(i in 1..5)
    {
        for (j in 1..5)
        {
            if (i ==3 && j ==4)
            {
                continue@cout   //it will directly jump to the next iteration of the outer loop
            }
            println("$i $j")
        }
        println("hi $i")
    }


}