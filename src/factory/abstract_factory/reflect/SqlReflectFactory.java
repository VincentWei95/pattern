package factory.abstract_factory.reflect;

import factory.abstract_factory.IDepartment;
import factory.abstract_factory.IUser;

public class SqlReflectFactory {

   public static IUser createUser(String className) {
       try {
           Class<?> clazz = Class.forName(className);
           return (IUser) clazz.newInstance();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return null;
   }

   public static IDepartment createDepartment(String className) {
       try {
           Class<?> clazz = Class.forName(className);
           return (IDepartment) clazz.newInstance();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return null;
   }
}
