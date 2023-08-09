import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import br.com.kandelloliveira.message.HelloProducer

@RestController
@RequestMapping("/kafka")
class MessagingController {

    @Autowired
    private lateinit var service: HelloProducer

    @GetMapping("/hello/{name}")
    fun hello(@PathVariable("name") name: String): String {
        service.sendMessage("Olá, $name")
        return "OK"
    }
}