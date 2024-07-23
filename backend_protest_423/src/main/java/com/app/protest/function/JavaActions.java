package com.app.protest.function;

import com.app.protest.model.Manager;
import com.app.protest.model.Pet;
import com.app.protest.model.PetCareCenter;
import com.app.protest.model.PetOwner;
import com.app.protest.model.Document;
import com.app.protest.model.PetService;




import com.app.protest.enums.PetServiceType;
import com.app.protest.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  