public class ReorganizeCode2 {
    class Bad_Reorganize_Code {
        public void calculateSpeed() {
            int xA = 1;
            int xB = 2;
            int yA = 3;
            int yB = 4;
            double timeInDays = 10;
            double distanceInMiles = Math.sqrt((xA - xB) ^ 2 + (yA - yB) ^ 2);
            double Days_to_sec = timeInDays * 24 * 60;
            double Miles_to_meter = distanceInMiles * 1609.34;
            double speed = Miles_to_meter / Days_to_sec;
            double speed_to_Kmh = speed / 3.6;
        }
    }

    class Good_Reorganized_Code{
        public void doCalculationSpeed(){
        double distance = calculateDistance(1,2,3,4);
        double time= dayToSec(58);
        double speed = calculateSpeed(distance, time);

        }

        private double calculateDistance(int xA, int xB, int yA, int yB) {
            return Math.sqrt((xA - xB) ^ 2 + (yA - yB) ^ 2);
        }

        private double calculateSpeed(double distance, double time) {
            return (distance /time)/3.6;
        }

        private double calculateDistanceIntoMeter(int xA, int xB, int yA, int yB) {
            double distance = Math.sqrt((xA - xB) ^ 2 + (yA - yB) ^ 2);
            return distance * 1609.34;
        }

        private double dayToSec(int i) {
            return i * 24 * 60;
        }
    }
}
