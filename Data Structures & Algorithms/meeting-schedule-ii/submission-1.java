/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i->i.start));
int rooms = 1;
for(int i=1;i<intervals.size();i++){
    if(intervals.get(i).start < intervals.get(i-1).end){
rooms += 1;
    }
}
return rooms;
    }
}
