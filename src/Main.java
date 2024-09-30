// Main.java
abstract class Cat {
    private String name;
    protected int age;
    protected String color;

    private static int catCount = 0;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo();

    public static int getCatCount() {
        return catCount;
    }

    public void haveBirthday() {
        age++;
    }
}

interface ISound {
    void makeSound();
}

interface ICare {
    void groom();
}

class SiameseCat extends Cat implements ISound, ICare {

    public SiameseCat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void displayInfo() {
        System.out.println("Сиамская кошка: " + getName() + ", Возраст: " + age + " лет, Цвет: " + color);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void groom() {
        System.out.println(getName() + " ухаживает за своей шерстью.");
    }
}

class PersianCat extends Cat implements ISound, ICare {

    public PersianCat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void displayInfo() {
        System.out.println("Персидская кошка: " + getName() + ", Возраст: " + age + " лет, Цвет: " + color);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу-мяу!");
    }

    @Override
    public void groom() {
        System.out.println(getName() + " требует ухода за своей длинной шерстью.");
    }
}

public class Main {
    public static void main(String[] args) {
        SiameseCat siameseCat = new SiameseCat("Луна", 3, "кремовый");
        siameseCat.displayInfo();
        siameseCat.makeSound();
        siameseCat.groom();

        PersianCat persianCat = new PersianCat("Мурка", 5, "белый");
        persianCat.displayInfo();
        persianCat.makeSound();
        persianCat.groom();

        siameseCat.haveBirthday();
        System.out.println("После дня рождения:");
        siameseCat.displayInfo();

        System.out.println("Всего кошек создано: " + Cat.getCatCount());
    }
}


//дз выполнено