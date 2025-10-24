package ua.opnu.list;

import java.util.Comparator;

public class AvgMarkSorter implements Comparator {

    private final boolean orderAsc;

    public AvgMarkSorter(boolean orderAsc) {
        this.orderAsc = orderAsc;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            int cmp = (s1.getAvgMark() > s2.getAvgMark()) ? 1 :
                      (s1.getAvgMark() < s2.getAvgMark()) ? -1 : 0;

            return orderAsc ? cmp : -cmp;
        }
        return 0;
    }
}
