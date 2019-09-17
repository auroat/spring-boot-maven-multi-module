package hello.app;

import hello.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "hello")
@RestController
public class DemoApp {

    private final MyService myService;

    public DemoApp(MyService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }
}