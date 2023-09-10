// toByte()...
// conversion from small to large --- done
// conversion from large to small --- data loss

fun main(args:Array<String>)
{
     var x:Byte = 65
    var i:Int= x.toInt()   // if x, type mismatch
    var c:Char = x.toChar()
    println(c)

    //big to small -- there will be data loss
    var d :Double= 66.234
    var f : Float = d.toFloat()
    var n:Int=d.toInt()
    var ch:Char=d.toChar()
    println(f)
    println(n)
    println(ch)

}