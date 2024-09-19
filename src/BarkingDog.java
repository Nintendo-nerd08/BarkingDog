public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWake(true, 1));
        System.out.println(shouldWake(false, 2));
        System.out.println(shouldWake(true, 8));
        System.out.println(shouldWake(true, -1));
    }

    private static boolean shouldWake(boolean isBarking, int hourOfDay) {
        if( hourOfDay < 0 || hourOfDay > 23) //if statements check for less than 0 or greater than 23:
            return false;

        return hourOfDay < 8 || hourOfDay > 22; //Understood after doing the first if statement.
    }


}
