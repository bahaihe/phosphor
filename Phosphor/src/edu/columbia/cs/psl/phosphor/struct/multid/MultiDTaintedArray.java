package edu.columbia.cs.psl.phosphor.struct.multid;

import edu.columbia.cs.psl.phosphor.Configuration;
import edu.columbia.cs.psl.phosphor.org.objectweb.asm.Type;

public abstract class MultiDTaintedArray {

	public static final Type getTypeForType(final Type originalElementType) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getTypeForType(originalElementType);
		return MultiDTaintedArrayWithObjTag.getTypeForType(originalElementType);
	}

	public static final String isPrimitiveBoxClass(Class c) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.isPrimitiveBoxClass(c);
		else
			return MultiDTaintedArrayWithObjTag.isPrimitiveBoxClass(c);
	}

	public static final String getPrimitiveTypeForWrapper(Class c) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getPrimitiveTypeForWrapper(c);
		else
			return MultiDTaintedArrayWithObjTag.getPrimitiveTypeForWrapper(c);

	}

	public static final Class getUnderlyingBoxClassForUnderlyingClass(Class c) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getUnderlyingBoxClassForUnderlyingClass(c);
		else
			return MultiDTaintedArrayWithObjTag.getUnderlyingBoxClassForUnderlyingClass(c);

	}

	public static final Class getClassForComponentType(final int componentSort) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getClassForComponentType(componentSort);
		else
			return MultiDTaintedArrayWithObjTag.getClassForComponentType(componentSort);
	}

	public static final Object unboxRaw(final Object in) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.unboxRaw(in);
		else
			return MultiDTaintedArrayWithObjTag.unboxRaw(in);
	}

	public static final Object unboxVal(final Object _in, final int componentType, final int dims) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.unboxVal(_in, componentType, dims);
		else
			return MultiDTaintedArrayWithObjTag.unboxVal(_in, componentType, dims);
	}

	public static int getSortForBoxClass(Class c) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getSortForBoxClass(c);
		else
			return MultiDTaintedArrayWithObjTag.getSortForBoxClass(c);
	}

	public static int getSort(Class c) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getSort(c);
		else
			return MultiDTaintedArrayWithObjTag.getSort(c);

	}

	public static final Object boxIfNecessary(final Object in) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.boxIfNecessary(in);
		else
			return MultiDTaintedArrayWithObjTag.boxIfNecessary(in);
	}

	public static final Object initWithEmptyTaints(final Object[] ar, final int componentType, final int dims) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.initWithEmptyTaints(ar, componentType, dims);
		else
			return MultiDTaintedArrayWithObjTag.initWithEmptyTaints(ar, componentType, dims);
	}

	public static final void initLastDim(final Object[] ar, final int lastDimSize, final int componentType) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			MultiDTaintedArrayWithIntTag.initLastDim(ar, lastDimSize, componentType);
		else
			MultiDTaintedArrayWithObjTag.initLastDim(ar, lastDimSize, componentType);

	}

	public static Type getPrimitiveTypeForWrapper(String internalName) {
		if (Configuration.TAINT_TAG_TYPE == Type.INT)
			return MultiDTaintedArrayWithIntTag.getPrimitiveTypeForWrapper(internalName);
		else
			return MultiDTaintedArrayWithObjTag.getPrimitiveTypeForWrapper(internalName);

	}
}
