package test.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AudienceConfig.class)
public class AudienceTest {

	@Autowired
	public Audience autowired;

	@Autowired
	public Performance performanceModel;

	@Test
	public void testAudience() {
		assertNotNull(autowired);
		performanceModel.perform();
		for (int i = 0; i < 16; i++) {
			Thread th = new Thread() {
				@Override
				public void run() {
					while (1 == 1) {
						System.out.println("hh");
						System.err.println();
					}
				}
			};
			th.start();
		}
		// snew PerformanceModel().perform();
	}
}
