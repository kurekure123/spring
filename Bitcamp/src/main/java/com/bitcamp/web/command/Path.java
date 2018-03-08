package com.bitcamp.web.command;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Path {
	private String context, js, img,css;
}
