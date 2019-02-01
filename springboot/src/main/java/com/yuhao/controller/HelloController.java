package com.yuhao.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/juran")
	public String yuhao() {
		return "浩浩：我爱你居然";
	}

	@RequestMapping("yuhao/{name}")
	public String yyy(@PathVariable String name){
		return name;
	}
}
