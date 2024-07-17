package net.naji.ensetchatbot1rag.Services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import net.naji.ensetchatbot1rag.PersonRepository;
import net.naji.ensetchatbot1rag.entities.Person;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}
