package AOP.AspectJAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("aopServiceImpl")
public class AopServiceImpl implements IAopService {
	public void withAop() throws Exception {
		System.out.println("业务逻辑处理中");
	}
}
