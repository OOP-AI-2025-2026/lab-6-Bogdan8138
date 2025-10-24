package org.example.devices;

public class Smartphone implements GPS, Cellular {
    private double latitude;
    private double longitude;
    private String phoneNumber;

    public Smartphone(String phoneNumber, double latitude, double longitude) {
        this.phoneNumber = phoneNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{ latitude, longitude };
    }

    @Override
    public void makeCall() {
        System.out.println("Dialing from " + phoneNumber + "...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming call to " + phoneNumber + "...");
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone("+380991112233", 46.4825, 30.7233);
        s.makeCall();
        s.receiveCall();
        double[] c = s.getCoordinates();
        System.out.println("GPS: lat=" + c[0] + ", lon=" + c[1]);
    }
}
