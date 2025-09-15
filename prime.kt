fun main(){
    val lastnum:Int=50
    for(i in 2..lastnum){
        if(isPrime(i)) println(i)
    }
}
fun isPrime(num: Int): Boolean{
    var flag: Boolean=true
    for(i in 2 until num){
        if(num%i==0){
            flag=false
        }
    }
    return flag
}
