package hello.core;

import hello.core.scan.filter.BeanB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = CoreApplicationTests.class)
class CoreApplicationTests {

	@Test
	void contextLoads() {


	}

}
