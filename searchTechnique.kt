fun main(){
    val list= mutableListOf<Int>(1,4,8,9,63,225,1122)
    println(linear_search(9,list))
    println(binarysearch(1122,list))
}
fun linear_search(searched_item:Int,arr: MutableList<Int>):Int{
    val len=arr.size
    for (i in 0..len-1) {
        if (arr[i] == searched_item) {
            return i
        }
    }
    return -1
}
fun binarysearch(searcheditem:Int,arr: MutableList<Int>):Int{
    var right=arr.size -1
    var left=0

    while(right>=left){
        val mid:Int=(right+left)/2
        if(arr[mid]>searcheditem){
            right=mid-1
        }else if(arr[mid]<searcheditem){
            left=mid+1
        }else{
            return mid
        }
    }
    return -1

}
