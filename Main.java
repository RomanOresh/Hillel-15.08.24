import java.util.Scanner;

public class Main implements Adviser{
    public static void main(String[] args) {
        System.out.println("Введите день недели для получения совета:");
        System.out.println("SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY");
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        Day any = Day.getFromString(day);
        Main n = new Main();

        if (any == null){
            System.out.println("Вы ввели неправильно день. Ошибка приложения");
        } else{
            n.advise(any);
        }
    }

    public void advise(Day day){
        switch (day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("Тщательно проверьте работу, чтобы потом не переделывать");
            case FRIDAY -> System.out.println("Happy friday");
            case SATURDAY, SUNDAY -> System.out.println("Посетите прекрасные места");
        }
    }
}
