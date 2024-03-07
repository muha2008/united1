fun main() {
    //переменная
    var phrase: String = "Hello, World"
    val NUM: Int = 5
    var word: String = "Kotlin"
    println("$phrase $NUM $word")

    when {
        NUM < 0 -> println("Вы сохранили отрицательное число")
        NUM > 0 -> println("Вы сохранили положительное число")
        else -> println("Вы сохранили ноль")
    }

    fun dz2() {

        val numbers = doubleArrayOf(8.0, -2.0, -4.0, 2.0, 3.0, 6.0, 1.5, -3.0, 10.0, -1.0, 7.0, -8.0, 4.0, -6.0, 9.0)

        var foundNegative = false

        var sum = 0.0
        var count = 0

        for (number in numbers) {
            if (foundNegative) {
                if (number > 0) {
                    sum += number
                    count++
                }
            } else {
                if (number < 0) {
                    foundNegative = true
                }
            }
        }
        if (count > 0) {
            val average = sum / count
            println("Среднее арифметическое положительных чисел после первого отрицательного: $average")
        }
    }

    fun dz3(){
        var sun:Array<Double> =arrayOf(1.0,2.0,3.0,4.0,-5.0,-6.0,2.0,1.0,-4.0,0.5,-3.0,4.0,-7.0,9.0,-9.0,)
        var gfd:Boolean =false
        var jhg: Double =0.0
        var uyt: Int = 0
        for (i in sun){
            if (i<0) {
                gfd = true

                if (gfd == true && i > 0) {
                    jhg += i
                    uyt += 1
                }
            }
            println(jhg / uyt)
        }
        }
    }
