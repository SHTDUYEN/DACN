package com.thicuoiky.web.service.mapper;

import com.thicuoiky.web.domain.Category;
import com.thicuoiky.web.service.dto.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link Category} and its DTO {@link CategoryDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {


    @Mapping(target = "products", ignore = true)
    @Mapping(target = "removeProduct", ignore = true)
    Category toEntity(CategoryDTO categoryDTO);

    default Category fromId(Long id) {
        if (id == null) {
            return null;
        }
        Category category = new Category();
        category.setId(id);
        return category;
    }
}
