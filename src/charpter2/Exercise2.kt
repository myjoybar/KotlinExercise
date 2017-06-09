package charpter2

/**
 * Created by joybar on 2017/6/9.
 */
fun main(args: Array<String>) {

    println("in关键字的使用===================================");
    val x: Int = 2;
    val y: Int = 10;

    //如果存在于区间(1,Y-1)，则打印OK
    if (x in 1..y - 1)
        println("OK")

////如果x不存在于array中，则输出Out
//    if (x !in 0..array.lastIndex)
//        print("Out")

//打印1到5
    for (x in 1..5)
        println(x)

////遍历集合(类似于Java中的for(String name : names))
//    for (name in names)
//        println(name)
//
////如果names集合中包含text对象则打印yes
//    if (text in names)
//        print("yes")


    println("when表达式===================================");
    fun cases(obj: Any) {
        when (obj) {
            1 -> println("第一项")
            "hello" -> println("这个是字符串hello")
            is Long -> println("这是一个Long类型数据")
            !is String -> println("这不是String类型的数据")
            else -> println("else类似于Java中的default")
        }
    }

    cases(2);
    cases("hello");

    println("智能类型推测===================================");

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }

        //同时还可以使用!is，来取反
        if (obj !is String){
        }

        // 代码块外部的obj仍然是Any类型的引用
        return null
    }

    println(getStringLength("AAA")) ;
    println(getStringLength(2)) ;

    println("空值检测===================================");
}