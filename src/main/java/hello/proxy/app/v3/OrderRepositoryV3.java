package hello.proxy.app.v3;

import org.springframework.stereotype.Repository;

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
@Repository
public class OrderRepositoryV3 {
    public void save(String itemId) {
        //ㅈㅓ장 로직
        if(itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생!");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
