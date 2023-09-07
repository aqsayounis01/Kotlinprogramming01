//useful while running the LOOPS
// Double dot operator - it  is used to define the variable with a range of values (increasing order )
// downTo - decreasing order
// step - to step directly to the nth integer
// in - used to check a value is present in a  rabge or not (returns true or false)
//Applicable to INT , CHAR

fun main(args: Array<String>)
{
    var a = 1..4
    var b= 4 downTo 2
    var c = 10 .. 20 step 2    //10,12,14..20

    var i = 2 in c   //false
    println(i)

    var cd = 10.downTo(1)      // same as downTo keyword
   var ut = 10.rangeTo(20)   // same as ..
}