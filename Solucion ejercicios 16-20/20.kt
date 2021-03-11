fun main() {
    var list: MutableList<Int> = mutableListOf(1,2,3,4,5,1,1,1,1,1)
    moda(list,1)
}

fun moda(list: MutableList<Int>, num:Int){   
    var count:Int = 0
    for(item in list){
       if(item==num) count++
    }
    print(count)
}