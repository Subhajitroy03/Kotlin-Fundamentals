//display only those names which starts with s
//shows the use of init block
fun main(){
    val s1: user =user("Subhajit",22,"Engineer")
    s1.show()
    val s2: user=user("Arjya",21,"Scientist")
    s2.show()

}

class user(name:String,var age:Int,var profession:String ){
    var name: String
    init{
        if(name.lowercase().startsWith("s")){
            this.name=name
        }else{
            this.name="Unknown"
            println("Name doesnot start with S")
        }
    }
    fun show(){
        println("The name is $name , of age $age , by profession $profession")
    }
}
