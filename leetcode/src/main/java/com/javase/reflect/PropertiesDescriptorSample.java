com.javase com.javase.reflect;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

/**
 * Created by DD240 on 2016/11/14.
 */
public class PropertiesDescriptorSample {
    public static void main(String[] args) throws IntrospectionException {
        Field[] fields = Node.class.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("===>" +  field.getName() + "\t" + field.getType());
            PropertyDescriptor propertyDescriptor =
                    new PropertyDescriptor(field.getName(), Node.class);
            printDesc(propertyDescriptor);
        }
    }

    private static  void printDesc(PropertyDescriptor propertyDescriptor) {
        System.out.println(propertyDescriptor.getDisplayName());
        System.out.println(propertyDescriptor.getShortDescription());
        System.out.println(propertyDescriptor.getPropertyEditorClass());
        System.out.println(propertyDescriptor.getPropertyType());
        System.out.println(propertyDescriptor.getReadMethod());
        System.out.println(propertyDescriptor.getWriteMethod());
    }

    static class Node {
        private String name;

        private String email;

        private boolean flag;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
