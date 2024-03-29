package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name =  "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Brand {
	
@Column(name="id")
	private int id;
@Column(name= "name")
	private String name;

	}