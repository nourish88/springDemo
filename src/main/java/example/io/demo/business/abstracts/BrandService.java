package example.io.demo.business.abstracts;

import example.io.demo.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
