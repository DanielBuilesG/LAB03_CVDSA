package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static edu.eci.cvds.tdd.registry.Gender.MALE;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
        }

    // TODO Complete with more test cases}


    @Test
    public void validateRegistryifDead() {
        Person person = new Person("Daniel", 123, 30, MALE, false);
        RegisterResult result = registry.registerDead(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryifUnderage() {
        Person person = new Person("Daniel", 123, 10, MALE, true);
        RegisterResult result = registry.registerUnderAge(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryInvalidAge() {
        Person person = new Person("Daniel", 123, -10, MALE, true);
        RegisterResult result = registry.registerInvalidAge(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryDuplicated() {
        Person person = new Person("Daniel", 123, 18, MALE, true);
        Person person2 = new Person("Daniel", 123, 18, MALE, true);
        List<Person> listaPersonas = new ArrayList<Person>();
        listaPersonas.add(person);
        listaPersonas.add(person2);

        RegisterResult result = registry.registerDuplicated((ArrayList<Person>) listaPersonas);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }


}

