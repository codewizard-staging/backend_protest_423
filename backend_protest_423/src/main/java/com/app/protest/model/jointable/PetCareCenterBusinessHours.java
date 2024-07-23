package com.app.protest.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.protest.model.Manager;
import com.app.protest.model.Pet;
import com.app.protest.model.PetCareCenter;
import com.app.protest.model.PetOwner;
import com.app.protest.model.Document;
import com.app.protest.model.PetService;
import com.app.protest.enums.PetServiceType;
import com.app.protest.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"protest\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}