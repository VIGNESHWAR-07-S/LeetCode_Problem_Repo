class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int aStart=toDay(arriveAlice,days);
        int aEnd=toDay(leaveAlice,days);
        int bStart=toDay(arriveBob,days);
        int bEnd=toDay(leaveBob,days);
        int start = Math.max(aStart,bStart);
        int end   = Math.min(aEnd,bEnd);
        return Math.max(0,end-start+1);
    }

    private int toDay(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day   = Integer.parseInt(date.substring(3, 5));
        int total=0;
        for (int i=0;i<month-1;i++) {
            total += days[i];
        }
        return total + day;
    }
}