package exam04;

public class Book {
    private String title;
    private String author;
    private String publisher;

    private Book(){}

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    protected static  class Builder {
        private Book instance = new Book();

        public Builder title(String title){
            instance.title = title;
            return this; // 본인 객체를 반환
        }

        public Builder author(String author){
            instance.author = author;
            return this; // 본인 객체를 반환
        }

        public Builder publisher(String publisher){
            instance.publisher = publisher;
            return this; // 본인 객체를 반환
        }

        public Book build() {
            return instance; //값이 다 대입된 instance를 반환
        }
    }
}
