package test.bin.prototype;

import java.io.Serializable;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class ResumeSerializable implements Serializable {
    private String name;
    private int age;
    private CompanySerializable company;


    @Override
    public String toString() {
        return "Resume{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", company=" + company +
            '}';
    }

    public ResumeSerializable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CompanySerializable getCompany() {
        return company;
    }

    public void setCompany(CompanySerializable company) {
        this.company = company;
    }

}
