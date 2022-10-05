package Task_1;

class Rectangle extends Figure {
    private double height;
    private double weight;

    Rectangle(double height, double weight) {
    this.height = height;
    this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    double getArea() {
        return height * weight;
    }
}
