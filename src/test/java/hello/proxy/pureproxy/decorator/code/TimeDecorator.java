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
 * 2023/06/05   johnpark   최초 생성
 * </pre>
 * @since 2023/06/05
 */
@Slf4j
public class TimeDecorator implements Component{
   private Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();
        String result = component.operation();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeDecorator 종료 resultTime = {}ms", resultTime);
        return result;
    }
}
