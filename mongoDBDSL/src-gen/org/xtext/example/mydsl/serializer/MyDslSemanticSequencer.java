/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.DBModel;
import org.xtext.example.mydsl.myDsl.DataArray;
import org.xtext.example.mydsl.myDsl.DataPair;
import org.xtext.example.mydsl.myDsl.DataType;
import org.xtext.example.mydsl.myDsl.DataValue;
import org.xtext.example.mydsl.myDsl.Field;
import org.xtext.example.mydsl.myDsl.Index;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SeedData;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.COLLECTION:
				sequence_Collection(context, (Collection) semanticObject); 
				return; 
			case MyDslPackage.DB_MODEL:
				sequence_DBModel(context, (DBModel) semanticObject); 
				return; 
			case MyDslPackage.DATA_ARRAY:
				sequence_DataArray(context, (DataArray) semanticObject); 
				return; 
			case MyDslPackage.DATA_PAIR:
				sequence_DataPair(context, (DataPair) semanticObject); 
				return; 
			case MyDslPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case MyDslPackage.DATA_VALUE:
				sequence_DataValue(context, (DataValue) semanticObject); 
				return; 
			case MyDslPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case MyDslPackage.INDEX:
				sequence_Index(context, (Index) semanticObject); 
				return; 
			case MyDslPackage.SEED_DATA:
				sequence_SeedData(context, (SeedData) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Collection returns Collection
	 *
	 * Constraint:
	 *     (name=STRING fields+=Field* indexes+=Index* seedData=SeedData?)
	 * </pre>
	 */
	protected void sequence_Collection(ISerializationContext context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DBModel returns DBModel
	 *
	 * Constraint:
	 *     collections+=Collection*
	 * </pre>
	 */
	protected void sequence_DBModel(ISerializationContext context, DBModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DataArray returns DataArray
	 *
	 * Constraint:
	 *     (name=ID dataPairs+=DataPair*)
	 * </pre>
	 */
	protected void sequence_DataArray(ISerializationContext context, DataArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DataPair returns DataPair
	 *
	 * Constraint:
	 *     (fieldName=STRING value=DataValue dataType=DataType)
	 * </pre>
	 */
	protected void sequence_DataPair(ISerializationContext context, DataPair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DATA_PAIR__FIELD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DATA_PAIR__FIELD_NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DATA_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DATA_PAIR__VALUE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DATA_PAIR__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DATA_PAIR__DATA_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataPairAccess().getFieldNameSTRINGTerminalRuleCall_0_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getDataPairAccess().getValueDataValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDataPairAccess().getDataTypeDataTypeParserRuleCall_5_0(), semanticObject.getDataType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     dataType=DataType?
	 * </pre>
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DataValue returns DataValue
	 *
	 * Constraint:
	 *     (stringValue=STRING | intValue=INT | doubleValue=DOUBLE | booleanValue=BOOLEAN)
	 * </pre>
	 */
	protected void sequence_DataValue(ISerializationContext context, DataValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (name=STRING type=DataType)
	 * </pre>
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FIELD__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Index returns Index
	 *
	 * Constraint:
	 *     (name=STRING fields+=STRING* fields+=STRING*)
	 * </pre>
	 */
	protected void sequence_Index(ISerializationContext context, Index semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SeedData returns SeedData
	 *
	 * Constraint:
	 *     (collectionName=STRING dataArrays+=DataArray*)
	 * </pre>
	 */
	protected void sequence_SeedData(ISerializationContext context, SeedData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
