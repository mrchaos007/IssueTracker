package hu.elte.alkfejl.issuetracker.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id;
	
	@Version
	private int version;
}
