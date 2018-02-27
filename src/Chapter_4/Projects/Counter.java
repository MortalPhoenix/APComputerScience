package Chapter_4.Projects;

class Counter {

    private int count;

    Counter() {
        count = 0;
    }

    void click () {
        count++;
    }

    int getCount() {
        return count;
    }

    void reset() {
        count = 0;
    }
}
