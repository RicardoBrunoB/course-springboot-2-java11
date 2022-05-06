package com.nomedaempresa.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_category")
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	private Set<Product> products = new HashSet<>();

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
