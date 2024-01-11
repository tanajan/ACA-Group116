package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DBModel'", "'{'", "'collections'", "'['", "']'", "'}'", "'Collection'", "'fields'", "'indexes'", "'Field'", "':'", "'String'", "'Number'", "'Boolean'", "'Date'", "'Object'", "'Array'", "'<'", "'>'", "'ObjectId'", "'Index'", "','", "'seedData'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DBModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDBModel"
    // InternalMyDsl.g:64:1: entryRuleDBModel returns [EObject current=null] : iv_ruleDBModel= ruleDBModel EOF ;
    public final EObject entryRuleDBModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBModel = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleDBModel= ruleDBModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleDBModel= ruleDBModel EOF
            {
             newCompositeNode(grammarAccess.getDBModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBModel=ruleDBModel();

            state._fsp--;

             current =iv_ruleDBModel; 
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
    // $ANTLR end "entryRuleDBModel"


    // $ANTLR start "ruleDBModel"
    // InternalMyDsl.g:71:1: ruleDBModel returns [EObject current=null] : ( () otherlv_1= 'DBModel' otherlv_2= '{' otherlv_3= 'collections' otherlv_4= '[' ( (lv_collections_5_0= ruleCollection ) )* otherlv_6= ']' otherlv_7= '}' ) ;
    public final EObject ruleDBModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_collections_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'DBModel' otherlv_2= '{' otherlv_3= 'collections' otherlv_4= '[' ( (lv_collections_5_0= ruleCollection ) )* otherlv_6= ']' otherlv_7= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'DBModel' otherlv_2= '{' otherlv_3= 'collections' otherlv_4= '[' ( (lv_collections_5_0= ruleCollection ) )* otherlv_6= ']' otherlv_7= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'DBModel' otherlv_2= '{' otherlv_3= 'collections' otherlv_4= '[' ( (lv_collections_5_0= ruleCollection ) )* otherlv_6= ']' otherlv_7= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'DBModel' otherlv_2= '{' otherlv_3= 'collections' otherlv_4= '[' ( (lv_collections_5_0= ruleCollection ) )* otherlv_6= ']' otherlv_7= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDBModelAccess().getDBModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDBModelAccess().getDBModelKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDBModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDBModelAccess().getCollectionsKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDBModelAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalMyDsl.g:102:3: ( (lv_collections_5_0= ruleCollection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:103:4: (lv_collections_5_0= ruleCollection )
            	    {
            	    // InternalMyDsl.g:103:4: (lv_collections_5_0= ruleCollection )
            	    // InternalMyDsl.g:104:5: lv_collections_5_0= ruleCollection
            	    {

            	    					newCompositeNode(grammarAccess.getDBModelAccess().getCollectionsCollectionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_collections_5_0=ruleCollection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDBModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"collections",
            	    						lv_collections_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Collection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDBModelAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDBModelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDBModel"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:133:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:133:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:134:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:140:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'fields' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'indexes' otherlv_8= '{' ( (lv_indexes_9_0= ruleIndex ) )* otherlv_10= '}' ( (lv_seedData_11_0= ruleSeedData ) )? otherlv_12= '}' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_fields_5_0 = null;

        EObject lv_indexes_9_0 = null;

        EObject lv_seedData_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:146:2: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'fields' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'indexes' otherlv_8= '{' ( (lv_indexes_9_0= ruleIndex ) )* otherlv_10= '}' ( (lv_seedData_11_0= ruleSeedData ) )? otherlv_12= '}' ) )
            // InternalMyDsl.g:147:2: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'fields' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'indexes' otherlv_8= '{' ( (lv_indexes_9_0= ruleIndex ) )* otherlv_10= '}' ( (lv_seedData_11_0= ruleSeedData ) )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:147:2: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'fields' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'indexes' otherlv_8= '{' ( (lv_indexes_9_0= ruleIndex ) )* otherlv_10= '}' ( (lv_seedData_11_0= ruleSeedData ) )? otherlv_12= '}' )
            // InternalMyDsl.g:148:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'fields' otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' otherlv_7= 'indexes' otherlv_8= '{' ( (lv_indexes_9_0= ruleIndex ) )* otherlv_10= '}' ( (lv_seedData_11_0= ruleSeedData ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
            		
            // InternalMyDsl.g:152:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:153:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:153:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:154:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCollectionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getFieldsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:182:3: ( (lv_fields_5_0= ruleField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:183:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalMyDsl.g:183:4: (lv_fields_5_0= ruleField )
            	    // InternalMyDsl.g:184:5: lv_fields_5_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getCollectionAccess().getFieldsFieldParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCollectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCollectionAccess().getIndexesKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:213:3: ( (lv_indexes_9_0= ruleIndex ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==33) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:214:4: (lv_indexes_9_0= ruleIndex )
            	    {
            	    // InternalMyDsl.g:214:4: (lv_indexes_9_0= ruleIndex )
            	    // InternalMyDsl.g:215:5: lv_indexes_9_0= ruleIndex
            	    {

            	    					newCompositeNode(grammarAccess.getCollectionAccess().getIndexesIndexParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_indexes_9_0=ruleIndex();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCollectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"indexes",
            	    						lv_indexes_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Index");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:236:3: ( (lv_seedData_11_0= ruleSeedData ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:237:4: (lv_seedData_11_0= ruleSeedData )
                    {
                    // InternalMyDsl.g:237:4: (lv_seedData_11_0= ruleSeedData )
                    // InternalMyDsl.g:238:5: lv_seedData_11_0= ruleSeedData
                    {

                    					newCompositeNode(grammarAccess.getCollectionAccess().getSeedDataSeedDataParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_seedData_11_0=ruleSeedData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCollectionRule());
                    					}
                    					set(
                    						current,
                    						"seedData",
                    						lv_seedData_11_0,
                    						"org.xtext.example.mydsl.MyDsl.SeedData");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleField"
    // InternalMyDsl.g:263:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMyDsl.g:263:46: (iv_ruleField= ruleField EOF )
            // InternalMyDsl.g:264:2: iv_ruleField= ruleField EOF
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
    // InternalMyDsl.g:270:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:276:2: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalMyDsl.g:277:2: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalMyDsl.g:277:2: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            // InternalMyDsl.g:278:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalMyDsl.g:282:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:283:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:283:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:284:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:304:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalMyDsl.g:305:4: (lv_type_3_0= ruleDataType )
            {
            // InternalMyDsl.g:305:4: (lv_type_3_0= ruleDataType )
            // InternalMyDsl.g:306:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.DataType");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:327:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalMyDsl.g:327:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalMyDsl.g:328:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:334:1: ruleDataType returns [EObject current=null] : ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Number' ) | ( () otherlv_5= 'Boolean' ) | ( () otherlv_7= 'Date' ) | ( () otherlv_9= 'Object' ) | (otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>' ) | ( () otherlv_15= 'ObjectId' ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_dataType_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:340:2: ( ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Number' ) | ( () otherlv_5= 'Boolean' ) | ( () otherlv_7= 'Date' ) | ( () otherlv_9= 'Object' ) | (otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>' ) | ( () otherlv_15= 'ObjectId' ) ) )
            // InternalMyDsl.g:341:2: ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Number' ) | ( () otherlv_5= 'Boolean' ) | ( () otherlv_7= 'Date' ) | ( () otherlv_9= 'Object' ) | (otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>' ) | ( () otherlv_15= 'ObjectId' ) )
            {
            // InternalMyDsl.g:341:2: ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Number' ) | ( () otherlv_5= 'Boolean' ) | ( () otherlv_7= 'Date' ) | ( () otherlv_9= 'Object' ) | (otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>' ) | ( () otherlv_15= 'ObjectId' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
                {
                alt5=5;
                }
                break;
            case 29:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:342:3: ( () otherlv_1= 'String' )
                    {
                    // InternalMyDsl.g:342:3: ( () otherlv_1= 'String' )
                    // InternalMyDsl.g:343:4: () otherlv_1= 'String'
                    {
                    // InternalMyDsl.g:343:4: ()
                    // InternalMyDsl.g:344:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:356:3: ( () otherlv_3= 'Number' )
                    {
                    // InternalMyDsl.g:356:3: ( () otherlv_3= 'Number' )
                    // InternalMyDsl.g:357:4: () otherlv_3= 'Number'
                    {
                    // InternalMyDsl.g:357:4: ()
                    // InternalMyDsl.g:358:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getNumberKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:370:3: ( () otherlv_5= 'Boolean' )
                    {
                    // InternalMyDsl.g:370:3: ( () otherlv_5= 'Boolean' )
                    // InternalMyDsl.g:371:4: () otherlv_5= 'Boolean'
                    {
                    // InternalMyDsl.g:371:4: ()
                    // InternalMyDsl.g:372:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getBooleanKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:384:3: ( () otherlv_7= 'Date' )
                    {
                    // InternalMyDsl.g:384:3: ( () otherlv_7= 'Date' )
                    // InternalMyDsl.g:385:4: () otherlv_7= 'Date'
                    {
                    // InternalMyDsl.g:385:4: ()
                    // InternalMyDsl.g:386:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getDateKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:398:3: ( () otherlv_9= 'Object' )
                    {
                    // InternalMyDsl.g:398:3: ( () otherlv_9= 'Object' )
                    // InternalMyDsl.g:399:4: () otherlv_9= 'Object'
                    {
                    // InternalMyDsl.g:399:4: ()
                    // InternalMyDsl.g:400:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataTypeAccess().getObjectKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:412:3: (otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>' )
                    {
                    // InternalMyDsl.g:412:3: (otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>' )
                    // InternalMyDsl.g:413:4: otherlv_10= 'Array' otherlv_11= '<' ( (lv_dataType_12_0= ruleDataType ) ) otherlv_13= '>'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getDataTypeAccess().getArrayKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getDataTypeAccess().getLessThanSignKeyword_5_1());
                    			
                    // InternalMyDsl.g:421:4: ( (lv_dataType_12_0= ruleDataType ) )
                    // InternalMyDsl.g:422:5: (lv_dataType_12_0= ruleDataType )
                    {
                    // InternalMyDsl.g:422:5: (lv_dataType_12_0= ruleDataType )
                    // InternalMyDsl.g:423:6: lv_dataType_12_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeDataTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_dataType_12_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"dataType",
                    							lv_dataType_12_0,
                    							"org.xtext.example.mydsl.MyDsl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataTypeAccess().getGreaterThanSignKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:446:3: ( () otherlv_15= 'ObjectId' )
                    {
                    // InternalMyDsl.g:446:3: ( () otherlv_15= 'ObjectId' )
                    // InternalMyDsl.g:447:4: () otherlv_15= 'ObjectId'
                    {
                    // InternalMyDsl.g:447:4: ()
                    // InternalMyDsl.g:448:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDataTypeAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDataTypeAccess().getObjectIdKeyword_6_1());
                    			

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleIndex"
    // InternalMyDsl.g:463:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // InternalMyDsl.g:463:46: (iv_ruleIndex= ruleIndex EOF )
            // InternalMyDsl.g:464:2: iv_ruleIndex= ruleIndex EOF
            {
             newCompositeNode(grammarAccess.getIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndex=ruleIndex();

            state._fsp--;

             current =iv_ruleIndex; 
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
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalMyDsl.g:470:1: ruleIndex returns [EObject current=null] : (otherlv_0= 'Index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_fields_4_0= RULE_STRING ) )* otherlv_5= ',' ( (lv_fields_6_0= RULE_STRING ) )* otherlv_7= '}' ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fields_4_0=null;
        Token otherlv_5=null;
        Token lv_fields_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:476:2: ( (otherlv_0= 'Index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_fields_4_0= RULE_STRING ) )* otherlv_5= ',' ( (lv_fields_6_0= RULE_STRING ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:477:2: (otherlv_0= 'Index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_fields_4_0= RULE_STRING ) )* otherlv_5= ',' ( (lv_fields_6_0= RULE_STRING ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:477:2: (otherlv_0= 'Index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_fields_4_0= RULE_STRING ) )* otherlv_5= ',' ( (lv_fields_6_0= RULE_STRING ) )* otherlv_7= '}' )
            // InternalMyDsl.g:478:3: otherlv_0= 'Index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_fields_4_0= RULE_STRING ) )* otherlv_5= ',' ( (lv_fields_6_0= RULE_STRING ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexAccess().getIndexKeyword_0());
            		
            // InternalMyDsl.g:482:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:483:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:483:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:484:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndexAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:508:3: ( (lv_fields_4_0= RULE_STRING ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:509:4: (lv_fields_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:509:4: (lv_fields_4_0= RULE_STRING )
            	    // InternalMyDsl.g:510:5: lv_fields_4_0= RULE_STRING
            	    {
            	    lv_fields_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    					newLeafNode(lv_fields_4_0, grammarAccess.getIndexAccess().getFieldsSTRINGTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIndexRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"fields",
            	    						lv_fields_4_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:530:3: ( (lv_fields_6_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:531:4: (lv_fields_6_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:531:4: (lv_fields_6_0= RULE_STRING )
            	    // InternalMyDsl.g:532:5: lv_fields_6_0= RULE_STRING
            	    {
            	    lv_fields_6_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    					newLeafNode(lv_fields_6_0, grammarAccess.getIndexAccess().getFieldsSTRINGTerminalRuleCall_6_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIndexRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"fields",
            	    						lv_fields_6_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIndexAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleSeedData"
    // InternalMyDsl.g:556:1: entryRuleSeedData returns [EObject current=null] : iv_ruleSeedData= ruleSeedData EOF ;
    public final EObject entryRuleSeedData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeedData = null;


        try {
            // InternalMyDsl.g:556:49: (iv_ruleSeedData= ruleSeedData EOF )
            // InternalMyDsl.g:557:2: iv_ruleSeedData= ruleSeedData EOF
            {
             newCompositeNode(grammarAccess.getSeedDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeedData=ruleSeedData();

            state._fsp--;

             current =iv_ruleSeedData; 
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
    // $ANTLR end "entryRuleSeedData"


    // $ANTLR start "ruleSeedData"
    // InternalMyDsl.g:563:1: ruleSeedData returns [EObject current=null] : (otherlv_0= 'seedData' ( (lv_collectionName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_dataArrays_3_0= ruleDataArray ) )* otherlv_4= '}' ) ;
    public final EObject ruleSeedData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_collectionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dataArrays_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:569:2: ( (otherlv_0= 'seedData' ( (lv_collectionName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_dataArrays_3_0= ruleDataArray ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:570:2: (otherlv_0= 'seedData' ( (lv_collectionName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_dataArrays_3_0= ruleDataArray ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:570:2: (otherlv_0= 'seedData' ( (lv_collectionName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_dataArrays_3_0= ruleDataArray ) )* otherlv_4= '}' )
            // InternalMyDsl.g:571:3: otherlv_0= 'seedData' ( (lv_collectionName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_dataArrays_3_0= ruleDataArray ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSeedDataAccess().getSeedDataKeyword_0());
            		
            // InternalMyDsl.g:575:3: ( (lv_collectionName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:576:4: (lv_collectionName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:576:4: (lv_collectionName_1_0= RULE_STRING )
            // InternalMyDsl.g:577:5: lv_collectionName_1_0= RULE_STRING
            {
            lv_collectionName_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_collectionName_1_0, grammarAccess.getSeedDataAccess().getCollectionNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeedDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"collectionName",
            						lv_collectionName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSeedDataAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:597:3: ( (lv_dataArrays_3_0= ruleDataArray ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:598:4: (lv_dataArrays_3_0= ruleDataArray )
            	    {
            	    // InternalMyDsl.g:598:4: (lv_dataArrays_3_0= ruleDataArray )
            	    // InternalMyDsl.g:599:5: lv_dataArrays_3_0= ruleDataArray
            	    {

            	    					newCompositeNode(grammarAccess.getSeedDataAccess().getDataArraysDataArrayParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_dataArrays_3_0=ruleDataArray();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeedDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataArrays",
            	    						lv_dataArrays_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.DataArray");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSeedDataAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSeedData"


    // $ANTLR start "entryRuleDataArray"
    // InternalMyDsl.g:624:1: entryRuleDataArray returns [EObject current=null] : iv_ruleDataArray= ruleDataArray EOF ;
    public final EObject entryRuleDataArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataArray = null;


        try {
            // InternalMyDsl.g:624:50: (iv_ruleDataArray= ruleDataArray EOF )
            // InternalMyDsl.g:625:2: iv_ruleDataArray= ruleDataArray EOF
            {
             newCompositeNode(grammarAccess.getDataArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataArray=ruleDataArray();

            state._fsp--;

             current =iv_ruleDataArray; 
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
    // $ANTLR end "entryRuleDataArray"


    // $ANTLR start "ruleDataArray"
    // InternalMyDsl.g:631:1: ruleDataArray returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_dataPairs_2_0= ruleDataPair ) )* otherlv_3= '}' ) ;
    public final EObject ruleDataArray() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataPairs_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:637:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_dataPairs_2_0= ruleDataPair ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_dataPairs_2_0= ruleDataPair ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_dataPairs_2_0= ruleDataPair ) )* otherlv_3= '}' )
            // InternalMyDsl.g:639:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_dataPairs_2_0= ruleDataPair ) )* otherlv_3= '}'
            {
            // InternalMyDsl.g:639:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:640:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:640:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:641:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDataArrayAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDataArrayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:661:3: ( (lv_dataPairs_2_0= ruleDataPair ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:662:4: (lv_dataPairs_2_0= ruleDataPair )
            	    {
            	    // InternalMyDsl.g:662:4: (lv_dataPairs_2_0= ruleDataPair )
            	    // InternalMyDsl.g:663:5: lv_dataPairs_2_0= ruleDataPair
            	    {

            	    					newCompositeNode(grammarAccess.getDataArrayAccess().getDataPairsDataPairParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_dataPairs_2_0=ruleDataPair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataArrayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataPairs",
            	    						lv_dataPairs_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.DataPair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataArrayAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleDataArray"


    // $ANTLR start "entryRuleDataPair"
    // InternalMyDsl.g:688:1: entryRuleDataPair returns [EObject current=null] : iv_ruleDataPair= ruleDataPair EOF ;
    public final EObject entryRuleDataPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPair = null;


        try {
            // InternalMyDsl.g:688:49: (iv_ruleDataPair= ruleDataPair EOF )
            // InternalMyDsl.g:689:2: iv_ruleDataPair= ruleDataPair EOF
            {
             newCompositeNode(grammarAccess.getDataPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPair=ruleDataPair();

            state._fsp--;

             current =iv_ruleDataPair; 
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
    // $ANTLR end "entryRuleDataPair"


    // $ANTLR start "ruleDataPair"
    // InternalMyDsl.g:695:1: ruleDataPair returns [EObject current=null] : ( ( (lv_fieldName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_value_3_0= ruleDataValue ) ) otherlv_4= ',' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= '}' ) ;
    public final EObject ruleDataPair() throws RecognitionException {
        EObject current = null;

        Token lv_fieldName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_3_0 = null;

        EObject lv_dataType_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:701:2: ( ( ( (lv_fieldName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_value_3_0= ruleDataValue ) ) otherlv_4= ',' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:702:2: ( ( (lv_fieldName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_value_3_0= ruleDataValue ) ) otherlv_4= ',' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:702:2: ( ( (lv_fieldName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_value_3_0= ruleDataValue ) ) otherlv_4= ',' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= '}' )
            // InternalMyDsl.g:703:3: ( (lv_fieldName_0_0= RULE_STRING ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_value_3_0= ruleDataValue ) ) otherlv_4= ',' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= '}'
            {
            // InternalMyDsl.g:703:3: ( (lv_fieldName_0_0= RULE_STRING ) )
            // InternalMyDsl.g:704:4: (lv_fieldName_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:704:4: (lv_fieldName_0_0= RULE_STRING )
            // InternalMyDsl.g:705:5: lv_fieldName_0_0= RULE_STRING
            {
            lv_fieldName_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_fieldName_0_0, grammarAccess.getDataPairAccess().getFieldNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldName",
            						lv_fieldName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPairAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDataPairAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:729:3: ( (lv_value_3_0= ruleDataValue ) )
            // InternalMyDsl.g:730:4: (lv_value_3_0= ruleDataValue )
            {
            // InternalMyDsl.g:730:4: (lv_value_3_0= ruleDataValue )
            // InternalMyDsl.g:731:5: lv_value_3_0= ruleDataValue
            {

            					newCompositeNode(grammarAccess.getDataPairAccess().getValueDataValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_3_0=ruleDataValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.MyDsl.DataValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getDataPairAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:752:3: ( (lv_dataType_5_0= ruleDataType ) )
            // InternalMyDsl.g:753:4: (lv_dataType_5_0= ruleDataType )
            {
            // InternalMyDsl.g:753:4: (lv_dataType_5_0= ruleDataType )
            // InternalMyDsl.g:754:5: lv_dataType_5_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getDataPairAccess().getDataTypeDataTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_dataType_5_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPairRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_5_0,
            						"org.xtext.example.mydsl.MyDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataPairAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDataPair"


    // $ANTLR start "entryRuleDataValue"
    // InternalMyDsl.g:779:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalMyDsl.g:779:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalMyDsl.g:780:2: iv_ruleDataValue= ruleDataValue EOF
            {
             newCompositeNode(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataValue=ruleDataValue();

            state._fsp--;

             current =iv_ruleDataValue; 
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
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalMyDsl.g:786:1: ruleDataValue returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_doubleValue_2_0= RULE_DOUBLE ) ) | ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_intValue_1_0=null;
        Token lv_doubleValue_2_0=null;
        Token lv_booleanValue_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:792:2: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_doubleValue_2_0= RULE_DOUBLE ) ) | ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) )
            // InternalMyDsl.g:793:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_doubleValue_2_0= RULE_DOUBLE ) ) | ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
            {
            // InternalMyDsl.g:793:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_doubleValue_2_0= RULE_DOUBLE ) ) | ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt10=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:794:3: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:794:3: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // InternalMyDsl.g:795:4: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:795:4: (lv_stringValue_0_0= RULE_STRING )
                    // InternalMyDsl.g:796:5: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_stringValue_0_0, grammarAccess.getDataValueAccess().getStringValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"stringValue",
                    						lv_stringValue_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:813:3: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:813:3: ( (lv_intValue_1_0= RULE_INT ) )
                    // InternalMyDsl.g:814:4: (lv_intValue_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:814:4: (lv_intValue_1_0= RULE_INT )
                    // InternalMyDsl.g:815:5: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intValue_1_0, grammarAccess.getDataValueAccess().getIntValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intValue",
                    						lv_intValue_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:832:3: ( (lv_doubleValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMyDsl.g:832:3: ( (lv_doubleValue_2_0= RULE_DOUBLE ) )
                    // InternalMyDsl.g:833:4: (lv_doubleValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:833:4: (lv_doubleValue_2_0= RULE_DOUBLE )
                    // InternalMyDsl.g:834:5: lv_doubleValue_2_0= RULE_DOUBLE
                    {
                    lv_doubleValue_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_doubleValue_2_0, grammarAccess.getDataValueAccess().getDoubleValueDOUBLETerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doubleValue",
                    						lv_doubleValue_2_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:851:3: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalMyDsl.g:851:3: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    // InternalMyDsl.g:852:4: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    {
                    // InternalMyDsl.g:852:4: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    // InternalMyDsl.g:853:5: lv_booleanValue_3_0= RULE_BOOLEAN
                    {
                    lv_booleanValue_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_booleanValue_3_0, grammarAccess.getDataValueAccess().getBooleanValueBOOLEANTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"booleanValue",
                    						lv_booleanValue_3_0,
                    						"org.xtext.example.mydsl.MyDsl.BOOLEAN");
                    				

                    }


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
    // $ANTLR end "ruleDataValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000013F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});

}