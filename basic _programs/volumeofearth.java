public class VolumeOfEarth {
    public static void main(String[] args) {

        double radiusKm = 6378;   // radius of Earth in kilometers
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km³ to miles³ (1 km = 0.621371 miles)
        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles
        );
    }
}
