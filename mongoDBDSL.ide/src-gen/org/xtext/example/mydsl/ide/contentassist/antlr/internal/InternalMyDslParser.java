package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDBModel"
    // InternalMyDsl.g:53:1: entryRuleDBModel : ruleDBModel EOF ;
    public final void entryRuleDBModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDBModel EOF )
            // InternalMyDsl.g:55:1: ruleDBModel EOF
            {
             before(grammarAccess.getDBModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDBModel();

            state._fsp--;

             after(grammarAccess.getDBModelRule()); 
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
    // $ANTLR end "entryRuleDBModel"


    // $ANTLR start "ruleDBModel"
    // InternalMyDsl.g:62:1: ruleDBModel : ( ( rule__DBModel__Group__0 ) ) ;
    public final void ruleDBModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__DBModel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__DBModel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__DBModel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__DBModel__Group__0 )
            {
             before(grammarAccess.getDBModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__DBModel__Group__0 )
            // InternalMyDsl.g:69:4: rule__DBModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DBModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDBModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDBModel"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:78:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCollection EOF )
            // InternalMyDsl.g:80:1: ruleCollection EOF
            {
             before(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getCollectionRule()); 
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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:87:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Collection__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Collection__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Collection__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Collection__Group__0 )
            {
             before(grammarAccess.getCollectionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Collection__Group__0 )
            // InternalMyDsl.g:94:4: rule__Collection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getGroup()); 

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleField"
    // InternalMyDsl.g:103:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleField EOF )
            // InternalMyDsl.g:105:1: ruleField EOF
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
    // InternalMyDsl.g:112:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Field__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Field__Group__0 )
            // InternalMyDsl.g:119:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:128:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleDataType EOF )
            // InternalMyDsl.g:130:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:137:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__DataType__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__DataType__Alternatives )
            // InternalMyDsl.g:144:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleIndex"
    // InternalMyDsl.g:153:1: entryRuleIndex : ruleIndex EOF ;
    public final void entryRuleIndex() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleIndex EOF )
            // InternalMyDsl.g:155:1: ruleIndex EOF
            {
             before(grammarAccess.getIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleIndex();

            state._fsp--;

             after(grammarAccess.getIndexRule()); 
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
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalMyDsl.g:162:1: ruleIndex : ( ( rule__Index__Group__0 ) ) ;
    public final void ruleIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Index__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Index__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Index__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Index__Group__0 )
            {
             before(grammarAccess.getIndexAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Index__Group__0 )
            // InternalMyDsl.g:169:4: rule__Index__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexAccess().getGroup()); 

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
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleSeedData"
    // InternalMyDsl.g:178:1: entryRuleSeedData : ruleSeedData EOF ;
    public final void entryRuleSeedData() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSeedData EOF )
            // InternalMyDsl.g:180:1: ruleSeedData EOF
            {
             before(grammarAccess.getSeedDataRule()); 
            pushFollow(FOLLOW_1);
            ruleSeedData();

            state._fsp--;

             after(grammarAccess.getSeedDataRule()); 
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
    // $ANTLR end "entryRuleSeedData"


    // $ANTLR start "ruleSeedData"
    // InternalMyDsl.g:187:1: ruleSeedData : ( ( rule__SeedData__Group__0 ) ) ;
    public final void ruleSeedData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__SeedData__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__SeedData__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__SeedData__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__SeedData__Group__0 )
            {
             before(grammarAccess.getSeedDataAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__SeedData__Group__0 )
            // InternalMyDsl.g:194:4: rule__SeedData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeedData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeedDataAccess().getGroup()); 

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
    // $ANTLR end "ruleSeedData"


    // $ANTLR start "entryRuleDataArray"
    // InternalMyDsl.g:203:1: entryRuleDataArray : ruleDataArray EOF ;
    public final void entryRuleDataArray() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleDataArray EOF )
            // InternalMyDsl.g:205:1: ruleDataArray EOF
            {
             before(grammarAccess.getDataArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleDataArray();

            state._fsp--;

             after(grammarAccess.getDataArrayRule()); 
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
    // $ANTLR end "entryRuleDataArray"


    // $ANTLR start "ruleDataArray"
    // InternalMyDsl.g:212:1: ruleDataArray : ( ( rule__DataArray__Group__0 ) ) ;
    public final void ruleDataArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__DataArray__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__DataArray__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__DataArray__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__DataArray__Group__0 )
            {
             before(grammarAccess.getDataArrayAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__DataArray__Group__0 )
            // InternalMyDsl.g:219:4: rule__DataArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleDataArray"


    // $ANTLR start "entryRuleDataPair"
    // InternalMyDsl.g:228:1: entryRuleDataPair : ruleDataPair EOF ;
    public final void entryRuleDataPair() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleDataPair EOF )
            // InternalMyDsl.g:230:1: ruleDataPair EOF
            {
             before(grammarAccess.getDataPairRule()); 
            pushFollow(FOLLOW_1);
            ruleDataPair();

            state._fsp--;

             after(grammarAccess.getDataPairRule()); 
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
    // $ANTLR end "entryRuleDataPair"


    // $ANTLR start "ruleDataPair"
    // InternalMyDsl.g:237:1: ruleDataPair : ( ( rule__DataPair__Group__0 ) ) ;
    public final void ruleDataPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__DataPair__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__DataPair__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__DataPair__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__DataPair__Group__0 )
            {
             before(grammarAccess.getDataPairAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__DataPair__Group__0 )
            // InternalMyDsl.g:244:4: rule__DataPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataPairAccess().getGroup()); 

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
    // $ANTLR end "ruleDataPair"


    // $ANTLR start "entryRuleDataValue"
    // InternalMyDsl.g:253:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleDataValue EOF )
            // InternalMyDsl.g:255:1: ruleDataValue EOF
            {
             before(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getDataValueRule()); 
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
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalMyDsl.g:262:1: ruleDataValue : ( ( rule__DataValue__Alternatives ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__DataValue__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__DataValue__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__DataValue__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__DataValue__Alternatives )
            {
             before(grammarAccess.getDataValueAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__DataValue__Alternatives )
            // InternalMyDsl.g:269:4: rule__DataValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalMyDsl.g:277:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( ( rule__DataType__Group_1__0 ) ) | ( ( rule__DataType__Group_2__0 ) ) | ( ( rule__DataType__Group_3__0 ) ) | ( ( rule__DataType__Group_4__0 ) ) | ( ( rule__DataType__Group_5__0 ) ) | ( ( rule__DataType__Group_6__0 ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( ( rule__DataType__Group_1__0 ) ) | ( ( rule__DataType__Group_2__0 ) ) | ( ( rule__DataType__Group_3__0 ) ) | ( ( rule__DataType__Group_4__0 ) ) | ( ( rule__DataType__Group_5__0 ) ) | ( ( rule__DataType__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            case 32:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:282:2: ( ( rule__DataType__Group_0__0 ) )
                    // InternalMyDsl.g:283:3: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // InternalMyDsl.g:284:3: ( rule__DataType__Group_0__0 )
                    // InternalMyDsl.g:284:4: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ( rule__DataType__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:288:2: ( ( rule__DataType__Group_1__0 ) )
                    // InternalMyDsl.g:289:3: ( rule__DataType__Group_1__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_1()); 
                    // InternalMyDsl.g:290:3: ( rule__DataType__Group_1__0 )
                    // InternalMyDsl.g:290:4: rule__DataType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ( rule__DataType__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:294:2: ( ( rule__DataType__Group_2__0 ) )
                    // InternalMyDsl.g:295:3: ( rule__DataType__Group_2__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_2()); 
                    // InternalMyDsl.g:296:3: ( rule__DataType__Group_2__0 )
                    // InternalMyDsl.g:296:4: rule__DataType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:300:2: ( ( rule__DataType__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:300:2: ( ( rule__DataType__Group_3__0 ) )
                    // InternalMyDsl.g:301:3: ( rule__DataType__Group_3__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_3()); 
                    // InternalMyDsl.g:302:3: ( rule__DataType__Group_3__0 )
                    // InternalMyDsl.g:302:4: rule__DataType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:306:2: ( ( rule__DataType__Group_4__0 ) )
                    {
                    // InternalMyDsl.g:306:2: ( ( rule__DataType__Group_4__0 ) )
                    // InternalMyDsl.g:307:3: ( rule__DataType__Group_4__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_4()); 
                    // InternalMyDsl.g:308:3: ( rule__DataType__Group_4__0 )
                    // InternalMyDsl.g:308:4: rule__DataType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:312:2: ( ( rule__DataType__Group_5__0 ) )
                    {
                    // InternalMyDsl.g:312:2: ( ( rule__DataType__Group_5__0 ) )
                    // InternalMyDsl.g:313:3: ( rule__DataType__Group_5__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_5()); 
                    // InternalMyDsl.g:314:3: ( rule__DataType__Group_5__0 )
                    // InternalMyDsl.g:314:4: rule__DataType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:318:2: ( ( rule__DataType__Group_6__0 ) )
                    {
                    // InternalMyDsl.g:318:2: ( ( rule__DataType__Group_6__0 ) )
                    // InternalMyDsl.g:319:3: ( rule__DataType__Group_6__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_6()); 
                    // InternalMyDsl.g:320:3: ( rule__DataType__Group_6__0 )
                    // InternalMyDsl.g:320:4: rule__DataType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__DataValue__Alternatives"
    // InternalMyDsl.g:328:1: rule__DataValue__Alternatives : ( ( ( rule__DataValue__StringValueAssignment_0 ) ) | ( ( rule__DataValue__IntValueAssignment_1 ) ) | ( ( rule__DataValue__DoubleValueAssignment_2 ) ) | ( ( rule__DataValue__BooleanValueAssignment_3 ) ) );
    public final void rule__DataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( ( rule__DataValue__StringValueAssignment_0 ) ) | ( ( rule__DataValue__IntValueAssignment_1 ) ) | ( ( rule__DataValue__DoubleValueAssignment_2 ) ) | ( ( rule__DataValue__BooleanValueAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
                {
                alt2=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt2=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:333:2: ( ( rule__DataValue__StringValueAssignment_0 ) )
                    {
                    // InternalMyDsl.g:333:2: ( ( rule__DataValue__StringValueAssignment_0 ) )
                    // InternalMyDsl.g:334:3: ( rule__DataValue__StringValueAssignment_0 )
                    {
                     before(grammarAccess.getDataValueAccess().getStringValueAssignment_0()); 
                    // InternalMyDsl.g:335:3: ( rule__DataValue__StringValueAssignment_0 )
                    // InternalMyDsl.g:335:4: rule__DataValue__StringValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataValue__StringValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataValueAccess().getStringValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:339:2: ( ( rule__DataValue__IntValueAssignment_1 ) )
                    {
                    // InternalMyDsl.g:339:2: ( ( rule__DataValue__IntValueAssignment_1 ) )
                    // InternalMyDsl.g:340:3: ( rule__DataValue__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getDataValueAccess().getIntValueAssignment_1()); 
                    // InternalMyDsl.g:341:3: ( rule__DataValue__IntValueAssignment_1 )
                    // InternalMyDsl.g:341:4: rule__DataValue__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataValue__IntValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataValueAccess().getIntValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:345:2: ( ( rule__DataValue__DoubleValueAssignment_2 ) )
                    {
                    // InternalMyDsl.g:345:2: ( ( rule__DataValue__DoubleValueAssignment_2 ) )
                    // InternalMyDsl.g:346:3: ( rule__DataValue__DoubleValueAssignment_2 )
                    {
                     before(grammarAccess.getDataValueAccess().getDoubleValueAssignment_2()); 
                    // InternalMyDsl.g:347:3: ( rule__DataValue__DoubleValueAssignment_2 )
                    // InternalMyDsl.g:347:4: rule__DataValue__DoubleValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataValue__DoubleValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataValueAccess().getDoubleValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:351:2: ( ( rule__DataValue__BooleanValueAssignment_3 ) )
                    {
                    // InternalMyDsl.g:351:2: ( ( rule__DataValue__BooleanValueAssignment_3 ) )
                    // InternalMyDsl.g:352:3: ( rule__DataValue__BooleanValueAssignment_3 )
                    {
                     before(grammarAccess.getDataValueAccess().getBooleanValueAssignment_3()); 
                    // InternalMyDsl.g:353:3: ( rule__DataValue__BooleanValueAssignment_3 )
                    // InternalMyDsl.g:353:4: rule__DataValue__BooleanValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataValue__BooleanValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataValueAccess().getBooleanValueAssignment_3()); 

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
    // $ANTLR end "rule__DataValue__Alternatives"


    // $ANTLR start "rule__DBModel__Group__0"
    // InternalMyDsl.g:361:1: rule__DBModel__Group__0 : rule__DBModel__Group__0__Impl rule__DBModel__Group__1 ;
    public final void rule__DBModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( rule__DBModel__Group__0__Impl rule__DBModel__Group__1 )
            // InternalMyDsl.g:366:2: rule__DBModel__Group__0__Impl rule__DBModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DBModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__1();

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
    // $ANTLR end "rule__DBModel__Group__0"


    // $ANTLR start "rule__DBModel__Group__0__Impl"
    // InternalMyDsl.g:373:1: rule__DBModel__Group__0__Impl : ( () ) ;
    public final void rule__DBModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( ( () ) )
            // InternalMyDsl.g:378:1: ( () )
            {
            // InternalMyDsl.g:378:1: ( () )
            // InternalMyDsl.g:379:2: ()
            {
             before(grammarAccess.getDBModelAccess().getDBModelAction_0()); 
            // InternalMyDsl.g:380:2: ()
            // InternalMyDsl.g:380:3: 
            {
            }

             after(grammarAccess.getDBModelAccess().getDBModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBModel__Group__0__Impl"


    // $ANTLR start "rule__DBModel__Group__1"
    // InternalMyDsl.g:388:1: rule__DBModel__Group__1 : rule__DBModel__Group__1__Impl rule__DBModel__Group__2 ;
    public final void rule__DBModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( rule__DBModel__Group__1__Impl rule__DBModel__Group__2 )
            // InternalMyDsl.g:393:2: rule__DBModel__Group__1__Impl rule__DBModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DBModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__2();

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
    // $ANTLR end "rule__DBModel__Group__1"


    // $ANTLR start "rule__DBModel__Group__1__Impl"
    // InternalMyDsl.g:400:1: rule__DBModel__Group__1__Impl : ( 'DBModel' ) ;
    public final void rule__DBModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( ( 'DBModel' ) )
            // InternalMyDsl.g:405:1: ( 'DBModel' )
            {
            // InternalMyDsl.g:405:1: ( 'DBModel' )
            // InternalMyDsl.g:406:2: 'DBModel'
            {
             before(grammarAccess.getDBModelAccess().getDBModelKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDBModelAccess().getDBModelKeyword_1()); 

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
    // $ANTLR end "rule__DBModel__Group__1__Impl"


    // $ANTLR start "rule__DBModel__Group__2"
    // InternalMyDsl.g:415:1: rule__DBModel__Group__2 : rule__DBModel__Group__2__Impl rule__DBModel__Group__3 ;
    public final void rule__DBModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( rule__DBModel__Group__2__Impl rule__DBModel__Group__3 )
            // InternalMyDsl.g:420:2: rule__DBModel__Group__2__Impl rule__DBModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DBModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__3();

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
    // $ANTLR end "rule__DBModel__Group__2"


    // $ANTLR start "rule__DBModel__Group__2__Impl"
    // InternalMyDsl.g:427:1: rule__DBModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DBModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( '{' ) )
            // InternalMyDsl.g:432:1: ( '{' )
            {
            // InternalMyDsl.g:432:1: ( '{' )
            // InternalMyDsl.g:433:2: '{'
            {
             before(grammarAccess.getDBModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDBModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DBModel__Group__2__Impl"


    // $ANTLR start "rule__DBModel__Group__3"
    // InternalMyDsl.g:442:1: rule__DBModel__Group__3 : rule__DBModel__Group__3__Impl rule__DBModel__Group__4 ;
    public final void rule__DBModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( rule__DBModel__Group__3__Impl rule__DBModel__Group__4 )
            // InternalMyDsl.g:447:2: rule__DBModel__Group__3__Impl rule__DBModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DBModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__4();

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
    // $ANTLR end "rule__DBModel__Group__3"


    // $ANTLR start "rule__DBModel__Group__3__Impl"
    // InternalMyDsl.g:454:1: rule__DBModel__Group__3__Impl : ( 'collections' ) ;
    public final void rule__DBModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( 'collections' ) )
            // InternalMyDsl.g:459:1: ( 'collections' )
            {
            // InternalMyDsl.g:459:1: ( 'collections' )
            // InternalMyDsl.g:460:2: 'collections'
            {
             before(grammarAccess.getDBModelAccess().getCollectionsKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDBModelAccess().getCollectionsKeyword_3()); 

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
    // $ANTLR end "rule__DBModel__Group__3__Impl"


    // $ANTLR start "rule__DBModel__Group__4"
    // InternalMyDsl.g:469:1: rule__DBModel__Group__4 : rule__DBModel__Group__4__Impl rule__DBModel__Group__5 ;
    public final void rule__DBModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( rule__DBModel__Group__4__Impl rule__DBModel__Group__5 )
            // InternalMyDsl.g:474:2: rule__DBModel__Group__4__Impl rule__DBModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DBModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__5();

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
    // $ANTLR end "rule__DBModel__Group__4"


    // $ANTLR start "rule__DBModel__Group__4__Impl"
    // InternalMyDsl.g:481:1: rule__DBModel__Group__4__Impl : ( '[' ) ;
    public final void rule__DBModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( ( '[' ) )
            // InternalMyDsl.g:486:1: ( '[' )
            {
            // InternalMyDsl.g:486:1: ( '[' )
            // InternalMyDsl.g:487:2: '['
            {
             before(grammarAccess.getDBModelAccess().getLeftSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDBModelAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__DBModel__Group__4__Impl"


    // $ANTLR start "rule__DBModel__Group__5"
    // InternalMyDsl.g:496:1: rule__DBModel__Group__5 : rule__DBModel__Group__5__Impl rule__DBModel__Group__6 ;
    public final void rule__DBModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:500:1: ( rule__DBModel__Group__5__Impl rule__DBModel__Group__6 )
            // InternalMyDsl.g:501:2: rule__DBModel__Group__5__Impl rule__DBModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DBModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__6();

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
    // $ANTLR end "rule__DBModel__Group__5"


    // $ANTLR start "rule__DBModel__Group__5__Impl"
    // InternalMyDsl.g:508:1: rule__DBModel__Group__5__Impl : ( ( rule__DBModel__CollectionsAssignment_5 )* ) ;
    public final void rule__DBModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( ( rule__DBModel__CollectionsAssignment_5 )* ) )
            // InternalMyDsl.g:513:1: ( ( rule__DBModel__CollectionsAssignment_5 )* )
            {
            // InternalMyDsl.g:513:1: ( ( rule__DBModel__CollectionsAssignment_5 )* )
            // InternalMyDsl.g:514:2: ( rule__DBModel__CollectionsAssignment_5 )*
            {
             before(grammarAccess.getDBModelAccess().getCollectionsAssignment_5()); 
            // InternalMyDsl.g:515:2: ( rule__DBModel__CollectionsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:515:3: rule__DBModel__CollectionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DBModel__CollectionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDBModelAccess().getCollectionsAssignment_5()); 

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
    // $ANTLR end "rule__DBModel__Group__5__Impl"


    // $ANTLR start "rule__DBModel__Group__6"
    // InternalMyDsl.g:523:1: rule__DBModel__Group__6 : rule__DBModel__Group__6__Impl rule__DBModel__Group__7 ;
    public final void rule__DBModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( rule__DBModel__Group__6__Impl rule__DBModel__Group__7 )
            // InternalMyDsl.g:528:2: rule__DBModel__Group__6__Impl rule__DBModel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__DBModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBModel__Group__7();

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
    // $ANTLR end "rule__DBModel__Group__6"


    // $ANTLR start "rule__DBModel__Group__6__Impl"
    // InternalMyDsl.g:535:1: rule__DBModel__Group__6__Impl : ( ']' ) ;
    public final void rule__DBModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ']' ) )
            // InternalMyDsl.g:540:1: ( ']' )
            {
            // InternalMyDsl.g:540:1: ( ']' )
            // InternalMyDsl.g:541:2: ']'
            {
             before(grammarAccess.getDBModelAccess().getRightSquareBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDBModelAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__DBModel__Group__6__Impl"


    // $ANTLR start "rule__DBModel__Group__7"
    // InternalMyDsl.g:550:1: rule__DBModel__Group__7 : rule__DBModel__Group__7__Impl ;
    public final void rule__DBModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( rule__DBModel__Group__7__Impl )
            // InternalMyDsl.g:555:2: rule__DBModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBModel__Group__7__Impl();

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
    // $ANTLR end "rule__DBModel__Group__7"


    // $ANTLR start "rule__DBModel__Group__7__Impl"
    // InternalMyDsl.g:561:1: rule__DBModel__Group__7__Impl : ( '}' ) ;
    public final void rule__DBModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( '}' ) )
            // InternalMyDsl.g:566:1: ( '}' )
            {
            // InternalMyDsl.g:566:1: ( '}' )
            // InternalMyDsl.g:567:2: '}'
            {
             before(grammarAccess.getDBModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDBModelAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__DBModel__Group__7__Impl"


    // $ANTLR start "rule__Collection__Group__0"
    // InternalMyDsl.g:577:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // InternalMyDsl.g:582:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Collection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__1();

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
    // $ANTLR end "rule__Collection__Group__0"


    // $ANTLR start "rule__Collection__Group__0__Impl"
    // InternalMyDsl.g:589:1: rule__Collection__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( ( 'Collection' ) )
            // InternalMyDsl.g:594:1: ( 'Collection' )
            {
            // InternalMyDsl.g:594:1: ( 'Collection' )
            // InternalMyDsl.g:595:2: 'Collection'
            {
             before(grammarAccess.getCollectionAccess().getCollectionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getCollectionKeyword_0()); 

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
    // $ANTLR end "rule__Collection__Group__0__Impl"


    // $ANTLR start "rule__Collection__Group__1"
    // InternalMyDsl.g:604:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl rule__Collection__Group__2 ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( rule__Collection__Group__1__Impl rule__Collection__Group__2 )
            // InternalMyDsl.g:609:2: rule__Collection__Group__1__Impl rule__Collection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Collection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__2();

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
    // $ANTLR end "rule__Collection__Group__1"


    // $ANTLR start "rule__Collection__Group__1__Impl"
    // InternalMyDsl.g:616:1: rule__Collection__Group__1__Impl : ( ( rule__Collection__NameAssignment_1 ) ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( ( ( rule__Collection__NameAssignment_1 ) ) )
            // InternalMyDsl.g:621:1: ( ( rule__Collection__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:621:1: ( ( rule__Collection__NameAssignment_1 ) )
            // InternalMyDsl.g:622:2: ( rule__Collection__NameAssignment_1 )
            {
             before(grammarAccess.getCollectionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:623:2: ( rule__Collection__NameAssignment_1 )
            // InternalMyDsl.g:623:3: rule__Collection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Collection__Group__1__Impl"


    // $ANTLR start "rule__Collection__Group__2"
    // InternalMyDsl.g:631:1: rule__Collection__Group__2 : rule__Collection__Group__2__Impl rule__Collection__Group__3 ;
    public final void rule__Collection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( rule__Collection__Group__2__Impl rule__Collection__Group__3 )
            // InternalMyDsl.g:636:2: rule__Collection__Group__2__Impl rule__Collection__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Collection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__3();

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
    // $ANTLR end "rule__Collection__Group__2"


    // $ANTLR start "rule__Collection__Group__2__Impl"
    // InternalMyDsl.g:643:1: rule__Collection__Group__2__Impl : ( '{' ) ;
    public final void rule__Collection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( ( '{' ) )
            // InternalMyDsl.g:648:1: ( '{' )
            {
            // InternalMyDsl.g:648:1: ( '{' )
            // InternalMyDsl.g:649:2: '{'
            {
             before(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Collection__Group__2__Impl"


    // $ANTLR start "rule__Collection__Group__3"
    // InternalMyDsl.g:658:1: rule__Collection__Group__3 : rule__Collection__Group__3__Impl rule__Collection__Group__4 ;
    public final void rule__Collection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( rule__Collection__Group__3__Impl rule__Collection__Group__4 )
            // InternalMyDsl.g:663:2: rule__Collection__Group__3__Impl rule__Collection__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Collection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__4();

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
    // $ANTLR end "rule__Collection__Group__3"


    // $ANTLR start "rule__Collection__Group__3__Impl"
    // InternalMyDsl.g:670:1: rule__Collection__Group__3__Impl : ( 'fields' ) ;
    public final void rule__Collection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( 'fields' ) )
            // InternalMyDsl.g:675:1: ( 'fields' )
            {
            // InternalMyDsl.g:675:1: ( 'fields' )
            // InternalMyDsl.g:676:2: 'fields'
            {
             before(grammarAccess.getCollectionAccess().getFieldsKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getFieldsKeyword_3()); 

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
    // $ANTLR end "rule__Collection__Group__3__Impl"


    // $ANTLR start "rule__Collection__Group__4"
    // InternalMyDsl.g:685:1: rule__Collection__Group__4 : rule__Collection__Group__4__Impl rule__Collection__Group__5 ;
    public final void rule__Collection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( rule__Collection__Group__4__Impl rule__Collection__Group__5 )
            // InternalMyDsl.g:690:2: rule__Collection__Group__4__Impl rule__Collection__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Collection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__5();

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
    // $ANTLR end "rule__Collection__Group__4"


    // $ANTLR start "rule__Collection__Group__4__Impl"
    // InternalMyDsl.g:697:1: rule__Collection__Group__4__Impl : ( '{' ) ;
    public final void rule__Collection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( ( '{' ) )
            // InternalMyDsl.g:702:1: ( '{' )
            {
            // InternalMyDsl.g:702:1: ( '{' )
            // InternalMyDsl.g:703:2: '{'
            {
             before(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Collection__Group__4__Impl"


    // $ANTLR start "rule__Collection__Group__5"
    // InternalMyDsl.g:712:1: rule__Collection__Group__5 : rule__Collection__Group__5__Impl rule__Collection__Group__6 ;
    public final void rule__Collection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( rule__Collection__Group__5__Impl rule__Collection__Group__6 )
            // InternalMyDsl.g:717:2: rule__Collection__Group__5__Impl rule__Collection__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Collection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__6();

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
    // $ANTLR end "rule__Collection__Group__5"


    // $ANTLR start "rule__Collection__Group__5__Impl"
    // InternalMyDsl.g:724:1: rule__Collection__Group__5__Impl : ( ( rule__Collection__FieldsAssignment_5 )* ) ;
    public final void rule__Collection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ( rule__Collection__FieldsAssignment_5 )* ) )
            // InternalMyDsl.g:729:1: ( ( rule__Collection__FieldsAssignment_5 )* )
            {
            // InternalMyDsl.g:729:1: ( ( rule__Collection__FieldsAssignment_5 )* )
            // InternalMyDsl.g:730:2: ( rule__Collection__FieldsAssignment_5 )*
            {
             before(grammarAccess.getCollectionAccess().getFieldsAssignment_5()); 
            // InternalMyDsl.g:731:2: ( rule__Collection__FieldsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:731:3: rule__Collection__FieldsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Collection__FieldsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCollectionAccess().getFieldsAssignment_5()); 

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
    // $ANTLR end "rule__Collection__Group__5__Impl"


    // $ANTLR start "rule__Collection__Group__6"
    // InternalMyDsl.g:739:1: rule__Collection__Group__6 : rule__Collection__Group__6__Impl rule__Collection__Group__7 ;
    public final void rule__Collection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( rule__Collection__Group__6__Impl rule__Collection__Group__7 )
            // InternalMyDsl.g:744:2: rule__Collection__Group__6__Impl rule__Collection__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Collection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__7();

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
    // $ANTLR end "rule__Collection__Group__6"


    // $ANTLR start "rule__Collection__Group__6__Impl"
    // InternalMyDsl.g:751:1: rule__Collection__Group__6__Impl : ( '}' ) ;
    public final void rule__Collection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( '}' ) )
            // InternalMyDsl.g:756:1: ( '}' )
            {
            // InternalMyDsl.g:756:1: ( '}' )
            // InternalMyDsl.g:757:2: '}'
            {
             before(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Collection__Group__6__Impl"


    // $ANTLR start "rule__Collection__Group__7"
    // InternalMyDsl.g:766:1: rule__Collection__Group__7 : rule__Collection__Group__7__Impl rule__Collection__Group__8 ;
    public final void rule__Collection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( rule__Collection__Group__7__Impl rule__Collection__Group__8 )
            // InternalMyDsl.g:771:2: rule__Collection__Group__7__Impl rule__Collection__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Collection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__8();

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
    // $ANTLR end "rule__Collection__Group__7"


    // $ANTLR start "rule__Collection__Group__7__Impl"
    // InternalMyDsl.g:778:1: rule__Collection__Group__7__Impl : ( 'indexes' ) ;
    public final void rule__Collection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( 'indexes' ) )
            // InternalMyDsl.g:783:1: ( 'indexes' )
            {
            // InternalMyDsl.g:783:1: ( 'indexes' )
            // InternalMyDsl.g:784:2: 'indexes'
            {
             before(grammarAccess.getCollectionAccess().getIndexesKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getIndexesKeyword_7()); 

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
    // $ANTLR end "rule__Collection__Group__7__Impl"


    // $ANTLR start "rule__Collection__Group__8"
    // InternalMyDsl.g:793:1: rule__Collection__Group__8 : rule__Collection__Group__8__Impl rule__Collection__Group__9 ;
    public final void rule__Collection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( rule__Collection__Group__8__Impl rule__Collection__Group__9 )
            // InternalMyDsl.g:798:2: rule__Collection__Group__8__Impl rule__Collection__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Collection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__9();

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
    // $ANTLR end "rule__Collection__Group__8"


    // $ANTLR start "rule__Collection__Group__8__Impl"
    // InternalMyDsl.g:805:1: rule__Collection__Group__8__Impl : ( '{' ) ;
    public final void rule__Collection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( '{' ) )
            // InternalMyDsl.g:810:1: ( '{' )
            {
            // InternalMyDsl.g:810:1: ( '{' )
            // InternalMyDsl.g:811:2: '{'
            {
             before(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Collection__Group__8__Impl"


    // $ANTLR start "rule__Collection__Group__9"
    // InternalMyDsl.g:820:1: rule__Collection__Group__9 : rule__Collection__Group__9__Impl rule__Collection__Group__10 ;
    public final void rule__Collection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( rule__Collection__Group__9__Impl rule__Collection__Group__10 )
            // InternalMyDsl.g:825:2: rule__Collection__Group__9__Impl rule__Collection__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Collection__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__10();

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
    // $ANTLR end "rule__Collection__Group__9"


    // $ANTLR start "rule__Collection__Group__9__Impl"
    // InternalMyDsl.g:832:1: rule__Collection__Group__9__Impl : ( ( rule__Collection__IndexesAssignment_9 )* ) ;
    public final void rule__Collection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( ( ( rule__Collection__IndexesAssignment_9 )* ) )
            // InternalMyDsl.g:837:1: ( ( rule__Collection__IndexesAssignment_9 )* )
            {
            // InternalMyDsl.g:837:1: ( ( rule__Collection__IndexesAssignment_9 )* )
            // InternalMyDsl.g:838:2: ( rule__Collection__IndexesAssignment_9 )*
            {
             before(grammarAccess.getCollectionAccess().getIndexesAssignment_9()); 
            // InternalMyDsl.g:839:2: ( rule__Collection__IndexesAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:839:3: rule__Collection__IndexesAssignment_9
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Collection__IndexesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCollectionAccess().getIndexesAssignment_9()); 

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
    // $ANTLR end "rule__Collection__Group__9__Impl"


    // $ANTLR start "rule__Collection__Group__10"
    // InternalMyDsl.g:847:1: rule__Collection__Group__10 : rule__Collection__Group__10__Impl rule__Collection__Group__11 ;
    public final void rule__Collection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( rule__Collection__Group__10__Impl rule__Collection__Group__11 )
            // InternalMyDsl.g:852:2: rule__Collection__Group__10__Impl rule__Collection__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Collection__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__11();

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
    // $ANTLR end "rule__Collection__Group__10"


    // $ANTLR start "rule__Collection__Group__10__Impl"
    // InternalMyDsl.g:859:1: rule__Collection__Group__10__Impl : ( '}' ) ;
    public final void rule__Collection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( '}' ) )
            // InternalMyDsl.g:864:1: ( '}' )
            {
            // InternalMyDsl.g:864:1: ( '}' )
            // InternalMyDsl.g:865:2: '}'
            {
             before(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Collection__Group__10__Impl"


    // $ANTLR start "rule__Collection__Group__11"
    // InternalMyDsl.g:874:1: rule__Collection__Group__11 : rule__Collection__Group__11__Impl rule__Collection__Group__12 ;
    public final void rule__Collection__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( rule__Collection__Group__11__Impl rule__Collection__Group__12 )
            // InternalMyDsl.g:879:2: rule__Collection__Group__11__Impl rule__Collection__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Collection__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__12();

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
    // $ANTLR end "rule__Collection__Group__11"


    // $ANTLR start "rule__Collection__Group__11__Impl"
    // InternalMyDsl.g:886:1: rule__Collection__Group__11__Impl : ( ( rule__Collection__SeedDataAssignment_11 )? ) ;
    public final void rule__Collection__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( ( ( rule__Collection__SeedDataAssignment_11 )? ) )
            // InternalMyDsl.g:891:1: ( ( rule__Collection__SeedDataAssignment_11 )? )
            {
            // InternalMyDsl.g:891:1: ( ( rule__Collection__SeedDataAssignment_11 )? )
            // InternalMyDsl.g:892:2: ( rule__Collection__SeedDataAssignment_11 )?
            {
             before(grammarAccess.getCollectionAccess().getSeedDataAssignment_11()); 
            // InternalMyDsl.g:893:2: ( rule__Collection__SeedDataAssignment_11 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:893:3: rule__Collection__SeedDataAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collection__SeedDataAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionAccess().getSeedDataAssignment_11()); 

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
    // $ANTLR end "rule__Collection__Group__11__Impl"


    // $ANTLR start "rule__Collection__Group__12"
    // InternalMyDsl.g:901:1: rule__Collection__Group__12 : rule__Collection__Group__12__Impl ;
    public final void rule__Collection__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( rule__Collection__Group__12__Impl )
            // InternalMyDsl.g:906:2: rule__Collection__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__12__Impl();

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
    // $ANTLR end "rule__Collection__Group__12"


    // $ANTLR start "rule__Collection__Group__12__Impl"
    // InternalMyDsl.g:912:1: rule__Collection__Group__12__Impl : ( '}' ) ;
    public final void rule__Collection__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( '}' ) )
            // InternalMyDsl.g:917:1: ( '}' )
            {
            // InternalMyDsl.g:917:1: ( '}' )
            // InternalMyDsl.g:918:2: '}'
            {
             before(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Collection__Group__12__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMyDsl.g:928:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMyDsl.g:933:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMyDsl.g:940:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( 'Field' ) )
            // InternalMyDsl.g:945:1: ( 'Field' )
            {
            // InternalMyDsl.g:945:1: ( 'Field' )
            // InternalMyDsl.g:946:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMyDsl.g:955:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMyDsl.g:960:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMyDsl.g:967:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalMyDsl.g:972:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:972:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalMyDsl.g:973:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:974:2: ( rule__Field__NameAssignment_1 )
            // InternalMyDsl.g:974:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMyDsl.g:982:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalMyDsl.g:987:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMyDsl.g:994:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ':' ) )
            // InternalMyDsl.g:999:1: ( ':' )
            {
            // InternalMyDsl.g:999:1: ( ':' )
            // InternalMyDsl.g:1000:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalMyDsl.g:1009:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( rule__Field__Group__3__Impl )
            // InternalMyDsl.g:1014:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__3__Impl();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalMyDsl.g:1020:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:1025:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:1025:1: ( ( rule__Field__TypeAssignment_3 ) )
            // InternalMyDsl.g:1026:2: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:1027:2: ( rule__Field__TypeAssignment_3 )
            // InternalMyDsl.g:1027:3: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // InternalMyDsl.g:1036:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // InternalMyDsl.g:1041:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1();

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
    // $ANTLR end "rule__DataType__Group_0__0"


    // $ANTLR start "rule__DataType__Group_0__0__Impl"
    // InternalMyDsl.g:1048:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( ( () ) )
            // InternalMyDsl.g:1053:1: ( () )
            {
            // InternalMyDsl.g:1053:1: ( () )
            // InternalMyDsl.g:1054:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 
            // InternalMyDsl.g:1055:2: ()
            // InternalMyDsl.g:1055:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0__Impl"


    // $ANTLR start "rule__DataType__Group_0__1"
    // InternalMyDsl.g:1063:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1067:1: ( rule__DataType__Group_0__1__Impl )
            // InternalMyDsl.g:1068:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_0__1"


    // $ANTLR start "rule__DataType__Group_0__1__Impl"
    // InternalMyDsl.g:1074:1: rule__DataType__Group_0__1__Impl : ( 'String' ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( ( 'String' ) )
            // InternalMyDsl.g:1079:1: ( 'String' )
            {
            // InternalMyDsl.g:1079:1: ( 'String' )
            // InternalMyDsl.g:1080:2: 'String'
            {
             before(grammarAccess.getDataTypeAccess().getStringKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getStringKeyword_0_1()); 

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
    // $ANTLR end "rule__DataType__Group_0__1__Impl"


    // $ANTLR start "rule__DataType__Group_1__0"
    // InternalMyDsl.g:1090:1: rule__DataType__Group_1__0 : rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 ;
    public final void rule__DataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 )
            // InternalMyDsl.g:1095:2: rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__DataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1();

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
    // $ANTLR end "rule__DataType__Group_1__0"


    // $ANTLR start "rule__DataType__Group_1__0__Impl"
    // InternalMyDsl.g:1102:1: rule__DataType__Group_1__0__Impl : ( () ) ;
    public final void rule__DataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( ( () ) )
            // InternalMyDsl.g:1107:1: ( () )
            {
            // InternalMyDsl.g:1107:1: ( () )
            // InternalMyDsl.g:1108:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_1_0()); 
            // InternalMyDsl.g:1109:2: ()
            // InternalMyDsl.g:1109:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0__Impl"


    // $ANTLR start "rule__DataType__Group_1__1"
    // InternalMyDsl.g:1117:1: rule__DataType__Group_1__1 : rule__DataType__Group_1__1__Impl ;
    public final void rule__DataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( rule__DataType__Group_1__1__Impl )
            // InternalMyDsl.g:1122:2: rule__DataType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_1__1"


    // $ANTLR start "rule__DataType__Group_1__1__Impl"
    // InternalMyDsl.g:1128:1: rule__DataType__Group_1__1__Impl : ( 'Number' ) ;
    public final void rule__DataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( 'Number' ) )
            // InternalMyDsl.g:1133:1: ( 'Number' )
            {
            // InternalMyDsl.g:1133:1: ( 'Number' )
            // InternalMyDsl.g:1134:2: 'Number'
            {
             before(grammarAccess.getDataTypeAccess().getNumberKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNumberKeyword_1_1()); 

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
    // $ANTLR end "rule__DataType__Group_1__1__Impl"


    // $ANTLR start "rule__DataType__Group_2__0"
    // InternalMyDsl.g:1144:1: rule__DataType__Group_2__0 : rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 ;
    public final void rule__DataType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 )
            // InternalMyDsl.g:1149:2: rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__DataType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__1();

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
    // $ANTLR end "rule__DataType__Group_2__0"


    // $ANTLR start "rule__DataType__Group_2__0__Impl"
    // InternalMyDsl.g:1156:1: rule__DataType__Group_2__0__Impl : ( () ) ;
    public final void rule__DataType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( ( () ) )
            // InternalMyDsl.g:1161:1: ( () )
            {
            // InternalMyDsl.g:1161:1: ( () )
            // InternalMyDsl.g:1162:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_2_0()); 
            // InternalMyDsl.g:1163:2: ()
            // InternalMyDsl.g:1163:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_2__1"
    // InternalMyDsl.g:1171:1: rule__DataType__Group_2__1 : rule__DataType__Group_2__1__Impl ;
    public final void rule__DataType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( rule__DataType__Group_2__1__Impl )
            // InternalMyDsl.g:1176:2: rule__DataType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_2__1"


    // $ANTLR start "rule__DataType__Group_2__1__Impl"
    // InternalMyDsl.g:1182:1: rule__DataType__Group_2__1__Impl : ( 'Boolean' ) ;
    public final void rule__DataType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( 'Boolean' ) )
            // InternalMyDsl.g:1187:1: ( 'Boolean' )
            {
            // InternalMyDsl.g:1187:1: ( 'Boolean' )
            // InternalMyDsl.g:1188:2: 'Boolean'
            {
             before(grammarAccess.getDataTypeAccess().getBooleanKeyword_2_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getBooleanKeyword_2_1()); 

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
    // $ANTLR end "rule__DataType__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group_3__0"
    // InternalMyDsl.g:1198:1: rule__DataType__Group_3__0 : rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1 ;
    public final void rule__DataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1 )
            // InternalMyDsl.g:1203:2: rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__DataType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_3__1();

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
    // $ANTLR end "rule__DataType__Group_3__0"


    // $ANTLR start "rule__DataType__Group_3__0__Impl"
    // InternalMyDsl.g:1210:1: rule__DataType__Group_3__0__Impl : ( () ) ;
    public final void rule__DataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( () ) )
            // InternalMyDsl.g:1215:1: ( () )
            {
            // InternalMyDsl.g:1215:1: ( () )
            // InternalMyDsl.g:1216:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_3_0()); 
            // InternalMyDsl.g:1217:2: ()
            // InternalMyDsl.g:1217:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_3__0__Impl"


    // $ANTLR start "rule__DataType__Group_3__1"
    // InternalMyDsl.g:1225:1: rule__DataType__Group_3__1 : rule__DataType__Group_3__1__Impl ;
    public final void rule__DataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( rule__DataType__Group_3__1__Impl )
            // InternalMyDsl.g:1230:2: rule__DataType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_3__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_3__1"


    // $ANTLR start "rule__DataType__Group_3__1__Impl"
    // InternalMyDsl.g:1236:1: rule__DataType__Group_3__1__Impl : ( 'Date' ) ;
    public final void rule__DataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( 'Date' ) )
            // InternalMyDsl.g:1241:1: ( 'Date' )
            {
            // InternalMyDsl.g:1241:1: ( 'Date' )
            // InternalMyDsl.g:1242:2: 'Date'
            {
             before(grammarAccess.getDataTypeAccess().getDateKeyword_3_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDateKeyword_3_1()); 

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
    // $ANTLR end "rule__DataType__Group_3__1__Impl"


    // $ANTLR start "rule__DataType__Group_4__0"
    // InternalMyDsl.g:1252:1: rule__DataType__Group_4__0 : rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 ;
    public final void rule__DataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 )
            // InternalMyDsl.g:1257:2: rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__DataType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1();

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
    // $ANTLR end "rule__DataType__Group_4__0"


    // $ANTLR start "rule__DataType__Group_4__0__Impl"
    // InternalMyDsl.g:1264:1: rule__DataType__Group_4__0__Impl : ( () ) ;
    public final void rule__DataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( () ) )
            // InternalMyDsl.g:1269:1: ( () )
            {
            // InternalMyDsl.g:1269:1: ( () )
            // InternalMyDsl.g:1270:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_4_0()); 
            // InternalMyDsl.g:1271:2: ()
            // InternalMyDsl.g:1271:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__0__Impl"


    // $ANTLR start "rule__DataType__Group_4__1"
    // InternalMyDsl.g:1279:1: rule__DataType__Group_4__1 : rule__DataType__Group_4__1__Impl ;
    public final void rule__DataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( rule__DataType__Group_4__1__Impl )
            // InternalMyDsl.g:1284:2: rule__DataType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_4__1"


    // $ANTLR start "rule__DataType__Group_4__1__Impl"
    // InternalMyDsl.g:1290:1: rule__DataType__Group_4__1__Impl : ( 'Object' ) ;
    public final void rule__DataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( 'Object' ) )
            // InternalMyDsl.g:1295:1: ( 'Object' )
            {
            // InternalMyDsl.g:1295:1: ( 'Object' )
            // InternalMyDsl.g:1296:2: 'Object'
            {
             before(grammarAccess.getDataTypeAccess().getObjectKeyword_4_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getObjectKeyword_4_1()); 

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
    // $ANTLR end "rule__DataType__Group_4__1__Impl"


    // $ANTLR start "rule__DataType__Group_5__0"
    // InternalMyDsl.g:1306:1: rule__DataType__Group_5__0 : rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 ;
    public final void rule__DataType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 )
            // InternalMyDsl.g:1311:2: rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__DataType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_5__1();

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
    // $ANTLR end "rule__DataType__Group_5__0"


    // $ANTLR start "rule__DataType__Group_5__0__Impl"
    // InternalMyDsl.g:1318:1: rule__DataType__Group_5__0__Impl : ( 'Array' ) ;
    public final void rule__DataType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( 'Array' ) )
            // InternalMyDsl.g:1323:1: ( 'Array' )
            {
            // InternalMyDsl.g:1323:1: ( 'Array' )
            // InternalMyDsl.g:1324:2: 'Array'
            {
             before(grammarAccess.getDataTypeAccess().getArrayKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getArrayKeyword_5_0()); 

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
    // $ANTLR end "rule__DataType__Group_5__0__Impl"


    // $ANTLR start "rule__DataType__Group_5__1"
    // InternalMyDsl.g:1333:1: rule__DataType__Group_5__1 : rule__DataType__Group_5__1__Impl rule__DataType__Group_5__2 ;
    public final void rule__DataType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( rule__DataType__Group_5__1__Impl rule__DataType__Group_5__2 )
            // InternalMyDsl.g:1338:2: rule__DataType__Group_5__1__Impl rule__DataType__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__DataType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_5__2();

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
    // $ANTLR end "rule__DataType__Group_5__1"


    // $ANTLR start "rule__DataType__Group_5__1__Impl"
    // InternalMyDsl.g:1345:1: rule__DataType__Group_5__1__Impl : ( '<' ) ;
    public final void rule__DataType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( '<' ) )
            // InternalMyDsl.g:1350:1: ( '<' )
            {
            // InternalMyDsl.g:1350:1: ( '<' )
            // InternalMyDsl.g:1351:2: '<'
            {
             before(grammarAccess.getDataTypeAccess().getLessThanSignKeyword_5_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLessThanSignKeyword_5_1()); 

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
    // $ANTLR end "rule__DataType__Group_5__1__Impl"


    // $ANTLR start "rule__DataType__Group_5__2"
    // InternalMyDsl.g:1360:1: rule__DataType__Group_5__2 : rule__DataType__Group_5__2__Impl rule__DataType__Group_5__3 ;
    public final void rule__DataType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( rule__DataType__Group_5__2__Impl rule__DataType__Group_5__3 )
            // InternalMyDsl.g:1365:2: rule__DataType__Group_5__2__Impl rule__DataType__Group_5__3
            {
            pushFollow(FOLLOW_26);
            rule__DataType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_5__3();

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
    // $ANTLR end "rule__DataType__Group_5__2"


    // $ANTLR start "rule__DataType__Group_5__2__Impl"
    // InternalMyDsl.g:1372:1: rule__DataType__Group_5__2__Impl : ( ( rule__DataType__DataTypeAssignment_5_2 ) ) ;
    public final void rule__DataType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( ( rule__DataType__DataTypeAssignment_5_2 ) ) )
            // InternalMyDsl.g:1377:1: ( ( rule__DataType__DataTypeAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1377:1: ( ( rule__DataType__DataTypeAssignment_5_2 ) )
            // InternalMyDsl.g:1378:2: ( rule__DataType__DataTypeAssignment_5_2 )
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAssignment_5_2()); 
            // InternalMyDsl.g:1379:2: ( rule__DataType__DataTypeAssignment_5_2 )
            // InternalMyDsl.g:1379:3: rule__DataType__DataTypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DataType__DataTypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAssignment_5_2()); 

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
    // $ANTLR end "rule__DataType__Group_5__2__Impl"


    // $ANTLR start "rule__DataType__Group_5__3"
    // InternalMyDsl.g:1387:1: rule__DataType__Group_5__3 : rule__DataType__Group_5__3__Impl ;
    public final void rule__DataType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( rule__DataType__Group_5__3__Impl )
            // InternalMyDsl.g:1392:2: rule__DataType__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_5__3__Impl();

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
    // $ANTLR end "rule__DataType__Group_5__3"


    // $ANTLR start "rule__DataType__Group_5__3__Impl"
    // InternalMyDsl.g:1398:1: rule__DataType__Group_5__3__Impl : ( '>' ) ;
    public final void rule__DataType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( ( '>' ) )
            // InternalMyDsl.g:1403:1: ( '>' )
            {
            // InternalMyDsl.g:1403:1: ( '>' )
            // InternalMyDsl.g:1404:2: '>'
            {
             before(grammarAccess.getDataTypeAccess().getGreaterThanSignKeyword_5_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getGreaterThanSignKeyword_5_3()); 

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
    // $ANTLR end "rule__DataType__Group_5__3__Impl"


    // $ANTLR start "rule__DataType__Group_6__0"
    // InternalMyDsl.g:1414:1: rule__DataType__Group_6__0 : rule__DataType__Group_6__0__Impl rule__DataType__Group_6__1 ;
    public final void rule__DataType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( rule__DataType__Group_6__0__Impl rule__DataType__Group_6__1 )
            // InternalMyDsl.g:1419:2: rule__DataType__Group_6__0__Impl rule__DataType__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__DataType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_6__1();

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
    // $ANTLR end "rule__DataType__Group_6__0"


    // $ANTLR start "rule__DataType__Group_6__0__Impl"
    // InternalMyDsl.g:1426:1: rule__DataType__Group_6__0__Impl : ( () ) ;
    public final void rule__DataType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( ( () ) )
            // InternalMyDsl.g:1431:1: ( () )
            {
            // InternalMyDsl.g:1431:1: ( () )
            // InternalMyDsl.g:1432:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_6_0()); 
            // InternalMyDsl.g:1433:2: ()
            // InternalMyDsl.g:1433:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_6__0__Impl"


    // $ANTLR start "rule__DataType__Group_6__1"
    // InternalMyDsl.g:1441:1: rule__DataType__Group_6__1 : rule__DataType__Group_6__1__Impl ;
    public final void rule__DataType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( rule__DataType__Group_6__1__Impl )
            // InternalMyDsl.g:1446:2: rule__DataType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_6__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_6__1"


    // $ANTLR start "rule__DataType__Group_6__1__Impl"
    // InternalMyDsl.g:1452:1: rule__DataType__Group_6__1__Impl : ( 'ObjectId' ) ;
    public final void rule__DataType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( ( 'ObjectId' ) )
            // InternalMyDsl.g:1457:1: ( 'ObjectId' )
            {
            // InternalMyDsl.g:1457:1: ( 'ObjectId' )
            // InternalMyDsl.g:1458:2: 'ObjectId'
            {
             before(grammarAccess.getDataTypeAccess().getObjectIdKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getObjectIdKeyword_6_1()); 

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
    // $ANTLR end "rule__DataType__Group_6__1__Impl"


    // $ANTLR start "rule__Index__Group__0"
    // InternalMyDsl.g:1468:1: rule__Index__Group__0 : rule__Index__Group__0__Impl rule__Index__Group__1 ;
    public final void rule__Index__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( rule__Index__Group__0__Impl rule__Index__Group__1 )
            // InternalMyDsl.g:1473:2: rule__Index__Group__0__Impl rule__Index__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Index__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__1();

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
    // $ANTLR end "rule__Index__Group__0"


    // $ANTLR start "rule__Index__Group__0__Impl"
    // InternalMyDsl.g:1480:1: rule__Index__Group__0__Impl : ( 'Index' ) ;
    public final void rule__Index__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( 'Index' ) )
            // InternalMyDsl.g:1485:1: ( 'Index' )
            {
            // InternalMyDsl.g:1485:1: ( 'Index' )
            // InternalMyDsl.g:1486:2: 'Index'
            {
             before(grammarAccess.getIndexAccess().getIndexKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getIndexKeyword_0()); 

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
    // $ANTLR end "rule__Index__Group__0__Impl"


    // $ANTLR start "rule__Index__Group__1"
    // InternalMyDsl.g:1495:1: rule__Index__Group__1 : rule__Index__Group__1__Impl rule__Index__Group__2 ;
    public final void rule__Index__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( rule__Index__Group__1__Impl rule__Index__Group__2 )
            // InternalMyDsl.g:1500:2: rule__Index__Group__1__Impl rule__Index__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Index__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__2();

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
    // $ANTLR end "rule__Index__Group__1"


    // $ANTLR start "rule__Index__Group__1__Impl"
    // InternalMyDsl.g:1507:1: rule__Index__Group__1__Impl : ( ( rule__Index__NameAssignment_1 ) ) ;
    public final void rule__Index__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( ( ( rule__Index__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1512:1: ( ( rule__Index__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1512:1: ( ( rule__Index__NameAssignment_1 ) )
            // InternalMyDsl.g:1513:2: ( rule__Index__NameAssignment_1 )
            {
             before(grammarAccess.getIndexAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1514:2: ( rule__Index__NameAssignment_1 )
            // InternalMyDsl.g:1514:3: rule__Index__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Index__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Index__Group__1__Impl"


    // $ANTLR start "rule__Index__Group__2"
    // InternalMyDsl.g:1522:1: rule__Index__Group__2 : rule__Index__Group__2__Impl rule__Index__Group__3 ;
    public final void rule__Index__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( rule__Index__Group__2__Impl rule__Index__Group__3 )
            // InternalMyDsl.g:1527:2: rule__Index__Group__2__Impl rule__Index__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Index__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__3();

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
    // $ANTLR end "rule__Index__Group__2"


    // $ANTLR start "rule__Index__Group__2__Impl"
    // InternalMyDsl.g:1534:1: rule__Index__Group__2__Impl : ( ':' ) ;
    public final void rule__Index__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ':' ) )
            // InternalMyDsl.g:1539:1: ( ':' )
            {
            // InternalMyDsl.g:1539:1: ( ':' )
            // InternalMyDsl.g:1540:2: ':'
            {
             before(grammarAccess.getIndexAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Index__Group__2__Impl"


    // $ANTLR start "rule__Index__Group__3"
    // InternalMyDsl.g:1549:1: rule__Index__Group__3 : rule__Index__Group__3__Impl rule__Index__Group__4 ;
    public final void rule__Index__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( rule__Index__Group__3__Impl rule__Index__Group__4 )
            // InternalMyDsl.g:1554:2: rule__Index__Group__3__Impl rule__Index__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Index__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__4();

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
    // $ANTLR end "rule__Index__Group__3"


    // $ANTLR start "rule__Index__Group__3__Impl"
    // InternalMyDsl.g:1561:1: rule__Index__Group__3__Impl : ( '{' ) ;
    public final void rule__Index__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( ( '{' ) )
            // InternalMyDsl.g:1566:1: ( '{' )
            {
            // InternalMyDsl.g:1566:1: ( '{' )
            // InternalMyDsl.g:1567:2: '{'
            {
             before(grammarAccess.getIndexAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Index__Group__3__Impl"


    // $ANTLR start "rule__Index__Group__4"
    // InternalMyDsl.g:1576:1: rule__Index__Group__4 : rule__Index__Group__4__Impl rule__Index__Group__5 ;
    public final void rule__Index__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( rule__Index__Group__4__Impl rule__Index__Group__5 )
            // InternalMyDsl.g:1581:2: rule__Index__Group__4__Impl rule__Index__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Index__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__5();

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
    // $ANTLR end "rule__Index__Group__4"


    // $ANTLR start "rule__Index__Group__4__Impl"
    // InternalMyDsl.g:1588:1: rule__Index__Group__4__Impl : ( ( rule__Index__FieldsAssignment_4 )* ) ;
    public final void rule__Index__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( ( ( rule__Index__FieldsAssignment_4 )* ) )
            // InternalMyDsl.g:1593:1: ( ( rule__Index__FieldsAssignment_4 )* )
            {
            // InternalMyDsl.g:1593:1: ( ( rule__Index__FieldsAssignment_4 )* )
            // InternalMyDsl.g:1594:2: ( rule__Index__FieldsAssignment_4 )*
            {
             before(grammarAccess.getIndexAccess().getFieldsAssignment_4()); 
            // InternalMyDsl.g:1595:2: ( rule__Index__FieldsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1595:3: rule__Index__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Index__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getIndexAccess().getFieldsAssignment_4()); 

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
    // $ANTLR end "rule__Index__Group__4__Impl"


    // $ANTLR start "rule__Index__Group__5"
    // InternalMyDsl.g:1603:1: rule__Index__Group__5 : rule__Index__Group__5__Impl rule__Index__Group__6 ;
    public final void rule__Index__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( rule__Index__Group__5__Impl rule__Index__Group__6 )
            // InternalMyDsl.g:1608:2: rule__Index__Group__5__Impl rule__Index__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Index__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__6();

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
    // $ANTLR end "rule__Index__Group__5"


    // $ANTLR start "rule__Index__Group__5__Impl"
    // InternalMyDsl.g:1615:1: rule__Index__Group__5__Impl : ( ',' ) ;
    public final void rule__Index__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ',' ) )
            // InternalMyDsl.g:1620:1: ( ',' )
            {
            // InternalMyDsl.g:1620:1: ( ',' )
            // InternalMyDsl.g:1621:2: ','
            {
             before(grammarAccess.getIndexAccess().getCommaKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Index__Group__5__Impl"


    // $ANTLR start "rule__Index__Group__6"
    // InternalMyDsl.g:1630:1: rule__Index__Group__6 : rule__Index__Group__6__Impl rule__Index__Group__7 ;
    public final void rule__Index__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( rule__Index__Group__6__Impl rule__Index__Group__7 )
            // InternalMyDsl.g:1635:2: rule__Index__Group__6__Impl rule__Index__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Index__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__7();

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
    // $ANTLR end "rule__Index__Group__6"


    // $ANTLR start "rule__Index__Group__6__Impl"
    // InternalMyDsl.g:1642:1: rule__Index__Group__6__Impl : ( ( rule__Index__FieldsAssignment_6 )* ) ;
    public final void rule__Index__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1646:1: ( ( ( rule__Index__FieldsAssignment_6 )* ) )
            // InternalMyDsl.g:1647:1: ( ( rule__Index__FieldsAssignment_6 )* )
            {
            // InternalMyDsl.g:1647:1: ( ( rule__Index__FieldsAssignment_6 )* )
            // InternalMyDsl.g:1648:2: ( rule__Index__FieldsAssignment_6 )*
            {
             before(grammarAccess.getIndexAccess().getFieldsAssignment_6()); 
            // InternalMyDsl.g:1649:2: ( rule__Index__FieldsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1649:3: rule__Index__FieldsAssignment_6
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Index__FieldsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIndexAccess().getFieldsAssignment_6()); 

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
    // $ANTLR end "rule__Index__Group__6__Impl"


    // $ANTLR start "rule__Index__Group__7"
    // InternalMyDsl.g:1657:1: rule__Index__Group__7 : rule__Index__Group__7__Impl ;
    public final void rule__Index__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( rule__Index__Group__7__Impl )
            // InternalMyDsl.g:1662:2: rule__Index__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group__7__Impl();

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
    // $ANTLR end "rule__Index__Group__7"


    // $ANTLR start "rule__Index__Group__7__Impl"
    // InternalMyDsl.g:1668:1: rule__Index__Group__7__Impl : ( '}' ) ;
    public final void rule__Index__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( '}' ) )
            // InternalMyDsl.g:1673:1: ( '}' )
            {
            // InternalMyDsl.g:1673:1: ( '}' )
            // InternalMyDsl.g:1674:2: '}'
            {
             before(grammarAccess.getIndexAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Index__Group__7__Impl"


    // $ANTLR start "rule__SeedData__Group__0"
    // InternalMyDsl.g:1684:1: rule__SeedData__Group__0 : rule__SeedData__Group__0__Impl rule__SeedData__Group__1 ;
    public final void rule__SeedData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( rule__SeedData__Group__0__Impl rule__SeedData__Group__1 )
            // InternalMyDsl.g:1689:2: rule__SeedData__Group__0__Impl rule__SeedData__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SeedData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedData__Group__1();

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
    // $ANTLR end "rule__SeedData__Group__0"


    // $ANTLR start "rule__SeedData__Group__0__Impl"
    // InternalMyDsl.g:1696:1: rule__SeedData__Group__0__Impl : ( 'seedData' ) ;
    public final void rule__SeedData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( 'seedData' ) )
            // InternalMyDsl.g:1701:1: ( 'seedData' )
            {
            // InternalMyDsl.g:1701:1: ( 'seedData' )
            // InternalMyDsl.g:1702:2: 'seedData'
            {
             before(grammarAccess.getSeedDataAccess().getSeedDataKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSeedDataAccess().getSeedDataKeyword_0()); 

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
    // $ANTLR end "rule__SeedData__Group__0__Impl"


    // $ANTLR start "rule__SeedData__Group__1"
    // InternalMyDsl.g:1711:1: rule__SeedData__Group__1 : rule__SeedData__Group__1__Impl rule__SeedData__Group__2 ;
    public final void rule__SeedData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( rule__SeedData__Group__1__Impl rule__SeedData__Group__2 )
            // InternalMyDsl.g:1716:2: rule__SeedData__Group__1__Impl rule__SeedData__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SeedData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedData__Group__2();

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
    // $ANTLR end "rule__SeedData__Group__1"


    // $ANTLR start "rule__SeedData__Group__1__Impl"
    // InternalMyDsl.g:1723:1: rule__SeedData__Group__1__Impl : ( ( rule__SeedData__CollectionNameAssignment_1 ) ) ;
    public final void rule__SeedData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( ( ( rule__SeedData__CollectionNameAssignment_1 ) ) )
            // InternalMyDsl.g:1728:1: ( ( rule__SeedData__CollectionNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1728:1: ( ( rule__SeedData__CollectionNameAssignment_1 ) )
            // InternalMyDsl.g:1729:2: ( rule__SeedData__CollectionNameAssignment_1 )
            {
             before(grammarAccess.getSeedDataAccess().getCollectionNameAssignment_1()); 
            // InternalMyDsl.g:1730:2: ( rule__SeedData__CollectionNameAssignment_1 )
            // InternalMyDsl.g:1730:3: rule__SeedData__CollectionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SeedData__CollectionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeedDataAccess().getCollectionNameAssignment_1()); 

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
    // $ANTLR end "rule__SeedData__Group__1__Impl"


    // $ANTLR start "rule__SeedData__Group__2"
    // InternalMyDsl.g:1738:1: rule__SeedData__Group__2 : rule__SeedData__Group__2__Impl rule__SeedData__Group__3 ;
    public final void rule__SeedData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( rule__SeedData__Group__2__Impl rule__SeedData__Group__3 )
            // InternalMyDsl.g:1743:2: rule__SeedData__Group__2__Impl rule__SeedData__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__SeedData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedData__Group__3();

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
    // $ANTLR end "rule__SeedData__Group__2"


    // $ANTLR start "rule__SeedData__Group__2__Impl"
    // InternalMyDsl.g:1750:1: rule__SeedData__Group__2__Impl : ( '{' ) ;
    public final void rule__SeedData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( ( '{' ) )
            // InternalMyDsl.g:1755:1: ( '{' )
            {
            // InternalMyDsl.g:1755:1: ( '{' )
            // InternalMyDsl.g:1756:2: '{'
            {
             before(grammarAccess.getSeedDataAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSeedDataAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SeedData__Group__2__Impl"


    // $ANTLR start "rule__SeedData__Group__3"
    // InternalMyDsl.g:1765:1: rule__SeedData__Group__3 : rule__SeedData__Group__3__Impl rule__SeedData__Group__4 ;
    public final void rule__SeedData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( rule__SeedData__Group__3__Impl rule__SeedData__Group__4 )
            // InternalMyDsl.g:1770:2: rule__SeedData__Group__3__Impl rule__SeedData__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__SeedData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeedData__Group__4();

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
    // $ANTLR end "rule__SeedData__Group__3"


    // $ANTLR start "rule__SeedData__Group__3__Impl"
    // InternalMyDsl.g:1777:1: rule__SeedData__Group__3__Impl : ( ( rule__SeedData__DataArraysAssignment_3 )* ) ;
    public final void rule__SeedData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( ( rule__SeedData__DataArraysAssignment_3 )* ) )
            // InternalMyDsl.g:1782:1: ( ( rule__SeedData__DataArraysAssignment_3 )* )
            {
            // InternalMyDsl.g:1782:1: ( ( rule__SeedData__DataArraysAssignment_3 )* )
            // InternalMyDsl.g:1783:2: ( rule__SeedData__DataArraysAssignment_3 )*
            {
             before(grammarAccess.getSeedDataAccess().getDataArraysAssignment_3()); 
            // InternalMyDsl.g:1784:2: ( rule__SeedData__DataArraysAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1784:3: rule__SeedData__DataArraysAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SeedData__DataArraysAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSeedDataAccess().getDataArraysAssignment_3()); 

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
    // $ANTLR end "rule__SeedData__Group__3__Impl"


    // $ANTLR start "rule__SeedData__Group__4"
    // InternalMyDsl.g:1792:1: rule__SeedData__Group__4 : rule__SeedData__Group__4__Impl ;
    public final void rule__SeedData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( rule__SeedData__Group__4__Impl )
            // InternalMyDsl.g:1797:2: rule__SeedData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeedData__Group__4__Impl();

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
    // $ANTLR end "rule__SeedData__Group__4"


    // $ANTLR start "rule__SeedData__Group__4__Impl"
    // InternalMyDsl.g:1803:1: rule__SeedData__Group__4__Impl : ( '}' ) ;
    public final void rule__SeedData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( '}' ) )
            // InternalMyDsl.g:1808:1: ( '}' )
            {
            // InternalMyDsl.g:1808:1: ( '}' )
            // InternalMyDsl.g:1809:2: '}'
            {
             before(grammarAccess.getSeedDataAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSeedDataAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SeedData__Group__4__Impl"


    // $ANTLR start "rule__DataArray__Group__0"
    // InternalMyDsl.g:1819:1: rule__DataArray__Group__0 : rule__DataArray__Group__0__Impl rule__DataArray__Group__1 ;
    public final void rule__DataArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( rule__DataArray__Group__0__Impl rule__DataArray__Group__1 )
            // InternalMyDsl.g:1824:2: rule__DataArray__Group__0__Impl rule__DataArray__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataArray__Group__1();

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
    // $ANTLR end "rule__DataArray__Group__0"


    // $ANTLR start "rule__DataArray__Group__0__Impl"
    // InternalMyDsl.g:1831:1: rule__DataArray__Group__0__Impl : ( ( rule__DataArray__NameAssignment_0 ) ) ;
    public final void rule__DataArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( ( ( rule__DataArray__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1836:1: ( ( rule__DataArray__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1836:1: ( ( rule__DataArray__NameAssignment_0 ) )
            // InternalMyDsl.g:1837:2: ( rule__DataArray__NameAssignment_0 )
            {
             before(grammarAccess.getDataArrayAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1838:2: ( rule__DataArray__NameAssignment_0 )
            // InternalMyDsl.g:1838:3: rule__DataArray__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataArray__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataArrayAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__DataArray__Group__0__Impl"


    // $ANTLR start "rule__DataArray__Group__1"
    // InternalMyDsl.g:1846:1: rule__DataArray__Group__1 : rule__DataArray__Group__1__Impl rule__DataArray__Group__2 ;
    public final void rule__DataArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( rule__DataArray__Group__1__Impl rule__DataArray__Group__2 )
            // InternalMyDsl.g:1851:2: rule__DataArray__Group__1__Impl rule__DataArray__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__DataArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataArray__Group__2();

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
    // $ANTLR end "rule__DataArray__Group__1"


    // $ANTLR start "rule__DataArray__Group__1__Impl"
    // InternalMyDsl.g:1858:1: rule__DataArray__Group__1__Impl : ( '{' ) ;
    public final void rule__DataArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1862:1: ( ( '{' ) )
            // InternalMyDsl.g:1863:1: ( '{' )
            {
            // InternalMyDsl.g:1863:1: ( '{' )
            // InternalMyDsl.g:1864:2: '{'
            {
             before(grammarAccess.getDataArrayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataArrayAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__DataArray__Group__1__Impl"


    // $ANTLR start "rule__DataArray__Group__2"
    // InternalMyDsl.g:1873:1: rule__DataArray__Group__2 : rule__DataArray__Group__2__Impl rule__DataArray__Group__3 ;
    public final void rule__DataArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( rule__DataArray__Group__2__Impl rule__DataArray__Group__3 )
            // InternalMyDsl.g:1878:2: rule__DataArray__Group__2__Impl rule__DataArray__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__DataArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataArray__Group__3();

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
    // $ANTLR end "rule__DataArray__Group__2"


    // $ANTLR start "rule__DataArray__Group__2__Impl"
    // InternalMyDsl.g:1885:1: rule__DataArray__Group__2__Impl : ( ( rule__DataArray__DataPairsAssignment_2 )* ) ;
    public final void rule__DataArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( ( ( rule__DataArray__DataPairsAssignment_2 )* ) )
            // InternalMyDsl.g:1890:1: ( ( rule__DataArray__DataPairsAssignment_2 )* )
            {
            // InternalMyDsl.g:1890:1: ( ( rule__DataArray__DataPairsAssignment_2 )* )
            // InternalMyDsl.g:1891:2: ( rule__DataArray__DataPairsAssignment_2 )*
            {
             before(grammarAccess.getDataArrayAccess().getDataPairsAssignment_2()); 
            // InternalMyDsl.g:1892:2: ( rule__DataArray__DataPairsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1892:3: rule__DataArray__DataPairsAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__DataArray__DataPairsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataArrayAccess().getDataPairsAssignment_2()); 

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
    // $ANTLR end "rule__DataArray__Group__2__Impl"


    // $ANTLR start "rule__DataArray__Group__3"
    // InternalMyDsl.g:1900:1: rule__DataArray__Group__3 : rule__DataArray__Group__3__Impl ;
    public final void rule__DataArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( rule__DataArray__Group__3__Impl )
            // InternalMyDsl.g:1905:2: rule__DataArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataArray__Group__3__Impl();

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
    // $ANTLR end "rule__DataArray__Group__3"


    // $ANTLR start "rule__DataArray__Group__3__Impl"
    // InternalMyDsl.g:1911:1: rule__DataArray__Group__3__Impl : ( '}' ) ;
    public final void rule__DataArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( '}' ) )
            // InternalMyDsl.g:1916:1: ( '}' )
            {
            // InternalMyDsl.g:1916:1: ( '}' )
            // InternalMyDsl.g:1917:2: '}'
            {
             before(grammarAccess.getDataArrayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataArrayAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DataArray__Group__3__Impl"


    // $ANTLR start "rule__DataPair__Group__0"
    // InternalMyDsl.g:1927:1: rule__DataPair__Group__0 : rule__DataPair__Group__0__Impl rule__DataPair__Group__1 ;
    public final void rule__DataPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( rule__DataPair__Group__0__Impl rule__DataPair__Group__1 )
            // InternalMyDsl.g:1932:2: rule__DataPair__Group__0__Impl rule__DataPair__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__DataPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPair__Group__1();

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
    // $ANTLR end "rule__DataPair__Group__0"


    // $ANTLR start "rule__DataPair__Group__0__Impl"
    // InternalMyDsl.g:1939:1: rule__DataPair__Group__0__Impl : ( ( rule__DataPair__FieldNameAssignment_0 ) ) ;
    public final void rule__DataPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( ( ( rule__DataPair__FieldNameAssignment_0 ) ) )
            // InternalMyDsl.g:1944:1: ( ( rule__DataPair__FieldNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1944:1: ( ( rule__DataPair__FieldNameAssignment_0 ) )
            // InternalMyDsl.g:1945:2: ( rule__DataPair__FieldNameAssignment_0 )
            {
             before(grammarAccess.getDataPairAccess().getFieldNameAssignment_0()); 
            // InternalMyDsl.g:1946:2: ( rule__DataPair__FieldNameAssignment_0 )
            // InternalMyDsl.g:1946:3: rule__DataPair__FieldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataPair__FieldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataPairAccess().getFieldNameAssignment_0()); 

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
    // $ANTLR end "rule__DataPair__Group__0__Impl"


    // $ANTLR start "rule__DataPair__Group__1"
    // InternalMyDsl.g:1954:1: rule__DataPair__Group__1 : rule__DataPair__Group__1__Impl rule__DataPair__Group__2 ;
    public final void rule__DataPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( rule__DataPair__Group__1__Impl rule__DataPair__Group__2 )
            // InternalMyDsl.g:1959:2: rule__DataPair__Group__1__Impl rule__DataPair__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPair__Group__2();

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
    // $ANTLR end "rule__DataPair__Group__1"


    // $ANTLR start "rule__DataPair__Group__1__Impl"
    // InternalMyDsl.g:1966:1: rule__DataPair__Group__1__Impl : ( ':' ) ;
    public final void rule__DataPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ':' ) )
            // InternalMyDsl.g:1971:1: ( ':' )
            {
            // InternalMyDsl.g:1971:1: ( ':' )
            // InternalMyDsl.g:1972:2: ':'
            {
             before(grammarAccess.getDataPairAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataPairAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__DataPair__Group__1__Impl"


    // $ANTLR start "rule__DataPair__Group__2"
    // InternalMyDsl.g:1981:1: rule__DataPair__Group__2 : rule__DataPair__Group__2__Impl rule__DataPair__Group__3 ;
    public final void rule__DataPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( rule__DataPair__Group__2__Impl rule__DataPair__Group__3 )
            // InternalMyDsl.g:1986:2: rule__DataPair__Group__2__Impl rule__DataPair__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__DataPair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPair__Group__3();

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
    // $ANTLR end "rule__DataPair__Group__2"


    // $ANTLR start "rule__DataPair__Group__2__Impl"
    // InternalMyDsl.g:1993:1: rule__DataPair__Group__2__Impl : ( '{' ) ;
    public final void rule__DataPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1997:1: ( ( '{' ) )
            // InternalMyDsl.g:1998:1: ( '{' )
            {
            // InternalMyDsl.g:1998:1: ( '{' )
            // InternalMyDsl.g:1999:2: '{'
            {
             before(grammarAccess.getDataPairAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataPairAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DataPair__Group__2__Impl"


    // $ANTLR start "rule__DataPair__Group__3"
    // InternalMyDsl.g:2008:1: rule__DataPair__Group__3 : rule__DataPair__Group__3__Impl rule__DataPair__Group__4 ;
    public final void rule__DataPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( rule__DataPair__Group__3__Impl rule__DataPair__Group__4 )
            // InternalMyDsl.g:2013:2: rule__DataPair__Group__3__Impl rule__DataPair__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__DataPair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPair__Group__4();

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
    // $ANTLR end "rule__DataPair__Group__3"


    // $ANTLR start "rule__DataPair__Group__3__Impl"
    // InternalMyDsl.g:2020:1: rule__DataPair__Group__3__Impl : ( ( rule__DataPair__ValueAssignment_3 ) ) ;
    public final void rule__DataPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( ( ( rule__DataPair__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:2025:1: ( ( rule__DataPair__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:2025:1: ( ( rule__DataPair__ValueAssignment_3 ) )
            // InternalMyDsl.g:2026:2: ( rule__DataPair__ValueAssignment_3 )
            {
             before(grammarAccess.getDataPairAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:2027:2: ( rule__DataPair__ValueAssignment_3 )
            // InternalMyDsl.g:2027:3: rule__DataPair__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataPair__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataPairAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__DataPair__Group__3__Impl"


    // $ANTLR start "rule__DataPair__Group__4"
    // InternalMyDsl.g:2035:1: rule__DataPair__Group__4 : rule__DataPair__Group__4__Impl rule__DataPair__Group__5 ;
    public final void rule__DataPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( rule__DataPair__Group__4__Impl rule__DataPair__Group__5 )
            // InternalMyDsl.g:2040:2: rule__DataPair__Group__4__Impl rule__DataPair__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__DataPair__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPair__Group__5();

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
    // $ANTLR end "rule__DataPair__Group__4"


    // $ANTLR start "rule__DataPair__Group__4__Impl"
    // InternalMyDsl.g:2047:1: rule__DataPair__Group__4__Impl : ( ',' ) ;
    public final void rule__DataPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2051:1: ( ( ',' ) )
            // InternalMyDsl.g:2052:1: ( ',' )
            {
            // InternalMyDsl.g:2052:1: ( ',' )
            // InternalMyDsl.g:2053:2: ','
            {
             before(grammarAccess.getDataPairAccess().getCommaKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataPairAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__DataPair__Group__4__Impl"


    // $ANTLR start "rule__DataPair__Group__5"
    // InternalMyDsl.g:2062:1: rule__DataPair__Group__5 : rule__DataPair__Group__5__Impl rule__DataPair__Group__6 ;
    public final void rule__DataPair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( rule__DataPair__Group__5__Impl rule__DataPair__Group__6 )
            // InternalMyDsl.g:2067:2: rule__DataPair__Group__5__Impl rule__DataPair__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__DataPair__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPair__Group__6();

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
    // $ANTLR end "rule__DataPair__Group__5"


    // $ANTLR start "rule__DataPair__Group__5__Impl"
    // InternalMyDsl.g:2074:1: rule__DataPair__Group__5__Impl : ( ( rule__DataPair__DataTypeAssignment_5 ) ) ;
    public final void rule__DataPair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( ( rule__DataPair__DataTypeAssignment_5 ) ) )
            // InternalMyDsl.g:2079:1: ( ( rule__DataPair__DataTypeAssignment_5 ) )
            {
            // InternalMyDsl.g:2079:1: ( ( rule__DataPair__DataTypeAssignment_5 ) )
            // InternalMyDsl.g:2080:2: ( rule__DataPair__DataTypeAssignment_5 )
            {
             before(grammarAccess.getDataPairAccess().getDataTypeAssignment_5()); 
            // InternalMyDsl.g:2081:2: ( rule__DataPair__DataTypeAssignment_5 )
            // InternalMyDsl.g:2081:3: rule__DataPair__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataPair__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataPairAccess().getDataTypeAssignment_5()); 

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
    // $ANTLR end "rule__DataPair__Group__5__Impl"


    // $ANTLR start "rule__DataPair__Group__6"
    // InternalMyDsl.g:2089:1: rule__DataPair__Group__6 : rule__DataPair__Group__6__Impl ;
    public final void rule__DataPair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( rule__DataPair__Group__6__Impl )
            // InternalMyDsl.g:2094:2: rule__DataPair__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataPair__Group__6__Impl();

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
    // $ANTLR end "rule__DataPair__Group__6"


    // $ANTLR start "rule__DataPair__Group__6__Impl"
    // InternalMyDsl.g:2100:1: rule__DataPair__Group__6__Impl : ( '}' ) ;
    public final void rule__DataPair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( ( '}' ) )
            // InternalMyDsl.g:2105:1: ( '}' )
            {
            // InternalMyDsl.g:2105:1: ( '}' )
            // InternalMyDsl.g:2106:2: '}'
            {
             before(grammarAccess.getDataPairAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataPairAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DataPair__Group__6__Impl"


    // $ANTLR start "rule__DBModel__CollectionsAssignment_5"
    // InternalMyDsl.g:2116:1: rule__DBModel__CollectionsAssignment_5 : ( ruleCollection ) ;
    public final void rule__DBModel__CollectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:2121:2: ( ruleCollection )
            {
            // InternalMyDsl.g:2121:2: ( ruleCollection )
            // InternalMyDsl.g:2122:3: ruleCollection
            {
             before(grammarAccess.getDBModelAccess().getCollectionsCollectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getDBModelAccess().getCollectionsCollectionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DBModel__CollectionsAssignment_5"


    // $ANTLR start "rule__Collection__NameAssignment_1"
    // InternalMyDsl.g:2131:1: rule__Collection__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Collection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2136:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2136:2: ( RULE_STRING )
            // InternalMyDsl.g:2137:3: RULE_STRING
            {
             before(grammarAccess.getCollectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Collection__NameAssignment_1"


    // $ANTLR start "rule__Collection__FieldsAssignment_5"
    // InternalMyDsl.g:2146:1: rule__Collection__FieldsAssignment_5 : ( ruleField ) ;
    public final void rule__Collection__FieldsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( ruleField ) )
            // InternalMyDsl.g:2151:2: ( ruleField )
            {
            // InternalMyDsl.g:2151:2: ( ruleField )
            // InternalMyDsl.g:2152:3: ruleField
            {
             before(grammarAccess.getCollectionAccess().getFieldsFieldParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getFieldsFieldParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Collection__FieldsAssignment_5"


    // $ANTLR start "rule__Collection__IndexesAssignment_9"
    // InternalMyDsl.g:2161:1: rule__Collection__IndexesAssignment_9 : ( ruleIndex ) ;
    public final void rule__Collection__IndexesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( ( ruleIndex ) )
            // InternalMyDsl.g:2166:2: ( ruleIndex )
            {
            // InternalMyDsl.g:2166:2: ( ruleIndex )
            // InternalMyDsl.g:2167:3: ruleIndex
            {
             before(grammarAccess.getCollectionAccess().getIndexesIndexParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleIndex();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getIndexesIndexParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Collection__IndexesAssignment_9"


    // $ANTLR start "rule__Collection__SeedDataAssignment_11"
    // InternalMyDsl.g:2176:1: rule__Collection__SeedDataAssignment_11 : ( ruleSeedData ) ;
    public final void rule__Collection__SeedDataAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2180:1: ( ( ruleSeedData ) )
            // InternalMyDsl.g:2181:2: ( ruleSeedData )
            {
            // InternalMyDsl.g:2181:2: ( ruleSeedData )
            // InternalMyDsl.g:2182:3: ruleSeedData
            {
             before(grammarAccess.getCollectionAccess().getSeedDataSeedDataParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSeedData();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getSeedDataSeedDataParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Collection__SeedDataAssignment_11"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalMyDsl.g:2191:1: rule__Field__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2196:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2196:2: ( RULE_STRING )
            // InternalMyDsl.g:2197:3: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_3"
    // InternalMyDsl.g:2206:1: rule__Field__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( ( ruleDataType ) )
            // InternalMyDsl.g:2211:2: ( ruleDataType )
            {
            // InternalMyDsl.g:2211:2: ( ruleDataType )
            // InternalMyDsl.g:2212:3: ruleDataType
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_3"


    // $ANTLR start "rule__DataType__DataTypeAssignment_5_2"
    // InternalMyDsl.g:2221:1: rule__DataType__DataTypeAssignment_5_2 : ( ruleDataType ) ;
    public final void rule__DataType__DataTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( ( ruleDataType ) )
            // InternalMyDsl.g:2226:2: ( ruleDataType )
            {
            // InternalMyDsl.g:2226:2: ( ruleDataType )
            // InternalMyDsl.g:2227:3: ruleDataType
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeDataTypeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getDataTypeDataTypeParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__DataType__DataTypeAssignment_5_2"


    // $ANTLR start "rule__Index__NameAssignment_1"
    // InternalMyDsl.g:2236:1: rule__Index__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Index__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2240:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2241:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2241:2: ( RULE_STRING )
            // InternalMyDsl.g:2242:3: RULE_STRING
            {
             before(grammarAccess.getIndexAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Index__NameAssignment_1"


    // $ANTLR start "rule__Index__FieldsAssignment_4"
    // InternalMyDsl.g:2251:1: rule__Index__FieldsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Index__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2256:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2256:2: ( RULE_STRING )
            // InternalMyDsl.g:2257:3: RULE_STRING
            {
             before(grammarAccess.getIndexAccess().getFieldsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getFieldsSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Index__FieldsAssignment_4"


    // $ANTLR start "rule__Index__FieldsAssignment_6"
    // InternalMyDsl.g:2266:1: rule__Index__FieldsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Index__FieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2271:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2271:2: ( RULE_STRING )
            // InternalMyDsl.g:2272:3: RULE_STRING
            {
             before(grammarAccess.getIndexAccess().getFieldsSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getFieldsSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Index__FieldsAssignment_6"


    // $ANTLR start "rule__SeedData__CollectionNameAssignment_1"
    // InternalMyDsl.g:2281:1: rule__SeedData__CollectionNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SeedData__CollectionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2286:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2286:2: ( RULE_STRING )
            // InternalMyDsl.g:2287:3: RULE_STRING
            {
             before(grammarAccess.getSeedDataAccess().getCollectionNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSeedDataAccess().getCollectionNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SeedData__CollectionNameAssignment_1"


    // $ANTLR start "rule__SeedData__DataArraysAssignment_3"
    // InternalMyDsl.g:2296:1: rule__SeedData__DataArraysAssignment_3 : ( ruleDataArray ) ;
    public final void rule__SeedData__DataArraysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( ( ruleDataArray ) )
            // InternalMyDsl.g:2301:2: ( ruleDataArray )
            {
            // InternalMyDsl.g:2301:2: ( ruleDataArray )
            // InternalMyDsl.g:2302:3: ruleDataArray
            {
             before(grammarAccess.getSeedDataAccess().getDataArraysDataArrayParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataArray();

            state._fsp--;

             after(grammarAccess.getSeedDataAccess().getDataArraysDataArrayParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SeedData__DataArraysAssignment_3"


    // $ANTLR start "rule__DataArray__NameAssignment_0"
    // InternalMyDsl.g:2311:1: rule__DataArray__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataArray__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2315:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2316:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2316:2: ( RULE_ID )
            // InternalMyDsl.g:2317:3: RULE_ID
            {
             before(grammarAccess.getDataArrayAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataArrayAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DataArray__NameAssignment_0"


    // $ANTLR start "rule__DataArray__DataPairsAssignment_2"
    // InternalMyDsl.g:2326:1: rule__DataArray__DataPairsAssignment_2 : ( ruleDataPair ) ;
    public final void rule__DataArray__DataPairsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( ruleDataPair ) )
            // InternalMyDsl.g:2331:2: ( ruleDataPair )
            {
            // InternalMyDsl.g:2331:2: ( ruleDataPair )
            // InternalMyDsl.g:2332:3: ruleDataPair
            {
             before(grammarAccess.getDataArrayAccess().getDataPairsDataPairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataPair();

            state._fsp--;

             after(grammarAccess.getDataArrayAccess().getDataPairsDataPairParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataArray__DataPairsAssignment_2"


    // $ANTLR start "rule__DataPair__FieldNameAssignment_0"
    // InternalMyDsl.g:2341:1: rule__DataPair__FieldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataPair__FieldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2346:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2346:2: ( RULE_STRING )
            // InternalMyDsl.g:2347:3: RULE_STRING
            {
             before(grammarAccess.getDataPairAccess().getFieldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataPairAccess().getFieldNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DataPair__FieldNameAssignment_0"


    // $ANTLR start "rule__DataPair__ValueAssignment_3"
    // InternalMyDsl.g:2356:1: rule__DataPair__ValueAssignment_3 : ( ruleDataValue ) ;
    public final void rule__DataPair__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( ( ruleDataValue ) )
            // InternalMyDsl.g:2361:2: ( ruleDataValue )
            {
            // InternalMyDsl.g:2361:2: ( ruleDataValue )
            // InternalMyDsl.g:2362:3: ruleDataValue
            {
             before(grammarAccess.getDataPairAccess().getValueDataValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getDataPairAccess().getValueDataValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataPair__ValueAssignment_3"


    // $ANTLR start "rule__DataPair__DataTypeAssignment_5"
    // InternalMyDsl.g:2371:1: rule__DataPair__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__DataPair__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2375:1: ( ( ruleDataType ) )
            // InternalMyDsl.g:2376:2: ( ruleDataType )
            {
            // InternalMyDsl.g:2376:2: ( ruleDataType )
            // InternalMyDsl.g:2377:3: ruleDataType
            {
             before(grammarAccess.getDataPairAccess().getDataTypeDataTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataPairAccess().getDataTypeDataTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DataPair__DataTypeAssignment_5"


    // $ANTLR start "rule__DataValue__StringValueAssignment_0"
    // InternalMyDsl.g:2386:1: rule__DataValue__StringValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataValue__StringValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2391:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2391:2: ( RULE_STRING )
            // InternalMyDsl.g:2392:3: RULE_STRING
            {
             before(grammarAccess.getDataValueAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DataValue__StringValueAssignment_0"


    // $ANTLR start "rule__DataValue__IntValueAssignment_1"
    // InternalMyDsl.g:2401:1: rule__DataValue__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__DataValue__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2406:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2406:2: ( RULE_INT )
            // InternalMyDsl.g:2407:3: RULE_INT
            {
             before(grammarAccess.getDataValueAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getIntValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataValue__IntValueAssignment_1"


    // $ANTLR start "rule__DataValue__DoubleValueAssignment_2"
    // InternalMyDsl.g:2416:1: rule__DataValue__DoubleValueAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__DataValue__DoubleValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( RULE_DOUBLE ) )
            // InternalMyDsl.g:2421:2: ( RULE_DOUBLE )
            {
            // InternalMyDsl.g:2421:2: ( RULE_DOUBLE )
            // InternalMyDsl.g:2422:3: RULE_DOUBLE
            {
             before(grammarAccess.getDataValueAccess().getDoubleValueDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getDoubleValueDOUBLETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataValue__DoubleValueAssignment_2"


    // $ANTLR start "rule__DataValue__BooleanValueAssignment_3"
    // InternalMyDsl.g:2431:1: rule__DataValue__BooleanValueAssignment_3 : ( RULE_BOOLEAN ) ;
    public final void rule__DataValue__BooleanValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( ( RULE_BOOLEAN ) )
            // InternalMyDsl.g:2436:2: ( RULE_BOOLEAN )
            {
            // InternalMyDsl.g:2436:2: ( RULE_BOOLEAN )
            // InternalMyDsl.g:2437:3: RULE_BOOLEAN
            {
             before(grammarAccess.getDataValueAccess().getBooleanValueBOOLEANTerminalRuleCall_3_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getBooleanValueBOOLEANTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataValue__BooleanValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000013F000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});

}