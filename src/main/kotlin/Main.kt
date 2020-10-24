fun main() {
    val itemPrice = 100.0
    val itemCount = 11
    val totalPrice = itemPrice * itemCount

    val discountStartFirstPhase = 1_000
    val discountStartSecondPhase = 10_000
    val standardDiscount = 100.0
    val maxDiscount = 0.05

    val result = if ((totalPrice > discountStartFirstPhase) && (totalPrice < discountStartSecondPhase)) {
        totalPrice - standardDiscount
    } else if (totalPrice > discountStartSecondPhase) {
        totalPrice - (totalPrice * maxDiscount)
    } else {
        totalPrice
    }
    println("Общая цена: $result")

    val regularUser = true
    val discountForRegularUser = 0.01
    val resultForRegularUser = result - (result * discountForRegularUser)

    if (regularUser) println("Цена с учётом скидки для постоянных пользователей: $resultForRegularUser")
    else println("Скидки для постоянных пользователей нет")
}