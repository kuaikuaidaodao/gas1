package com.example.gas;


import com.example.gas.Mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class GasApplication {
	@Autowired
	UserinfoMapper userinfoMapper;
@RequestMapping("/")
String home(){
	System.out.println(userinfoMapper.getList().size()+"----------");
	return "index";
}
	public static void main(String[] args) {
		SpringApplication.run(GasApplication.class, args);
	}
}
