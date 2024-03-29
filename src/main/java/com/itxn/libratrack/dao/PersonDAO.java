//package com.itxn.libratrack.dao;
//
//import com.itxn.libratrack.model.Book;
//import com.itxn.libratrack.model.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class PersonDAO {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public PersonDAO(JdbcTemplate jdbcTemplate)  {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Person> index() {
//        return jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper<>(Person.class));
//    }
//
//
//    public void create(Person person) {
//        jdbcTemplate.update("INSERT INTO person (fullName, birthYear) VALUES(?, ?)", person.getFullName(),
//                person.getBirthYear());
//    }
//
//    public Person show(int id) {
//        return jdbcTemplate.query("SELECT * FROM person WHERE id=?", new Object[]{id},
//                        new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
//    }
//
//    public Optional<Person> show(String fullName) {
//        return jdbcTemplate.query("SELECT * FROM person WHERE fullName=?", new Object[]{fullName},
//                new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
//
//    }
//     public void edit(int id, Person updatedPerson) {
//        jdbcTemplate.update("UPDATE PERSON SET fullName=?, birthYear=? WHERE id=?", updatedPerson.getFullName(),
//                updatedPerson.getBirthYear(), id);
//    }
//
//    public void delete(int id) {
////        jdbcTemplate.update("UPDATE book SET person_id = null WHERE person_id=?", id);
//        jdbcTemplate.update("DELETE FROM person WHERE id=?", id);
//    }
//
//    public List<Book> listBooks(int id) {
//        return jdbcTemplate.query("SELECT b.title, b.author, b.year FROM book b WHERE b.person_id = ?",
//                new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
//    }
//}
