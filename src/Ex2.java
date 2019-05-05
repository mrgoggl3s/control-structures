public class Ex2 {

    public static void main(String[] args) {
        int n = 6;
        while(n>1){
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = 3 * n + 1;
                System.out.println(n);
            }
        }


    }
}

