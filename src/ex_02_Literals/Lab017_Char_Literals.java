package ex_02_Literals;

public class Lab017_Char_Literals {
    public static void main(String[] args) {
        char c1='A'; //Characters can be A-Z. a-z. !@#$%^&*()_+(Special characters)
       // char c2="A"; //Single quotes is a character, Double quotes is string
        char c3='1';
        char c4='@';
        char c5='i';
        char c6='$';
        char c7=' ';  //blank space

        //Escape characters
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';
        //use of above escape characters

        //System.out.println("ApurvaPathak");
        System.out.println("Apurva"+new_line+"Pathak");
        System.out.println("Apurva"+tab_line+"Pathak");
        System.out.println("Apurva"+back_space+"Pathak");
        System.out.println("Apurva"+carriage_return+"Pathak");

        //directly using the \n instead of the variable name
        System.out.println("This is a 1st line..!!\nThis is a 2nd line..!!");

        //printing smiley characters using unicodes
        char laugh_smiley='\u1f61';
        System.out.println(laugh_smiley);

    }
}
