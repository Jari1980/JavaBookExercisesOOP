public class PolarCoordinates {
    double distanceFromOrigo;
    double angle;

    public PolarCoordinates(double distanceFromOrigo, double angle) {
        this.distanceFromOrigo = distanceFromOrigo;
        this.angle = angle;
    }

    public static double[] rectangularCoordinate(PolarCoordinates polar){
        var arr = new double[2];
        double x = polar.distanceFromOrigo * Math.cos(polar.angle);
        double y = polar.distanceFromOrigo * Math.sin(polar.angle);
        arr[0] = x;
        arr[1] = y;

        return arr;
    }
}
