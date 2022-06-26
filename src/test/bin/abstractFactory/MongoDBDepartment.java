package test.bin.abstractFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class MongoDBDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("MongoDB department insert");
    }

    @Override
    public void get(String id) {
        System.out.println("MongoDB department get");
    }
}
