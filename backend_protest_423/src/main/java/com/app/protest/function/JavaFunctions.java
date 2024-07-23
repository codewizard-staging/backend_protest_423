package com.app.protest.function;

import com.app.protest.model.Manager;
import com.app.protest.model.Pet;
import com.app.protest.model.PetCareCenter;
import com.app.protest.model.PetOwner;
import com.app.protest.model.Document;
import com.app.protest.model.PetService;
import com.app.protest.enums.PetServiceType;
import com.app.protest.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.protest.repository.PetServiceRepository;
import com.app.protest.repository.PetOwnerRepository;
import com.app.protest.repository.PetCareCenterRepository;
import com.app.protest.repository.ManagerRepository;
import com.app.protest.repository.DocumentRepository;
import com.app.protest.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
