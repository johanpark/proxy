package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * hello.proxy.pureproxy.decorator.code
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
 * 2023/05/31   johnpark   최초 생성
 * </pre>
 * @since 2023/05/31
 */
@Slf4j
public class DecoratorPatternClient {
    private Component component;

    public DecoratorPatternClient(Component component) {
        this.component = component;
    }



    public void execute() {
        String result = component.operation();
        log.info("result={}", result);
    }
}
