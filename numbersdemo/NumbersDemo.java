public class NumbersDemo {
    public static void main (String [] args){
        int Number1 = 20;
        int Number2 = 30;

        displayTwiceTheNumber(Number1);
        displayNumberPlusFive(Number1);
        displayNumberSquared(Number1);


System.out.println(" " );

        displayTwiceTheNumber(Number2);
        displayNumberPlusFive(Number2);
        displayNumberSquared(Number2);
    }

    public static void displayTwiceTheNumber(int Number){

       System.out.println( Number + " Twice is " + (Number * 3));
    }

    public static void displayNumberPlusFive(int Number){
        System.out.println( Number + " plus five is " + (Number + 8));
    
    }

    public static void displayNumberSquared(int Number){
        System.out.println( Number + " Squard is " + (Number * Number));
    }
}

