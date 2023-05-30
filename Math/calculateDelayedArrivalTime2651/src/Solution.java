public class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int delayedArrivalTime = arrivalTime + delayedTime;
        if (delayedArrivalTime < 24) {
            return delayedArrivalTime;
        } else {
            delayedArrivalTime = (arrivalTime + delayedTime) - 24;
            return delayedArrivalTime;
        }
    }
}
