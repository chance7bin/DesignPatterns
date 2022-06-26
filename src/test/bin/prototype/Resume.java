package test.bin.prototype;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class Resume implements Cloneable{

    private String name;
    private int age;
    private Company company;


    @Override
    public String toString() {
        return "Resume{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", company=" + company +
            '}';
    }

    public Resume(String name, int age) {
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public Resume clone() {
        try {
            Resume clone = (Resume) super.clone();
            // 简历类实例的company对象属性，调用其clone方法进行拷贝
            clone.company = clone.getCompany().clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
