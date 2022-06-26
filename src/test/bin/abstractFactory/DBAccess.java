package test.bin.abstractFactory;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class DBAccess {
    private String db;

    public IUser createUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //反射 Class.forName("test.bin.abstractFactory.MongoDBUser")
        return (IUser) Class.forName("test.bin.abstractFactory." + db + "User").newInstance();
    }

    public IDepartment createDepartment()  throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (IDepartment) Class.forName("test.bin.abstractFactory." + db + "Department").newInstance();
    }

    public void setDb(String db) {
        this.db = db;
    }
}
