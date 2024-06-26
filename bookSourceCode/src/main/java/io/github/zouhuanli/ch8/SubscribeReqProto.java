// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeReq.proto
// Protobuf Java Version: 4.26.1

package io.github.zouhuanli.ch8;



public final class SubscribeReqProto {
  private SubscribeReqProto() {}

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubscribeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:netty.SubscribeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 subReqID = 1;</code>
     * @return Whether the subReqID field is set.
     */
    boolean hasSubReqID();
    /**
     * <code>required int32 subReqID = 1;</code>
     * @return The subReqID.
     */
    int getSubReqID();

    /**
     * <code>required string userName = 2;</code>
     * @return Whether the userName field is set.
     */
    boolean hasUserName();
    /**
     * <code>required string userName = 2;</code>
     * @return The userName.
     */
    String getUserName();
    /**
     * <code>required string userName = 2;</code>
     * @return The bytes for userName.
     */
    com.google.protobuf.ByteString
        getUserNameBytes();

    /**
     * <code>required string productName = 3;</code>
     * @return Whether the productName field is set.
     */
    boolean hasProductName();
    /**
     * <code>required string productName = 3;</code>
     * @return The productName.
     */
    String getProductName();
    /**
     * <code>required string productName = 3;</code>
     * @return The bytes for productName.
     */
    com.google.protobuf.ByteString
        getProductNameBytes();

