package id.my.hendisantika.skaffold.repository;

import id.my.hendisantika.skaffold.datastore.FakeDataStore;
import id.my.hendisantika.skaffold.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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
@Repository
@RequiredArgsConstructor
public class MainRepository {

    private final FakeDataStore fakeDataStore;

    public List<Person> getFamilyMembers() {
        return fakeDataStore.getListOfFamilyMembers();
    }
}
