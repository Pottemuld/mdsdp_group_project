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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'entity'", "':'", "'attribute'", "'relation'", "'require'", "'external'", "'('", "','", "')'", "'workflow'", "'select'", "'add'", "'to'", "'.'", "'register'", "'||'", "'&&'", "'['", "']'", "'<'", "'>'", "'=='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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

                if ( (LA1_0==14||LA1_0==19||LA1_0==23) ) {
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
    // InternalRegistrationDSL.g:139:1: ruleDeclaration returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow | this_External_2= ruleExternal ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Workflow_1 = null;

        EObject this_External_2 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:145:2: ( (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow | this_External_2= ruleExternal ) )
            // InternalRegistrationDSL.g:146:2: (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow | this_External_2= ruleExternal )
            {
            // InternalRegistrationDSL.g:146:2: (this_Entity_0= ruleEntity | this_Workflow_1= ruleWorkflow | this_External_2= ruleExternal )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalRegistrationDSL.g:165:3: this_External_2= ruleExternal
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getExternalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_External_2=ruleExternal();

                    state._fsp--;


                    			current = this_External_2;
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
    // InternalRegistrationDSL.g:177:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRegistrationDSL.g:177:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRegistrationDSL.g:178:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalRegistrationDSL.g:184:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
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
            // InternalRegistrationDSL.g:190:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // InternalRegistrationDSL.g:191:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // InternalRegistrationDSL.g:191:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // InternalRegistrationDSL.g:192:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRegistrationDSL.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:198:5: lv_name_1_0= RULE_ID
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

            // InternalRegistrationDSL.g:214:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRegistrationDSL.g:215:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
                    			
                    // InternalRegistrationDSL.g:219:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRegistrationDSL.g:220:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRegistrationDSL.g:220:5: (otherlv_3= RULE_ID )
                    // InternalRegistrationDSL.g:221:6: otherlv_3= RULE_ID
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
            		
            // InternalRegistrationDSL.g:237:3: ( (lv_fields_5_0= ruleField ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRegistrationDSL.g:238:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalRegistrationDSL.g:238:4: (lv_fields_5_0= ruleField )
            	    // InternalRegistrationDSL.g:239:5: lv_fields_5_0= ruleField
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
    // InternalRegistrationDSL.g:264:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalRegistrationDSL.g:264:46: (iv_ruleField= ruleField EOF )
            // InternalRegistrationDSL.g:265:2: iv_ruleField= ruleField EOF
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
    // InternalRegistrationDSL.g:271:1: ruleField returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Relation_1 = null;

        EObject this_Require_2 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:277:2: ( (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire ) )
            // InternalRegistrationDSL.g:278:2: (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire )
            {
            // InternalRegistrationDSL.g:278:2: (this_Attribute_0= ruleAttribute | this_Relation_1= ruleRelation | this_Require_2= ruleRequire )
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
                    // InternalRegistrationDSL.g:279:3: this_Attribute_0= ruleAttribute
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
                    // InternalRegistrationDSL.g:288:3: this_Relation_1= ruleRelation
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
                    // InternalRegistrationDSL.g:297:3: this_Require_2= ruleRequire
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
    // InternalRegistrationDSL.g:309:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRegistrationDSL.g:309:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRegistrationDSL.g:310:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRegistrationDSL.g:316:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:322:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:323:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:323:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:324:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRegistrationDSL.g:328:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:329:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:329:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:330:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRegistrationDSL.g:350:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalRegistrationDSL.g:351:4: (lv_type_3_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:351:4: (lv_type_3_0= RULE_ID )
            // InternalRegistrationDSL.g:352:5: lv_type_3_0= RULE_ID
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
    // InternalRegistrationDSL.g:372:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalRegistrationDSL.g:372:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalRegistrationDSL.g:373:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalRegistrationDSL.g:379:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:385:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:386:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:386:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalRegistrationDSL.g:387:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalRegistrationDSL.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:393:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRegistrationDSL.g:413:3: ( (otherlv_3= RULE_ID ) )
            // InternalRegistrationDSL.g:414:4: (otherlv_3= RULE_ID )
            {
            // InternalRegistrationDSL.g:414:4: (otherlv_3= RULE_ID )
            // InternalRegistrationDSL.g:415:5: otherlv_3= RULE_ID
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
    // InternalRegistrationDSL.g:430:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRegistrationDSL.g:430:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRegistrationDSL.g:431:2: iv_ruleRequire= ruleRequire EOF
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
    // InternalRegistrationDSL.g:437:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_logic_1_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:443:2: ( (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) ) )
            // InternalRegistrationDSL.g:444:2: (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) )
            {
            // InternalRegistrationDSL.g:444:2: (otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) ) )
            // InternalRegistrationDSL.g:445:3: otherlv_0= 'require' ( (lv_logic_1_0= ruleLogic ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalRegistrationDSL.g:449:3: ( (lv_logic_1_0= ruleLogic ) )
            // InternalRegistrationDSL.g:450:4: (lv_logic_1_0= ruleLogic )
            {
            // InternalRegistrationDSL.g:450:4: (lv_logic_1_0= ruleLogic )
            // InternalRegistrationDSL.g:451:5: lv_logic_1_0= ruleLogic
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


    // $ANTLR start "entryRuleExternal"
    // InternalRegistrationDSL.g:472:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalRegistrationDSL.g:472:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalRegistrationDSL.g:473:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalRegistrationDSL.g:479:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameters_3_0=null;
        Token otherlv_4=null;
        Token lv_parameters_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:485:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalRegistrationDSL.g:486:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalRegistrationDSL.g:486:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalRegistrationDSL.g:487:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalRegistrationDSL.g:491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:492:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRegistrationDSL.g:513:3: ( (lv_parameters_3_0= RULE_ID ) )
            // InternalRegistrationDSL.g:514:4: (lv_parameters_3_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:514:4: (lv_parameters_3_0= RULE_ID )
            // InternalRegistrationDSL.g:515:5: lv_parameters_3_0= RULE_ID
            {
            lv_parameters_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_parameters_3_0, grammarAccess.getExternalAccess().getParametersIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					addWithLastConsumed(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRegistrationDSL.g:531:3: (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRegistrationDSL.g:532:4: otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRegistrationDSL.g:536:4: ( (lv_parameters_5_0= RULE_ID ) )
            	    // InternalRegistrationDSL.g:537:5: (lv_parameters_5_0= RULE_ID )
            	    {
            	    // InternalRegistrationDSL.g:537:5: (lv_parameters_5_0= RULE_ID )
            	    // InternalRegistrationDSL.g:538:6: lv_parameters_5_0= RULE_ID
            	    {
            	    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(lv_parameters_5_0, grammarAccess.getExternalAccess().getParametersIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExternalRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleWorkflow"
    // InternalRegistrationDSL.g:563:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalRegistrationDSL.g:563:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalRegistrationDSL.g:564:2: iv_ruleWorkflow= ruleWorkflow EOF
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
    // InternalRegistrationDSL.g:570:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:576:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalRegistrationDSL.g:577:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalRegistrationDSL.g:577:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalRegistrationDSL.g:578:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalRegistrationDSL.g:582:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:583:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:583:4: (lv_name_1_0= RULE_ID )
            // InternalRegistrationDSL.g:584:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRegistrationDSL.g:604:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRegistrationDSL.g:605:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalRegistrationDSL.g:605:4: (lv_statements_3_0= ruleStatement )
            	    // InternalRegistrationDSL.g:606:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop7;
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
    // InternalRegistrationDSL.g:631:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRegistrationDSL.g:631:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRegistrationDSL.g:632:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRegistrationDSL.g:638:1: ruleStatement returns [EObject current=null] : (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_Add_1 = null;

        EObject this_Register_2 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:644:2: ( (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister ) )
            // InternalRegistrationDSL.g:645:2: (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister )
            {
            // InternalRegistrationDSL.g:645:2: (this_Select_0= ruleSelect | this_Add_1= ruleAdd | this_Register_2= ruleRegister )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRegistrationDSL.g:646:3: this_Select_0= ruleSelect
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
                    // InternalRegistrationDSL.g:655:3: this_Add_1= ruleAdd
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
                    // InternalRegistrationDSL.g:664:3: this_Register_2= ruleRegister
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
    // InternalRegistrationDSL.g:676:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalRegistrationDSL.g:676:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalRegistrationDSL.g:677:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalRegistrationDSL.g:683:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_entityName_2_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:689:2: ( (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:690:2: (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:690:2: (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:691:3: otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) ( (lv_entityName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalRegistrationDSL.g:695:3: ( (otherlv_1= RULE_ID ) )
            // InternalRegistrationDSL.g:696:4: (otherlv_1= RULE_ID )
            {
            // InternalRegistrationDSL.g:696:4: (otherlv_1= RULE_ID )
            // InternalRegistrationDSL.g:697:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getSelectTypeEntityCrossReference_1_0());
            				

            }


            }

            // InternalRegistrationDSL.g:708:3: ( (lv_entityName_2_0= RULE_ID ) )
            // InternalRegistrationDSL.g:709:4: (lv_entityName_2_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:709:4: (lv_entityName_2_0= RULE_ID )
            // InternalRegistrationDSL.g:710:5: lv_entityName_2_0= RULE_ID
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
    // InternalRegistrationDSL.g:730:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalRegistrationDSL.g:730:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalRegistrationDSL.g:731:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalRegistrationDSL.g:737:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) ) ;
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
            // InternalRegistrationDSL.g:743:2: ( (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:744:2: (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:744:2: (otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:745:3: otherlv_0= 'add' ( (lv_selectedEntityName_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_toEntity_3_0= RULE_ID ) ) otherlv_4= '.' ( (lv_toEntityRelation_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		
            // InternalRegistrationDSL.g:749:3: ( (lv_selectedEntityName_1_0= RULE_ID ) )
            // InternalRegistrationDSL.g:750:4: (lv_selectedEntityName_1_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:750:4: (lv_selectedEntityName_1_0= RULE_ID )
            // InternalRegistrationDSL.g:751:5: lv_selectedEntityName_1_0= RULE_ID
            {
            lv_selectedEntityName_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getToKeyword_2());
            		
            // InternalRegistrationDSL.g:771:3: ( (lv_toEntity_3_0= RULE_ID ) )
            // InternalRegistrationDSL.g:772:4: (lv_toEntity_3_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:772:4: (lv_toEntity_3_0= RULE_ID )
            // InternalRegistrationDSL.g:773:5: lv_toEntity_3_0= RULE_ID
            {
            lv_toEntity_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAccess().getFullStopKeyword_4());
            		
            // InternalRegistrationDSL.g:793:3: ( (lv_toEntityRelation_5_0= RULE_ID ) )
            // InternalRegistrationDSL.g:794:4: (lv_toEntityRelation_5_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:794:4: (lv_toEntityRelation_5_0= RULE_ID )
            // InternalRegistrationDSL.g:795:5: lv_toEntityRelation_5_0= RULE_ID
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
    // InternalRegistrationDSL.g:815:1: entryRuleRegister returns [EObject current=null] : iv_ruleRegister= ruleRegister EOF ;
    public final EObject entryRuleRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegister = null;


        try {
            // InternalRegistrationDSL.g:815:49: (iv_ruleRegister= ruleRegister EOF )
            // InternalRegistrationDSL.g:816:2: iv_ruleRegister= ruleRegister EOF
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
    // InternalRegistrationDSL.g:822:1: ruleRegister returns [EObject current=null] : (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:828:2: ( (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:829:2: (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:829:2: (otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalRegistrationDSL.g:830:3: otherlv_0= 'register' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegisterAccess().getRegisterKeyword_0());
            		
            // InternalRegistrationDSL.g:834:3: ( (otherlv_1= RULE_ID ) )
            // InternalRegistrationDSL.g:835:4: (otherlv_1= RULE_ID )
            {
            // InternalRegistrationDSL.g:835:4: (otherlv_1= RULE_ID )
            // InternalRegistrationDSL.g:836:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getRegisterAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            // InternalRegistrationDSL.g:847:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRegistrationDSL.g:848:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:848:4: (lv_name_2_0= RULE_ID )
            // InternalRegistrationDSL.g:849:5: lv_name_2_0= RULE_ID
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
    // InternalRegistrationDSL.g:869:1: entryRuleLogic returns [EObject current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final EObject entryRuleLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogic = null;


        try {
            // InternalRegistrationDSL.g:869:46: (iv_ruleLogic= ruleLogic EOF )
            // InternalRegistrationDSL.g:870:2: iv_ruleLogic= ruleLogic EOF
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
    // InternalRegistrationDSL.g:876:1: ruleLogic returns [EObject current=null] : (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:882:2: ( (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalRegistrationDSL.g:883:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalRegistrationDSL.g:883:2: (this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalRegistrationDSL.g:884:3: this_Conjunction_0= ruleConjunction (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:892:3: (otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRegistrationDSL.g:893:4: otherlv_1= '||' () ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLogicAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalRegistrationDSL.g:897:4: ()
            	    // InternalRegistrationDSL.g:898:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRegistrationDSL.g:904:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalRegistrationDSL.g:905:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalRegistrationDSL.g:905:5: (lv_right_3_0= ruleConjunction )
            	    // InternalRegistrationDSL.g:906:6: lv_right_3_0= ruleConjunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicAccess().getRightConjunctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleConjunction"
    // InternalRegistrationDSL.g:928:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalRegistrationDSL.g:928:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalRegistrationDSL.g:929:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalRegistrationDSL.g:935:1: ruleConjunction returns [EObject current=null] : (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimLogic_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:941:2: ( (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* ) )
            // InternalRegistrationDSL.g:942:2: (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* )
            {
            // InternalRegistrationDSL.g:942:2: (this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )* )
            // InternalRegistrationDSL.g:943:3: this_PrimLogic_0= rulePrimLogic (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getPrimLogicParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_PrimLogic_0=rulePrimLogic();

            state._fsp--;


            			current = this_PrimLogic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:951:3: (otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRegistrationDSL.g:952:4: otherlv_1= '&&' () ( (lv_right_3_0= rulePrimLogic ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalRegistrationDSL.g:956:4: ()
            	    // InternalRegistrationDSL.g:957:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRegistrationDSL.g:963:4: ( (lv_right_3_0= rulePrimLogic ) )
            	    // InternalRegistrationDSL.g:964:5: (lv_right_3_0= rulePrimLogic )
            	    {
            	    // InternalRegistrationDSL.g:964:5: (lv_right_3_0= rulePrimLogic )
            	    // InternalRegistrationDSL.g:965:6: lv_right_3_0= rulePrimLogic
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getRightPrimLogicParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop10;
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
    // InternalRegistrationDSL.g:987:1: entryRulePrimLogic returns [EObject current=null] : iv_rulePrimLogic= rulePrimLogic EOF ;
    public final EObject entryRulePrimLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimLogic = null;


        try {
            // InternalRegistrationDSL.g:987:50: (iv_rulePrimLogic= rulePrimLogic EOF )
            // InternalRegistrationDSL.g:988:2: iv_rulePrimLogic= rulePrimLogic EOF
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
    // InternalRegistrationDSL.g:994:1: rulePrimLogic returns [EObject current=null] : (this_ExternalCall_0= ruleExternalCall | this_Comparison_1= ruleComparison | (otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']' ) ) ;
    public final EObject rulePrimLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ExternalCall_0 = null;

        EObject this_Comparison_1 = null;

        EObject lv_logic_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1000:2: ( (this_ExternalCall_0= ruleExternalCall | this_Comparison_1= ruleComparison | (otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']' ) ) )
            // InternalRegistrationDSL.g:1001:2: (this_ExternalCall_0= ruleExternalCall | this_Comparison_1= ruleComparison | (otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']' ) )
            {
            // InternalRegistrationDSL.g:1001:2: (this_ExternalCall_0= ruleExternalCall | this_Comparison_1= ruleComparison | (otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=33 && LA11_1<=41)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==20) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 20:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRegistrationDSL.g:1002:3: this_ExternalCall_0= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getPrimLogicAccess().getExternalCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_0=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:1011:3: this_Comparison_1= ruleComparison
                    {

                    			newCompositeNode(grammarAccess.getPrimLogicAccess().getComparisonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparison_1=ruleComparison();

                    state._fsp--;


                    			current = this_Comparison_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:1020:3: (otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']' )
                    {
                    // InternalRegistrationDSL.g:1020:3: (otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']' )
                    // InternalRegistrationDSL.g:1021:4: otherlv_2= '[' ( (lv_logic_3_0= ruleLogic ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimLogicAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRegistrationDSL.g:1025:4: ( (lv_logic_3_0= ruleLogic ) )
                    // InternalRegistrationDSL.g:1026:5: (lv_logic_3_0= ruleLogic )
                    {
                    // InternalRegistrationDSL.g:1026:5: (lv_logic_3_0= ruleLogic )
                    // InternalRegistrationDSL.g:1027:6: lv_logic_3_0= ruleLogic
                    {

                    						newCompositeNode(grammarAccess.getPrimLogicAccess().getLogicLogicParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_logic_3_0=ruleLogic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimLogicRule());
                    						}
                    						set(
                    							current,
                    							"logic",
                    							lv_logic_3_0,
                    							"org.xtext.RegistrationDSL.Logic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimLogicAccess().getRightSquareBracketKeyword_2_2());
                    			

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


    // $ANTLR start "entryRuleExternalCall"
    // InternalRegistrationDSL.g:1053:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalRegistrationDSL.g:1053:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalRegistrationDSL.g:1054:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
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
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalRegistrationDSL.g:1060:1: ruleExternalCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1066:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* otherlv_5= ')' ) )
            // InternalRegistrationDSL.g:1067:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* otherlv_5= ')' )
            {
            // InternalRegistrationDSL.g:1067:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* otherlv_5= ')' )
            // InternalRegistrationDSL.g:1068:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_arguments_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )* otherlv_5= ')'
            {
            // InternalRegistrationDSL.g:1068:3: ( (otherlv_0= RULE_ID ) )
            // InternalRegistrationDSL.g:1069:4: (otherlv_0= RULE_ID )
            {
            // InternalRegistrationDSL.g:1069:4: (otherlv_0= RULE_ID )
            // InternalRegistrationDSL.g:1070:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getTargetExternalCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRegistrationDSL.g:1085:3: ( (lv_arguments_2_0= ruleExp ) )
            // InternalRegistrationDSL.g:1086:4: (lv_arguments_2_0= ruleExp )
            {
            // InternalRegistrationDSL.g:1086:4: (lv_arguments_2_0= ruleExp )
            // InternalRegistrationDSL.g:1087:5: lv_arguments_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getExternalCallAccess().getArgumentsExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_arguments_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalCallRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_2_0,
            						"org.xtext.RegistrationDSL.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRegistrationDSL.g:1104:3: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1105:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExp ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRegistrationDSL.g:1109:4: ( (lv_arguments_4_0= ruleExp ) )
            	    // InternalRegistrationDSL.g:1110:5: (lv_arguments_4_0= ruleExp )
            	    {
            	    // InternalRegistrationDSL.g:1110:5: (lv_arguments_4_0= ruleExp )
            	    // InternalRegistrationDSL.g:1111:6: lv_arguments_4_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgumentsExpParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_arguments_4_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_4_0,
            	    							"org.xtext.RegistrationDSL.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleComparison"
    // InternalRegistrationDSL.g:1137:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalRegistrationDSL.g:1137:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalRegistrationDSL.g:1138:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalRegistrationDSL.g:1144:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1150:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalRegistrationDSL.g:1151:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalRegistrationDSL.g:1151:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalRegistrationDSL.g:1152:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_op_1_0= ruleCompareOp ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalRegistrationDSL.g:1152:3: ( (lv_left_0_0= ruleExp ) )
            // InternalRegistrationDSL.g:1153:4: (lv_left_0_0= ruleExp )
            {
            // InternalRegistrationDSL.g:1153:4: (lv_left_0_0= ruleExp )
            // InternalRegistrationDSL.g:1154:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalRegistrationDSL.g:1171:3: ( (lv_op_1_0= ruleCompareOp ) )
            // InternalRegistrationDSL.g:1172:4: (lv_op_1_0= ruleCompareOp )
            {
            // InternalRegistrationDSL.g:1172:4: (lv_op_1_0= ruleCompareOp )
            // InternalRegistrationDSL.g:1173:5: lv_op_1_0= ruleCompareOp
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOpCompareOpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalRegistrationDSL.g:1190:3: ( (lv_right_2_0= ruleExp ) )
            // InternalRegistrationDSL.g:1191:4: (lv_right_2_0= ruleExp )
            {
            // InternalRegistrationDSL.g:1191:4: (lv_right_2_0= ruleExp )
            // InternalRegistrationDSL.g:1192:5: lv_right_2_0= ruleExp
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
    // InternalRegistrationDSL.g:1213:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // InternalRegistrationDSL.g:1213:49: (iv_ruleCompareOp= ruleCompareOp EOF )
            // InternalRegistrationDSL.g:1214:2: iv_ruleCompareOp= ruleCompareOp EOF
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
    // InternalRegistrationDSL.g:1220:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:1226:2: ( (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' ) )
            // InternalRegistrationDSL.g:1227:2: (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' )
            {
            // InternalRegistrationDSL.g:1227:2: (kw= '<' | kw= '>' | kw= '==' | kw= '<=' | kw= '>=' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 36:
                {
                alt13=4;
                }
                break;
            case 37:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRegistrationDSL.g:1228:3: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRegistrationDSL.g:1234:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRegistrationDSL.g:1240:3: kw= '=='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRegistrationDSL.g:1246:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRegistrationDSL.g:1252:3: kw= '>='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalRegistrationDSL.g:1261:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalRegistrationDSL.g:1261:44: (iv_ruleExp= ruleExp EOF )
            // InternalRegistrationDSL.g:1262:2: iv_ruleExp= ruleExp EOF
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
    // InternalRegistrationDSL.g:1268:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1274:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalRegistrationDSL.g:1275:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalRegistrationDSL.g:1275:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalRegistrationDSL.g:1276:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:1284:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=38 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1285:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalRegistrationDSL.g:1285:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==38) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==39) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalRegistrationDSL.g:1286:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRegistrationDSL.g:1286:5: (otherlv_1= '+' () )
            	            // InternalRegistrationDSL.g:1287:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,38,FOLLOW_18); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRegistrationDSL.g:1291:6: ()
            	            // InternalRegistrationDSL.g:1292:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRegistrationDSL.g:1300:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRegistrationDSL.g:1300:5: (otherlv_3= '-' () )
            	            // InternalRegistrationDSL.g:1301:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,39,FOLLOW_18); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRegistrationDSL.g:1305:6: ()
            	            // InternalRegistrationDSL.g:1306:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRegistrationDSL.g:1314:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalRegistrationDSL.g:1315:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalRegistrationDSL.g:1315:5: (lv_right_5_0= ruleFactor )
            	    // InternalRegistrationDSL.g:1316:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalRegistrationDSL.g:1338:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalRegistrationDSL.g:1338:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalRegistrationDSL.g:1339:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalRegistrationDSL.g:1345:1: ruleFactor returns [EObject current=null] : (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_PrimExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1351:2: ( (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* ) )
            // InternalRegistrationDSL.g:1352:2: (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* )
            {
            // InternalRegistrationDSL.g:1352:2: (this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )* )
            // InternalRegistrationDSL.g:1353:3: this_PrimExp_0= rulePrimExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_PrimExp_0=rulePrimExp();

            state._fsp--;


            			current = this_PrimExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegistrationDSL.g:1361:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRegistrationDSL.g:1362:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimExp ) )
            	    {
            	    // InternalRegistrationDSL.g:1362:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==40) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==41) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalRegistrationDSL.g:1363:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRegistrationDSL.g:1363:5: (otherlv_1= '*' () )
            	            // InternalRegistrationDSL.g:1364:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,40,FOLLOW_18); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRegistrationDSL.g:1368:6: ()
            	            // InternalRegistrationDSL.g:1369:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRegistrationDSL.g:1377:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRegistrationDSL.g:1377:5: (otherlv_3= '/' () )
            	            // InternalRegistrationDSL.g:1378:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,41,FOLLOW_18); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRegistrationDSL.g:1382:6: ()
            	            // InternalRegistrationDSL.g:1383:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRegistrationDSL.g:1391:4: ( (lv_right_5_0= rulePrimExp ) )
            	    // InternalRegistrationDSL.g:1392:5: (lv_right_5_0= rulePrimExp )
            	    {
            	    // InternalRegistrationDSL.g:1392:5: (lv_right_5_0= rulePrimExp )
            	    // InternalRegistrationDSL.g:1393:6: lv_right_5_0= rulePrimExp
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop17;
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
    // InternalRegistrationDSL.g:1415:1: entryRulePrimExp returns [EObject current=null] : iv_rulePrimExp= rulePrimExp EOF ;
    public final EObject entryRulePrimExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimExp = null;


        try {
            // InternalRegistrationDSL.g:1415:48: (iv_rulePrimExp= rulePrimExp EOF )
            // InternalRegistrationDSL.g:1416:2: iv_rulePrimExp= rulePrimExp EOF
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
    // InternalRegistrationDSL.g:1422:1: rulePrimExp returns [EObject current=null] : (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Var_0 = null;

        EObject this_Constant_1 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalRegistrationDSL.g:1428:2: ( (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) ) )
            // InternalRegistrationDSL.g:1429:2: (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) )
            {
            // InternalRegistrationDSL.g:1429:2: (this_Var_0= ruleVar | this_Constant_1= ruleConstant | (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRegistrationDSL.g:1430:3: this_Var_0= ruleVar
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
                    // InternalRegistrationDSL.g:1439:3: this_Constant_1= ruleConstant
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
                    // InternalRegistrationDSL.g:1448:3: (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' )
                    {
                    // InternalRegistrationDSL.g:1448:3: (otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')' )
                    // InternalRegistrationDSL.g:1449:4: otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimExpAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRegistrationDSL.g:1453:4: ( (lv_exp_3_0= ruleExp ) )
                    // InternalRegistrationDSL.g:1454:5: (lv_exp_3_0= ruleExp )
                    {
                    // InternalRegistrationDSL.g:1454:5: (lv_exp_3_0= ruleExp )
                    // InternalRegistrationDSL.g:1455:6: lv_exp_3_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimExpAccess().getExpExpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalRegistrationDSL.g:1481:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalRegistrationDSL.g:1481:44: (iv_ruleVar= ruleVar EOF )
            // InternalRegistrationDSL.g:1482:2: iv_ruleVar= ruleVar EOF
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
    // InternalRegistrationDSL.g:1488:1: ruleVar returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:1494:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRegistrationDSL.g:1495:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRegistrationDSL.g:1495:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalRegistrationDSL.g:1496:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalRegistrationDSL.g:1496:3: ()
            // InternalRegistrationDSL.g:1497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalRegistrationDSL.g:1503:3: ( (otherlv_1= RULE_ID ) )
            // InternalRegistrationDSL.g:1504:4: (otherlv_1= RULE_ID )
            {
            // InternalRegistrationDSL.g:1504:4: (otherlv_1= RULE_ID )
            // InternalRegistrationDSL.g:1505:5: otherlv_1= RULE_ID
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
    // InternalRegistrationDSL.g:1520:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRegistrationDSL.g:1520:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRegistrationDSL.g:1521:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalRegistrationDSL.g:1527:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRegistrationDSL.g:1533:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRegistrationDSL.g:1534:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRegistrationDSL.g:1534:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRegistrationDSL.g:1535:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRegistrationDSL.g:1535:3: (lv_value_0_0= RULE_INT )
            // InternalRegistrationDSL.g:1536:4: lv_value_0_0= RULE_INT
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000886000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080100030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000013002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});

}