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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'entity'", "':'", "'attribute'", "'relation'", "'workflow'", "'select'", "'add'", "'to'", "'.'"
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


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRegistrationDSL.g:302:1: rule__Declaration__Alternatives : ( ( ruleEntity ) | ( ruleWorkflow ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:306:1: ( ( ruleEntity ) | ( ruleWorkflow ) )
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
                    // InternalRegistrationDSL.g:307:2: ( ruleEntity )
                    {
                    // InternalRegistrationDSL.g:307:2: ( ruleEntity )
                    // InternalRegistrationDSL.g:308:3: ruleEntity
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
                    // InternalRegistrationDSL.g:313:2: ( ruleWorkflow )
                    {
                    // InternalRegistrationDSL.g:313:2: ( ruleWorkflow )
                    // InternalRegistrationDSL.g:314:3: ruleWorkflow
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
    // InternalRegistrationDSL.g:323:1: rule__Field__Alternatives : ( ( ruleAttribute ) | ( ruleRelation ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:327:1: ( ( ruleAttribute ) | ( ruleRelation ) )
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
                    // InternalRegistrationDSL.g:328:2: ( ruleAttribute )
                    {
                    // InternalRegistrationDSL.g:328:2: ( ruleAttribute )
                    // InternalRegistrationDSL.g:329:3: ruleAttribute
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
                    // InternalRegistrationDSL.g:334:2: ( ruleRelation )
                    {
                    // InternalRegistrationDSL.g:334:2: ( ruleRelation )
                    // InternalRegistrationDSL.g:335:3: ruleRelation
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
    // InternalRegistrationDSL.g:344:1: rule__Statement__Alternatives : ( ( ruleSelect ) | ( ruleAdd ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:348:1: ( ( ruleSelect ) | ( ruleAdd ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRegistrationDSL.g:349:2: ( ruleSelect )
                    {
                    // InternalRegistrationDSL.g:349:2: ( ruleSelect )
                    // InternalRegistrationDSL.g:350:3: ruleSelect
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
                    // InternalRegistrationDSL.g:355:2: ( ruleAdd )
                    {
                    // InternalRegistrationDSL.g:355:2: ( ruleAdd )
                    // InternalRegistrationDSL.g:356:3: ruleAdd
                    {
                     before(grammarAccess.getStatementAccess().getAddParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAddParserRuleCall_1()); 

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
    // InternalRegistrationDSL.g:365:1: rule__Registationsystem__Group__0 : rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1 ;
    public final void rule__Registationsystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:369:1: ( rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1 )
            // InternalRegistrationDSL.g:370:2: rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1
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
    // InternalRegistrationDSL.g:377:1: rule__Registationsystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__Registationsystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:381:1: ( ( 'system' ) )
            // InternalRegistrationDSL.g:382:1: ( 'system' )
            {
            // InternalRegistrationDSL.g:382:1: ( 'system' )
            // InternalRegistrationDSL.g:383:2: 'system'
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
    // InternalRegistrationDSL.g:392:1: rule__Registationsystem__Group__1 : rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2 ;
    public final void rule__Registationsystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:396:1: ( rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2 )
            // InternalRegistrationDSL.g:397:2: rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2
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
    // InternalRegistrationDSL.g:404:1: rule__Registationsystem__Group__1__Impl : ( ( rule__Registationsystem__NameAssignment_1 ) ) ;
    public final void rule__Registationsystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:408:1: ( ( ( rule__Registationsystem__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:409:1: ( ( rule__Registationsystem__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:409:1: ( ( rule__Registationsystem__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:410:2: ( rule__Registationsystem__NameAssignment_1 )
            {
             before(grammarAccess.getRegistationsystemAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:411:2: ( rule__Registationsystem__NameAssignment_1 )
            // InternalRegistrationDSL.g:411:3: rule__Registationsystem__NameAssignment_1
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
    // InternalRegistrationDSL.g:419:1: rule__Registationsystem__Group__2 : rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3 ;
    public final void rule__Registationsystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:423:1: ( rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3 )
            // InternalRegistrationDSL.g:424:2: rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3
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
    // InternalRegistrationDSL.g:431:1: rule__Registationsystem__Group__2__Impl : ( '{' ) ;
    public final void rule__Registationsystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:435:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:436:1: ( '{' )
            {
            // InternalRegistrationDSL.g:436:1: ( '{' )
            // InternalRegistrationDSL.g:437:2: '{'
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
    // InternalRegistrationDSL.g:446:1: rule__Registationsystem__Group__3 : rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4 ;
    public final void rule__Registationsystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:450:1: ( rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4 )
            // InternalRegistrationDSL.g:451:2: rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4
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
    // InternalRegistrationDSL.g:458:1: rule__Registationsystem__Group__3__Impl : ( ( rule__Registationsystem__DeclarationsAssignment_3 )* ) ;
    public final void rule__Registationsystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:462:1: ( ( ( rule__Registationsystem__DeclarationsAssignment_3 )* ) )
            // InternalRegistrationDSL.g:463:1: ( ( rule__Registationsystem__DeclarationsAssignment_3 )* )
            {
            // InternalRegistrationDSL.g:463:1: ( ( rule__Registationsystem__DeclarationsAssignment_3 )* )
            // InternalRegistrationDSL.g:464:2: ( rule__Registationsystem__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3()); 
            // InternalRegistrationDSL.g:465:2: ( rule__Registationsystem__DeclarationsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRegistrationDSL.g:465:3: rule__Registationsystem__DeclarationsAssignment_3
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
    // InternalRegistrationDSL.g:473:1: rule__Registationsystem__Group__4 : rule__Registationsystem__Group__4__Impl ;
    public final void rule__Registationsystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:477:1: ( rule__Registationsystem__Group__4__Impl )
            // InternalRegistrationDSL.g:478:2: rule__Registationsystem__Group__4__Impl
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
    // InternalRegistrationDSL.g:484:1: rule__Registationsystem__Group__4__Impl : ( '}' ) ;
    public final void rule__Registationsystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:488:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:489:1: ( '}' )
            {
            // InternalRegistrationDSL.g:489:1: ( '}' )
            // InternalRegistrationDSL.g:490:2: '}'
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
    // InternalRegistrationDSL.g:500:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:504:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRegistrationDSL.g:505:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalRegistrationDSL.g:512:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:516:1: ( ( 'entity' ) )
            // InternalRegistrationDSL.g:517:1: ( 'entity' )
            {
            // InternalRegistrationDSL.g:517:1: ( 'entity' )
            // InternalRegistrationDSL.g:518:2: 'entity'
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
    // InternalRegistrationDSL.g:527:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:531:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRegistrationDSL.g:532:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalRegistrationDSL.g:539:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:543:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:544:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:544:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:545:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:546:2: ( rule__Entity__NameAssignment_1 )
            // InternalRegistrationDSL.g:546:3: rule__Entity__NameAssignment_1
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
    // InternalRegistrationDSL.g:554:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:558:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRegistrationDSL.g:559:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalRegistrationDSL.g:566:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:570:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalRegistrationDSL.g:571:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalRegistrationDSL.g:571:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalRegistrationDSL.g:572:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalRegistrationDSL.g:573:2: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRegistrationDSL.g:573:3: rule__Entity__Group_2__0
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
    // InternalRegistrationDSL.g:581:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:585:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRegistrationDSL.g:586:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalRegistrationDSL.g:593:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:597:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:598:1: ( '{' )
            {
            // InternalRegistrationDSL.g:598:1: ( '{' )
            // InternalRegistrationDSL.g:599:2: '{'
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
    // InternalRegistrationDSL.g:608:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:612:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalRegistrationDSL.g:613:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalRegistrationDSL.g:620:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:624:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // InternalRegistrationDSL.g:625:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // InternalRegistrationDSL.g:625:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // InternalRegistrationDSL.g:626:2: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // InternalRegistrationDSL.g:627:2: ( rule__Entity__FieldsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRegistrationDSL.g:627:3: rule__Entity__FieldsAssignment_4
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
    // InternalRegistrationDSL.g:635:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:639:1: ( rule__Entity__Group__5__Impl )
            // InternalRegistrationDSL.g:640:2: rule__Entity__Group__5__Impl
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
    // InternalRegistrationDSL.g:646:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:650:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:651:1: ( '}' )
            {
            // InternalRegistrationDSL.g:651:1: ( '}' )
            // InternalRegistrationDSL.g:652:2: '}'
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
    // InternalRegistrationDSL.g:662:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:666:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalRegistrationDSL.g:667:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalRegistrationDSL.g:674:1: rule__Entity__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:678:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:679:1: ( ':' )
            {
            // InternalRegistrationDSL.g:679:1: ( ':' )
            // InternalRegistrationDSL.g:680:2: ':'
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
    // InternalRegistrationDSL.g:689:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:693:1: ( rule__Entity__Group_2__1__Impl )
            // InternalRegistrationDSL.g:694:2: rule__Entity__Group_2__1__Impl
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
    // InternalRegistrationDSL.g:700:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__BaseAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:704:1: ( ( ( rule__Entity__BaseAssignment_2_1 ) ) )
            // InternalRegistrationDSL.g:705:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            {
            // InternalRegistrationDSL.g:705:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            // InternalRegistrationDSL.g:706:2: ( rule__Entity__BaseAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); 
            // InternalRegistrationDSL.g:707:2: ( rule__Entity__BaseAssignment_2_1 )
            // InternalRegistrationDSL.g:707:3: rule__Entity__BaseAssignment_2_1
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
    // InternalRegistrationDSL.g:716:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:720:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRegistrationDSL.g:721:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalRegistrationDSL.g:728:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:732:1: ( ( 'attribute' ) )
            // InternalRegistrationDSL.g:733:1: ( 'attribute' )
            {
            // InternalRegistrationDSL.g:733:1: ( 'attribute' )
            // InternalRegistrationDSL.g:734:2: 'attribute'
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
    // InternalRegistrationDSL.g:743:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:747:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRegistrationDSL.g:748:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalRegistrationDSL.g:755:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:759:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:760:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:760:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:761:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:762:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRegistrationDSL.g:762:3: rule__Attribute__NameAssignment_1
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
    // InternalRegistrationDSL.g:770:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:774:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalRegistrationDSL.g:775:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalRegistrationDSL.g:782:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:786:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:787:1: ( ':' )
            {
            // InternalRegistrationDSL.g:787:1: ( ':' )
            // InternalRegistrationDSL.g:788:2: ':'
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
    // InternalRegistrationDSL.g:797:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:801:1: ( rule__Attribute__Group__3__Impl )
            // InternalRegistrationDSL.g:802:2: rule__Attribute__Group__3__Impl
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
    // InternalRegistrationDSL.g:808:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:812:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalRegistrationDSL.g:813:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:813:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalRegistrationDSL.g:814:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalRegistrationDSL.g:815:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalRegistrationDSL.g:815:3: rule__Attribute__TypeAssignment_3
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
    // InternalRegistrationDSL.g:824:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:828:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalRegistrationDSL.g:829:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalRegistrationDSL.g:836:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:840:1: ( ( 'relation' ) )
            // InternalRegistrationDSL.g:841:1: ( 'relation' )
            {
            // InternalRegistrationDSL.g:841:1: ( 'relation' )
            // InternalRegistrationDSL.g:842:2: 'relation'
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
    // InternalRegistrationDSL.g:851:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:855:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalRegistrationDSL.g:856:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalRegistrationDSL.g:863:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:867:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:868:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:868:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:869:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:870:2: ( rule__Relation__NameAssignment_1 )
            // InternalRegistrationDSL.g:870:3: rule__Relation__NameAssignment_1
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
    // InternalRegistrationDSL.g:878:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:882:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalRegistrationDSL.g:883:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
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
    // InternalRegistrationDSL.g:890:1: rule__Relation__Group__2__Impl : ( ':' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:894:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:895:1: ( ':' )
            {
            // InternalRegistrationDSL.g:895:1: ( ':' )
            // InternalRegistrationDSL.g:896:2: ':'
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
    // InternalRegistrationDSL.g:905:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:909:1: ( rule__Relation__Group__3__Impl )
            // InternalRegistrationDSL.g:910:2: rule__Relation__Group__3__Impl
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
    // InternalRegistrationDSL.g:916:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__TargetAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:920:1: ( ( ( rule__Relation__TargetAssignment_3 ) ) )
            // InternalRegistrationDSL.g:921:1: ( ( rule__Relation__TargetAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:921:1: ( ( rule__Relation__TargetAssignment_3 ) )
            // InternalRegistrationDSL.g:922:2: ( rule__Relation__TargetAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_3()); 
            // InternalRegistrationDSL.g:923:2: ( rule__Relation__TargetAssignment_3 )
            // InternalRegistrationDSL.g:923:3: rule__Relation__TargetAssignment_3
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
    // InternalRegistrationDSL.g:932:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:936:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalRegistrationDSL.g:937:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
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
    // InternalRegistrationDSL.g:944:1: rule__Workflow__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:948:1: ( ( 'workflow' ) )
            // InternalRegistrationDSL.g:949:1: ( 'workflow' )
            {
            // InternalRegistrationDSL.g:949:1: ( 'workflow' )
            // InternalRegistrationDSL.g:950:2: 'workflow'
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
    // InternalRegistrationDSL.g:959:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:963:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalRegistrationDSL.g:964:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
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
    // InternalRegistrationDSL.g:971:1: rule__Workflow__Group__1__Impl : ( ( rule__Workflow__NameAssignment_1 ) ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:975:1: ( ( ( rule__Workflow__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:976:1: ( ( rule__Workflow__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:976:1: ( ( rule__Workflow__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:977:2: ( rule__Workflow__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:978:2: ( rule__Workflow__NameAssignment_1 )
            // InternalRegistrationDSL.g:978:3: rule__Workflow__NameAssignment_1
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
    // InternalRegistrationDSL.g:986:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:990:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalRegistrationDSL.g:991:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
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
    // InternalRegistrationDSL.g:998:1: rule__Workflow__Group__2__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1002:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:1003:1: ( '{' )
            {
            // InternalRegistrationDSL.g:1003:1: ( '{' )
            // InternalRegistrationDSL.g:1004:2: '{'
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
    // InternalRegistrationDSL.g:1013:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1017:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalRegistrationDSL.g:1018:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
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
    // InternalRegistrationDSL.g:1025:1: rule__Workflow__Group__3__Impl : ( ( rule__Workflow__StatementsAssignment_3 )* ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1029:1: ( ( ( rule__Workflow__StatementsAssignment_3 )* ) )
            // InternalRegistrationDSL.g:1030:1: ( ( rule__Workflow__StatementsAssignment_3 )* )
            {
            // InternalRegistrationDSL.g:1030:1: ( ( rule__Workflow__StatementsAssignment_3 )* )
            // InternalRegistrationDSL.g:1031:2: ( rule__Workflow__StatementsAssignment_3 )*
            {
             before(grammarAccess.getWorkflowAccess().getStatementsAssignment_3()); 
            // InternalRegistrationDSL.g:1032:2: ( rule__Workflow__StatementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1032:3: rule__Workflow__StatementsAssignment_3
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
    // InternalRegistrationDSL.g:1040:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1044:1: ( rule__Workflow__Group__4__Impl )
            // InternalRegistrationDSL.g:1045:2: rule__Workflow__Group__4__Impl
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
    // InternalRegistrationDSL.g:1051:1: rule__Workflow__Group__4__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1055:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:1056:1: ( '}' )
            {
            // InternalRegistrationDSL.g:1056:1: ( '}' )
            // InternalRegistrationDSL.g:1057:2: '}'
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
    // InternalRegistrationDSL.g:1067:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1071:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalRegistrationDSL.g:1072:2: rule__Select__Group__0__Impl rule__Select__Group__1
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
    // InternalRegistrationDSL.g:1079:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1083:1: ( ( 'select' ) )
            // InternalRegistrationDSL.g:1084:1: ( 'select' )
            {
            // InternalRegistrationDSL.g:1084:1: ( 'select' )
            // InternalRegistrationDSL.g:1085:2: 'select'
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
    // InternalRegistrationDSL.g:1094:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1098:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalRegistrationDSL.g:1099:2: rule__Select__Group__1__Impl rule__Select__Group__2
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
    // InternalRegistrationDSL.g:1106:1: rule__Select__Group__1__Impl : ( ( rule__Select__SelectTypeAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1110:1: ( ( ( rule__Select__SelectTypeAssignment_1 ) ) )
            // InternalRegistrationDSL.g:1111:1: ( ( rule__Select__SelectTypeAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:1111:1: ( ( rule__Select__SelectTypeAssignment_1 ) )
            // InternalRegistrationDSL.g:1112:2: ( rule__Select__SelectTypeAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getSelectTypeAssignment_1()); 
            // InternalRegistrationDSL.g:1113:2: ( rule__Select__SelectTypeAssignment_1 )
            // InternalRegistrationDSL.g:1113:3: rule__Select__SelectTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelectTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelectTypeAssignment_1()); 

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
    // InternalRegistrationDSL.g:1121:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1125:1: ( rule__Select__Group__2__Impl )
            // InternalRegistrationDSL.g:1126:2: rule__Select__Group__2__Impl
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
    // InternalRegistrationDSL.g:1132:1: rule__Select__Group__2__Impl : ( ( rule__Select__EntityNameAssignment_2 ) ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1136:1: ( ( ( rule__Select__EntityNameAssignment_2 ) ) )
            // InternalRegistrationDSL.g:1137:1: ( ( rule__Select__EntityNameAssignment_2 ) )
            {
            // InternalRegistrationDSL.g:1137:1: ( ( rule__Select__EntityNameAssignment_2 ) )
            // InternalRegistrationDSL.g:1138:2: ( rule__Select__EntityNameAssignment_2 )
            {
             before(grammarAccess.getSelectAccess().getEntityNameAssignment_2()); 
            // InternalRegistrationDSL.g:1139:2: ( rule__Select__EntityNameAssignment_2 )
            // InternalRegistrationDSL.g:1139:3: rule__Select__EntityNameAssignment_2
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
    // InternalRegistrationDSL.g:1148:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1152:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalRegistrationDSL.g:1153:2: rule__Add__Group__0__Impl rule__Add__Group__1
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
    // InternalRegistrationDSL.g:1160:1: rule__Add__Group__0__Impl : ( 'add' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1164:1: ( ( 'add' ) )
            // InternalRegistrationDSL.g:1165:1: ( 'add' )
            {
            // InternalRegistrationDSL.g:1165:1: ( 'add' )
            // InternalRegistrationDSL.g:1166:2: 'add'
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
    // InternalRegistrationDSL.g:1175:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1179:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalRegistrationDSL.g:1180:2: rule__Add__Group__1__Impl rule__Add__Group__2
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
    // InternalRegistrationDSL.g:1187:1: rule__Add__Group__1__Impl : ( ( rule__Add__SelectedEntityNameAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1191:1: ( ( ( rule__Add__SelectedEntityNameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:1192:1: ( ( rule__Add__SelectedEntityNameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:1192:1: ( ( rule__Add__SelectedEntityNameAssignment_1 ) )
            // InternalRegistrationDSL.g:1193:2: ( rule__Add__SelectedEntityNameAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getSelectedEntityNameAssignment_1()); 
            // InternalRegistrationDSL.g:1194:2: ( rule__Add__SelectedEntityNameAssignment_1 )
            // InternalRegistrationDSL.g:1194:3: rule__Add__SelectedEntityNameAssignment_1
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
    // InternalRegistrationDSL.g:1202:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1206:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalRegistrationDSL.g:1207:2: rule__Add__Group__2__Impl rule__Add__Group__3
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
    // InternalRegistrationDSL.g:1214:1: rule__Add__Group__2__Impl : ( 'to' ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1218:1: ( ( 'to' ) )
            // InternalRegistrationDSL.g:1219:1: ( 'to' )
            {
            // InternalRegistrationDSL.g:1219:1: ( 'to' )
            // InternalRegistrationDSL.g:1220:2: 'to'
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
    // InternalRegistrationDSL.g:1229:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1233:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalRegistrationDSL.g:1234:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Add__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__4();

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
    // InternalRegistrationDSL.g:1241:1: rule__Add__Group__3__Impl : ( ( rule__Add__ToEntityAssignment_3 ) ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1245:1: ( ( ( rule__Add__ToEntityAssignment_3 ) ) )
            // InternalRegistrationDSL.g:1246:1: ( ( rule__Add__ToEntityAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:1246:1: ( ( rule__Add__ToEntityAssignment_3 ) )
            // InternalRegistrationDSL.g:1247:2: ( rule__Add__ToEntityAssignment_3 )
            {
             before(grammarAccess.getAddAccess().getToEntityAssignment_3()); 
            // InternalRegistrationDSL.g:1248:2: ( rule__Add__ToEntityAssignment_3 )
            // InternalRegistrationDSL.g:1248:3: rule__Add__ToEntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Add__ToEntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getToEntityAssignment_3()); 

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


    // $ANTLR start "rule__Add__Group__4"
    // InternalRegistrationDSL.g:1256:1: rule__Add__Group__4 : rule__Add__Group__4__Impl rule__Add__Group__5 ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1260:1: ( rule__Add__Group__4__Impl rule__Add__Group__5 )
            // InternalRegistrationDSL.g:1261:2: rule__Add__Group__4__Impl rule__Add__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Add__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__5();

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
    // $ANTLR end "rule__Add__Group__4"


    // $ANTLR start "rule__Add__Group__4__Impl"
    // InternalRegistrationDSL.g:1268:1: rule__Add__Group__4__Impl : ( '.' ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1272:1: ( ( '.' ) )
            // InternalRegistrationDSL.g:1273:1: ( '.' )
            {
            // InternalRegistrationDSL.g:1273:1: ( '.' )
            // InternalRegistrationDSL.g:1274:2: '.'
            {
             before(grammarAccess.getAddAccess().getFullStopKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__Add__Group__4__Impl"


    // $ANTLR start "rule__Add__Group__5"
    // InternalRegistrationDSL.g:1283:1: rule__Add__Group__5 : rule__Add__Group__5__Impl ;
    public final void rule__Add__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1287:1: ( rule__Add__Group__5__Impl )
            // InternalRegistrationDSL.g:1288:2: rule__Add__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__5__Impl();

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
    // $ANTLR end "rule__Add__Group__5"


    // $ANTLR start "rule__Add__Group__5__Impl"
    // InternalRegistrationDSL.g:1294:1: rule__Add__Group__5__Impl : ( ( rule__Add__ToEntityRelationAssignment_5 ) ) ;
    public final void rule__Add__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1298:1: ( ( ( rule__Add__ToEntityRelationAssignment_5 ) ) )
            // InternalRegistrationDSL.g:1299:1: ( ( rule__Add__ToEntityRelationAssignment_5 ) )
            {
            // InternalRegistrationDSL.g:1299:1: ( ( rule__Add__ToEntityRelationAssignment_5 ) )
            // InternalRegistrationDSL.g:1300:2: ( rule__Add__ToEntityRelationAssignment_5 )
            {
             before(grammarAccess.getAddAccess().getToEntityRelationAssignment_5()); 
            // InternalRegistrationDSL.g:1301:2: ( rule__Add__ToEntityRelationAssignment_5 )
            // InternalRegistrationDSL.g:1301:3: rule__Add__ToEntityRelationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Add__ToEntityRelationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getToEntityRelationAssignment_5()); 

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
    // $ANTLR end "rule__Add__Group__5__Impl"


    // $ANTLR start "rule__Registationsystem__NameAssignment_1"
    // InternalRegistrationDSL.g:1310:1: rule__Registationsystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Registationsystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1314:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1315:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1315:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1316:3: RULE_ID
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
    // InternalRegistrationDSL.g:1325:1: rule__Registationsystem__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Registationsystem__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1329:1: ( ( ruleDeclaration ) )
            // InternalRegistrationDSL.g:1330:2: ( ruleDeclaration )
            {
            // InternalRegistrationDSL.g:1330:2: ( ruleDeclaration )
            // InternalRegistrationDSL.g:1331:3: ruleDeclaration
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
    // InternalRegistrationDSL.g:1340:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1344:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1345:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1345:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1346:3: RULE_ID
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
    // InternalRegistrationDSL.g:1355:1: rule__Entity__BaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__BaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1359:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1360:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1360:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1361:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); 
            // InternalRegistrationDSL.g:1362:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1363:4: RULE_ID
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
    // InternalRegistrationDSL.g:1374:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1378:1: ( ( ruleField ) )
            // InternalRegistrationDSL.g:1379:2: ( ruleField )
            {
            // InternalRegistrationDSL.g:1379:2: ( ruleField )
            // InternalRegistrationDSL.g:1380:3: ruleField
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
    // InternalRegistrationDSL.g:1389:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1393:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1394:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1394:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1395:3: RULE_ID
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
    // InternalRegistrationDSL.g:1404:1: rule__Attribute__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1408:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1409:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1409:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1410:3: RULE_ID
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
    // InternalRegistrationDSL.g:1419:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1423:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1424:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1424:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1425:3: RULE_ID
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
    // InternalRegistrationDSL.g:1434:1: rule__Relation__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1438:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1439:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1439:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1440:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0()); 
            // InternalRegistrationDSL.g:1441:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1442:4: RULE_ID
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
    // InternalRegistrationDSL.g:1453:1: rule__Workflow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Workflow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1457:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1458:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1458:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1459:3: RULE_ID
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
    // InternalRegistrationDSL.g:1468:1: rule__Workflow__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Workflow__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1472:1: ( ( ruleStatement ) )
            // InternalRegistrationDSL.g:1473:2: ( ruleStatement )
            {
            // InternalRegistrationDSL.g:1473:2: ( ruleStatement )
            // InternalRegistrationDSL.g:1474:3: ruleStatement
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


    // $ANTLR start "rule__Select__SelectTypeAssignment_1"
    // InternalRegistrationDSL.g:1483:1: rule__Select__SelectTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Select__SelectTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1487:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1488:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1488:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1489:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectAccess().getSelectTypeEntityCrossReference_1_0()); 
            // InternalRegistrationDSL.g:1490:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1491:4: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getSelectTypeEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectTypeEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSelectAccess().getSelectTypeEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Select__SelectTypeAssignment_1"


    // $ANTLR start "rule__Select__EntityNameAssignment_2"
    // InternalRegistrationDSL.g:1502:1: rule__Select__EntityNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Select__EntityNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1506:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1507:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1507:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1508:3: RULE_ID
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
    // InternalRegistrationDSL.g:1517:1: rule__Add__SelectedEntityNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Add__SelectedEntityNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1521:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1522:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1522:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1523:3: RULE_ID
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


    // $ANTLR start "rule__Add__ToEntityAssignment_3"
    // InternalRegistrationDSL.g:1532:1: rule__Add__ToEntityAssignment_3 : ( RULE_ID ) ;
    public final void rule__Add__ToEntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1536:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1537:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1537:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1538:3: RULE_ID
            {
             before(grammarAccess.getAddAccess().getToEntityIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getToEntityIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Add__ToEntityAssignment_3"


    // $ANTLR start "rule__Add__ToEntityRelationAssignment_5"
    // InternalRegistrationDSL.g:1547:1: rule__Add__ToEntityRelationAssignment_5 : ( RULE_ID ) ;
    public final void rule__Add__ToEntityRelationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1551:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1552:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1552:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1553:3: RULE_ID
            {
             before(grammarAccess.getAddAccess().getToEntityRelationIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getToEntityRelationIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Add__ToEntityRelationAssignment_5"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}