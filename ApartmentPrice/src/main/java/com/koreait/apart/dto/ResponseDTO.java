package com.koreait.apart.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "response")
public class ResponseDTO {

	@JacksonXmlProperty(localName = "body")
	private BodyDTO body;

	public BodyDTO getBody() {
		return body;
	}

	public void setBody(BodyDTO body) {
		this.body = body;
	}
}