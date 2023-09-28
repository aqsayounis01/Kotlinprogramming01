//array lsit is used when we are not sure about the size and we want to add more elements

fun main(args:Array<String>)
{
    var  a= arrayListOf<Any>(1,2,3,"hi")

//    or var a = ArrayList<Int>(5)  like in  Array if we want input fron the user
    a.add(20)
    a.add(0,10)

    a.remove(2)  // removes the element 2 from the array
    a.removeAt(1)  // removes the element at this index

    var i:Int
    for(i in 0..2)
    {
      print(" "+a[i])
    }

}