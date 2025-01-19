package chap07.section2

// 실드 클래스 선언하는 첫 번째 방법
/*sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

class Status : Result() // 실드 클래스 상속은 같은 파일에서만 가능
class Inside : Result.Success("Status") // 내부 클래스 상속
*/


// 실드 클래스 선언하는 두 번째 방법
sealed class Result
open class Success(val message: String) : Result()
class Error(val code: Int, val message: String) : Result()

class Status : Result()

// 두 번째 방법으로 선언하는 경우 내부 클래스를 상속할 때 점(.) 표기로 접근하지 않고 그대로 사용
class Inside : Success("Status")

fun main() {
    // Success 에 대한 객체 생성
    val result = Success("Good!")
    val msg = eval(result)
    println(msg)
}

fun eval(result: Result): String = when (result) {
    is Status -> "in progress"
    is Success -> result.message
    is Error -> result.message
    // 모든 조건을 가지므로 else 가 필요없음
}