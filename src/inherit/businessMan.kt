package inherit

class businessMan(name:String,age:Int, gender:String, var annualIncome:Double):person(name,age,gender){
    fun display(){
        println("Name:$name")
        println("Age: $age")
        println("Gender: $gender")
        println("Annual Income: $annualIncome")
    }
}