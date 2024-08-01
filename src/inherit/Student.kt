package inherit

class Student(name:String,age:Int,gender:String, var studentId:Int):person(name,age,gender){

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Student ID: $studentId")
    }
}
