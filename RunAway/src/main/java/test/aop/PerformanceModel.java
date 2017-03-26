package test.aop;

import org.springframework.stereotype.Component;

public class PerformanceModel implements Performance{

	public void perform() {
		System.out.println("Perform call");
	}

}
