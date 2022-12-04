package Less1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5)); // Создаем полосу препятствий
        Team team = new Team("Марафоновцы", new Human("Люди"), new Cat("Коты"), new Dog("Собаки")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу

        System.out.println("\nПобедители:");
        team.passedTheDistance();

        System.out.println("\nРезультаты марафона:");// Показываем результаты
        team.showResults();
    }
}