/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getDataValueAccess().getAlternatives(), "rule__DataValue__Alternatives");
			builder.put(grammarAccess.getDBModelAccess().getGroup(), "rule__DBModel__Group__0");
			builder.put(grammarAccess.getCollectionAccess().getGroup(), "rule__Collection__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_0(), "rule__DataType__Group_0__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_1(), "rule__DataType__Group_1__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_2(), "rule__DataType__Group_2__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_3(), "rule__DataType__Group_3__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_4(), "rule__DataType__Group_4__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_5(), "rule__DataType__Group_5__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup_6(), "rule__DataType__Group_6__0");
			builder.put(grammarAccess.getIndexAccess().getGroup(), "rule__Index__Group__0");
			builder.put(grammarAccess.getSeedDataAccess().getGroup(), "rule__SeedData__Group__0");
			builder.put(grammarAccess.getDataArrayAccess().getGroup(), "rule__DataArray__Group__0");
			builder.put(grammarAccess.getDataPairAccess().getGroup(), "rule__DataPair__Group__0");
			builder.put(grammarAccess.getDBModelAccess().getCollectionsAssignment_5(), "rule__DBModel__CollectionsAssignment_5");
			builder.put(grammarAccess.getCollectionAccess().getNameAssignment_1(), "rule__Collection__NameAssignment_1");
			builder.put(grammarAccess.getCollectionAccess().getFieldsAssignment_5(), "rule__Collection__FieldsAssignment_5");
			builder.put(grammarAccess.getCollectionAccess().getIndexesAssignment_9(), "rule__Collection__IndexesAssignment_9");
			builder.put(grammarAccess.getCollectionAccess().getSeedDataAssignment_11(), "rule__Collection__SeedDataAssignment_11");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_3(), "rule__Field__TypeAssignment_3");
			builder.put(grammarAccess.getDataTypeAccess().getDataTypeAssignment_5_2(), "rule__DataType__DataTypeAssignment_5_2");
			builder.put(grammarAccess.getIndexAccess().getNameAssignment_1(), "rule__Index__NameAssignment_1");
			builder.put(grammarAccess.getIndexAccess().getFieldsAssignment_4(), "rule__Index__FieldsAssignment_4");
			builder.put(grammarAccess.getIndexAccess().getFieldsAssignment_6(), "rule__Index__FieldsAssignment_6");
			builder.put(grammarAccess.getSeedDataAccess().getCollectionNameAssignment_1(), "rule__SeedData__CollectionNameAssignment_1");
			builder.put(grammarAccess.getSeedDataAccess().getDataArraysAssignment_3(), "rule__SeedData__DataArraysAssignment_3");
			builder.put(grammarAccess.getDataArrayAccess().getNameAssignment_0(), "rule__DataArray__NameAssignment_0");
			builder.put(grammarAccess.getDataArrayAccess().getDataPairsAssignment_2(), "rule__DataArray__DataPairsAssignment_2");
			builder.put(grammarAccess.getDataPairAccess().getFieldNameAssignment_0(), "rule__DataPair__FieldNameAssignment_0");
			builder.put(grammarAccess.getDataPairAccess().getValueAssignment_3(), "rule__DataPair__ValueAssignment_3");
			builder.put(grammarAccess.getDataPairAccess().getDataTypeAssignment_5(), "rule__DataPair__DataTypeAssignment_5");
			builder.put(grammarAccess.getDataValueAccess().getStringValueAssignment_0(), "rule__DataValue__StringValueAssignment_0");
			builder.put(grammarAccess.getDataValueAccess().getIntValueAssignment_1(), "rule__DataValue__IntValueAssignment_1");
			builder.put(grammarAccess.getDataValueAccess().getDoubleValueAssignment_2(), "rule__DataValue__DoubleValueAssignment_2");
			builder.put(grammarAccess.getDataValueAccess().getBooleanValueAssignment_3(), "rule__DataValue__BooleanValueAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
