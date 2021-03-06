/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>View State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getViewState()
 * @model
 * @generated
 */
public enum ViewState implements Enumerator {
	/**
	 * The '<em><b>VISIBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VISIBLE(0, "VISIBLE", "VISIBLE"),

	/**
	 * The '<em><b>TRANSPARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENT(0, "TRANSPARENT", "TRANSPARENT"),

	/**
	 * The '<em><b>HIDDEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	HIDDEN(0, "HIDDEN", "HIDDEN");

	/**
	 * The '<em><b>VISIBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VISIBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VISIBLE_VALUE = 0;

	/**
	 * The '<em><b>TRANSPARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPARENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENT_VALUE = 0;

	/**
	 * The '<em><b>HIDDEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIDDEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDDEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIDDEN_VALUE = 0;

	/**
	 * An array of all the '<em><b>View State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ViewState[] VALUES_ARRAY =
		new ViewState[] {
			VISIBLE,
			TRANSPARENT,
			HIDDEN,
		};

	/**
	 * A public read-only list of all the '<em><b>View State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ViewState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>View State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>View State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>View State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewState get(int value) {
		switch (value) {
			case VISIBLE_VALUE: return VISIBLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ViewState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ViewState
