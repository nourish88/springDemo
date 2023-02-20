package example.io.demo.dataAccess.abstracts;

import example.io.demo.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository {
    List<Brand> getAll();
}
