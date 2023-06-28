import java.util.Arrays;
import java.util.Comparator;
class P8 {
    public static boolean canAttendMeeting(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean res = canAttendMeeting(intervals);
        System.out.println(res);
    }
}
