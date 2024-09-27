class MyCalendarTwo {

    private List<int[]> booking ;
    private List<int[]> overlap;

    public MyCalendarTwo() {
        booking = new ArrayList<>();
        overlap = new ArrayList<>();

    }
    
    public boolean book(int start, int end) {
        for(int[] now : overlap){
            if(Math.max(start,now[0]) < Math.min(end,now[1])) return false;
        }

        for(int[] now : booking){
            int maxStart = Math.max(start,now[0]);
            int minend = Math.min(end,now[1]);
            if(maxStart<minend) overlap.add(new int[]{maxStart,minend});
        }

        booking.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */