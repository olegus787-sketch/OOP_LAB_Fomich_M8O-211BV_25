public class Vector_ {

    public static double[] crossProduct(double[] a, double[] b) {
        if (a.length != 3 || b.length != 3) {
            throw new IllegalArgumentException("Векторное произведение определено только для 3D векторов (длина массива должна быть 3).");
        }

        double ax = a[0], ay = a[1], az = a[2];
        double bx = b[0], by = b[1], bz = b[2];

        double rx = ay * bz - az * by;
        double ry = az * bx - ax * bz;
        double rz = ax * by - ay * bx;

        return new double[]{rx, ry, rz};
    }

    public static void main(String[] args) {
        // Пример
        double[] v1 = {1.0, 0.0, 0.0};  // i
        double[] v2 = {0.0, 1.0, 0.0};  // j

        double[] result = crossProduct(v1, v2);

        System.out.println("v1 = [" + v1[0] + ", " + v1[1] + ", " + v1[2] + "]");
        System.out.println("v2 = [" + v2[0] + ", " + v2[1] + ", " + v2[2] + "]");
        System.out.println("v1 × v2 = [" + result[0] + ", " + result[1] + ", " + result[2] + "]");
    }
}
