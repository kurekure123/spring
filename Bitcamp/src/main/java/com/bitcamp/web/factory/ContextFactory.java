package com.bitcamp.web.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.enums.Direction;

@Component
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Autowired Path path;
	@Override
	public Object create() {
		return ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}
	
	public Path path() {
		path.setContext((String) create());
		path.setJs(create() + Direction.JS.toString());
		path.setCss(create() + Direction.CSS.toString());
		path.setImg(create() + Direction.IMG.toString());
		logger.info("ContextFactory path ()에 넘어온 tag 값은 {} 이다", path);
		return path;
	}
}
