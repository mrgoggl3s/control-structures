public class Ex10 {
    public static void main(String[] args) {
        int[] sir = {1, 2, 56, 7, 5, 34, 3, 657, 7, 34, 65, 764356, 43, 6, 7};
        int primeleNrPare = 12;
        int sumaLor = 0;
        int counter = 0;
        for (int i = 0; counter < primeleNrPare && i < sir.length; i++) {
            int numarCurent = sir[i];
            if (numarCurent % 2 == 0) {
                counter++;
                System.out.println("Al " + counter + "-lea numar par este: " + numarCurent);
                sumaLor += numarCurent;
            }

        }

        System.out.println("Suma primelor " + counter + " numere pare este: " + sumaLor);
    }
}
