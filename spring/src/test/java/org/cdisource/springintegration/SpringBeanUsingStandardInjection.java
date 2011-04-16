package org.cdisource.springintegration;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringBeanUsingStandardInjection {
		
		NamedCdiBean bean;
		
		@Autowired
		CdiBeanThatHasSpringInjection2 injection;
		
		public void setBean(NamedCdiBean bean) {
			this.bean = bean;
		}

		public void validate() {
			if (bean == null) {
				throw new IllegalStateException("CDI bean is null");
			}
			if (injection == null) {
				throw new IllegalStateException("injection bean is null");
			}

		}
		
}
