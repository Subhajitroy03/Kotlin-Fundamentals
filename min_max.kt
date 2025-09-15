fun main(){
    val numbers: Array<Int> = arrayOf(1,5,8,7,-3)
    val maximum: Int = find_min_max(numbers)
    val minimum: Int = find_min_max(numbers,false)
    println("The maximum value from array is $maximum and the minimum value is $minimum")
}
fun find_min_max(num: Array<Int>,maximum: Boolean=true):Int{
    if(maximum){
        var max: Int =num[0]
        for(i in num){
            if(max<i){
                max=i
            }
        }
        return max
    }
    else{
        var min: Int =num[0]
        for(i in num){
            if(min>i){
                min=i
            }
        }
        return min
    }
}
