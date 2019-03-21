package com.codenomads.mylistapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class ListDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max = 255)
	@Column(unique = true)
	private String name;

	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalDateTime dateList;

	@OneToMany(mappedBy = "myList", cascade = CascadeType.ALL)
	private List<TaskDomain> taks;

	public ListDomain(String name, LocalDateTime dateList) {
		this.name = name;
		this.dateList = dateList;
	}

	public ListDomain() {
		this.dateList = LocalDateTime.now();
	}

}
