package exam01;

import lombok.*;

//@Getter
//@Setter
//@ToString

//@NoArgsConstructor(access = AccessLevel.PRIVATE) //기본 생성자
//@AllArgsConstructor //모든 멤버 변수 초기화 생성자

//@RequiredArgsConstructor
/* 상수에 값을 부여하는 생성자
  public Book(String title){
    this.title = title;
  }
*/

//@EqualsAndHashCode

@Data //@Getter @Setter @ToString @EqualsAndHashCode
public class Book {
    private final String title;

    //@NonNull //상수는 아니지만 항상 값이 있어야하는 변수에 달아주는 어노테이션
    private String author;
    private String publisher;


}
