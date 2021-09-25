import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        Cat victor = (Cat) applicationContext.getBean("cat");
        Cat artemiy = (Cat) applicationContext.getBean("cat");

        System.out.println(bean == helloWorld);
        System.out.println(victor == artemiy);
    }
}