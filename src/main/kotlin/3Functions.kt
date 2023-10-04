//Unit means void in kotlin (by default)
//primitive functions - returns int , char, float etc
//non primitive  - returns object, string etc
// camelCase is used for function names

fun main(args: Array<String>)
{
   var name ="Aqsa Younis"
   display(name)
}

fun display(name:String):Unit    // variable:Data type
{
    println(name)
}