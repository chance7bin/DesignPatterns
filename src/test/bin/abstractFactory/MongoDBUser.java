package test.bin.abstractFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class MongoDBUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("MongoDB user insert");
    }

    @Override
    public void get(String id) {
        System.out.println("MongoDB user get");
    }
}
