fun main() {
    invertPhrase("Un perrito saltando")
 }
 
 fun invertPhrase(phrase:String){
     var reversedPhrase:String = ""
     
     val strs = phrase.split(" ").toTypedArray()
     strs.reverse()
     
     for(item in strs){
         reversedPhrase+=" " + item
     }
     
     print(reversedPhrase)
     
 }