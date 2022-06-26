package test.bin.abstractFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class SqlserverDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("sqlserver department insert");
    }

    @Override
    public void get(String id) {
        System.out.println("sqlserver department get");
    }
}
