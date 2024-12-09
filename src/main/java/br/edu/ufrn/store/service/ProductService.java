package br.edu.ufrn.store.service;

import br.edu.ufrn.store.dto.ProductDTO;
import br.edu.ufrn.store.mapper.ProductMapper;
import br.edu.ufrn.store.model.Product;
import br.edu.ufrn.store.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
        return productMapper.toDTO(product);
    }

    public Long save(ProductDTO productDTO) {
        var productSaved = productRepository.save(productMapper.toModel(productDTO));
        return productSaved.getId();
    }
}
