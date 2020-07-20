package ch4.mvc.json;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch4.mvc.json.domain.DemoObj;

@RestController
@RequestMapping("/rest")
public class DemoRestController {
	
	@RequestMapping(value = "/getjson", produces = {"application/json ; charset=utf-8"})
	public DemoObj getjson(DemoObj obj) {
		return new DemoObj(obj.getId()+1,obj.getName()+"yy");
	}
	
	@RequestMapping(value = "/getxml", produces = {"application/xml ; charset=utf-8"})
	public DemoObj getxml(DemoObj obj) {
		return new DemoObj(obj.getId()+1,obj.getName()+"yy");
	}

}
