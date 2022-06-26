package test.bin.prototype;

import java.io.Serializable;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class CompanySerializable implements Serializable {
    private String name;
    private String address;



    @Override
    public String toString() {
        return "Company{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
    }

    public CompanySerializable() {
    }

    public CompanySerializable(String name, String address) {
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

}
