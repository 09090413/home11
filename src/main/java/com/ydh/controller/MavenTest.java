package com.ydh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MavenTest {
	@RequestMapping
	public String maven() {
		return "maven";
	}
}
