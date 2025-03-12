package id.my.hendisantika.skaffold.datastore;

import id.my.hendisantika.skaffold.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-skaffold
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 12/03/25
 * Time: 09.37
 * To change this template use File | Settings | File Templates.
 */
public class FakeDataStore {
    private static final List<Person> HENDI_FAMILY = new ArrayList<>();

    static {
        HENDI_FAMILY.add(
                new Person(1L,
                        "YUJI",
                        "ITADORI",
                        "father"
                )
        );
        HENDI_FAMILY.add(
                new Person(2L,
                        "KUGISAKI",
                        "NAOBARA",
                        "mother"
                )
        );
        HENDI_FAMILY.add(
                new Person(3L,
                        "RYOUMEN",
                        "SUKUNA",
                        "son"
                )
        );
        HENDI_FAMILY.add(
                new Person(4L,
                        "SUGURU",
                        "GETO",
                        "uncle"
                )
        );
        HENDI_FAMILY.add(
                new Person(5L,
                        "MEGUMI",
                        "FUSHIGURO",
                        "grandfather"
                )
        );
    }

    public List<Person> getListOfFamilyMembers() {
        return HENDI_FAMILY;
    }
}
