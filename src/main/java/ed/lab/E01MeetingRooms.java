package ed.lab;

import java.util.*;

public class E01MeetingRooms {

    public int minMeetingRooms(List<MeetingInterval> meetingIntervals) {
        if (meetingIntervals == null || meetingIntervals.isEmpty()) return 0;

        meetingIntervals.sort(Comparator.comparingInt(MeetingInterval::startTime));
        PriorityQueue<Integer> tiempoFinal = new PriorityQueue<>();

        for (MeetingInterval interval : meetingIntervals) {
            if (!tiempoFinal.isEmpty() && interval.startTime() >= tiempoFinal.peek()) {
                tiempoFinal.poll();
            }
            tiempoFinal.offer(interval.endTime());
        }
        return tiempoFinal.size();
    }
}
