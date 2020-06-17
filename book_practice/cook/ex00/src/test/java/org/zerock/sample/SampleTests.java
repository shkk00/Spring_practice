package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//  test ���� ��� :  Rus As> Junit Test ��


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")  // spr �����, (classpath: or file:)�� class�� ���ڿ��� bean ���
@Log4j  // log4j ���̺귯���� ���� ����� ������� ��밡�� (src/main/resources, src/test/resources ������ �α� ���� ������ ����)
public class SampleTests {

	
	@Setter(onMethod_ = @Autowired)   // @Autowired : ������ , �ش� bean ���ԵǴ�
	private Restaurant restaurant;
	
	
	@Test  //  ����Ʈ ��� ǥ��
	public void testExist() {
		
		assertNotNull(restaurant);  //  restaurant ���� null�� �ƴ� �� �׽�Ʈ ����

		log.info("---------------- SampleTests ---------------------");
		
		log.info(restaurant);
		
		log.info("-----------------------------------------");
		
		log.info(restaurant.getChef());
		
	}
}
