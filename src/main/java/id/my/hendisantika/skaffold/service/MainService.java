package id.my.hendisantika.skaffold.service;

import id.my.hendisantika.skaffold.domain.Person;
import id.my.hendisantika.skaffold.repository.MainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-skaffold
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 12/03/25
 * Time: 09.40
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    public List<Person> getHendiFamilyMembers() {
        return mainRepository.getFamilyMembers();
    }
}
