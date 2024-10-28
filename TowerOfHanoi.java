public class TowerOfHanoi {

    public static void solveHanoi(int n, char sumber, char bantu, char tujuan) {
        if (n == 1) {
            System.out.println("Memindahkan cakram 1 dari " + sumber + " ke " + tujuan);
            return;
        }
        solveHanoi(n - 1, sumber, tujuan, bantu);
        System.out.println("Memindahkan cakram " + n + " dari " + sumber + " ke " + tujuan);
        solveHanoi(n - 1, bantu, sumber, tujuan);
    }

    public static void main(String[] args) {
        int cakram = 3;
        solveHanoi(cakram, 'A', 'B', 'C');
    }
}

