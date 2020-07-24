package ch4.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch4.mvc.json.domain.DemoObj;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
	
	@RequestMapping(produces = "text/plain; charset=utf-8")
	public @ResponseBody String index(HttpServletRequest request) {
		return "url:"+request.getRequestURI()+" can access";
	}
	
	@RequestMapping(value = "/pathver/{str}",produces = "text/plain;charset=utf-8")
	public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest request) {
		return "url:"+request.getRequestURI()+" can access,str: "+str;
	}
	
	@RequestMapping(value = "/requestParam" , produces = "text/plain; charset=utf-8")
	public @ResponseBody String passRequestParam(Long id,HttpServletRequest request) {
		return "url:"+request.getRequestURI()+" can access,id: "+id;
	}
	
	@RequestMapping(value = "/obj", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String passObj(DemoObj obj,HttpServletRequest request) {
		return "url:"+request.getRequestURI()+" can access, obj id:"+obj.getId()+" obj name: "+obj.getName();
	}
	
	@RequestMapping(value = {"/name1","/name2"}, produces = "text/plain ; charset=utf-8")
	public @ResponseBody String remove(HttpServletRequest request) {
		return "url:" +request.getRequestURI()+ " can access";
	}

}
