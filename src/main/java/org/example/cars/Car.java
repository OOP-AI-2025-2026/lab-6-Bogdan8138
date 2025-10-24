package org.example.cars;

@SuppressWarnings({"rawtypes","unchecked"})
public class Car implements Comparable {
    private int price;
    private int year;       
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) throw new ClassCastException("Cannot compare Car with " + (o == null ? "null" : o.getClass()));
        Car other = (Car) o;

        if (this.price != other.price) {
            return other.price - this.price; 
        }
 
        if (this.year != other.year) {
            return this.year - other.year; 
        }

        return this.horsePower - other.horsePower;
    }

    @Override
    public String toString() {
        return "Car{price=" + price + ", year=" + year + ", hp=" + horsePower + "}";
    }

    public static void main(String[] args) {
        Car a = new Car(10000, 2015, 120);
        Car b = new Car(10000, 2018, 110);
        System.out.println(a + " vs " + b + " -> " + a.compareTo(b));
    }
}
