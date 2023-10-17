import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SummonRift summonRifts = new SummonRift();
        System.out.println("Thông tin team SKT");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nhập tên người chơi "+i+": ");
            String name = scanner.nextLine();
            ArrayList<Figure> figures = new ArrayList<>();
            System.out.print("Nhập tên tướng của người chơi "+i+": ");
            String figure = scanner.nextLine();
            System.out.print("Nhập chức vụ của tướng: ");
            String position = scanner.nextLine();
            figures.add(new Figure(figure, position));
            SummonRift.addSkt(name, figures);
        }
        System.out.println("Thông tin team G2");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nhập tên người chơi "+i+": ");
            String name = scanner.nextLine();
            ArrayList<Figure> figures = new ArrayList<>();
            System.out.print("Nhập tên tướng của người chơi "+i+": ");
            String figure = scanner.nextLine();
            System.out.print("Nhập chức vụ của tướng: ");
            String position = scanner.nextLine();
            figures.add(new Figure(figure, position));
            SummonRift.addG2(name, figures);
        }
        System.out.println(summonRifts);
    }
}
