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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'entity'", "':'", "'attribute'", "'relation'", "'workflow'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRegistrationDSL.g:227:1: rule__Declaration__Alternatives : ( ( ruleEntity ) | ( ruleWorkflow ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:231:1: ( ( ruleEntity ) | ( ruleWorkflow ) )
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
                    // InternalRegistrationDSL.g:232:2: ( ruleEntity )
                    {
                    // InternalRegistrationDSL.g:232:2: ( ruleEntity )
                    // InternalRegistrationDSL.g:233:3: ruleEntity
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
                    // InternalRegistrationDSL.g:238:2: ( ruleWorkflow )
                    {
                    // InternalRegistrationDSL.g:238:2: ( ruleWorkflow )
                    // InternalRegistrationDSL.g:239:3: ruleWorkflow
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
    // InternalRegistrationDSL.g:248:1: rule__Field__Alternatives : ( ( ruleAttribute ) | ( ruleRelation ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:252:1: ( ( ruleAttribute ) | ( ruleRelation ) )
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
                    // InternalRegistrationDSL.g:253:2: ( ruleAttribute )
                    {
                    // InternalRegistrationDSL.g:253:2: ( ruleAttribute )
                    // InternalRegistrationDSL.g:254:3: ruleAttribute
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
                    // InternalRegistrationDSL.g:259:2: ( ruleRelation )
                    {
                    // InternalRegistrationDSL.g:259:2: ( ruleRelation )
                    // InternalRegistrationDSL.g:260:3: ruleRelation
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


    // $ANTLR start "rule__Registationsystem__Group__0"
    // InternalRegistrationDSL.g:269:1: rule__Registationsystem__Group__0 : rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1 ;
    public final void rule__Registationsystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:273:1: ( rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1 )
            // InternalRegistrationDSL.g:274:2: rule__Registationsystem__Group__0__Impl rule__Registationsystem__Group__1
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
    // InternalRegistrationDSL.g:281:1: rule__Registationsystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__Registationsystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:285:1: ( ( 'system' ) )
            // InternalRegistrationDSL.g:286:1: ( 'system' )
            {
            // InternalRegistrationDSL.g:286:1: ( 'system' )
            // InternalRegistrationDSL.g:287:2: 'system'
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
    // InternalRegistrationDSL.g:296:1: rule__Registationsystem__Group__1 : rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2 ;
    public final void rule__Registationsystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:300:1: ( rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2 )
            // InternalRegistrationDSL.g:301:2: rule__Registationsystem__Group__1__Impl rule__Registationsystem__Group__2
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
    // InternalRegistrationDSL.g:308:1: rule__Registationsystem__Group__1__Impl : ( ( rule__Registationsystem__NameAssignment_1 ) ) ;
    public final void rule__Registationsystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:312:1: ( ( ( rule__Registationsystem__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:313:1: ( ( rule__Registationsystem__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:313:1: ( ( rule__Registationsystem__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:314:2: ( rule__Registationsystem__NameAssignment_1 )
            {
             before(grammarAccess.getRegistationsystemAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:315:2: ( rule__Registationsystem__NameAssignment_1 )
            // InternalRegistrationDSL.g:315:3: rule__Registationsystem__NameAssignment_1
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
    // InternalRegistrationDSL.g:323:1: rule__Registationsystem__Group__2 : rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3 ;
    public final void rule__Registationsystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:327:1: ( rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3 )
            // InternalRegistrationDSL.g:328:2: rule__Registationsystem__Group__2__Impl rule__Registationsystem__Group__3
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
    // InternalRegistrationDSL.g:335:1: rule__Registationsystem__Group__2__Impl : ( '{' ) ;
    public final void rule__Registationsystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:339:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:340:1: ( '{' )
            {
            // InternalRegistrationDSL.g:340:1: ( '{' )
            // InternalRegistrationDSL.g:341:2: '{'
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
    // InternalRegistrationDSL.g:350:1: rule__Registationsystem__Group__3 : rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4 ;
    public final void rule__Registationsystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:354:1: ( rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4 )
            // InternalRegistrationDSL.g:355:2: rule__Registationsystem__Group__3__Impl rule__Registationsystem__Group__4
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
    // InternalRegistrationDSL.g:362:1: rule__Registationsystem__Group__3__Impl : ( ( rule__Registationsystem__DeclarationsAssignment_3 )* ) ;
    public final void rule__Registationsystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:366:1: ( ( ( rule__Registationsystem__DeclarationsAssignment_3 )* ) )
            // InternalRegistrationDSL.g:367:1: ( ( rule__Registationsystem__DeclarationsAssignment_3 )* )
            {
            // InternalRegistrationDSL.g:367:1: ( ( rule__Registationsystem__DeclarationsAssignment_3 )* )
            // InternalRegistrationDSL.g:368:2: ( rule__Registationsystem__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getRegistationsystemAccess().getDeclarationsAssignment_3()); 
            // InternalRegistrationDSL.g:369:2: ( rule__Registationsystem__DeclarationsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRegistrationDSL.g:369:3: rule__Registationsystem__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Registationsystem__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalRegistrationDSL.g:377:1: rule__Registationsystem__Group__4 : rule__Registationsystem__Group__4__Impl ;
    public final void rule__Registationsystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:381:1: ( rule__Registationsystem__Group__4__Impl )
            // InternalRegistrationDSL.g:382:2: rule__Registationsystem__Group__4__Impl
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
    // InternalRegistrationDSL.g:388:1: rule__Registationsystem__Group__4__Impl : ( '}' ) ;
    public final void rule__Registationsystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:392:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:393:1: ( '}' )
            {
            // InternalRegistrationDSL.g:393:1: ( '}' )
            // InternalRegistrationDSL.g:394:2: '}'
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
    // InternalRegistrationDSL.g:404:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:408:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRegistrationDSL.g:409:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalRegistrationDSL.g:416:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:420:1: ( ( 'entity' ) )
            // InternalRegistrationDSL.g:421:1: ( 'entity' )
            {
            // InternalRegistrationDSL.g:421:1: ( 'entity' )
            // InternalRegistrationDSL.g:422:2: 'entity'
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
    // InternalRegistrationDSL.g:431:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:435:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRegistrationDSL.g:436:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalRegistrationDSL.g:443:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:447:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:448:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:448:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:449:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:450:2: ( rule__Entity__NameAssignment_1 )
            // InternalRegistrationDSL.g:450:3: rule__Entity__NameAssignment_1
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
    // InternalRegistrationDSL.g:458:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:462:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRegistrationDSL.g:463:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalRegistrationDSL.g:470:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:474:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalRegistrationDSL.g:475:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalRegistrationDSL.g:475:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalRegistrationDSL.g:476:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalRegistrationDSL.g:477:2: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRegistrationDSL.g:477:3: rule__Entity__Group_2__0
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
    // InternalRegistrationDSL.g:485:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:489:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRegistrationDSL.g:490:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalRegistrationDSL.g:497:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:501:1: ( ( '{' ) )
            // InternalRegistrationDSL.g:502:1: ( '{' )
            {
            // InternalRegistrationDSL.g:502:1: ( '{' )
            // InternalRegistrationDSL.g:503:2: '{'
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
    // InternalRegistrationDSL.g:512:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:516:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalRegistrationDSL.g:517:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalRegistrationDSL.g:524:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:528:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // InternalRegistrationDSL.g:529:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // InternalRegistrationDSL.g:529:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // InternalRegistrationDSL.g:530:2: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // InternalRegistrationDSL.g:531:2: ( rule__Entity__FieldsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRegistrationDSL.g:531:3: rule__Entity__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalRegistrationDSL.g:539:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:543:1: ( rule__Entity__Group__5__Impl )
            // InternalRegistrationDSL.g:544:2: rule__Entity__Group__5__Impl
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
    // InternalRegistrationDSL.g:550:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:554:1: ( ( '}' ) )
            // InternalRegistrationDSL.g:555:1: ( '}' )
            {
            // InternalRegistrationDSL.g:555:1: ( '}' )
            // InternalRegistrationDSL.g:556:2: '}'
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
    // InternalRegistrationDSL.g:566:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:570:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalRegistrationDSL.g:571:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalRegistrationDSL.g:578:1: rule__Entity__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:582:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:583:1: ( ':' )
            {
            // InternalRegistrationDSL.g:583:1: ( ':' )
            // InternalRegistrationDSL.g:584:2: ':'
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
    // InternalRegistrationDSL.g:593:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:597:1: ( rule__Entity__Group_2__1__Impl )
            // InternalRegistrationDSL.g:598:2: rule__Entity__Group_2__1__Impl
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
    // InternalRegistrationDSL.g:604:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__BaseAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:608:1: ( ( ( rule__Entity__BaseAssignment_2_1 ) ) )
            // InternalRegistrationDSL.g:609:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            {
            // InternalRegistrationDSL.g:609:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            // InternalRegistrationDSL.g:610:2: ( rule__Entity__BaseAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); 
            // InternalRegistrationDSL.g:611:2: ( rule__Entity__BaseAssignment_2_1 )
            // InternalRegistrationDSL.g:611:3: rule__Entity__BaseAssignment_2_1
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
    // InternalRegistrationDSL.g:620:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:624:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRegistrationDSL.g:625:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalRegistrationDSL.g:632:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:636:1: ( ( 'attribute' ) )
            // InternalRegistrationDSL.g:637:1: ( 'attribute' )
            {
            // InternalRegistrationDSL.g:637:1: ( 'attribute' )
            // InternalRegistrationDSL.g:638:2: 'attribute'
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
    // InternalRegistrationDSL.g:647:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:651:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRegistrationDSL.g:652:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalRegistrationDSL.g:659:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:663:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:664:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:664:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:665:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:666:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRegistrationDSL.g:666:3: rule__Attribute__NameAssignment_1
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
    // InternalRegistrationDSL.g:674:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:678:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalRegistrationDSL.g:679:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalRegistrationDSL.g:686:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:690:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:691:1: ( ':' )
            {
            // InternalRegistrationDSL.g:691:1: ( ':' )
            // InternalRegistrationDSL.g:692:2: ':'
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
    // InternalRegistrationDSL.g:701:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:705:1: ( rule__Attribute__Group__3__Impl )
            // InternalRegistrationDSL.g:706:2: rule__Attribute__Group__3__Impl
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
    // InternalRegistrationDSL.g:712:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:716:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalRegistrationDSL.g:717:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:717:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalRegistrationDSL.g:718:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalRegistrationDSL.g:719:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalRegistrationDSL.g:719:3: rule__Attribute__TypeAssignment_3
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
    // InternalRegistrationDSL.g:728:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:732:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalRegistrationDSL.g:733:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalRegistrationDSL.g:740:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:744:1: ( ( 'relation' ) )
            // InternalRegistrationDSL.g:745:1: ( 'relation' )
            {
            // InternalRegistrationDSL.g:745:1: ( 'relation' )
            // InternalRegistrationDSL.g:746:2: 'relation'
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
    // InternalRegistrationDSL.g:755:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:759:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalRegistrationDSL.g:760:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalRegistrationDSL.g:767:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:771:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:772:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:772:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:773:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:774:2: ( rule__Relation__NameAssignment_1 )
            // InternalRegistrationDSL.g:774:3: rule__Relation__NameAssignment_1
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
    // InternalRegistrationDSL.g:782:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:786:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalRegistrationDSL.g:787:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
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
    // InternalRegistrationDSL.g:794:1: rule__Relation__Group__2__Impl : ( ':' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:798:1: ( ( ':' ) )
            // InternalRegistrationDSL.g:799:1: ( ':' )
            {
            // InternalRegistrationDSL.g:799:1: ( ':' )
            // InternalRegistrationDSL.g:800:2: ':'
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
    // InternalRegistrationDSL.g:809:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:813:1: ( rule__Relation__Group__3__Impl )
            // InternalRegistrationDSL.g:814:2: rule__Relation__Group__3__Impl
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
    // InternalRegistrationDSL.g:820:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__TargetAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:824:1: ( ( ( rule__Relation__TargetAssignment_3 ) ) )
            // InternalRegistrationDSL.g:825:1: ( ( rule__Relation__TargetAssignment_3 ) )
            {
            // InternalRegistrationDSL.g:825:1: ( ( rule__Relation__TargetAssignment_3 ) )
            // InternalRegistrationDSL.g:826:2: ( rule__Relation__TargetAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_3()); 
            // InternalRegistrationDSL.g:827:2: ( rule__Relation__TargetAssignment_3 )
            // InternalRegistrationDSL.g:827:3: rule__Relation__TargetAssignment_3
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
    // InternalRegistrationDSL.g:836:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:840:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalRegistrationDSL.g:841:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
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
    // InternalRegistrationDSL.g:848:1: rule__Workflow__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:852:1: ( ( 'workflow' ) )
            // InternalRegistrationDSL.g:853:1: ( 'workflow' )
            {
            // InternalRegistrationDSL.g:853:1: ( 'workflow' )
            // InternalRegistrationDSL.g:854:2: 'workflow'
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
    // InternalRegistrationDSL.g:863:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:867:1: ( rule__Workflow__Group__1__Impl )
            // InternalRegistrationDSL.g:868:2: rule__Workflow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__1__Impl();

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
    // InternalRegistrationDSL.g:874:1: rule__Workflow__Group__1__Impl : ( ( rule__Workflow__NameAssignment_1 ) ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:878:1: ( ( ( rule__Workflow__NameAssignment_1 ) ) )
            // InternalRegistrationDSL.g:879:1: ( ( rule__Workflow__NameAssignment_1 ) )
            {
            // InternalRegistrationDSL.g:879:1: ( ( rule__Workflow__NameAssignment_1 ) )
            // InternalRegistrationDSL.g:880:2: ( rule__Workflow__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_1()); 
            // InternalRegistrationDSL.g:881:2: ( rule__Workflow__NameAssignment_1 )
            // InternalRegistrationDSL.g:881:3: rule__Workflow__NameAssignment_1
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


    // $ANTLR start "rule__Registationsystem__NameAssignment_1"
    // InternalRegistrationDSL.g:890:1: rule__Registationsystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Registationsystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:894:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:895:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:895:2: ( RULE_ID )
            // InternalRegistrationDSL.g:896:3: RULE_ID
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
    // InternalRegistrationDSL.g:905:1: rule__Registationsystem__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Registationsystem__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:909:1: ( ( ruleDeclaration ) )
            // InternalRegistrationDSL.g:910:2: ( ruleDeclaration )
            {
            // InternalRegistrationDSL.g:910:2: ( ruleDeclaration )
            // InternalRegistrationDSL.g:911:3: ruleDeclaration
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
    // InternalRegistrationDSL.g:920:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:924:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:925:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:925:2: ( RULE_ID )
            // InternalRegistrationDSL.g:926:3: RULE_ID
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
    // InternalRegistrationDSL.g:935:1: rule__Entity__BaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__BaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:939:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:940:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:940:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:941:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); 
            // InternalRegistrationDSL.g:942:3: ( RULE_ID )
            // InternalRegistrationDSL.g:943:4: RULE_ID
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
    // InternalRegistrationDSL.g:954:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:958:1: ( ( ruleField ) )
            // InternalRegistrationDSL.g:959:2: ( ruleField )
            {
            // InternalRegistrationDSL.g:959:2: ( ruleField )
            // InternalRegistrationDSL.g:960:3: ruleField
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
    // InternalRegistrationDSL.g:969:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:973:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:974:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:974:2: ( RULE_ID )
            // InternalRegistrationDSL.g:975:3: RULE_ID
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
    // InternalRegistrationDSL.g:984:1: rule__Attribute__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:988:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:989:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:989:2: ( RULE_ID )
            // InternalRegistrationDSL.g:990:3: RULE_ID
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
    // InternalRegistrationDSL.g:999:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1003:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1004:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1004:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1005:3: RULE_ID
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
    // InternalRegistrationDSL.g:1014:1: rule__Relation__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1018:1: ( ( ( RULE_ID ) ) )
            // InternalRegistrationDSL.g:1019:2: ( ( RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1019:2: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1020:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0()); 
            // InternalRegistrationDSL.g:1021:3: ( RULE_ID )
            // InternalRegistrationDSL.g:1022:4: RULE_ID
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
    // InternalRegistrationDSL.g:1033:1: rule__Workflow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Workflow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegistrationDSL.g:1037:1: ( ( RULE_ID ) )
            // InternalRegistrationDSL.g:1038:2: ( RULE_ID )
            {
            // InternalRegistrationDSL.g:1038:2: ( RULE_ID )
            // InternalRegistrationDSL.g:1039:3: RULE_ID
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

}