package com.thicuoiky.web.service.mapper;

import com.thicuoiky.web.domain.Product;
import com.thicuoiky.web.service.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {


    @Mapping(target = "removeCategory", ignore = true)

    default Product fromId(Long id) {
        if (id == null) {
            return null;
        }
        Product product = new Product();
        product.setId(id);
        return product;
    }
}
