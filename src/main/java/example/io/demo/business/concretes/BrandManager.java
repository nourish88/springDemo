package example.io.demo.business.concretes;

import example.io.demo.business.abstracts.BrandService;
import example.io.demo.dataAccess.abstracts.BrandRepository;
import example.io.demo.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
