package ch4.mvc.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UploadController {

	@RequestMapping(value = "/upload")
	public @ResponseBody String upload(MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		try {
			FileUtils.writeByteArrayToFile(new File("d:/upload/"+file.getOriginalFilename()), file.getBytes());
			return "ok";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "wrong";
		}
	}
}
