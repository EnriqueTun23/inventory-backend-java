package com.company.inventory.dao;

import com.company.inventory.model.Category;
import org.springframework.data.repository.CrudRepository;

// Aqui se extiendien con crudrepositori para obtener todo el tipo de peticiones que se puede tener para esta clase
public interface ICategoryDao extends CrudRepository<Category, Long> {

}
