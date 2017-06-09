package part1

/**
 * Created by joybar on 2017/6/9.
 */
fun main(args: Array<String>) {

    println("定义局部变量===================================");
    val a: Int = 1  // 立即初始化
    val b = 2   // 推导出Int型
    val c: Int  // 当没有初始化值时必须声明类型
    c = 3       // 赋值
    println("a = $a, b = $b, c = $c")


    var x = 5 // 推导出Int类型
    x += 1
    println("x = $x")


    println("使用字符串模板===================================");

    var a1 = 1
    // 使用变量名作为模板:
    val s1 = "a is $a"

    a1 = 2
    // 使用表达式作为模板:
    val s2 = "${s1.replace("is", "was")}, but now is $a1"
    println(s2)

    println("使用条件表达式===================================");

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    println("max of 0 and 42 is ${maxOf(0, 42)}")

    println("把if当表达式：===================================");
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b

    println("max of 0 and 42 is ${maxOf2(0, 42)}")


    println("使用可空变量以及空值检查：===================================");

    fun parseInt(str: String): Int? {
        return str.toInt()// todo

    }


    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        } else {
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    printProduct("22", "33");
    //  printProduct("22","bb");

    println("使用值检查并自动转换：===================================");

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // obj 将会在这个分支中自动转换为 String 类型
            return obj.length
        }

        // obj 在种类检查外仍然是 Any 类型
        return null
    }


    fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

    println("甚至可以这样：===================================");
    fun getStringLength2(obj: Any): Int? {
        // obj 将会在&&右边自动转换为 String 类型
        if (obj is String && obj.length > 0) {
            return obj.length
        }

        return null
    }


    fun printLength2(obj: Any) {
        println("'$obj' string length is ${getStringLength2(obj) ?: "... err, is empty or not a string at all"} ")
    }
    printLength2("Incomprehensibilities")
    printLength2("")
    printLength2(1000)

    println("使用循环：===================================");

    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    println("或者：===================================");
    val items2 = listOf("apple", "banana", "kiwi")
    for (index in items2.indices) {
        println("item at $index is ${items[index]}")
    }

    println("使用 while 循环：===================================");

    val items3 = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items3[index]}")
        index++
    }

    println("使用 when 表达式：===================================");

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("使用ranges：===================================");
//使用 in 操作符检查数值是否在某个范围内：
    val x4 = 10
    val y4 = 9
    if (x4 in 1..y4 + 1) {
        println("fits in range")
    }
    //检查数值是否在范围外：
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
    println("在范围内迭代：===================================");
    for (x in 1..5) {
        println(x)
    }
    println("或者使用步进2：===================================");

    for (x in 1..10 step 2) {
        println(x)
    }
    println("或者使用步进3：===================================");

    for (x in 9 downTo 0 step 3) {
        println(x)
    }

    println("使用集合：===================================");

    val items5 = listOf("apple", "banana", "kiwi")
    for (item in items5) {
        println(item)
    }

    println("使用 in 操作符检查集合中是否包含某个对象：===================================");
    val items6 = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items6 -> println("juicy")
        "apple" in items6 -> println("apple is fine too")
    }
    println("使用lambda表达式过滤和映射集合：：===================================");

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}