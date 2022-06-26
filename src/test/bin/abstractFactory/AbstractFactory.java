package test.bin.abstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/20
 */
public class AbstractFactory {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        //通过配置文件读取访问的数据库
        Properties properties = new Properties();
        ClassLoader classLoader = AbstractFactory.class.getClassLoader();
        // 使用FileInputStream读取配置文件，文件默认在当前的module下
        // FileInputStream fis = new FileInputStream("src\\test\\bin\\abstractFactory\\db.properties");
        // 使用ClassLoader读取配置文件，配置文件默认识别为：当前module的src下
        InputStream is = classLoader.getResourceAsStream("test\\bin\\abstractFactory\\db.properties");
        properties.load(is);
        String db = properties.getProperty("db");

        DBAccess dbAccess = new DBAccess();
        dbAccess.setDb(db);
        IUser user = dbAccess.createUser();
        IDepartment department = dbAccess.createDepartment();
        user.get("1");
        department.get("1");
    }
}
