public class Trapezoid extends Figure {
    private final double base1; // большее основание
    private final double base2; // меньшее основание
    private final double height;

    public Trapezoid(double base1, double base2, double height) {
        if (base1 <= 0 || base2 <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основания и высота должны быть положительными");
        }
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        // Наклонная сторона по теореме Пифагора: sqrt((base1 - base2)^2 + height^2)
        double diff = Math.abs(base1 - base2);
        double slantSide = Math.sqrt(diff * diff + height * height);
        return base1 + base2 + height + slantSide;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2.0;
    }
}
