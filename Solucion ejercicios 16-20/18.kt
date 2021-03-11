fun main() {
    var list: MutableList<String> = mutableListOf("perro","gato","ganso")
    var filteredList: MutableList<String> = search(list,"ga")
    
    //Mostramos el resultado
    filteredList.forEach{
        println(it)
    }
}

fun search(list:MutableList<String>, searchParam:String) : MutableList<String>{
    var filteredList: MutableList<String> = mutableListOf()
    list.forEach{
        if(it.contains(searchParam)) filteredList.add(it)
    }
    return filteredList
    
}
