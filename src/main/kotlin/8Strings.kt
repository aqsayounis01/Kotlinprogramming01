// string interpolation - instead of concatenation,  use ${} to print the value of a  string or any other datatype with the string
//string_name.length - gives the no of character in the string
// string + int = string (concatenation)
fun main(args:Array<String>)
{
    println("Strings in Kotlin")

    var str ="hello"
    var str2 = "${str} world"
    println(str2.length)

    var a =10
    var b =5
    println("the sum of the two no's is "+a+b)    // it will concatenate the no's with the string
    println("the sum of the two no's is "+(a+b))
    println("the sum of $a and $b is ${a+b}")


}