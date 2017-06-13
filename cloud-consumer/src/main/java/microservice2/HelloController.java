package microservice2;

/**
 * Created by xuawai on 12/06/2017.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @Autowired
    private HelloService helloServcie;
    @RequestMapping("/test/{fallback}")
    public String hello(@PathVariable("fallback") String fallback){
        String res=helloServcie.hello(fallback);
        return "调用服务结果为"+res;
    }
}