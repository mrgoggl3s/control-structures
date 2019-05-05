import java.sql.SQLOutput;

public class Ex12 {
    public static void main(String[] args) {
        int luna = 31;
        switch (luna){
            case 11:
            case 0:
            case 1:
                System.out.println("este iarna");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("este primavara");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("este vara");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("este toamana");
                break;
            default:
                System.out.println("eroare");
        }
    }
}
