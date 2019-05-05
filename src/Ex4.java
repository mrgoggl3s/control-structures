public class Ex4 {
    public static void main(String[] args) {
        int[] nrNat = {4, 6, 7, 5, 45, 768, 4324, 5643};
        int nrPare = 0;
        int nrImpare = 0;
        for (int i = 0; i < nrNat.length; i++) {
            if (nrNat[i] % 2 == 0) {
                nrPare = nrPare + 1;

            }
            else {
                nrImpare++;
            }
        }
        System.out.println(nrPare);
        System.out.println(nrImpare);
    }
}
