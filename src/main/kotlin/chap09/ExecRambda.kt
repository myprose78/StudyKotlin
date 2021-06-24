package chap09

// typealias 예약어로 타입 선언

typealias MyFunType = (Int) -> Boolean

fun main() {
    var some1 = {no: Int -> println("some1.... $no")}
    some1(10)

    some1 = {no -> println("some1..")}

    var some2 = { arg1: Int, arg2: Int -> println("some2...$arg1, $arg2")
        arg1 * arg2 //마지막 라인은 결과값
    }
    println(some2(10, 10))

    var some4 : MyFunType = { arg -> true}
    println("some4: $some4") //함수형태임??
}