public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static Day getFromString(String s){
    for (Day i: Day.values()) {
        if (i.name().equals(s))
            return i;
    }
        return null;
    }
}
