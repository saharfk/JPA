package com.jpav2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CityDao implements Dao<Person> {
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Person person) {
        String sql = "insert into Person values (sq_person.nextval, ?, ?, ?)";
        jdbcTemplate.update(sql, person.getFirstName(),
                person.getLastName(), person.getAddress());
    }
    .............
    @Override
    public List<Person> loadAll() {
        return jdbcTemplate.query("select * from Person", (resultSet, i) -> {
            return toPerson(resultSet);
        });
    }
    .............
}
