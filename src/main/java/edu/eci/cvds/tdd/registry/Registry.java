package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }

    public RegisterResult registerDead(Person p){
        boolean alive = p.isAlive();
        if (!alive){
            return RegisterResult.DEAD;
        }
        return null;
    }

    public RegisterResult registerUnderAge(Person p){
        int alive = p.getAge();
        if (alive < 18){
            return RegisterResult.UNDERAGE;
        }
        return null;
    }

    public RegisterResult registerInvalidAge(Person p){
        int alive = p.getAge();
        if (alive < 0 || alive > 105){
            return RegisterResult.INVALID_AGE;
        }
        return null;
    }



    public RegisterResult registerDuplicated(ArrayList<Person> lista){
        String persona1;
        String persona2;

        for (Person persona: lista) {
            return null;
        }
        return null;
    }
}

