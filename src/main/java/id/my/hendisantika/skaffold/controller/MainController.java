package id.my.hendisantika.skaffold.controller;

import id.my.hendisantika.skaffold.domain.Person;
import id.my.hendisantika.skaffold.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("api/v1/hendi")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping
    public List<Person> getHendiFamilyList() {
        return mainService.getHendiFamilyMembers();
    }
}
