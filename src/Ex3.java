public class Ex3 {
    public static void main(String[] args) {
        int[] multime = {100, 4, 98, 4, 6};

        int maxim = -1; //am folosit -1 pentru ca este multime de nr Naturale in cerinta
        for (int i = 0; i < multime.length; i++) {
            int numarCurent = multime[i];
            if (numarCurent % 2 == 0 ) {
                continue;
            }
            if (numarCurent > maxim) {
                maxim = numarCurent;
            }
        }
        if (maxim > 0) {
            System.out.println(maxim);
        } else {
            System.out.println("no");
        }


    }

}


