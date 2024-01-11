/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import mongoDBDSL.ui.internal.MongoDBDSLActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MongoDBDSLActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MongoDBDSLActivator activator = MongoDBDSLActivator.getInstance();
		return activator != null ? activator.getInjector(MongoDBDSLActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}
