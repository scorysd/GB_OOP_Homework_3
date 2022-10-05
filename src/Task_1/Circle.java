package Task_1;

class Circle extends Figure {
    private double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    double getArea() {
        return Math.PI * rad * rad;
    }
}
