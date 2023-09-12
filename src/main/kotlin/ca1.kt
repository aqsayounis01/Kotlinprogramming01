class Fruit
{
    class Apple
    {
        fun readprice(price:Int,quantity:Int)
        {
            println("enter the price of the Apple and its quantity:")
            var price = readln().toInt()
            var quantity = readln().toInt()
            displayprice(price,quantity)

        }
        fun displayprice(price:Int,quantity:Int)
        {
            println(price*quantity)
        }
    }
}
fun main(args:Array<String>)
{
    var price:Int=0
    var quantity:Int=0
    var obj = Fruit.Apple()
    obj.readprice(price,quantity)

}





