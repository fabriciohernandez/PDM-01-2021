fun main() {
    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
	var list2: MutableList<Int> = mutableListOf(1,5,6,7,8)

    var mergedList: MutableList<Int> = mergeUnRepeat(list1, list2)
    
    //Mostramos el resultado
    mergedList.forEach{
        print(it)
    }
}

fun mergeUnRepeat(list1: MutableList<Int>, list2: MutableList<Int>) : MutableList<Int>{
   var mergedList: MutableList<Int> = list1
   list2.forEach {
  		if(!mergedList.contains(it)){
            mergedList.add(it)
        }
   }
   
   return mergedList;
   
}