package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Human();
        animals[1] = new Dog();
        animals[2] = new Bird();

        for(Animal animal : animals){
            animal.move();

            if(animal instanceof Human) {
                Human human = (Human) animal; //형변환
                human.readBook(); //형변환을 해야지 readBook()을 호출할수 있음
            }
        }
    }
}
