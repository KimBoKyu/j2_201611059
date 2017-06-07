package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2 {
    public static void main(String args[]){
        PersonDAOImpl personDAOImpl = new PersonDAOImpl();
        PersonVO person = new PersonVO();

        person.setName("KBK");
        person.setAddress("1 Sa-Dang");
        personDAOImpl.insert(person);

        person.setName("LSH");
        person.setAddress("2 Bang-Bae");
        personDAOImpl.insert(person);

        List persons=personDAOImpl.findAll();
        Iterator iter=persons.iterator();
        while(iter.hasNext()) {
            person=(PersonVO)iter.next();
            System.out.println(person.toString());        }


        person.setId(2);
        person.setName("LSH2 updated");
        person.setAddress("2 Bang-Bae updated");
        personDAOImpl.update(person);

        person=personDAOImpl.findById(2);
        System.out.println("found by id..."+person);

        personDAOImpl.close();
    }
}