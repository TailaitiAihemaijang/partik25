public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int space = rows - 1;
        int stars = 1;

        //Üst yarımı çiz
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            stars += 2;
        }

        //Alt yarımı çiz
        space = 1;
        stars = rows * 2 - 3;

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            stars -= 2;
        }
    }
}
