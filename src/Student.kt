class Student {
    var name: String = ""
    var id: Int =0
    var address:String = ""

    constructor()

    constructor(name:String){
        this.name= name
    }
    constructor(name: String, id:Int){
        this.name = name
        this.id=id
    }
    constructor(name:String, id:Int, address:String){
        this.name= name
        this.id= id
        this.address= address
    }

    fun display() {
       if(name.equals("")&& id==0 && address.equals("")){
           println("no data")
       }
        else if(id==0 && address.equals("")){
            println("Name:$name")
       }
        else if(address.equals("")){
            println("Name: $name,Id:$id")
       }
        else{
            println("Name: $name, Id:$id, Address: $address")
       }

    }

}