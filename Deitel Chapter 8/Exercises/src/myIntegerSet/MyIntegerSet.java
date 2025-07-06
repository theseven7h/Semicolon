package myIntegerSet;

public class MyIntegerSet {
    private boolean[] status =  new boolean[100];

    public boolean[] getSet() {
        return status;
    }

    public void setStatus(boolean[] newStatus) {
        this.status = newStatus;
    }

    public void insertElement(int number) {
        validate(number);
        status[number] = true;
    }

    public void deleteElement(int number) {
        validate(number);
        status[number] = false;
    }

    public boolean contains(int number) {
        validate(number);
        return status[number];
    }

    public void validate(int number) {
        boolean isBetweenZeroToHundred = number >= 0 && number <= 100;
        if (!isBetweenZeroToHundred)
            throw new IllegalArgumentException("Number " + number + " is not between 0 and 100");
    }

    public static boolean[] union(MyIntegerSet set, MyIntegerSet set2) {
        boolean[] newSet = new boolean[100];
        for (int i = 0; i < newSet.length; i++)
            if((set.contains(i) || set2.contains(i))) newSet[i] = true;
        return newSet;
    }

    public static boolean[] intersect(MyIntegerSet set, MyIntegerSet set2) {
        boolean[] newSet = new boolean[100];
        for (int i = 0; i < newSet.length; i++)
            if((set.contains(i) && set2.contains(i))) newSet[i] = true;
        return newSet;
    }

    public int elementsIn() {
        int count = 0;
        for(boolean stat : getSet()) if(stat) count++;
        return count;
    }

    public int elementsNotIn() {
        int count = 0;
        for(boolean stat : getSet()) if(!stat) count++;
        return count;
    }

    public boolean isEqual(MyIntegerSet set) {
        return set.elementsIn() == elementsIn();
    }

    @Override
    public String toString() {
        StringBuilder setString = new StringBuilder();
        for(int number = 0; number < getSet().length; number++) if(getSet()[number]) setString.append(number + " ");
        setString.deleteCharAt(setString.length() - 1);
        return setString.toString();
    }
}