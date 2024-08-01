package inherit

class teacher(name:String,age:Int,gender:String, var teacherID:Int, var subject:String):person(name,age,gender){

    fun display(){
        println("Name:$name")
        println("Age:$age")
        println("Gender:  $gender")
        println("Teacher Id: $teacherID")
        println("Subject:$subject")
    }
}