package Practce5;

public class CameraWork {
    public static void main(String[] args) {
        Camera c = new Camera();
        c.setBrand("cabc");
        c.setId(4);
        c.setPrice(300);
        System.out.println(c.brand);
        System.out.println(c.id);
        System.out.println(c.price);
    }
}

class Camera {
    int id;
    String brand;
    double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
