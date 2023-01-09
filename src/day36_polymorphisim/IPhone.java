package day36_polymorphisim;

import java.util.Arrays;

public class IPhone {

    private String brand, model, size, color;
    private double price;

    public IPhone(String brand, String model, String size, String color, double price) {//constructor
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "\n color of the phone can be only: " + Arrays.toString(colors));
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Price cannot be zero or below zero");
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNumber) {
        System.out.println(getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getModel() + " is texting to " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                " brand='" + getClass().getSimpleName() + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IPhone)) {
            System.err.println("Invalid object. Object must be IPhone");
            System.exit(1);
        }
        if (model.equals(((IPhone) obj).model)) {//if  model is equal to giving model
            if (color.equals(((IPhone) obj).color)) {//if color is equal to giving color
                return true;
            }
        }

        return false;
    }


}
