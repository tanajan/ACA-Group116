/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.Field;
import org.xtext.example.mydsl.myDsl.Index;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SeedData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CollectionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CollectionImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CollectionImpl#getSeedData <em>Seed Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexes()
   * @generated
   * @ordered
   */
  protected EList<Index> indexes;

  /**
   * The cached value of the '{@link #getSeedData() <em>Seed Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeedData()
   * @generated
   * @ordered
   */
  protected SeedData seedData;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, MyDslPackage.COLLECTION__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Index> getIndexes()
  {
    if (indexes == null)
    {
      indexes = new EObjectContainmentEList<Index>(Index.class, this, MyDslPackage.COLLECTION__INDEXES);
    }
    return indexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeedData getSeedData()
  {
    return seedData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeedData(SeedData newSeedData, NotificationChain msgs)
  {
    SeedData oldSeedData = seedData;
    seedData = newSeedData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COLLECTION__SEED_DATA, oldSeedData, newSeedData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSeedData(SeedData newSeedData)
  {
    if (newSeedData != seedData)
    {
      NotificationChain msgs = null;
      if (seedData != null)
        msgs = ((InternalEObject)seedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COLLECTION__SEED_DATA, null, msgs);
      if (newSeedData != null)
        msgs = ((InternalEObject)newSeedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COLLECTION__SEED_DATA, null, msgs);
      msgs = basicSetSeedData(newSeedData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLLECTION__SEED_DATA, newSeedData, newSeedData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.COLLECTION__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case MyDslPackage.COLLECTION__INDEXES:
        return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.COLLECTION__SEED_DATA:
        return basicSetSeedData(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COLLECTION__NAME:
        return getName();
      case MyDslPackage.COLLECTION__FIELDS:
        return getFields();
      case MyDslPackage.COLLECTION__INDEXES:
        return getIndexes();
      case MyDslPackage.COLLECTION__SEED_DATA:
        return getSeedData();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COLLECTION__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.COLLECTION__FIELDS:
        getFields().clear();
        getFields().addAll((java.util.Collection<? extends Field>)newValue);
        return;
      case MyDslPackage.COLLECTION__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((java.util.Collection<? extends Index>)newValue);
        return;
      case MyDslPackage.COLLECTION__SEED_DATA:
        setSeedData((SeedData)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.COLLECTION__FIELDS:
        getFields().clear();
        return;
      case MyDslPackage.COLLECTION__INDEXES:
        getIndexes().clear();
        return;
      case MyDslPackage.COLLECTION__SEED_DATA:
        setSeedData((SeedData)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.COLLECTION__FIELDS:
        return fields != null && !fields.isEmpty();
      case MyDslPackage.COLLECTION__INDEXES:
        return indexes != null && !indexes.isEmpty();
      case MyDslPackage.COLLECTION__SEED_DATA:
        return seedData != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CollectionImpl
