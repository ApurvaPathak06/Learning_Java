package ex_08_Switch;

public class Lab060_JDK13above {
    public static void main(String[] args) {
        int itemcode=004;
        switch (itemcode){
            case 001 -> System.out.println("Print 001");
            case 002 -> System.out.println("Print 002");
            default -> System.out.println("This kind of syntax will work in JDK 13 above version");
            //In this no break statement is required as well
        }
    }
}
