package euclidean;

public class Main {
    public static void main(String[] args) {
        System.out.println(EuclidianNOD(168, 64));
    }

    //assume that a >= b
    public static int EuclidianNOD (int a, int b) {
        int q = a % b;
        if (q == 0) {
            return b;
        }
        return EuclidianNOD(b, q);
    }
}


