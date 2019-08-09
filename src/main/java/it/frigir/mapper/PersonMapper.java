package it.frigir.mapper;

import it.frigir.command.PersonCommand;
import it.frigir.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper PERSON_MAPPER = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "email", target = "mail")
    PersonCommand personToPersonCommand(Person person);

}
