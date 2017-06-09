package part1

/**
 * Created by joybar on 2017/6/9.
 */


//定义一个函数接受两个 int 型参数，返回值为 int ：
fun sum(a: Int , b: Int) : Int{
    return a + b
}

//该函数只有一个表达式函数体以及一个自推导型的返回值：
fun sum1(a: Int, b: Int) = a + b

//返回一个没有意义的值：
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

//Unit 的返回类型可以省略：
fun printSum1(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


fun main(args: Array<String>) {
    println("定义函数===================================");
    println("sum of 3 and 5 is ")
    println(sum(3, 5))
    println("sum of 19 and 23 is ${sum1(19, 23)}")
    printSum(-1, 8)
    printSum1(-1, 8)
}
