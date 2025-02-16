package chap08.section1

class InvariantBox<T>(val size: Int)
// 무변성: `T`에 대해 상위-하위 타입 변환이 불가능 (즉, `InvariantBox<Sub>`를 `InvariantBox<Super>`에 대입할 수 없음)

class CovariantBox<out T>(val size: Int)
// 공변성(`out`): `T`를 반환(출력)만 가능 (읽기 전용)
//   - `CovariantBox<Sub>`를 `CovariantBox<Super>`로 변환 가능
//   - `T`를 "생성(produce)"하는 역할만 수행 가능 → `set()` 불가

class ContravariantBox<in T>(val size: Int)
// 반공변성(`in`): `T`를 입력(소비)만 가능 (쓰기 전용)
//   - `ContravariantBox<Super>`를 `ContravariantBox<Sub>`로 변환 가능
//   - `T`를 "소비(consume)"하는 역할만 수행 가능 → `get()` 불가

fun main() {
    // Any <- Int <- Nothing

    /*
    val anys: InvariantBox<Any> = Box<Int>(10) // 오류. 자료형 불일치
    val nothings: InvariantBox<Nothing> = Box<Int>(20) // 오류. 자료형 불일치
     */

    val anys: CovariantBox<Any> = CovariantBox<Int>(10) // 관게 성립으로 객체 생성 가능
    /*
    val nothings: CovariantBox<Nothing> = CovariantBox<Int>(20) // 오류. 자료형 불일치
     */

    /*
    val anys: ContravariantBox<Any> = ContravariantBox<Int>(10) // 오류. 자료형 불일치
     */
    val nothings: ContravariantBox<Nothing> = ContravariantBox<Int>(20) // 관게 성립으로 객체 생성 가능

}