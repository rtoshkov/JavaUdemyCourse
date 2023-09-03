public class Section2Challenge {
    public static void main(String[] args) {
        double varOne = 20.00d;
        double varTwo = 80.00d;
        double result = (varOne + varTwo) * 100.00d;
//        System.out.println(result);

        double reminder = result % 40d;
//        System.out.println(reminder);

        boolean boolOne = reminder == 0.00d;

        System.out.println("Boolean value is " + boolOne);

        if (!boolOne){
            System.out.println("You got some reminder");
        }

    }
}
