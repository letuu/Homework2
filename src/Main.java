public class Main {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 1 выполнено");

        // Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 2 выполнено");

        // Задание 3
        dog = dog - 3.6;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 3 выполнено");

        // Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задание 4 выполнено");

        // Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание 5 выполнено");

        // Задание 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух боксеров " + boxersWeight + " кг");
        var differenceWeight1 = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров " + differenceWeight1 + " кг ");
        System.out.println("Задание 6 выполнено");

        // Задание 7
        System.out.println("Разница в весе боксеров " + differenceWeight1 + " кг (вычислено 1-ым способом)");
        var differenceWeight2 = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе боксеров " + differenceWeight2 + " кг (вычислено 2-ым способом)");
        System.out.println("Задание 7 выполнено");

        // Задание 8
        var workHours = 640;
        var employeeHours = 8;
        var employees = workHours / employeeHours;
        System.out.println("Всего работников в компании - " + employees + " человек");
        employees = employees + 94;
        workHours = employees * 8;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
        System.out.println("Задание 8 выполнено");

    }
}