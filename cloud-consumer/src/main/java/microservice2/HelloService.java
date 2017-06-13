package microservice2;

/**
 * Created by xuawai on 12/06/2017.
 */
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cloud-client")
public interface HelloService {
    @RequestMapping("/hello/{fallback}")
    public String hello(@PathVariable("fallback") String fallback);
}