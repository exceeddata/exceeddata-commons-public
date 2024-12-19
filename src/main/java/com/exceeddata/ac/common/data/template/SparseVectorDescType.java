package com.exceeddata.ac.common.data.template;

import com.exceeddata.ac.common.data.type.Types;

public class SparseVectorDescType extends VectorDescType {
    private static final long serialVersionUID = 1L;
    
    /** {@inheritDoc} */
    @Override
    public boolean isPrimitive() {
        return false;
    }
    
    /** {@inheritDoc} */
    @Override
    public boolean isGroup() {
        return true;
    }
    
    /** {@inheritDoc} */
    @Override
    public boolean isKeyValue() {
        return false;
    }
    
    /** {@inheritDoc} */
    @Override
    public byte getType() { return Types.SPARSEVECTOR; }

    /** {@inheritDoc} */
    @Override
    public GroupDescType asGroupDescType() {
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyValueDescType asKeyValueDescType() {
        throw new IllegalArgumentException("DATA_SPARSEVECTOR_TO_KEYVALUE_DESC_INVALID");
    }

    /** {@inheritDoc} */
    @Override
    public PrimitiveDescType asPrimitiveDescType() {
        throw new IllegalArgumentException("DATA_SPARSEVECTOR_TO_PRIMITIVE_DESC_INVALID");
    }
}
