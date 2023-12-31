// kotlin is a statically typed language -> data type of the language it known at the compile time
// i.e the programmer has to specify the data type while writing the code.
// it is a JVM language -> it needs JAVA VIRTUAL MACHINE TO EXECUTE ITS byte code ( IT IS ADVANCED VERSION OF JAVA )
// it has the support to avoid NullPointerException
//Immutable -> constatnts dont change
// OOPS
//Functional Programming -> lambdas and Higher order function
// less ceremony - no boilerplate codes, less code more function.
// use -> Android, web, desktop
// In kotlin, WE dont have an EXPLICIT CLASS LIKE JAVA, THE kotlin compiler internally creates a  CLASS FILE  whuch is loaded into the memory during the runtime
// JVM -> CREATES THE CLASS FILE (containing byte code)  FROM THE .kt file and the class file is stored in the out folder

//Package - it is a module that consists of all the classes and interfaces (separately used in the kotlin or Java code)

// no semicolon at the end
// Unit here means -> function returns void datatype ( For void we can leave it empty also)

// Comments (inline )
/*
 this is a multiline comment
 */


//readLine - for input
// println - for displaying
fun main(args:Array<String>): Unit      //Array of Strings
{
    print("hello world!\n")
    println("This will print a new line also.")
    println(6-7)
    println(true)

    // input
    //? after variable dataype- user may or may not enter data
    //!! after the readline() - user will surely enter the data
    var a = readln().toInt()
    println(a)
    var b = readln().toInt()
    println(a+b)
    println()
    var c:String=readLine()!!
    println(c)
    println()
    var d:String?= readLine()
    println(d)
}

