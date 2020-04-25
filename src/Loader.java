
public class Loader {
    public static void main(String[] args) {
        Cat murka = new Cat();
        Cat barsik = new Cat("Барсик");
        Cat vasya = new Cat(10000, "Васька");
        Cat marsik = new Cat("Марсик");
        Cat tom = vasya.copyCat(); //Создаём клона Васьки, назовём его Том
        var kuzya = new Cat("Кузя"); //var реально работает, вот это да! :)
        var semen = tom.copyCat(); //Создаём мёртвого кота Семёна - брата-близнеца мёртвого Васьки

        System.out.println("Now you have " + Cat.getCount() + " cats");

        //Закормим мурку до смерти
        murka.feed(4000.0);
        System.out.println("Murka is " + murka.getStatus() + " now");
        murka.drink(800.5);
        System.out.println("Murka is " + murka.getStatus() + " now");
        murka.feed(4000.93);
        System.out.println("Murka is " + murka.getStatus() + " now");
        murka.feed(500.4); //Пытаемся снова покормить

        //Замяукаем Барсика до смерти
        System.out.println("Barsik is " + barsik.getStatus() + " now");
        while (!barsik.isDead())
        {
            barsik.meow();
        }

        //Заставим Ваську ходить в туалет до сметри
        System.out.println("Vaska is " + (vasya.isDead() ? "dead" : vasya.getStatus()) + " now");
        while (!vasya.isDead())
        {
            vasya.goToilet();
        }
        vasya.meow(); //Попытаемся заставить Ваську мяукнуть

        //Смотрим вес Марсика
        System.out.println("Marsik weight is " + marsik.getWeight() + " gramm");
        marsik.goToilet();
        System.out.println("Marsik weight is " + marsik.getWeight() + " gramm");
        marsik.meow();
        System.out.println("Marsik weight is " + marsik.getWeight() + " gramm");
        marsik.feed(100.6);
        System.out.println("Marsik weight is " + marsik.getWeight() + " gramm");
        marsik.drink(50.2);
        System.out.println("Marsik weight is " + marsik.getWeight() + " gramm");

        //Смотрим количество еды, которое скушала наша Мурка
        System.out.println("Murka ate " + murka.getFoodAmount() + " gramms of food");

        tom.setColor(CatColours.WHITE); //Красим мёртвого Тома в белый цвет

        kuzya.setColor(CatColours.BLACK); //А Кузю красим в чёрный
        System.out.println("Now you have " + Cat.getCount() + " cats"); //Смотрим, сколько котов у нас в живых


    }
}