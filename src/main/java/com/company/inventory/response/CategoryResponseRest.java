package com.company.inventory.response;

import lombok.Getter;
import lombok.Setter;


// Se extiende de responseRest que setea toda la metadata
@Getter
@Setter
public class CategoryResponseRest extends ResponseRest {

    // Esta clase se encarga de devolver la respuesta

    private CategoryResponse categoryResponse =  new CategoryResponse();

}
