package springcarstore.basicstore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import springcarstore.basicstore.entity.Manufacturer;

import java.util.List;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {

    Manufacturer findManufacturerByManufacturerIdEquals(int manufacturerId);
    Manufacturer findManufacturerByManufacturerNameContains(String lettersGroup);
    List<Manufacturer> findManufacturersByManufacturerIdGreaterThan(int value);

    @Query(value = "select * from manufacturer where ManufacturerID = :manufacturerId", nativeQuery = true)
    Manufacturer oMetodaCareExecutaQuerryNativ(@Param("manufacturerId") int parametru);

}
