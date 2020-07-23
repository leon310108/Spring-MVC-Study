package ch4.mvc.messageconverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch4.mvc.json.domain.DemoObj;

@Controller
public class ConverterController {

	@RequestMapping(value = "/convert" , produces = {"application/x-wisely"})
	public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj) {
		return demoObj;
	}
}
