package hello.proxy.pureproxy.proxy.code;

/**
 * <pre>
 * hello.proxy.pureproxy.proxy.code
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
public class ProxyPatternClient {
    private Subject subject;

    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.operation();
    }
}
