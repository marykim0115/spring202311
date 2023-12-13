/*
* 람다에 사용될 함수형 인터페이스:하나의 추상메서드만 정의할수 있다.
* @FunctionalInterface : 추상 메서드가 1개만 정의되어 있는지를 체크

* java.util.function 패키지 : 자주 사용하는 유형의 함수형 인터페이스들을 미리 정의해둔 패키지
    <유형들>
        1) 매개변수가 없고, 반환값이 있는 형태 : Type supplier 인터페이스
            Return get()
        2) 매개변수가 1개, 반환값은 없음 : Comsumer 인터페이스
            void accept(Type t)
        3) 매개변수가 1개, 반환값 있음 : Function 인터페이스
            Return apply(Type t)
        4) 매개변수가 1개, 반환값 boolean : Predicate 인터페이스
            boolean test(Type t)
        5) 매개변수가 1개, 반환값 있음, 매개변수 자료형과 반환값 자료형이 같다 : UnaryOperator<Type> : Function<Type,Type> 인터페이스
            Type apply(Type t)

           *매개변수가 2개 - Bi 접두어
                1) 매개변수가 2개, 반환값 없음 : BiConsummer<T,U> 인터페이스
                    void accept(T t, U u);
                2) 매개변수가 2개, 반환값 있음 : BiFunction<T,U,R> 인터페이스
                    Return apply(T t, U u);
                3) 매개변수가 2개, 반환값 blooean : BiPredicate<T,U> 인터페이스
                    boolean test(T t, U u)
                4) 매개변수가 2개, 반환값 있음, 자료형이 모두 같다 : BinaryOperator<T>
                    T apply(T t1, T t2)
* Function의 합성과 Predicate의 결합
    Function
        f.andThen(g) -> f -> g 결합
        g.compose(f) -> f -> g 결합
    Predicate : 조건식(판별식)
        and
        or

*/
package exam01;

@FunctionalInterface
public interface Calculator {
    int square(int num);
    //int root(int num);
}
