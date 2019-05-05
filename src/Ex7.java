public class Ex7 {
    public static void main(String[] args) {

        //2 * (3 la puterea n)

        int numarulDorit = 1234;
        int suma = 0;
        while ( numarulDorit > 0 ){
            suma = suma + (numarulDorit%10);
            numarulDorit=numarulDorit/10;

        }
        System.out.println(suma);


    }
}
