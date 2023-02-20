package example.io.demo.dataAccess.concretes;

import example.io.demo.dataAccess.abstracts.BrandRepository;
import example.io.demo.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BrandRepositoryInMemory implements BrandRepository {

   ArrayList<Brand> brands;
    public BrandRepositoryInMemory() {
        brands= new ArrayList<Brand>();
        brands.add( new Brand(1, "BMW"));
        brands.add( new Brand(2, "Mercedes"));
        brands.add( new Brand(3, "Audi"));
        brands.add( new Brand(4, "Volkswagen"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
