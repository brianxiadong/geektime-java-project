import java.beans.beancontext.BeanContextServicesSupport;
import java.beans.beancontext.BeanContextSupport;
import java.util.Iterator;

/**
 * @author brianxia
 * @version 1.0
 * @date 2021/7/8 11:33
 */
public class BeanContextTest {
    public static void main(String[] args) {
        BeanContextSupport beanContextSupport = new BeanContextSupport();
        String s = "123";
        beanContextSupport.add(s);
        Iterator iterator = beanContextSupport.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
