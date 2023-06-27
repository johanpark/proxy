package hello.proxy.app.v3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * hello.proxy.app.v3
 *
 * Description :
 * </pre>
 *
 * @author johnpark
 * @version 1.0
 * @see <pre>
 * == 개정이력(Modification Information) ==
 *
 * 수정일     수정자   수정내용
 * ---------- -------- -------------------
 * 2023/05/29   johnpark   최초 생성
 * </pre>
 * @since 2023/05/29
 */
@Slf4j
@RestController
public class OrderControllerV3 {
    private final OrderServiceV3 orderService;

    public OrderControllerV3(OrderServiceV3 orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/v3/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "OK";
    }

    @GetMapping("/v3/no-log")
    public String nolog() {
        return "OK";
    }
}
