class Bissextile {
    public static boolean apply(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
}