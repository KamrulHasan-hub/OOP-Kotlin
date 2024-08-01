package nestedAndInner

class Outer {
    var name:String= "Musfiq"
    inner class Inner{
        var name="Musfiq"

        fun display(){
            println(name)
        }
    }
}

fun main(){
    val out = Outer()
    val inner= out.Inner()

    
    inner.display()

}