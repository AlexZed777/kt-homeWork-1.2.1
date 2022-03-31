
val scan = java.util.Scanner(System.`in`)
fun main () {
    while (true) {
        println("Введите сумму перевода: ")

        val amount = scan.nextInt() * 100
        val minCommission = 3500

        var commission: Double
        if ((amount * 0.0075) < minCommission) commission = minCommission.toDouble() else commission = ((amount * 0.0075))
        val result = commission/100
        println("Коммиссия составит: $result рублей")
    }
}