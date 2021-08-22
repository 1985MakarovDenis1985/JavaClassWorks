package enums.model;

public enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

    public Month plusMonth(int months) {
        int pos = this.ordinal() + months;
        Month[] values = Month.values();
        return values[pos % values.length];
    }

    public static String getName(int pos){
        Month[] values = Month.values();
        return values[(pos-1) % values.length].name();
    }
}
