package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.RegistrationDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegistrationDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'entity'", "':'", "'attribute'", "'relation'", "'require'", "'workflow'", "'select'", "'add'", "'to'", "'.'", "'register'", "'||'", "'&&'", "'['", "']'", "'<'", "'>'", "'=='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

        public InternalRegistrationDSLParser(TokenStream input, RegistrationDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Registationsystem";
       	}

       	@Override
       	protected RegistrationDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRegistationsystem"
    // InternalRegistrationDSL.g:64:1: entryRuleRegistationsystem returns [EObject current=null] : iv_ruleRegistationsystem= ruleRegistationsystem EOF ;
    public final EObject entryRuleRegistationsystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistationsystem = null;


        try {
            // InternalRegistrationDSL.g:64:58: (iv_ruleRegistationsystem= ruleRegistationsystem EOF )
            // InternalRegistrationDSL.g:65:2: iv_ruleRegistationsystem= ruleRegistationsystem EOF
            {
             newCompositeNode(grammarAccess.getRegistationsystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegistationsystem=ruleRegistationsystem();

            state._fsp--;

             current =iv_ruleRegistationsystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegistationsystem"


    // $ANTLR start "ruleRegistationsystem"
    // InternalRegistrationDSL.g:71:1: ruleRegistationsystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleRegistationsystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) )
            // InternalRegistrationDSL.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            {
            // InternalRegistrationDSL.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            // InternalRegistrationDSL.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegistationsystemAccess().getSystemKeyword_0());
            		
            // InternalRegistrationDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRegistationsystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegistationsystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRegistationsystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRegistrationDSL.g:105:3: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRegistrationDSL.g:106:4: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalRegistrationDSL.g:106:4: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalRegistrationDSL.g:107:5: lv_declarations_3_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRegistationsystemAccess().getDeclarationsDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRegistationsystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_3_0,
            	    						"org.xtext.RegistrationDSL.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRegistationsystemAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegistationsystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRegistrationDSL.g:132:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRegistrationDSL.g:132:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRegistrationDSL.g:133:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRegistrationDSL.g:139:1: ruleDeclaration returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Workflow_1 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:145:2: ( (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow ) )
            // InternalRegistrationDSL.g:146:2: (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow )
            {
            // InternalRegistrationDSL.g:146:2: (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRegistrationDSL.g:147:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:156:3: this_Workflow_1= ruleWorkflow
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getWorkflowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Workflow_1=ruleWorkflow();

                    state._fsp--;


                    			current = this_Workflow_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalRegistrationDSL.g:168:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRegistrationDSL.g:168:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRegistrationDSL.g:169:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRegistrationDSL.g:175:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:181:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // InternalRegistrationDSL.g:182:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // InternalRegistrationDSL.g:182:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // InternalRegistrationDSL.g:183:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRegistrationDSL.g:187:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:188:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:188:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:189:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRegistrationDSL.g:205:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRegistrationDSL.g:206:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
                    			
                    // InternalRegistrationDSL.g:210:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRegistrationDSL.g:211:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRegistrationDSL.g:211:5: (otherlv_3= RULE_ID )
                    // InternalRegistrationDSL.g:212:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRegistrationDSL.g:228:3: ( (lv_fields_5_0= ruleField ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRegistrationDSL.g:229:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalRegistrationDSL.g:229:4: (lv_fields_5_0= ruleField )
            	    // InternalRegistrationDSL.g:230:5: lv_fields_5_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"org.xtext.RegistrationDSL.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalRegistrationDSL.g:255:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalRegistrationDSL.g:255:46: (iv_ruleField= ruleField EOF )
            // InternalRegistrationDSL.g:256:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalRegistrationDSL.g:262:1: ruleField returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Relation_1 = null;

        EObject this_Require_2 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:268:2: ( (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire ) )
            // InternalRegistrationDSL.g:269:2: (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire )
            {
            // InternalRegistrationDSL.g:269:2: (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRegistrationDSL.g:270:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:279:3: this_Relation_1= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_1=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:288:3: this_Require_2= ruleRequire
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getRequireParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Require_2=ruleRequire();

                    state._fsp--;


                    			current = this_Require_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleAttribute"
    // InternalRegistrationDSL.g:300:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRegistrationDSL.g:300:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRegistrationDSL.g:301:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRegistrationDSL.g:307:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:313:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:314:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:314:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:315:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRegistrationDSL.g:319:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:320:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:320:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:321:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalRegistrationDSL.g:341:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalRegistrationDSL.g:342:4: (lv_type_3_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:342:4: (lv_type_3_0= RULE_ID )
            // InternalRegistrationDSL.g:343:5: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalRegistrationDSL.g:363:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalRegistrationDSL.g:363:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalRegistrationDSL.g:364:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalRegistrationDSL.g:370:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:376:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:377:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:377:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalRegistrationDSL.g:378:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalRegistrationDSL.g:382:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:383:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:383:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:384:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getColonKeyword_2());
            		
            // InternalRegistrationDSL.g:404:3: ( (otherlv_3= RULE_ID ) )
            // InternalRegistrationDSL.g:405:4: (otherlv_3= RULE_ID )
            {
            // InternalRegistrationDSL.g:405:4: (otherlv_3= RULE_ID )
            // InternalRegistrationDSL.g:406:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getTargetEntityCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRequire"
    // InternalRegistrationDSL.g:421:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRegistrationDSL.g:421:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRegistrationDSL.g:422:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalRegistrationDSL.g:428:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_logic_1_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:434:2: ( (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) ) )
            // InternalRegistrationDSL.g:435:2: (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) )
            {
            // InternalRegistrationDSL.g:435:2: (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) )
            // InternalRegistrationDSL.g:436:3: otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalRegistrationDSL.g:440:3: ( (lv_logic_1_0= ruleLogic ) )
            // InternalRegistrationDSL.g:441:4: (lv_logic_1_0= ruleLogic )
            {
            // InternalRegistrationDSL.g:441:4: (lv_logic_1_0= ruleLogic )
            // InternalRegistrationDSL.g:442:5: lv_logic_1_0= ruleLogic
            {

            					newCompositeNode(grammarAccess.getRequireAccess().getLogicLogicParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_logic_1_0=ruleLogic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireRule());
            					}
            					set(
            						current,
            						"logic",
            						lv_logic_1_0,
            						"org.xtext.RegistrationDSL.Logic");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleWorkflow"
    // InternalRegistrationDSL.g:463:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalRegistrationDSL.g:463:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalRegistrationDSL.g:464:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalRegistrationDSL.g:470:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:476:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalRegistrationDSL.g:477:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalRegistrationDSL.g:477:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalRegistrationDSL.g:478:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalRegistrationDSL.g:482:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:483:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:483:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:484:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRegistrationDSL.g:504:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=21)||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRegistrationDSL.g:505:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalRegistrationDSL.g:505:4: (lv_statements_3_0= ruleStatement )
            	    // InternalRegistrationDSL.g:506:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.RegistrationDSL.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleStatement"
    // InternalRegistrationDSL.g:531:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRegistrationDSL.g:531:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRegistrationDSL.g:532:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRegistrationDSL.g:538:1: ruleStatement returns [EObject current=null] : (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_Add_1 = null;

        EObject this_Register_2 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:544:2: ( (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister ) )
            // InternalRegistrationDSL.g:545:2: (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister )
            {
            // InternalRegistrationDSL.g:545:2: (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRegistrationDSL.g:546:3: this_Select_0= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_0=ruleSelect();

                    state._fsp--;


                    			current = this_Select_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:555:3: this_Add_1= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAddParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_1=ruleAdd();

                    state._fsp--;


                    			current = this_Add_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:564:3: this_Register_2= ruleRegister
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRegisterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Register_2=ruleRegister();

                    state._fsp--;


                    			current = this_Register_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSelect"
    // InternalRegistrationDSL.g:576:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalRegistrationDSL.g:576:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalRegistrationDSL.g:577:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalRegistrationDSL.g:583:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_entityName_2_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:589:2: ( (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:590:2: (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:590:2: (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:591:3: otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalRegistrationDSL.g:595:3: ( (otherlv_1= RULE_ID ) )
            // InternalRegistrationDSL.g:596:4: (otherlv_1= RULE_ID )
            {
            // InternalRegistrationDSL.g:596:4: (otherlv_1= RULE_ID )
            // InternalRegistrationDSL.g:597:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getSelectTypeEntityCrossReference_1_0());
            				

            }


            }

            // InternalRegistrationDSL.g:608:3: ( (lv_entityName_2_0= RULE_ID ) )
            // InternalRegistrationDSL.g:609:4: (lv_entityName_2_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:609:4: (lv_entityName_2_0= RULE_ID )
            // InternalRegistrationDSL.g:610:5: lv_entityName_2_0= RULE_ID
            {
            lv_entityName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_entityName_2_0, grammarAccess.getSelectAccess().getEntityNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entityName",
            						lv_entityName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleAdd"
    // InternalRegistrationDSL.g:630:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalRegistrationDSL.g:630:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalRegistrationDSL.g:631:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalRegistrationDSL.g:637:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_selectedEntityName_1_0=null;
        Token otherlv_2=null;
        Token lv_toEntity_3_0=null;
        Token otherlv_4=null;
        Token lv_toEntityRelation_5_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:643:2: ( (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:644:2: (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:644:2: (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:645:3: otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            // InternalRegistrationDSL.g:649:3: ( (lv_selectedEntityName_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:650:4: (lv_selectedEntityName_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:650:4: (lv_selectedEntityName_1_0= RULE_ID )
            // InternalRegistrationDSL.g:651:5: lv_selectedEntityName_1_0= RULE_ID
            {
            lv_selectedEntityName_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_selectedEntityName_1_0, grammarAccess.getAddAccess().getSelectedEntityNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"selectedEntityName",
            						lv_selectedEntityName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getToKeyword_2());
            		
            // InternalRegistrationDSL.g:671:3: ( (lv_toEntity_3_0= RULE_ID ) )
            // InternalRegistrationDSL.g:672:4: (lv_toEntity_3_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:672:4: (lv_toEntity_3_0= RULE_ID )
            // InternalRegistrationDSL.g:673:5: lv_toEntity_3_0= RULE_ID
            {
            lv_toEntity_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_toEntity_3_0, grammarAccess.getAddAccess().getToEntityIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toEntity",
            						lv_toEntity_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getFullStopKeyword_4());
            		
            // InternalRegistrationDSL.g:693:3: ( (lv_toEntityRelation_5_0= RULE_ID ) )
            // InternalRegistrationDSL.g:694:4: (lv_toEntityRelation_5_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:694:4: (lv_toEntityRelation_5_0= RULE_ID )
            // InternalRegistrationDSL.g:695:5: lv_toEntityRelation_5_0= RULE_ID
            {
            lv_toEntityRelation_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_toEntityRelation_5_0, grammarAccess.getAddAccess().getToEntityRelationIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toEntityRelation",
            						lv_toEntityRelation_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleRegister"
    // InternalRegistrationDSL.g:715:1: entryRuleRegister returns [EObject current=null] : iv_ruleRegister= ruleRegister EOF ;
    public final EObject entryRuleRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegister = null;


        try {
            // InternalRegistrationDSL.g:715:49: (iv_ruleRegister= ruleRegister EOF )
            // InternalRegistrationDSL.g:716:2: iv_ruleRegister= ruleRegister EOF
            {
             newCompositeNode(grammarAccess.getRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegister=ruleRegister();

            state._fsp--;

             current =iv_ruleRegister; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegister"


    // $ANTLR start "ruleRegister"
    // InternalRegistrationDSL.g:722:1: ruleRegister returns [EObject current=null] : (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:728:2: ( (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:729:2: (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:729:2: (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:730:3: otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegisterAccess().getRegisterKeyword_0());
            		
            // InternalRegistrationDSL.g:734:3: ( (otherlv_1= RULE_ID ) )
            // InternalRegistrationDSL.g:735:4: (otherlv_1= RULE_ID )
            {
            // InternalRegistrationDSL.g:735:4: (otherlv_1= RULE_ID )
            // InternalRegistrationDSL.g:736:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getRegisterAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            // InternalRegistrationDSL.g:747:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRegistrationDSL.g:748:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:748:4: (lv_name_2_0= RULE_ID )
            // InternalRegistrationDSL.g:749:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegister"


    // $ANTLR start "entryRuleLogic"
    // InternalRegistrationDSL.g:769:1: entryRuleLogic returns [EObject current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final EObject entryRuleLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogic = null;


        try {
            // InternalRegistrationDSL.g:769:46: (iv_ruleLogic= ruleLogic EOF )
            // InternalRegistrationDSL.g:770:2: iv_ruleLogic= ruleLogic EOF
            {
             newCompositeNode(grammarAccess.getLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogic=ruleLogic();

            state._fsp--;

             current =iv_ruleLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalRegistrationDSL.g:776:1: ruleLogic returns [EObject current=null] : (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:782:2: ( (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalRegistrationDSL.g:783:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalRegistrationDSL.g:783:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalRegistrationDSL.g:784:3: this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:792:3: (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRegistrationDSL.g:793:4: otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalRegistrationDSL.g:797:4: ()
            	    // InternalRegistrationDSL.g:798:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRegistrationDSL.g:804:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalRegistrationDSL.g:805:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalRegistrationDSL.g:805:5: (lv_right_3_0= ruleConjunction )
            	    // InternalRegistrationDSL.g:806:6: lv_right_3_0= ruleConjunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicAccess().getRightConjunctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleConjunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.RegistrationDSL.Conjunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleConjunction"
    // InternalRegistrationDSL.g:828:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalRegistrationDSL.g:828:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalRegistrationDSL.g:829:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalRegistrationDSL.g:835:1: ruleConjunction returns [EObject current=null] : (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimLogic_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:841:2: ( (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* ) )
            // InternalRegistrationDSL.g:842:2: (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* )
            {
            // InternalRegistrationDSL.g:842:2: (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* )
            // InternalRegistrationDSL.g:843:3: this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getPrimLogicParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_PrimLogic_0=rulePrimLogic();

            state._fsp--;


            			current = this_PrimLogic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:851:3: (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRegistrationDSL.g:852:4: otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalRegistrationDSL.g:856:4: ()
            	    // InternalRegistrationDSL.g:857:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRegistrationDSL.g:863:4: ( (lv_right_3_0= rulePrimLogic ) )
            	    // InternalRegistrationDSL.g:864:5: (lv_right_3_0= rulePrimLogic )
            	    {
            	    // InternalRegistrationDSL.g:864:5: (lv_right_3_0= rulePrimLogic )
            	    // InternalRegistrationDSL.g:865:6: lv_right_3_0= rulePrimLogic
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getRightPrimLogicParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=rulePrimLogic();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.RegistrationDSL.PrimLogic");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRulePrimLogic"
    // InternalRegistrationDSL.g:887:1: entryRulePrimLogic returns [EObject current=null] : iv_rulePrimLogic= rulePrimLogic EOF ;
    public final EObject entryRulePrimLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimLogic = null;


        try {
            // InternalRegistrationDSL.g:887:50: (iv_rulePrimLogic= rulePrimLogic EOF )
            // InternalRegistrationDSL.g:888:2: iv_rulePrimLogic= rulePrimLogic EOF
            {
             newCompositeNode(grammarAccess.getPrimLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimLogic=rulePrimLogic();

            state._fsp--;

             current =iv_rulePrimLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimLogic"


    // $ANTLR start "rulePrimLogic"
    // InternalRegistrationDSL.g:894:1: rulePrimLogic returns [EObject current=null] : (this_Comparison_0= ruleComparison | (otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']' ) ) ;
    public final EObject rulePrimLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Comparison_0 = null;

        EObject lv_logic_2_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:900:2: ( (this_Comparison_0= ruleComparison | (otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']' ) ) )
            // InternalRegistrationDSL.g:901:2: (this_Comparison_0= ruleComparison | (otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']' ) )
            {
            // InternalRegistrationDSL.g:901:2: (this_Comparison_0= ruleComparison | (otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRegistrationDSL.g:902:3: this_Comparison_0= ruleComparison
                    {

                    			newCompositeNode(grammarAccess.getPrimLogicAccess().getComparisonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparison_0=ruleComparison();

                    state._fsp--;


                    			current = this_Comparison_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:911:3: (otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']' )
                    {
                    // InternalRegistrationDSL.g:911:3: (otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']' )
                    // InternalRegistrationDSL.g:912:4: otherlv_1= '[' ( (lv_logic_2_0= ruleLogic ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimLogicAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalRegistrationDSL.g:916:4: ( (lv_logic_2_0= ruleLogic ) )
                    // InternalRegistrationDSL.g:917:5: (lv_logic_2_0= ruleLogic )
                    {
                    // InternalRegistrationDSL.g:917:5: (lv_logic_2_0= ruleLogic )
                    // InternalRegistrationDSL.g:918:6: lv_logic_2_0= ruleLogic
                    {

                    						newCompositeNode(grammarAccess.getPrimLogicAccess().getLogicLogicParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_logic_2_0=ruleLogic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimLogicRule());
                    						}
                    						set(
                    							current,
                    							"logic",
                    							lv_logic_2_0,
                    							"org.xtext.RegistrationDSL.Logic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimLogicAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimLogic"


    // $ANTLR start "entryRuleComparison"
    // InternalRegistrationDSL.g:944:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalRegistrationDSL.g:944:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalRegistrationDSL.g:945:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalRegistrationDSL.g:951:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:957:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalRegistrationDSL.g:958:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalRegistrationDSL.g:958:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalRegistrationDSL.g:959:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalRegistrationDSL.g:959:3: ( (lv_left_0_0= ruleExp ) )
            // InternalRegistrationDSL.g:960:4: (lv_left_0_0= ruleExp )
            {
            // InternalRegistrationDSL.g:960:4: (lv_left_0_0= ruleExp )
            // InternalRegistrationDSL.g:961:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_0_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.RegistrationDSL.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRegistrationDSL.g:978:3: ( (lv_op_1_0= ruleCompareOp ) )
            // InternalRegistrationDSL.g:979:4: (lv_op_1_0= ruleCompareOp )
            {
            // InternalRegistrationDSL.g:979:4: (lv_op_1_0= ruleCompareOp )
            // InternalRegistrationDSL.g:980:5: lv_op_1_0= ruleCompareOp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOpCompareOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_op_1_0=ruleCompareOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.RegistrationDSL.CompareOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRegistrationDSL.g:997:3: ( (lv_right_2_0= ruleExp ) )
            // InternalRegistrationDSL.g:998:4: (lv_right_2_0= ruleExp )
            {
            // InternalRegistrationDSL.g:998:4: (lv_right_2_0= ruleExp )
            // InternalRegistrationDSL.g:999:5: lv_right_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getRightExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.RegistrationDSL.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleCompareOp"
    // InternalRegistrationDSL.g:1020:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // InternalRegistrationDSL.g:1020:49: (iv_ruleCompareOp= ruleCompareOp EOF )
            // InternalRegistrationDSL.g:1021:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
             newCompositeNode(grammarAccess.getCompareOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareOp=ruleCompareOp();

            state._fsp--;

             current =iv_ruleCompareOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOp"


    // $ANTLR start "ruleCompareOp"
    // InternalRegistrationDSL.g:1027:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:1033:2: ( (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' ) )
            // InternalRegistrationDSL.g:1034:2: (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' )
            {
            // InternalRegistrationDSL.g:1034:2: (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRegistrationDSL.g:1035:3: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:1041:3: kw= '>'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:1047:3: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRegistrationDSL.g:1053:3: kw= '<='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRegistrationDSL.g:1059:3: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOp"


    // $ANTLR start "entryRuleExp"
    // InternalRegistrationDSL.g:1068:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalRegistrationDSL.g:1068:44: (iv_ruleExp= ruleExp EOF )
            // InternalRegistrationDSL.g:1069:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalRegistrationDSL.g:1075:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1081:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalRegistrationDSL.g:1082:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalRegistrationDSL.g:1082:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalRegistrationDSL.g:1083:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:1091:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=34 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1092:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalRegistrationDSL.g:1092:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==34) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==35) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalRegistrationDSL.g:1093:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRegistrationDSL.g:1093:5: (otherlv_1= '+' () )
            	            // InternalRegistrationDSL.g:1094:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRegistrationDSL.g:1098:6: ()
            	            // InternalRegistrationDSL.g:1099:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRegistrationDSL.g:1107:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRegistrationDSL.g:1107:5: (otherlv_3= '-' () )
            	            // InternalRegistrationDSL.g:1108:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,35,FOLLOW_17); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRegistrationDSL.g:1112:6: ()
            	            // InternalRegistrationDSL.g:1113:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRegistrationDSL.g:1121:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalRegistrationDSL.g:1122:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalRegistrationDSL.g:1122:5: (lv_right_5_0= ruleFactor )
            	    // InternalRegistrationDSL.g:1123:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.RegistrationDSL.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalRegistrationDSL.g:1145:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalRegistrationDSL.g:1145:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalRegistrationDSL.g:1146:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalRegistrationDSL.g:1152:1: ruleFactor returns [EObject current=null] : (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_PrimExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1158:2: ( (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* ) )
            // InternalRegistrationDSL.g:1159:2: (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* )
            {
            // InternalRegistrationDSL.g:1159:2: (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* )
            // InternalRegistrationDSL.g:1160:3: this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_PrimExp_0=rulePrimExp();

            state._fsp--;


            			current = this_PrimExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:1168:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=36 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1169:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) )
            	    {
            	    // InternalRegistrationDSL.g:1169:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==36) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==37) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalRegistrationDSL.g:1170:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRegistrationDSL.g:1170:5: (otherlv_1= '*' () )
            	            // InternalRegistrationDSL.g:1171:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,36,FOLLOW_17); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRegistrationDSL.g:1175:6: ()
            	            // InternalRegistrationDSL.g:1176:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRegistrationDSL.g:1184:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRegistrationDSL.g:1184:5: (otherlv_3= '/' () )
            	            // InternalRegistrationDSL.g:1185:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,37,FOLLOW_17); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRegistrationDSL.g:1189:6: ()
            	            // InternalRegistrationDSL.g:1190:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRegistrationDSL.g:1198:4: ( (lv_right_5_0= rulePrimExp ) )
            	    // InternalRegistrationDSL.g:1199:5: (lv_right_5_0= rulePrimExp )
            	    {
            	    // InternalRegistrationDSL.g:1199:5: (lv_right_5_0= rulePrimExp )
            	    // InternalRegistrationDSL.g:1200:6: lv_right_5_0= rulePrimExp
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_5_0=rulePrimExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.RegistrationDSL.PrimExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimExp"
    // InternalRegistrationDSL.g:1222:1: entryRulePrimExp returns [EObject current=null] : iv_rulePrimExp= rulePrimExp EOF ;
    public final EObject entryRulePrimExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimExp = null;


        try {
            // InternalRegistrationDSL.g:1222:48: (iv_rulePrimExp= rulePrimExp EOF )
            // InternalRegistrationDSL.g:1223:2: iv_rulePrimExp= rulePrimExp EOF
            {
             newCompositeNode(grammarAccess.getPrimExpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimExp=rulePrimExp();

            state._fsp--;

             current =iv_rulePrimExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimExp"


    // $ANTLR start "rulePrimExp"
    // InternalRegistrationDSL.g:1229:1: rulePrimExp returns [EObject current=null] : (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Var_0 = null;

        EObject this_Constant_1 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1235:2: ( (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) ) )
            // InternalRegistrationDSL.g:1236:2: (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) )
            {
            // InternalRegistrationDSL.g:1236:2: (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRegistrationDSL.g:1237:3: this_Var_0= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getPrimExpAccess().getVarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_0=ruleVar();

                    state._fsp--;


                    			current = this_Var_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:1246:3: this_Constant_1= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getPrimExpAccess().getConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_1=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:1255:3: (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' )
                    {
                    // InternalRegistrationDSL.g:1255:3: (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' )
                    // InternalRegistrationDSL.g:1256:4: otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimExpAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRegistrationDSL.g:1260:4: ( (lv_exp_3_0= ruleExp ) )
                    // InternalRegistrationDSL.g:1261:5: (lv_exp_3_0= ruleExp )
                    {
                    // InternalRegistrationDSL.g:1261:5: (lv_exp_3_0= ruleExp )
                    // InternalRegistrationDSL.g:1262:6: lv_exp_3_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimExpAccess().getExpExpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_exp_3_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimExpRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"org.xtext.RegistrationDSL.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimExpAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimExp"


    // $ANTLR start "entryRuleVar"
    // InternalRegistrationDSL.g:1288:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalRegistrationDSL.g:1288:44: (iv_ruleVar= ruleVar EOF )
            // InternalRegistrationDSL.g:1289:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalRegistrationDSL.g:1295:1: ruleVar returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:1301:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:1302:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:1302:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalRegistrationDSL.g:1303:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1303:3: ()
            // InternalRegistrationDSL.g:1304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalRegistrationDSL.g:1310:3: ( (otherlv_1= RULE_ID ) )
            // InternalRegistrationDSL.g:1311:4: (otherlv_1= RULE_ID )
            {
            // InternalRegistrationDSL.g:1311:4: (otherlv_1= RULE_ID )
            // InternalRegistrationDSL.g:1312:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVarAccess().getNameAttributeCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConstant"
    // InternalRegistrationDSL.g:1327:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRegistrationDSL.g:1327:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRegistrationDSL.g:1328:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalRegistrationDSL.g:1334:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:1340:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRegistrationDSL.g:1341:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRegistrationDSL.g:1341:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRegistrationDSL.g:1342:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRegistrationDSL.g:1342:3: (lv_value_0_0= RULE_INT )
            // InternalRegistrationDSL.g:1343:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004008000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001302000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});

}