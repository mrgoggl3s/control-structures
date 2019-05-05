public class Ex1 {

    public static void main(String[] args) {
     String propozitie = "";
     int n = 4;
        for (int i = 0; i <n ; i++) {
            String diezuri = "";

            for (int j = 0 ; j<=i ; j++){
                diezuri = diezuri + "#";
            }

            propozitie = propozitie + diezuri + " ";

        }
        System.out.println(propozitie);
    }
}

