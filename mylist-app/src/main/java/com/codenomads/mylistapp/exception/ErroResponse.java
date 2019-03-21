package com.codenomads.mylistapp.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * Class that maps an error type object.
 * 
 * @author Namom Alencar {@literal <namomalencar@gmail.com>}
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class ErroResponse {

	private HttpStatus status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;
	private List<String> listmsg;

	private ErroResponse() {
		this.timestamp = LocalDateTime.now();
	}

	public ErroResponse(HttpStatus status) {
		this();
		this.status = status;
	}

	public ErroResponse(HttpStatus status, String message) {
		this();
		this.status = status;
		this.message = message;
	}

	public ErroResponse(HttpStatus status, String message, List<String> listmsg) {
		this();
		this.status = status;
		this.message = message;
		this.listmsg = listmsg;
	}

}
