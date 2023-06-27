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
public class MessageDecorator implements Component {
    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");
        String result = component.operation();
        String decoResult = "****" + result + "****";
        log.info("MessageDecorator 꾸미기 적용 전 ={}, 적용 후  ={}", result, decoResult);
        return decoResult;
    }
}
