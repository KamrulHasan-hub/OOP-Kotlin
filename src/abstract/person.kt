package abstract

abstract class person {
    abstract var name:String
    open var age:Int=0
    open var gender:String=""

    fun display(){
        println("Name: $name")
        println("age: $age")
        println("Gender:$gender")
    }

    abstract fun work()
}