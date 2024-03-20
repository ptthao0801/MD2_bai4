package thuchanh;

public class rectangle {
    double width, height;

    public rectangle() {
    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    public String display(){
        return "Rectangle{width = "+width+", height = "+height+"}";
    }
}

