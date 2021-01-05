package com.yy.ymissyou.core.configuration;

import com.yy.ymissyou.core.hack.AutoPrefixUrlMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 通过@Component注解和implements WebMvcRegistrations让spring boot自动发现我们自定义的AutoPrefixUrlMapping这个类并调用里面的方法。
 * @author Admin
 * 感觉这个东西是个鸡肋，所以这个东西暂时不用。
 */
//@Component
public class AutoPrefixUrlConfiguration implements WebMvcRegistrations{

	@Override
	public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
		return new AutoPrefixUrlMapping();
	}

}
