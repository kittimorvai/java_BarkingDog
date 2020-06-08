public class BarkingDog {
    public static void main(String[] args) {

        boolean whetherToWakeUp = shouldWakeUp(true, 25);
        System.out.println(whetherToWakeUp);
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfTheDay){
      if(hourOfTheDay < 0 || hourOfTheDay > 23){
          return false;
      } else if (barking && (hourOfTheDay < 8 || hourOfTheDay > 22)) {
          return true;
      }
      return false;
    }
}
