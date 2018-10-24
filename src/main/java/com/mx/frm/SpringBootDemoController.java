package com.mx.frm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.SpringBootDemoDTO;

@Controller
@EnableAutoConfiguration
public class SpringBootDemoController {
	
	@RequestMapping(value="/")
	@ResponseBody
	public SpringBootDemoDTO root(){
		return new SpringBootDemoDTO("attr1","attr2");
	}
	
	@RequestMapping(value="/parameters", method=RequestMethod.GET)
	@ResponseBody
	public SpringBootDemoDTO parameters(
			@RequestParam(name="param1", required=true) String attr1,
			@RequestParam(name="param2", required=false) String attr2
	){
		return new SpringBootDemoDTO(
			 attr1,
			 attr2
		);
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootDemoController.class, args);
	}

}
