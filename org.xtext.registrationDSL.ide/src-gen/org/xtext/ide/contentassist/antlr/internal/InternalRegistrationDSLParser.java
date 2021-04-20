package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.RegistrationDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegistrationDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'entity'", "':'", "'attribute'", "'relation'", "'workflow'", "'select'", "'add'", "'to'", "'set'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRegistrationDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRegistrationDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRegistrationDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRegistrationDSL.g"; }


    	private RegistrationDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(RegistrationDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRegistationsystem"
    // InternalRegistrationDSL.g:53:1: entryRuleRegistationsystem : ruleRegistationsystem EOF ;
    public final void entryRuleRegistationsystem() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:54:1: ( ruleRegistationsystem EOF )
            // InternalRegistrationDSL.g:55:1: ruleRegistationsystem EOF
            {
             before(grammarAccess.getRegistationsystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRegistationsystem();

            state._fsp--;

             after(grammarAccess.getRegistationsystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegistationsystem"


    // $ANTLR start "ruleRegistationsystem"
    // InternalRegistrationDSL.g:62:1: ruleRegistationsystem : ( ( rule__Registationsystem__Group__0 ) ) ;
    public final void ruleRegistationsystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:66:2: ( ( ( rule__Registationsystem__Group__0 ) ) )
            // InternalRegistrationDSL.g:67:2: ( ( rule__Registationsystem__Group__0 ) )
            {
            // InternalRegistrationDSL.g:67:2: ( ( rule__Registationsystem__Group__0 ) )
            // InternalRegistrationDSL.g:68:3: ( rule__Registationsystem__Group__0 )
            {
             before(grammarAccess.getRegistationsystemAccess().getGroup()); 
            // InternalRegistrationDSL.g:69:3: ( rule__Registationsystem__Group__0 )
            // InternalRegistrationDSL.g:69:4: rule__Registationsystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Registationsystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegistationsystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegistationsystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRegistrationDSL.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:79:1: ( ruleDeclaration EOF )
            // InternalRegistrationDSL.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRegistrationDSL.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalRegistrationDSL.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalRegistrationDSL.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalRegistrationDSL.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalRegistrationDSL.g:94:3: ( rule__Declaration__Alternatives )
            // InternalRegistrationDSL.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalRegistrationDSL.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:104:1: ( ruleEntity EOF )
            // InternalRegistrationDSL.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRegistrationDSL.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalRegistrationDSL.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalRegistrationDSL.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalRegistrationDSL.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalRegistrationDSL.g:119:3: ( rule__Entity__Group__0 )
            // InternalRegistrationDSL.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalRegistrationDSL.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:129:1: ( ruleField EOF )
            // InternalRegistrationDSL.g:130:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRegistrationDSL.g:137:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:141:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalRegistrationDSL.g:142:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalRegistrationDSL.g:142:2: ( ( rule__Field__Alternatives ) )
            // InternalRegistrationDSL.g:143:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalRegistrationDSL.g:144:3: ( rule__Field__Alternatives )
            // InternalRegistrationDSL.g:144:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleAttribute"
    // InternalRegistrationDSL.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:154:1: ( ruleAttribute EOF )
            // InternalRegistrationDSL.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRegistrationDSL.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalRegistrationDSL.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalRegistrationDSL.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalRegistrationDSL.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalRegistrationDSL.g:169:3: ( rule__Attribute__Group__0 )
            // InternalRegistrationDSL.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalRegistrationDSL.g:178:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:179:1: ( ruleRelation EOF )
            // InternalRegistrationDSL.g:180:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalRegistrationDSL.g:187:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:191:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalRegistrationDSL.g:192:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalRegistrationDSL.g:192:2: ( ( rule__Relation__Group__0 ) )
            // InternalRegistrationDSL.g:193:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalRegistrationDSL.g:194:3: ( rule__Relation__Group__0 )
            // InternalRegistrationDSL.g:194:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleWorkflow"
    // InternalRegistrationDSL.g:203:1: entryRuleWorkflow : ruleWorkflow EOF ;
    public final void entryRuleWorkflow() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:204:1: ( ruleWorkflow EOF )
            // InternalRegistrationDSL.g:205:1: ruleWorkflow EOF
            {
             before(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkflow();

            state._fsp--;

             after(grammarAccess.getWorkflowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalRegistrationDSL.g:212:1: ruleWorkflow : ( ( rule__Workflow__Group__0 ) ) ;
    public final void ruleWorkflow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:216:2: ( ( ( rule__Workflow__Group__0 ) ) )
            // InternalRegistrationDSL.g:217:2: ( ( rule__Workflow__Group__0 ) )
            {
            // InternalRegistrationDSL.g:217:2: ( ( rule__Workflow__Group__0 ) )
            // InternalRegistrationDSL.g:218:3: ( rule__Workflow__Group__0 )
            {
             before(grammarAccess.getWorkflowAccess().getGroup()); 
            // InternalRegistrationDSL.g:219:3: ( rule__Workflow__Group__0 )
            // InternalRegistrationDSL.g:219:4: rule__Workflow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleStatement"
    // InternalRegistrationDSL.g:228:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:229:1: ( ruleStatement EOF )
            // InternalRegistrationDSL.g:230:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRegistrationDSL.g:237:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:241:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRegistrationDSL.g:242:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRegistrationDSL.g:242:2: ( ( rule__Statement__Alternatives ) )
            // InternalRegistrationDSL.g:243:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRegistrationDSL.g:244:3: ( rule__Statement__Alternatives )
            // InternalRegistrationDSL.g:244:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSelect"
    // InternalRegistrationDSL.g:253:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:254:1: ( ruleSelect EOF )
            // InternalRegistrationDSL.g:255:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalRegistrationDSL.g:262:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:266:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalRegistrationDSL.g:267:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalRegistrationDSL.g:267:2: ( ( rule__Select__Group__0 ) )
            // InternalRegistrationDSL.g:268:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalRegistrationDSL.g:269:3: ( rule__Select__Group__0 )
            // InternalRegistrationDSL.g:269:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleAdd"
    // InternalRegistrationDSL.g:278:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:279:1: ( ruleAdd EOF )
            // InternalRegistrationDSL.g:280:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalRegistrationDSL.g:287:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:291:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalRegistrationDSL.g:292:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalRegistrationDSL.g:292:2: ( ( rule__Add__Group__0 ) )
            // InternalRegistrationDSL.g:293:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalRegistrationDSL.g:294:3: ( rule__Add__Group__0 )
            // InternalRegistrationDSL.g:294:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleSet"
    // InternalRegistrationDSL.g:303:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalRegistrationDSL.g:304:1: ( ruleSet EOF )
            // InternalRegistrationDSL.g:305:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalRegistrationDSL.g:312:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:316:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalRegistrationDSL.g:317:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalRegistrationDSL.g:317:2: ( ( rule__Set__Group__0 ) )
            // InternalRegistrationDSL.g:318:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalRegistrationDSL.g:319:3: ( rule__Set__Group__0 )
            // InternalRegistrationDSL.g:319:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRegistrationDSL.g:327:1: rule__Declaration__Alternatives : ( ( ruleEntity ) | ( ruleWorkflow ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:331:1: ( ( ruleEntity ) | ( ruleWorkflow ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRegistrationDSL.g:332:2: ( ruleEntity )
                    {
                    // InternalRegistrationDSL.g:332:2: ( ruleEntity )
                    // InternalRegistrationDSL.g:333:3: ruleEntity
                    {
                     before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:338:2: ( ruleWorkflow )
                    {
                    // InternalRegistrationDSL.g:338:2: ( ruleWorkflow )
                    // InternalRegistrationDSL.g:339:3: ruleWorkflow
                    {
                     before(grammarAccess.getDeclarationAccess().getWorkflowParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkflow();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getWorkflowParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Field__Alternatives"
    // InternalRegistrationDSL.g:348:1: rule__Field__Alternatives : ( ( ruleAttribute ) | ( ruleRelation ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:352:1: ( ( ruleAttribute ) | ( ruleRelation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRegistrationDSL.g:353:2: ( ruleAttribute )
                    {
                    // InternalRegistrationDSL.g:353:2: ( ruleAttribute )
                    // InternalRegistrationDSL.g:354:3: ruleAttribute
                    {
                     before(grammarAccess.getFieldAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:359:2: ( ruleRelation )
                    {
                    // InternalRegistrationDSL.g:359:2: ( ruleRelation )
                    // InternalRegistrationDSL.g:360:3: ruleRelation
                    {
                     before(grammarAccess.getFieldAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getRelationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRegistrationDSL.g:369:1: rule__Statement__Alternatives : ( ( ruleSelect ) | ( ruleAdd ) | ( ruleSet ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:373:1: ( ( ruleSelect ) | ( ruleAdd ) | ( ruleSet ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRegistrationDSL.g:374:2: ( ruleSelect )
                    {
                    // InternalRegistrationDSL.g:374:2: ( ruleSelect )
                    // InternalRegistrationDSL.g:375:3: ruleSelect
                    {
                     before(grammarAccess.getStatementAccess().getSelectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:380:2: ( ruleAdd )
                    {
                    // InternalRegistrationDSL.g:380:2: ( ruleAdd )
                    // InternalRegistrationDSL.g:381:3: ruleAdd
                    {
                     before(grammarAccess.getStatementAccess().getAddParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAddParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:386:2: ( ruleSet )
                    {
                    // InternalRegistrationDSL.g:386:2: ( ruleSet )
                    // InternalRegistrationDSL.g:387:3: ruleSet
                    {
                     before(grammarAccess.getStatementAccess().getSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSet();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSetParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Registationsystem__Group__0"
    // InternalRegistrationDSL.g:396:1: rule__Registationsystem__Group__0 : rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1 ;
    public final void rule__Registationsystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:400:1: ( rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1 )
            // InternalRegistrationDSL.g:401:2: rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Registationsystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registationsystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__0"


    // $ANTLR start "rule__Registationsystem__Group__0__Impl"
    // InternalRegistrationDSL.g:408:1: rule__Registationsystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__Registationsystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:412:1: ( ( 'system' ) )
            // InternalRegistrationDSL.g:413:1: ( 'system' )
            {
            // InternalRegistrationDSL.g:413:1: ( 'system' )
            // InternalRegistrationDSL.g:414:2: 'system'
            {
             before(grammarAccess.getRegistationsystemAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRegistationsystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__0__Impl"


    // $ANTLR start "rule__Registationsystem__Group__1"
    // InternalRegistrationDSL.g:423:1: rule__Registationsystem__Group__1 : rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2 ;
    public final void rule__Registationsystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:427:1: ( rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2 )
            // InternalRegistrationDSL.g:428:2: rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Registationsystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registationsystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__1"


    // $ANTLR start "rule__Registationsystem__Group__1__Impl"
    // InternalRegistrationDSL.g:435:1: rule__Registationsystem__Group__1__Impl : ( ( rule__Registationsystem__NameAssignment_1 ) ) ;
    public final void rule__Registationsystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:439:1: ( ( ( rule__Registationsystem__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:440:1: ( ( rule__Registationsystem__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:440:1: ( ( rule__Registationsystem__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:441:2: ( rule__Registationsystem__NameAssignment_1 )
            {
             before(grammarAccess.getRegistationsystemAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:442:2: ( rule__Registationsystem__NameAssignment_1 )
            // InternalRegistrationDSL.g:442:3: rule__Registationsystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Registationsystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegistationsystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__1__Impl"


    // $ANTLR start "rule__Registationsystem__Group__2"
    // InternalRegistrationDSL.g:450:1: rule__Registationsystem__Group__2 : rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3 ;
    public final void rule__Registationsystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:454:1: ( rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3 )
            // InternalRegistrationDSL.g:455:2: rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Registationsystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registationsystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__2"


    // $ANTLR start "rule__Registationsystem__Group__2__Impl"
    // InternalRegistrationDSL.g:462:1: rule__Registationsystem__Group__2__Impl : ( '{' ) ;
    public final void rule__Registationsystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:466:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:467:1: ( '{' )
            {
            // InternalRegistrationDSL.g:467:1: ( '{' )
            // InternalRegistrationDSL.g:468:2: '{'
            {
             before(grammarAccess.getRegistationsystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRegistationsystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__2__Impl"


    // $ANTLR start "rule__Registationsystem__Group__3"
    // InternalRegistrationDSL.g:477:1: rule__Registationsystem__Group__3 : rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4 ;
    public final void rule__Registationsystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:481:1: ( rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4 )
            // InternalRegistrationDSL.g:482:2: rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Registationsystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registationsystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__3"


    // $ANTLR start "rule__Registationsystem__Group__3__Impl"
    // InternalRegistrationDSL.g:489:1: rule__Registationsystem__Group__3__Impl : ( ( rule__Registationsystem__DeclarationsAssignment_3 )* ) ;
    public final void rule__Registationsystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:493:1: ( ( ( rule__Registationsystem__DeclarationsAssignment_3 )* ) )
            // InternalRegistrationDSL.g:494:1: ( ( rule__Registationsystem__DeclarationsAssignment_3 )* )
            {
            // InternalRegistrationDSL.g:494:1: ( ( rule__Registationsystem__DeclarationsAssignment_3 )* )
            // InternalRegistrationDSL.g:495:2: ( rule__Registationsystem__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3()); 
            // InternalRegistrationDSL.g:496:2: ( rule__Registationsystem__DeclarationsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRegistrationDSL.g:496:3: rule__Registationsystem__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Registationsystem__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__3__Impl"


    // $ANTLR start "rule__Registationsystem__Group__4"
    // InternalRegistrationDSL.g:504:1: rule__Registationsystem__Group__4 : rule__Registationsystem__Group__4__Impl ;
    public final void rule__Registationsystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:508:1: ( rule__Registationsystem__Group__4__Impl )
            // InternalRegistrationDSL.g:509:2: rule__Registationsystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Registationsystem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__4"


    // $ANTLR start "rule__Registationsystem__Group__4__Impl"
    // InternalRegistrationDSL.g:515:1: rule__Registationsystem__Group__4__Impl : ( '}' ) ;
    public final void rule__Registationsystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:519:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:520:1: ( '}' )
            {
            // InternalRegistrationDSL.g:520:1: ( '}' )
            // InternalRegistrationDSL.g:521:2: '}'
            {
             before(grammarAccess.getRegistationsystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRegistationsystemAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalRegistrationDSL.g:531:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:535:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRegistrationDSL.g:536:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalRegistrationDSL.g:543:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:547:1: ( ( 'entity' ) )
            // InternalRegistrationDSL.g:548:1: ( 'entity' )
            {
            // InternalRegistrationDSL.g:548:1: ( 'entity' )
            // InternalRegistrationDSL.g:549:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalRegistrationDSL.g:558:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:562:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRegistrationDSL.g:563:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalRegistrationDSL.g:570:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:574:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:575:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:575:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:576:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:577:2: ( rule__Entity__NameAssignment_1 )
            // InternalRegistrationDSL.g:577:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalRegistrationDSL.g:585:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:589:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRegistrationDSL.g:590:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalRegistrationDSL.g:597:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:601:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalRegistrationDSL.g:602:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalRegistrationDSL.g:602:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalRegistrationDSL.g:603:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalRegistrationDSL.g:604:2: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRegistrationDSL.g:604:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalRegistrationDSL.g:612:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:616:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRegistrationDSL.g:617:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalRegistrationDSL.g:624:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:628:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:629:1: ( '{' )
            {
            // InternalRegistrationDSL.g:629:1: ( '{' )
            // InternalRegistrationDSL.g:630:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalRegistrationDSL.g:639:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:643:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalRegistrationDSL.g:644:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalRegistrationDSL.g:651:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:655:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // InternalRegistrationDSL.g:656:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // InternalRegistrationDSL.g:656:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // InternalRegistrationDSL.g:657:2: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // InternalRegistrationDSL.g:658:2: ( rule__Entity__FieldsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRegistrationDSL.g:658:3: rule__Entity__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalRegistrationDSL.g:666:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:670:1: ( rule__Entity__Group__5__Impl )
            // InternalRegistrationDSL.g:671:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalRegistrationDSL.g:677:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:681:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:682:1: ( '}' )
            {
            // InternalRegistrationDSL.g:682:1: ( '}' )
            // InternalRegistrationDSL.g:683:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalRegistrationDSL.g:693:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:697:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalRegistrationDSL.g:698:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalRegistrationDSL.g:705:1: rule__Entity__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:709:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:710:1: ( ':' )
            {
            // InternalRegistrationDSL.g:710:1: ( ':' )
            // InternalRegistrationDSL.g:711:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalRegistrationDSL.g:720:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:724:1: ( rule__Entity__Group_2__1__Impl )
            // InternalRegistrationDSL.g:725:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalRegistrationDSL.g:731:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__BaseAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:735:1: ( ( ( rule__Entity__BaseAssignment_2_1 ) ) )
            // InternalRegistrationDSL.g:736:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            {
            // InternalRegistrationDSL.g:736:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            // InternalRegistrationDSL.g:737:2: ( rule__Entity__BaseAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); 
            // InternalRegistrationDSL.g:738:2: ( rule__Entity__BaseAssignment_2_1 )
            // InternalRegistrationDSL.g:738:3: rule__Entity__BaseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__BaseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalRegistrationDSL.g:747:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:751:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRegistrationDSL.g:752:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalRegistrationDSL.g:759:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:763:1: ( ( 'attribute' ) )
            // InternalRegistrationDSL.g:764:1: ( 'attribute' )
            {
            // InternalRegistrationDSL.g:764:1: ( 'attribute' )
            // InternalRegistrationDSL.g:765:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalRegistrationDSL.g:774:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:778:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRegistrationDSL.g:779:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalRegistrationDSL.g:786:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:790:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:791:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:791:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:792:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:793:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRegistrationDSL.g:793:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalRegistrationDSL.g:801:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:805:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalRegistrationDSL.g:806:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalRegistrationDSL.g:813:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:817:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:818:1: ( ':' )
            {
            // InternalRegistrationDSL.g:818:1: ( ':' )
            // InternalRegistrationDSL.g:819:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalRegistrationDSL.g:828:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:832:1: ( rule__Attribute__Group__3__Impl )
            // InternalRegistrationDSL.g:833:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalRegistrationDSL.g:839:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:843:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalRegistrationDSL.g:844:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:844:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalRegistrationDSL.g:845:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalRegistrationDSL.g:846:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalRegistrationDSL.g:846:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalRegistrationDSL.g:855:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:859:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalRegistrationDSL.g:860:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalRegistrationDSL.g:867:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:871:1: ( ( 'relation' ) )
            // InternalRegistrationDSL.g:872:1: ( 'relation' )
            {
            // InternalRegistrationDSL.g:872:1: ( 'relation' )
            // InternalRegistrationDSL.g:873:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalRegistrationDSL.g:882:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:886:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalRegistrationDSL.g:887:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalRegistrationDSL.g:894:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:898:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:899:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:899:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:900:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:901:2: ( rule__Relation__NameAssignment_1 )
            // InternalRegistrationDSL.g:901:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalRegistrationDSL.g:909:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:913:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalRegistrationDSL.g:914:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalRegistrationDSL.g:921:1: rule__Relation__Group__2__Impl : ( ':' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:925:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:926:1: ( ':' )
            {
            // InternalRegistrationDSL.g:926:1: ( ':' )
            // InternalRegistrationDSL.g:927:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalRegistrationDSL.g:936:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:940:1: ( rule__Relation__Group__3__Impl )
            // InternalRegistrationDSL.g:941:2: rule__Relation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalRegistrationDSL.g:947:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__TargetAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:951:1: ( ( ( rule__Relation__TargetAssignment_3 ) ) )
            // InternalRegistrationDSL.g:952:1: ( ( rule__Relation__TargetAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:952:1: ( ( rule__Relation__TargetAssignment_3 ) )
            // InternalRegistrationDSL.g:953:2: ( rule__Relation__TargetAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_3()); 
            // InternalRegistrationDSL.g:954:2: ( rule__Relation__TargetAssignment_3 )
            // InternalRegistrationDSL.g:954:3: rule__Relation__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTargetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Workflow__Group__0"
    // InternalRegistrationDSL.g:963:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:967:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalRegistrationDSL.g:968:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Workflow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__0"


    // $ANTLR start "rule__Workflow__Group__0__Impl"
    // InternalRegistrationDSL.g:975:1: rule__Workflow__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:979:1: ( ( 'workflow' ) )
            // InternalRegistrationDSL.g:980:1: ( 'workflow' )
            {
            // InternalRegistrationDSL.g:980:1: ( 'workflow' )
            // InternalRegistrationDSL.g:981:2: 'workflow'
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__0__Impl"


    // $ANTLR start "rule__Workflow__Group__1"
    // InternalRegistrationDSL.g:990:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:994:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalRegistrationDSL.g:995:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Workflow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__1"


    // $ANTLR start "rule__Workflow__Group__1__Impl"
    // InternalRegistrationDSL.g:1002:1: rule__Workflow__Group__1__Impl : ( ( rule__Workflow__NameAssignment_1 ) ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1006:1: ( ( ( rule__Workflow__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:1007:1: ( ( rule__Workflow__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:1007:1: ( ( rule__Workflow__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:1008:2: ( rule__Workflow__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:1009:2: ( rule__Workflow__NameAssignment_1 )
            // InternalRegistrationDSL.g:1009:3: rule__Workflow__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__1__Impl"


    // $ANTLR start "rule__Workflow__Group__2"
    // InternalRegistrationDSL.g:1017:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1021:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalRegistrationDSL.g:1022:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Workflow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__2"


    // $ANTLR start "rule__Workflow__Group__2__Impl"
    // InternalRegistrationDSL.g:1029:1: rule__Workflow__Group__2__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1033:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:1034:1: ( '{' )
            {
            // InternalRegistrationDSL.g:1034:1: ( '{' )
            // InternalRegistrationDSL.g:1035:2: '{'
            {
             before(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__2__Impl"


    // $ANTLR start "rule__Workflow__Group__3"
    // InternalRegistrationDSL.g:1044:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1048:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalRegistrationDSL.g:1049:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Workflow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__3"


    // $ANTLR start "rule__Workflow__Group__3__Impl"
    // InternalRegistrationDSL.g:1056:1: rule__Workflow__Group__3__Impl : ( ( rule__Workflow__StatementsAssignment_3 )* ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1060:1: ( ( ( rule__Workflow__StatementsAssignment_3 )* ) )
            // InternalRegistrationDSL.g:1061:1: ( ( rule__Workflow__StatementsAssignment_3 )* )
            {
            // InternalRegistrationDSL.g:1061:1: ( ( rule__Workflow__StatementsAssignment_3 )* )
            // InternalRegistrationDSL.g:1062:2: ( rule__Workflow__StatementsAssignment_3 )*
            {
             before(grammarAccess.getWorkflowAccess().getStatementsAssignment_3()); 
            // InternalRegistrationDSL.g:1063:2: ( rule__Workflow__StatementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1063:3: rule__Workflow__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Workflow__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWorkflowAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__3__Impl"


    // $ANTLR start "rule__Workflow__Group__4"
    // InternalRegistrationDSL.g:1071:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1075:1: ( rule__Workflow__Group__4__Impl )
            // InternalRegistrationDSL.g:1076:2: rule__Workflow__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__4"


    // $ANTLR start "rule__Workflow__Group__4__Impl"
    // InternalRegistrationDSL.g:1082:1: rule__Workflow__Group__4__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1086:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:1087:1: ( '}' )
            {
            // InternalRegistrationDSL.g:1087:1: ( '}' )
            // InternalRegistrationDSL.g:1088:2: '}'
            {
             before(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__4__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalRegistrationDSL.g:1098:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1102:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalRegistrationDSL.g:1103:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalRegistrationDSL.g:1110:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1114:1: ( ( 'select' ) )
            // InternalRegistrationDSL.g:1115:1: ( 'select' )
            {
            // InternalRegistrationDSL.g:1115:1: ( 'select' )
            // InternalRegistrationDSL.g:1116:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalRegistrationDSL.g:1125:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1129:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalRegistrationDSL.g:1130:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalRegistrationDSL.g:1137:1: rule__Select__Group__1__Impl : ( ( rule__Select__SelecttypeAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1141:1: ( ( ( rule__Select__SelecttypeAssignment_1 ) ) )
            // InternalRegistrationDSL.g:1142:1: ( ( rule__Select__SelecttypeAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:1142:1: ( ( rule__Select__SelecttypeAssignment_1 ) )
            // InternalRegistrationDSL.g:1143:2: ( rule__Select__SelecttypeAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getSelecttypeAssignment_1()); 
            // InternalRegistrationDSL.g:1144:2: ( rule__Select__SelecttypeAssignment_1 )
            // InternalRegistrationDSL.g:1144:3: rule__Select__SelecttypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelecttypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelecttypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalRegistrationDSL.g:1152:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1156:1: ( rule__Select__Group__2__Impl )
            // InternalRegistrationDSL.g:1157:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalRegistrationDSL.g:1163:1: rule__Select__Group__2__Impl : ( ( rule__Select__EntityNameAssignment_2 ) ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1167:1: ( ( ( rule__Select__EntityNameAssignment_2 ) ) )
            // InternalRegistrationDSL.g:1168:1: ( ( rule__Select__EntityNameAssignment_2 ) )
            {
            // InternalRegistrationDSL.g:1168:1: ( ( rule__Select__EntityNameAssignment_2 ) )
            // InternalRegistrationDSL.g:1169:2: ( rule__Select__EntityNameAssignment_2 )
            {
             before(grammarAccess.getSelectAccess().getEntityNameAssignment_2()); 
            // InternalRegistrationDSL.g:1170:2: ( rule__Select__EntityNameAssignment_2 )
            // InternalRegistrationDSL.g:1170:3: rule__Select__EntityNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Select__EntityNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getEntityNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalRegistrationDSL.g:1179:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1183:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalRegistrationDSL.g:1184:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalRegistrationDSL.g:1191:1: rule__Add__Group__0__Impl : ( 'add' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1195:1: ( ( 'add' ) )
            // InternalRegistrationDSL.g:1196:1: ( 'add' )
            {
            // InternalRegistrationDSL.g:1196:1: ( 'add' )
            // InternalRegistrationDSL.g:1197:2: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalRegistrationDSL.g:1206:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1210:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalRegistrationDSL.g:1211:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Add__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalRegistrationDSL.g:1218:1: rule__Add__Group__1__Impl : ( ( rule__Add__SelectedEntityNameAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1222:1: ( ( ( rule__Add__SelectedEntityNameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:1223:1: ( ( rule__Add__SelectedEntityNameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:1223:1: ( ( rule__Add__SelectedEntityNameAssignment_1 ) )
            // InternalRegistrationDSL.g:1224:2: ( rule__Add__SelectedEntityNameAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getSelectedEntityNameAssignment_1()); 
            // InternalRegistrationDSL.g:1225:2: ( rule__Add__SelectedEntityNameAssignment_1 )
            // InternalRegistrationDSL.g:1225:3: rule__Add__SelectedEntityNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__SelectedEntityNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getSelectedEntityNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__2"
    // InternalRegistrationDSL.g:1233:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1237:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalRegistrationDSL.g:1238:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Add__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2"


    // $ANTLR start "rule__Add__Group__2__Impl"
    // InternalRegistrationDSL.g:1245:1: rule__Add__Group__2__Impl : ( 'to' ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1249:1: ( ( 'to' ) )
            // InternalRegistrationDSL.g:1250:1: ( 'to' )
            {
            // InternalRegistrationDSL.g:1250:1: ( 'to' )
            // InternalRegistrationDSL.g:1251:2: 'to'
            {
             before(grammarAccess.getAddAccess().getToKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__3"
    // InternalRegistrationDSL.g:1260:1: rule__Add__Group__3 : rule__Add__Group__3__Impl ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1264:1: ( rule__Add__Group__3__Impl )
            // InternalRegistrationDSL.g:1265:2: rule__Add__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__3"


    // $ANTLR start "rule__Add__Group__3__Impl"
    // InternalRegistrationDSL.g:1271:1: rule__Add__Group__3__Impl : ( ( rule__Add__ToEntityRelationAssignment_3 ) ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1275:1: ( ( ( rule__Add__ToEntityRelationAssignment_3 ) ) )
            // InternalRegistrationDSL.g:1276:1: ( ( rule__Add__ToEntityRelationAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:1276:1: ( ( rule__Add__ToEntityRelationAssignment_3 ) )
            // InternalRegistrationDSL.g:1277:2: ( rule__Add__ToEntityRelationAssignment_3 )
            {
             before(grammarAccess.getAddAccess().getToEntityRelationAssignment_3()); 
            // InternalRegistrationDSL.g:1278:2: ( rule__Add__ToEntityRelationAssignment_3 )
            // InternalRegistrationDSL.g:1278:3: rule__Add__ToEntityRelationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Add__ToEntityRelationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getToEntityRelationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__3__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalRegistrationDSL.g:1287:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1291:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalRegistrationDSL.g:1292:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalRegistrationDSL.g:1299:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1303:1: ( ( 'set' ) )
            // InternalRegistrationDSL.g:1304:1: ( 'set' )
            {
            // InternalRegistrationDSL.g:1304:1: ( 'set' )
            // InternalRegistrationDSL.g:1305:2: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalRegistrationDSL.g:1314:1: rule__Set__Group__1 : rule__Set__Group__1__Impl ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1318:1: ( rule__Set__Group__1__Impl )
            // InternalRegistrationDSL.g:1319:2: rule__Set__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalRegistrationDSL.g:1325:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1329:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:1330:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:1330:1: ( ( rule__Set__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:1331:2: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:1332:2: ( rule__Set__NameAssignment_1 )
            // InternalRegistrationDSL.g:1332:3: rule__Set__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Registationsystem__NameAssignment_1"
    // InternalRegistrationDSL.g:1341:1: rule__Registationsystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Registationsystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1345:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1346:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1346:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1347:3: RULE_ID
            {
             before(grammarAccess.getRegistationsystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegistationsystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__NameAssignment_1"


    // $ANTLR start "rule__Registationsystem__DeclarationsAssignment_3"
    // InternalRegistrationDSL.g:1356:1: rule__Registationsystem__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Registationsystem__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1360:1: ( ( ruleDeclaration ) )
            // InternalRegistrationDSL.g:1361:2: ( ruleDeclaration )
            {
            // InternalRegistrationDSL.g:1361:2: ( ruleDeclaration )
            // InternalRegistrationDSL.g:1362:3: ruleDeclaration
            {
             before(grammarAccess.getRegistationsystemAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getRegistationsystemAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registationsystem__DeclarationsAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalRegistrationDSL.g:1371:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1375:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1376:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1376:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1377:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__BaseAssignment_2_1"
    // InternalRegistrationDSL.g:1386:1: rule__Entity__BaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__BaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1390:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1391:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1391:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1392:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); 
            // InternalRegistrationDSL.g:1393:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1394:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getBaseEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getBaseEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__BaseAssignment_2_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_4"
    // InternalRegistrationDSL.g:1405:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1409:1: ( ( ruleField ) )
            // InternalRegistrationDSL.g:1410:2: ( ruleField )
            {
            // InternalRegistrationDSL.g:1410:2: ( ruleField )
            // InternalRegistrationDSL.g:1411:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalRegistrationDSL.g:1420:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1424:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1425:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1425:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1426:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalRegistrationDSL.g:1435:1: rule__Attribute__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1439:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1440:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1440:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1441:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalRegistrationDSL.g:1450:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1454:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1455:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1455:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1456:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__TargetAssignment_3"
    // InternalRegistrationDSL.g:1465:1: rule__Relation__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1469:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1470:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1470:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1471:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0()); 
            // InternalRegistrationDSL.g:1472:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1473:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TargetAssignment_3"


    // $ANTLR start "rule__Workflow__NameAssignment_1"
    // InternalRegistrationDSL.g:1484:1: rule__Workflow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Workflow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1488:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1489:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1489:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1490:3: RULE_ID
            {
             before(grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__NameAssignment_1"


    // $ANTLR start "rule__Workflow__StatementsAssignment_3"
    // InternalRegistrationDSL.g:1499:1: rule__Workflow__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Workflow__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1503:1: ( ( ruleStatement ) )
            // InternalRegistrationDSL.g:1504:2: ( ruleStatement )
            {
            // InternalRegistrationDSL.g:1504:2: ( ruleStatement )
            // InternalRegistrationDSL.g:1505:3: ruleStatement
            {
             before(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__StatementsAssignment_3"


    // $ANTLR start "rule__Select__SelecttypeAssignment_1"
    // InternalRegistrationDSL.g:1514:1: rule__Select__SelecttypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Select__SelecttypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1518:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1519:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1519:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1520:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectAccess().getSelecttypeEntityCrossReference_1_0()); 
            // InternalRegistrationDSL.g:1521:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1522:4: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getSelecttypeEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelecttypeEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSelectAccess().getSelecttypeEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelecttypeAssignment_1"


    // $ANTLR start "rule__Select__EntityNameAssignment_2"
    // InternalRegistrationDSL.g:1533:1: rule__Select__EntityNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Select__EntityNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1537:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1538:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1538:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1539:3: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__EntityNameAssignment_2"


    // $ANTLR start "rule__Add__SelectedEntityNameAssignment_1"
    // InternalRegistrationDSL.g:1548:1: rule__Add__SelectedEntityNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Add__SelectedEntityNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1552:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1553:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1553:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1554:3: RULE_ID
            {
             before(grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__SelectedEntityNameAssignment_1"


    // $ANTLR start "rule__Add__ToEntityRelationAssignment_3"
    // InternalRegistrationDSL.g:1563:1: rule__Add__ToEntityRelationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Add__ToEntityRelationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1567:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1568:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1568:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1569:3: ( RULE_ID )
            {
             before(grammarAccess.getAddAccess().getToEntityRelationRelationCrossReference_3_0()); 
            // InternalRegistrationDSL.g:1570:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1571:4: RULE_ID
            {
             before(grammarAccess.getAddAccess().getToEntityRelationRelationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getToEntityRelationRelationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddAccess().getToEntityRelationRelationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ToEntityRelationAssignment_3"


    // $ANTLR start "rule__Set__NameAssignment_1"
    // InternalRegistrationDSL.g:1582:1: rule__Set__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1586:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1587:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1587:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1588:3: RULE_ID
            {
             before(grammarAccess.getSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000582000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000580002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}