package ex_08_Switch;

public class Lab058_Interview_Questions {
    public static void main(String[] args) {
        //int a=10;
        //switch (a){
        // is this a valid statement ?
        //Answer -> Yes it is

        //boolean b=true;
        //switch (b){
          //Is this valid statement ?
        // Answer -> It is not valid, because boolean is not supported in this case
        //}
        char ch = 'A';
        switch(ch)
        {
            case 65:
                System.out.println("Match");
                break;
            default:
                System.out.println("No match...");
        }
    }
}
