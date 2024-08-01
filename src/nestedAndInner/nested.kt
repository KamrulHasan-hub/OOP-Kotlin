package nestedAndInner

class Outer {
    var name:String = "Musfiq"
    class Nested{
        var outer = Outer()
        fun display(){
            println(outer.name)
        }
    }
}

fun main(){
    val out = Outer()
    val nested= Outer.Nested()
    nested.display()
}