    /**
     * <code>repeated string address = 4;</code>
     * @return A list containing the address.
     */
    java.util.List<String>
        getAddressList();
    /**
     * <code>repeated string address = 4;</code>
     * @return The count of address.
     */
    int getAddressCount();
    /**
     * <code>repeated string address = 4;</code>
     * @param index The index of the element to return.
     * @return The address at the given index.
     */
    String getAddress(int index);
    /**
     * <code>repeated string address = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the address at the given index.
     */
    com.google.protobuf.ByteString
        getAddressBytes(int index);
  }
  /**
   * Protobuf type {@code netty.SubscribeReq}
   */
  public static final class SubscribeReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:netty.SubscribeReq)
      SubscribeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 1,
        /* suffix= */ "",
        SubscribeReq.class.getName());
    }
    // Use SubscribeReq.newBuilder() to construct.
    private SubscribeReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SubscribeReq() {
      userName_ = "";
      productName_ = "";
      address_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SubscribeReq.class, Builder.class);
    }

    private int bitField0_;
    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqID_ = 0;
    /**
     * <code>required int32 subReqID = 1;</code>
     * @return Whether the subReqID field is set.
     */
    @Override
    public boolean hasSubReqID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 subReqID = 1;</code>
     * @return The subReqID.
     */
    @Override
    public int getSubReqID() {
      return subReqID_;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object userName_ = "";
    /**
     * <code>required string userName = 2;</code>
     * @return Whether the userName field is set.
     */
    @Override
    public boolean hasUserName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string userName = 2;</code>
     * @return The userName.
     */
    @Override
    public String getUserName() {
      Object ref = userName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string userName = 2;</code>
     * @return The bytes for userName.
     */
    @Override
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRODUCTNAME_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile Object productName_ = "";
    /**
     * <code>required string productName = 3;</code>
     * @return Whether the productName field is set.
     */
    @Override
    public boolean hasProductName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string productName = 3;</code>
     * @return The productName.
     */
    @Override
    public String getProductName() {
      Object ref = productName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          productName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string productName = 3;</code>
     * @return The bytes for productName.
     */
    @Override
    public com.google.protobuf.ByteString
        getProductNameBytes() {
      Object ref = productName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        productName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDRESS_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList address_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string address = 4;</code>
     * @return A list containing the address.
     */
    public com.google.protobuf.ProtocolStringList
        getAddressList() {
      return address_;
    }
    /**
     * <code>repeated string address = 4;</code>
     * @return The count of address.
     */
    public int getAddressCount() {
      return address_.size();
    }
    /**
     * <code>repeated string address = 4;</code>
     * @param index The index of the element to return.
     * @return The address at the given index.
     */
    public String getAddress(int index) {
      return address_.get(index);
    }
    /**
     * <code>repeated string address = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the address at the given index.
     */
    public com.google.protobuf.ByteString
        getAddressBytes(int index) {
      return address_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSubReqID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProductName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, userName_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, productName_);
      }
      for (int i = 0; i < address_.size(); i++) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, address_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, userName_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, productName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < address_.size(); i++) {
          dataSize += computeStringSizeNoTag(address_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAddressList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SubscribeReq)) {
        return super.equals(obj);
      }
      SubscribeReq other = (SubscribeReq) obj;

      if (hasSubReqID() != other.hasSubReqID()) return false;
      if (hasSubReqID()) {
        if (getSubReqID()
            != other.getSubReqID()) return false;
      }
      if (hasUserName() != other.hasUserName()) return false;
      if (hasUserName()) {
        if (!getUserName()
            .equals(other.getUserName())) return false;
      }
      if (hasProductName() != other.hasProductName()) return false;
      if (hasProductName()) {
        if (!getProductName()
            .equals(other.getProductName())) return false;
      }
      if (!getAddressList()
          .equals(other.getAddressList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSubReqID()) {
        hash = (37 * hash) + SUBREQID_FIELD_NUMBER;
        hash = (53 * hash) + getSubReqID();
      }
      if (hasUserName()) {
        hash = (37 * hash) + USERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getUserName().hashCode();
      }
      if (hasProductName()) {
        hash = (37 * hash) + PRODUCTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getProductName().hashCode();
      }
      if (getAddressCount() > 0) {
        hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getAddressList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SubscribeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SubscribeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SubscribeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SubscribeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SubscribeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SubscribeReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SubscribeReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.SubscribeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:netty.SubscribeReq)
        SubscribeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SubscribeReq.class, Builder.class);
      }

      // Construct using io.github.zouhuanli.ch8.SubscribeReqProto.SubscribeReq.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        subReqID_ = 0;
        userName_ = "";
        productName_ = "";
        address_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
      }

      @Override
      public SubscribeReq getDefaultInstanceForType() {
        return SubscribeReq.getDefaultInstance();
      }

      @Override
      public SubscribeReq build() {
        SubscribeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SubscribeReq buildPartial() {
        SubscribeReq result = new SubscribeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SubscribeReq result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.subReqID_ = subReqID_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.userName_ = userName_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.productName_ = productName_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          address_.makeImmutable();
          result.address_ = address_;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SubscribeReq) {
          return mergeFrom((SubscribeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SubscribeReq other) {
        if (other == SubscribeReq.getDefaultInstance()) return this;
        if (other.hasSubReqID()) {
          setSubReqID(other.getSubReqID());
        }
        if (other.hasUserName()) {
          userName_ = other.userName_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasProductName()) {
          productName_ = other.productName_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.address_.isEmpty()) {
          if (address_.isEmpty()) {
            address_ = other.address_;
            bitField0_ |= 0x00000008;
          } else {
            ensureAddressIsMutable();
            address_.addAll(other.address_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasSubReqID()) {
          return false;
        }
        if (!hasUserName()) {
          return false;
        }
        if (!hasProductName()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                subReqID_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                userName_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                productName_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                com.google.protobuf.ByteString bs = input.readBytes();
                ensureAddressIsMutable();
                address_.add(bs);
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int subReqID_ ;
      /**
       * <code>required int32 subReqID = 1;</code>
       * @return Whether the subReqID field is set.
       */
      @Override
      public boolean hasSubReqID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       * @return The subReqID.
       */
      @Override
      public int getSubReqID() {
        return subReqID_;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       * @param value The subReqID to set.
       * @return This builder for chaining.
       */
      public Builder setSubReqID(int value) {

        subReqID_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubReqID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subReqID_ = 0;
        onChanged();
        return this;
      }

      private Object userName_ = "";
      /**
       * <code>required string userName = 2;</code>
       * @return Whether the userName field is set.
       */
      public boolean hasUserName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string userName = 2;</code>
       * @return The userName.
       */
      public String getUserName() {
        Object ref = userName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            userName_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string userName = 2;</code>
       * @return The bytes for userName.
       */
      public com.google.protobuf.ByteString
          getUserNameBytes() {
        Object ref = userName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          userName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string userName = 2;</code>
       * @param value The userName to set.
       * @return This builder for chaining.
       */
      public Builder setUserName(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        userName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required string userName = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserName() {
        userName_ = getDefaultInstance().getUserName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>required string userName = 2;</code>
       * @param value The bytes for userName to set.
       * @return This builder for chaining.
       */
      public Builder setUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        userName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private Object productName_ = "";
      /**
       * <code>required string productName = 3;</code>
       * @return Whether the productName field is set.
       */
      public boolean hasProductName() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string productName = 3;</code>
       * @return The productName.
       */
      public String getProductName() {
        Object ref = productName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            productName_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string productName = 3;</code>
       * @return The bytes for productName.
       */
      public com.google.protobuf.ByteString
          getProductNameBytes() {
        Object ref = productName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          productName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string productName = 3;</code>
       * @param value The productName to set.
       * @return This builder for chaining.
       */
      public Builder setProductName(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        productName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>required string productName = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductName() {
        productName_ = getDefaultInstance().getProductName();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>required string productName = 3;</code>
       * @param value The bytes for productName to set.
       * @return This builder for chaining.
       */
      public Builder setProductNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        productName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList address_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureAddressIsMutable() {
        if (!address_.isModifiable()) {
          address_ = new com.google.protobuf.LazyStringArrayList(address_);
        }
        bitField0_ |= 0x00000008;
      }
      /**
       * <code>repeated string address = 4;</code>
       * @return A list containing the address.
       */
      public com.google.protobuf.ProtocolStringList
          getAddressList() {
        address_.makeImmutable();
        return address_;
      }
      /**
       * <code>repeated string address = 4;</code>
       * @return The count of address.
       */
      public int getAddressCount() {
        return address_.size();
      }
      /**
       * <code>repeated string address = 4;</code>
       * @param index The index of the element to return.
       * @return The address at the given index.
       */
      public String getAddress(int index) {
        return address_.get(index);
      }
      /**
       * <code>repeated string address = 4;</code>
       * @param index The index of the value to return.
       * @return The bytes of the address at the given index.
       */
      public com.google.protobuf.ByteString
          getAddressBytes(int index) {
        return address_.getByteString(index);
      }
      /**
       * <code>repeated string address = 4;</code>
       * @param index The index to set the value at.
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          int index, String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAddressIsMutable();
        address_.set(index, value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       * @param value The address to add.
       * @return This builder for chaining.
       */
      public Builder addAddress(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAddressIsMutable();
        address_.add(value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       * @param values The address to add.
       * @return This builder for chaining.
       */
      public Builder addAllAddress(
          Iterable<String> values) {
        ensureAddressIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, address_);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        address_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       * @param value The bytes of the address to add.
       * @return This builder for chaining.
       */
      public Builder addAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAddressIsMutable();
        address_.add(value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:netty.SubscribeReq)
    }

    // @@protoc_insertion_point(class_scope:netty.SubscribeReq)
    private static final SubscribeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SubscribeReq();
    }

    public static SubscribeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscribeReq>
        PARSER = new com.google.protobuf.AbstractParser<SubscribeReq>() {
      @Override
      public SubscribeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SubscribeReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SubscribeReq> getParserForType() {
      return PARSER;
    }

    @Override
    public SubscribeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_SubscribeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_netty_SubscribeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022SubscribeReq.proto\022\005netty\"X\n\014Subscribe" +
      "Req\022\020\n\010subReqID\030\001 \002(\005\022\020\n\010userName\030\002 \002(\t\022" +
      "\023\n\013productName\030\003 \002(\t\022\017\n\007address\030\004 \003(\tB,\n" +
      "\027io.github.zouhuanli.ch8B\021SubscribeReqPr" +
      "oto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_netty_SubscribeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_netty_SubscribeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_netty_SubscribeReq_descriptor,
        new String[] { "SubReqID", "UserName", "ProductName", "Address", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
