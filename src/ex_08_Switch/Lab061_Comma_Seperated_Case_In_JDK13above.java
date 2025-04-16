package ex_08_Switch;

public class Lab061_Comma_Seperated_Case_In_JDK13above {
    public static void main(String[] args) {
        int itemcode=005;
        switch(itemcode){
            case 001,002,003:
                System.out.println("Items in aisle A");
                break;
            case 004,005:
                System.out.println("Items in aisle B");
                break;
            default:
                System.out.println("Item not available now");
                break;
        }
    }

}
