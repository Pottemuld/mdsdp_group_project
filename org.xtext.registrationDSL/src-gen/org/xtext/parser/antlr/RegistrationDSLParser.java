/*
 * generated by Xtext 2.25.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalRegistrationDSLParser;
import org.xtext.services.RegistrationDSLGrammarAccess;

public class RegistrationDSLParser extends AbstractAntlrParser {

	@Inject
	private RegistrationDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRegistrationDSLParser createParser(XtextTokenStream stream) {
		return new InternalRegistrationDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Registationsystem";
	}

	public RegistrationDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RegistrationDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
