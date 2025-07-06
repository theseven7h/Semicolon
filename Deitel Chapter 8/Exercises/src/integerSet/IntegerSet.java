package integerSet;

import java.util.Arrays;

public class IntegerSet {
   private final boolean[] set =  new boolean[101];

   public void add(int number) {
       validate(number);
       set[number] = true;
   }

   public void remove(int number) {
       validate(number);
       set[number] = false;
   }

   public boolean contains(int number) {
       validate(number);
       return set[number];
   }

   public void validate(int number) {
       boolean isBetweenZeroToHundred = number >= 0 && number <= 100;
       if (!isBetweenZeroToHundred)
           throw new IllegalArgumentException("Number " + number + " is not between 0 and 100");
   }

   @Override
   public String toString() {
       return Arrays.toString(set);
   }
}

class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet set = new IntegerSet();

        System.out.println(set.contains(55));
        set.add(55);
        System.out.println(set.contains(55));

        set.remove(55);
        System.out.println(set.contains(55));

        set.add(-1);
        set.add(101);
    }
}
