package com.sd.dao.v1;
public class DaoMainV1 {
    public static void main(String[] args) {
        PersonVO p;
        PersonDao personDao = new PersonDaoImp1();

        System.out.println("--- inserting...");
        p = new PersonVO(0, "KBK");
        personDao.insert(p);
        p = new PersonVO(1, "LSH");
        personDao.insert(p);

        System.out.println("--- finding all...");
        for (PersonVO pi:personDao.findAll()) {
            System.out.println("reading... "+pi.getId() +", "+pi.getName());
        }

        System.out.println("--- updating...");
        p =personDao.findAll().get(0);
        p.setName("KBK new");
        personDao.update(p);

        System.out.println("--- see if updated...");
        p=personDao.findById(0);
        System.out.println(p.getId() +", "+p.getName());

        System.out.println("--- deleting...");
        personDao.delete(0);

        System.out.println("--- finding all after deleting...");
        for (PersonVO pi:personDao.findAll()) {
            System.out.println("reading... "+pi.getId() +", "+pi.getName());
        }
   }
}