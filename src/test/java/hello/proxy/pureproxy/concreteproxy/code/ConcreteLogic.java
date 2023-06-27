package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

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
 * 수정일     수정자   수정내용
 * ---------- -------- -------------------
 * 2023/06/10   johnpark   최초 생성
 * </pre>
 * @since 2023/06/10
 */
@Slf4j
public class ConcreteLogic {
    public String operation() {
        log.info("ConcreateLogic 실행");
        return "data";
    }
}
