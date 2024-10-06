import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld1.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("helloWorld1 == helloWorld2: " + (helloWorld1 == helloWorld1));
        System.out.println("cat1 == cat2: " + (cat1 == cat2));

        System.out.println("Cat 1 Name: " + cat1.getName());
        System.out.println("Cat 2 Name: " + cat2.getName());
    }
}