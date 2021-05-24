package com.udacity.dogs.repository;

import com.udacity.dogs.entity.Dog;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by janaksoni on 5/24/21.
 */
public interface DogRepository extends CrudRepository<Dog, Long> {
}
