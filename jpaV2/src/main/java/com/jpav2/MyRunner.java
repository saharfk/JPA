package com.jpav2;

import com.jpav2.model.City;
import com.jpav2.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(String... args) throws Exception {

        cityRepository.save(new City("Bratislava", 432000));
        cityRepository.save(new City("Budapest", 1759000));
        cityRepository.save(new City("Prague", 1280000));
        cityRepository.save(new City("Warsaw", 1748000));
        cityRepository.save(new City("Los Angeles", 3971000));
        cityRepository.save(new City("New York", 8550000));
        cityRepository.save(new City("Edinburgh", 464000));

        logger.info("# of cities: {}", cityRepository.count());

        logger.info("All cities unsorted:");
        List<City> cities = cityRepository.findAll();
        logger.info("{}", cities);

        logger.info("------------------------");

        logger.info("All cities sorted by name in descending order");
        List<City> sortedCities = cityRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        logger.info("{}", sortedCities);

        logger.info("------------------------");

//        logger.info("Deleting all cities");
//        cityRepository.deleteAllInBatch();

        logger.info("# of cities: {}", cityRepository.count());
    }
}
