package br.edu.ufrn.store.service;

import br.edu.ufrn.store.dto.ProductDTO;
import br.edu.ufrn.store.mapper.ProductMapper;
import br.edu.ufrn.store.model.Product;
import br.edu.ufrn.store.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    private final Random random = new Random();

    public ProductDTO findById(Long id) {

        if (generateRandomNumber(0.2)) {
            return null;
        }

        Product product = productRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
        return productMapper.toDTO(product);
    }

    public Long save(ProductDTO productDTO) throws InterruptedException {

        if(generateRandomNumber(0.1)) {
            Thread.sleep(5000);
            throw new RuntimeException("Error when trying to register product. Try again later");
        }

        var productSaved = productRepository.save(productMapper.toModel(productDTO));
        return productSaved.getId();
    }

    public boolean generateRandomNumber(double percentage)  {
        double result = random.nextDouble();
        return result <= percentage;
    }
}
