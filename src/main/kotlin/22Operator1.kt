// Arithmetic operators - + * / %    (/ will give result as float by default )
// Assignment operator ->  = += -= *= /= %=
// unary operators -> need only one operator + - ++ -- ! (logical complement operator)
//relational operators - == != < > <= >=   (They return boolean values)
//conditional / logical op -> && (does not check the second condition if the first is false)
//                             || (checks the second condition only if the first one is false)
// their operands must be boolean
//operator precedence -> unary, multiplicative , additive ,relational, equality ,and ,or ,assignment
fun main(arg:Array<String>)
{
    var a :Double = 2.3
    var b :Double = 3.4
    var c = a+b
    println(c)

    var b1 = true
    var b2 = 6.7
    println(!b1)
    println(-(++b2))

    println(a==b)

    println((b>b2)&&(b2>c))


}