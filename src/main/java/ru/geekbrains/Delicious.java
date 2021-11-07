package ru.geekbrains;

public class Delicious {
    private static int TIME = 0;
    private static Object Cat;

    public static void main(String[] args) {
        Cat cat = new Cat("vasya", 20);
        Cat cat1 = new Cat("Neru", 15);
        Plate plate = new Plate(100);
        System.out.println("Привет,котики проголодались:" + cat.getName() + "," + cat1.getName() + ", они едят каждые " + cat.getSatiety(1) + "," + cat1.getSatiety(1) + " час(а) соответственно.");
        System.out.println("Один из котов моложе и ест быстрее. Сейчас в миске " + plate.getFood() + " грамм куриной требухи. Коты бегут к плошке, сметая на пути хозяев.Плошка всего одна.\n");

        do {
            for (Cat i : new Cat[1]) {

                //если кот голоден
                if (i.getSatiety(1)) {
                } else {

                    //если в миске не хватает еды, чтобы накормить кота, она будет добавлена
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //кот ест
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety(1)) + " часа(ов)");
                }

                //декрементация показателя сытости
                int i1 = Tasty();


            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 24);
    }

    private static int Tasty() {
        int i = 100;

        return i;
    }

    }






    class Plate {

        private int food;

        int getFood() {
            return food;
        }

        Plate(int food) {
            this.food = food;
        }

        void decreaseFood(int n) {
            food -= n;
        }

        void increaseFood() {
            this.food += 400;
            System.out.println("В миску добавили 400 грамм корма");
        }

        boolean checkFood(int n) {
            return (food - n) >= 0;
        }

    }

    class сat {

        private String name;
        private int appetite;
        private int satietyTime;
        private int satiety;

        String getName() {
            return name;
        }

        int getAppetite() {
            return appetite;
        }

        int getSatietyTime() {
            return satietyTime;
        }

        int getSatiety() {
            return satiety;
        }

        void setSatiety(int satiety) {
            this.satiety = satiety;
        }

        сat(String name, int appetite, int satietyTime) {

            this.name = name;
            this.appetite = appetite;
            this.satietyTime = satietyTime;
            this.satiety = 0;
        }

        void eat(Plate p) {
            p.decreaseFood(appetite);
            satiety += satietyTime;
        }
    }







