import kotlin.math.*
class vector(val x:Double,val y:Double,val z:Double): Comparable<vector>{
    var magnitude: Double=0.0
    init{
        magnitude = sqrt((x.pow(2))+(y.pow(2))+(z.pow(2)))
    }

    override fun toString(): String {
        var s:String="$x i"
        if(y>=0){
            s=s+" + $y j"
        }else{
            s=s+" $y j"
        }
        if(z>=0){
            s=s+" + $z k"
        }else{
            s=s+" $z k"
        }
        return s

    }

    operator fun plus(other: vector):vector {
        return vector(x + other.x, y + other.y,z+other.z)
    }
    operator fun minus(other: vector):vector {
        return vector(x - other.x, y - other.y,z-other.z)
    }
    fun dot_product(v1:vector,v2:vector):Double{
        return (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z)
    }
    fun cross_product(v1:vector,v2:vector):vector{
        val x1=v1.x
        val x2=v2.x
        val y1=v1.y
        val y2=v2.y
        val z1=v1.z
        val z2=v2.z
        return vector(y1*z2-z1*y2,z1*x2-x1*z2,x1*y2-y1*x2)
    }
    override fun compareTo(other: vector): Int {
        return when {
            this.magnitude>other.magnitude ->1
            this.magnitude<other.magnitude->-1
            else ->0
        }
    }

}
fun main() {
    val v = vector(3.0, -4.0, 12.0)
    val v1= vector(2.0, -1.0, 1.0)
    println(v.magnitude)
    println(v1.magnitude)
    println(v)
    println(v>v1)

}

