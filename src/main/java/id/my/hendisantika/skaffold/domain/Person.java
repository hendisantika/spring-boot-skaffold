package id.my.hendisantika.skaffold.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-skaffold
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 12/03/25
 * Time: 09.34
 * To change this template use File | Settings | File Templates.
 */
@Getter
@AllArgsConstructor
public class Person {
    private final Long userId;
    private final String lastName;
    private final String firstName;
    private final String position;
}
