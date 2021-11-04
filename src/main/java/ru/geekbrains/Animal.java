package ru.geekbrains;

public class Animal {
    public String name;
   public int run;


    public Animal(int runMaxDistance, int swimMaxDistance) {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        }



    public void animalInfo() {
        System.out.println();

    }
}

//Кошка вступает

class Cat extends Animal {

    public static Integer ccount;
    protected boolean swim;
    int sleep; // должна же выспаться

    public Cat(String name, int run, boolean swim, int sleep) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.sleep = sleep;
    }

    //печатаю действия кошки

        public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + swim + "/Sleep: " +sleep+ "hours/");
    }

    public void printCatsQuantity() {
    }
}

//Собака вступает
class Dog extends Animal {

    public static Integer dcount;
    private final int sleep; // и этот тоже
    public int swim;



    public Dog(String name, int run, int swim, int sleep) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.sleep = sleep;
    }
    // Печатаю действия собаки
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + swim +"/Sleep: " +sleep+ "hours/");
    }

    public void printDogsQuantity() {
    }
}

class Main {
    public static void main(String[] args) {
        int cntCat = 2, cntDog = 3, cntAnimal = 0;

        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Belial", 200, false, 18);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Vassago", 500, 10, 8);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

        Integer i1 = 8;
        Integer i2 = 5;

        int i3 = i1+i2;
        System.out.println("Всего животных: " + i3 );
    }


    }



