package br.edu.ufrn.store.mapper;

import br.edu.ufrn.store.dto.ProductDTO;
import br.edu.ufrn.store.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toModel(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setValue(productDTO.getValue());
        return product;
    }

    public ProductDTO toDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setValue(product.getValue());
        return productDTO;
    }
}
