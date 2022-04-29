package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 이 어노테이션이 있으면, 스프링 부트가 구동될 때 이 패키지 하위의 모든 패키지에 어노테이션을 읽어 스프링 빈으로 등록해준다.
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

}
