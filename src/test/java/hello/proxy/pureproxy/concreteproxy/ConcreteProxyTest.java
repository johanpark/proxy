package hello.proxy.pureproxy.concreteproxy;

import hello.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import hello.proxy.pureproxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

/**
 * <pre>
 * hello.proxy.pureproxy.concreteproxy.code
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
 * 2023/06/11   johnpark   최초 생성
 * </pre>
 * @since 2023/06/11
 */
public class ConcreteProxyTest {
    @Test
    void noProxy() {
        ConcreteLogic logic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(logic);
        client.execute();
    }

    @Test
    void addProxy() {
        ConcreteLogic logic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(logic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();
    }
}
