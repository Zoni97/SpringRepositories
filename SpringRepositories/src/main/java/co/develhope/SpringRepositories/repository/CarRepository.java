package co.develhope.SpringRepositories.repository;

import co.develhope.SpringRepositories.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, String> {
}
