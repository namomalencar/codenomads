package com.codenomads.mylistapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class TaskDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max = 255)
	@Column(unique = true)
	private String nameTask;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime dateTask;

	private Boolean status;

	@ManyToOne
	@JoinColumn(name = "id_list")
	private ListDomain myList;

	public TaskDomain(String nameTask, ListDomain myList) {
		this.nameTask = nameTask;
		this.dateTask = LocalDateTime.now();
		this.status = true;
		this.myList = myList;
	}

	public TaskDomain() {
	}

}
