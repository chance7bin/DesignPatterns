package test.bin.prototype;

import java.io.*;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/19
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        PrototypeTest.test2();
    }

    public static void test2() throws IOException, ClassNotFoundException {
        ResumeSerializable resume = new ResumeSerializable("张三", 18);
        CompanySerializable company = new CompanySerializable("字节","eimeng");
        resume.setCompany(company);
        //通过序列化方法实现深拷贝
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(resume);
        oos.flush();
        ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        ResumeSerializable resume1=(ResumeSerializable)ois.readObject();
        resume1.setAge(19);
        resume.setName("李四");
        resume.setAge(20);
        company.setName("高德");
        System.out.println(resume);
        System.out.println(resume1);

    }

    public static void test1(){
        Resume resume = new Resume("张三", 18);
        Company company = new Company("字节","eimeng");
        resume.setCompany(company);
        Resume resume1 = resume.clone();
        resume1.setAge(19);
        Resume resume2 = resume.clone();
        resume.setName("李四");
        resume.setAge(20);
        company.setName("高德");
        System.out.println(resume); //Resume{name='李四', age=20, company=Company{name='高德', address='eimeng'}}
        System.out.println(resume1); //Resume{name='张三', age=19, company=Company{name='高德', address='eimeng'}}
        System.out.println(resume2); //Resume{name='张三', age=18, company=Company{name='高德', address='eimeng'}}
    }
}
