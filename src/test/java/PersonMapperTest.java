import it.frigir.command.PersonCommand;
import it.frigir.mapper.PersonMapper;
import it.frigir.model.Person;

public class PersonMapperTest {

    public void testPersonMapper(){

        //given
        Person person = new Person();
        person.setEmail("aaaa@gmail.com");
        person.setFirstName("John");
        person.setLastName("Black");

        //when
        PersonCommand personCommand = PersonMapper.PERSON_MAPPER.personToPersonCommand(person);

        System.out.println(person);
        System.out.println(personCommand);

    }

}
