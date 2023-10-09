//class does not occupy any space in the memory (final by default)
//object occupies once it is made
//instance varibales must be initialized or declared as null
// access modifiers -> private , protected , internal, public
//private -> only accessed in the class in which it is made
// protected -> same as private but it is also accessed in the subclass
//internal -> anyone inside the same package
//public -> anyone
import first.Person

//TO IMPORT A CLASS IN OUR KOTLIN FILE:
/*
1) make  a package in src folder  (src -> make folder as root)
2) in that package , create  a kotlin class file ( which will only contain the class )
3) import the package in the kotlin file (ALT +ENTER  on the class name in the kotlin file )
or directly import package_name.class_name

 */



//class Person
//{
//    var name:String?=null   // data members should be initialized
//    var f= 12.00
//    fun display(dis:String,disint:Int,f:Float)
//    {
//        println(dis+" "+disint)
//        println(f)              // if f was not passed in the function ,
//                                   then it would take the value of f initialized above
//    }
//}


fun main(arg: Array<String>)
{

    var p1 = Person()    // p1 is the object of Person class
    var age=12
    var f=10.0f
    p1.name="ANONYMOUS"
    p1.display(p1.name,age,f)   // we use the dot (.) operator to access the methods and
                                // instance variables  of the class

}

