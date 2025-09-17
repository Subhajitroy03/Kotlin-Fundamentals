open class shape(var name:String){
    open fun perimeter():Int{
        return 0
    }
    open fun area():Int{
        return 0
    }
}
open class rectangle(name:String,var length:Int,var breadth:Int):shape(name){
    override fun area(): Int {
        return length * breadth
    }

    override fun perimeter(): Int {
        return 2*(length+breadth)
    }
}
class square(name:String,side:Int):rectangle(name,side,side){
    override fun perimeter(): Int {
        return super.perimeter()
    }

    override fun area(): Int {
        return super.area()
    }
}
fun main(){
    val r1:rectangle=rectangle("Rectangle1",10,20)
    var p: Int =r1.perimeter()
    var a:Int=r1.area()
    println("Area of rectangle $a and perimeter is $p")
    val s1:square=square("Square1",30)
    p=s1.perimeter()
    a=s1.area()
    println("Area of Square $a and perimeter is $p")

}
