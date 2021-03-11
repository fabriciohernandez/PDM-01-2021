fun main() {
    sumDigits(1234)
}

fun sumDigits(num:Int){
    var sum:Int = 0
    for (digit in num.toString()){   
        sum+=Integer.valueOf(digit.toString())
    }
    
    //Mostramos el resultado
    print(sum)
}