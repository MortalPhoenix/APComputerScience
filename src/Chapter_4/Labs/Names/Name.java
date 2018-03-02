package Chapter_4.Labs.Names;

public class Name {

    private String first, middle, last;

    Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getFirstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    public String getLastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    public boolean getEquals(String otherName) {
        String name = getFirstMiddleLast().toLowerCase();
        return name.equals(otherName.toLowerCase());
    }

    public String initials() {
        return "" + first.charAt(0) + middle.charAt(0) + last.charAt(0);
    }

    public int length() {
        return first.length() + middle.length() + last.length();
    }
}
