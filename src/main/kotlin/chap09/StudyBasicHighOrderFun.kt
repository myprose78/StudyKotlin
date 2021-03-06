package chap09

// run()
// 단순 람다함수를 실행키기고 그 결과 값을 획득
// 객체의 멤버에 접근
//inline fun <R>run(block:() ->R):R

// apply
// apply() 함수는 run() 함수와 사용 목적은 동일한데 리턴되는 값에 차이
// run() 함수의 리턴값은 대입된 람다 함수의 리턴 값이 그대로 run() 함수의 리턴 값
// apply() 함수는 apply() 함수를 적용한 객체가 리턴

// let
// let을 이용하는 객체를 let의 매개변수로 지정한 람다 함수에 매개변수로 전달

// with()
// with() 함수는 run() 함수와 사용 목적이 유사
// 객체의 멤버들을 반복적으로 접근할 때 객체명을 일일이 명시하지 않고 멤버들을 바로 이용하는 용도
// run() 함수는 run() 함수를 이용한 객체가 람다 함수에서 바로 이용
// with() 함수는 with() 함수의 매개변수를 지정한 객체를 람다 함수에서 이용
class StudyBasicHighOrderFun {
}

