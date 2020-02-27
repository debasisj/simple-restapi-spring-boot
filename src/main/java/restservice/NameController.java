package restservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NameController {

    @PostMapping(value = "/score", consumes = "application/json", produces = "application/json")
    public int score(@Valid @RequestBody Name name) {
        Name name1 = new Name(name.getFirstName(),name.getLastName(),name.getMiddleNames());
        return name1.getScore();

    }


}
