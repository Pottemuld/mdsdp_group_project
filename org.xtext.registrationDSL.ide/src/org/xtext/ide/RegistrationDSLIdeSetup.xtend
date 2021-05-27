/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.RegistrationDSLRuntimeModule
import org.xtext.RegistrationDSLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RegistrationDSLIdeSetup extends RegistrationDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RegistrationDSLRuntimeModule, new RegistrationDSLIdeModule))
	}
	
}
