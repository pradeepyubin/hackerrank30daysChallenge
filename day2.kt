import java.lang.Math.round

fun main() 
{
        val mealCost = readLine()!!.toDouble()
        val tipPercent = readLine()!!.toInt()
        val taxPercent = readLine()!!.toInt()

        val tip = tipPercent * mealCost / 100
        val tax = taxPercent * mealCost / 100
        val r = round((tip + tax + mealCost))
        println(r)
}

fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return round(this * multiplier) / multiplier
}
