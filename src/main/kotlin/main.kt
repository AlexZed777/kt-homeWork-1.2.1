
val scan = java.util.Scanner(System.`in`)
fun main () {
    println("Введите сумму перевода: ")

    val amount = scan.nextInt()

    val commission = if (amount*100 <= 466_600){
        35
    } else {
        amount * 100 * 0.0075 / 100
    }
    println("Коммиссия составит: $commission")
}