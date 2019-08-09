package it.frigir.mapper;

import it.frigir.command.PersonCommand;
import it.frigir.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonCommandMapper {

    PersonCommandMapper PERSON_COMMAND_MAPPER = Mappers.getMapper(PersonCommandMapper.class);

    @Mapping(source = "mail", target = "email")
    Person personCommandToPerson(PersonCommand personCommand);

}
