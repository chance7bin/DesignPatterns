package test.bin.prototype;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Company implements Cloneable{
    private String name;
    private String address;



    @Override
    public String toString() {
        return "Company{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
    }

    public Company() {
    }

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Company clone() {
        try {
            return (Company) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
