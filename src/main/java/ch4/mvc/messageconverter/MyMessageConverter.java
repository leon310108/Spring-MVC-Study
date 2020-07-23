package ch4.mvc.messageconverter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import ch4.mvc.json.domain.DemoObj;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

	public MyMessageConverter() {
		super(new MediaType("application","x-wisely",Charset.forName("utf-8")));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return DemoObj.class.isAssignableFrom(clazz);
	}

	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		String temp=StreamUtils.copyToString(inputMessage.getBody(),Charset.forName("utf-8"));
		String[] tempArr=temp.split("-");
		return new DemoObj(new Long(tempArr[0]), tempArr[1]);
	}

	@Override
	protected void writeInternal(DemoObj t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		String out="hello:"+t.getId()+"-"+t.getName();
		outputMessage.getBody().write(out.getBytes());
		
	}
	

}
