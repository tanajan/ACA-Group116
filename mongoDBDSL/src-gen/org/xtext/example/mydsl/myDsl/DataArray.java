/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataArray#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataArray#getDataPairs <em>Data Pairs</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataArray()
 * @model
 * @generated
 */
public interface DataArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataArray_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataArray#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data Pairs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DataPair}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Pairs</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataArray_DataPairs()
   * @model containment="true"
   * @generated
   */
  EList<DataPair> getDataPairs();

} // DataArray
