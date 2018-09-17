/*
 * MIT License
 *
 * Copyright (c) 2018 Aberic Yang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus/VoteResult.proto

package cn.aberic.bother.entity.proto.consensus;

public final class VoteResultProto {
  private VoteResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VoteResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VoteResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 加入节点所在级别
     * </pre>
     *
     * <code>.JoinLevel level = 1;</code>
     */
    int getLevelValue();
    /**
     * <pre>
     * 加入节点所在级别
     * </pre>
     *
     * <code>.JoinLevel level = 1;</code>
     */
    cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel getLevel();

    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    java.util.List<String>
        getAddressesList();
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    int getAddressesCount();
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    String getAddresses(int index);
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    com.google.protobuf.ByteString
        getAddressesBytes(int index);
  }
  /**
   * <pre>
   * 加入节点对象
   * </pre>
   *
   * Protobuf type {@code VoteResult}
   */
  public  static final class VoteResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VoteResult)
      VoteResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VoteResult.newBuilder() to construct.
    private VoteResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VoteResult() {
      level_ = 0;
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VoteResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              level_ = rawValue;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                addresses_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              addresses_.add(s);
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          addresses_ = addresses_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VoteResultProto.internal_static_VoteResult_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VoteResultProto.internal_static_VoteResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VoteResultProto.VoteResult.class, VoteResultProto.VoteResult.Builder.class);
    }

    private int bitField0_;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private int level_;
    /**
     * <pre>
     * 加入节点所在级别
     * </pre>
     *
     * <code>.JoinLevel level = 1;</code>
     */
    public int getLevelValue() {
      return level_;
    }
    /**
     * <pre>
     * 加入节点所在级别
     * </pre>
     *
     * <code>.JoinLevel level = 1;</code>
     */
    public cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel getLevel() {
      @SuppressWarnings("deprecation")
      cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel result = cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel.valueOf(level_);
      return result == null ? cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel.UNRECOGNIZED : result;
    }

    public static final int ADDRESSES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList addresses_;
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      return addresses_;
    }
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    public String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <pre>
     * 节点地址
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (level_ != cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel.LONEY.getNumber()) {
        output.writeEnum(1, level_);
      }
      for (int i = 0; i < addresses_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, addresses_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel.LONEY.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, level_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < addresses_.size(); i++) {
          dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAddressesList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof VoteResultProto.VoteResult)) {
        return super.equals(obj);
      }
      VoteResultProto.VoteResult other = (VoteResultProto.VoteResult) obj;

      boolean result = true;
      result = result && level_ == other.level_;
      result = result && getAddressesList()
          .equals(other.getAddressesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + level_;
      if (getAddressesCount() > 0) {
        hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
        hash = (53 * hash) + getAddressesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static VoteResultProto.VoteResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VoteResultProto.VoteResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteResultProto.VoteResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VoteResultProto.VoteResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteResultProto.VoteResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VoteResultProto.VoteResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteResultProto.VoteResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static VoteResultProto.VoteResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static VoteResultProto.VoteResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static VoteResultProto.VoteResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static VoteResultProto.VoteResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static VoteResultProto.VoteResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(VoteResultProto.VoteResult prototype) {
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
     * <pre>
     * 加入节点对象
     * </pre>
     *
     * Protobuf type {@code VoteResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VoteResult)
        VoteResultProto.VoteResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return VoteResultProto.internal_static_VoteResult_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return VoteResultProto.internal_static_VoteResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                VoteResultProto.VoteResult.class, VoteResultProto.VoteResult.Builder.class);
      }

      // Construct using cn.aberic.bother.entity.proto.consensus.VoteResultProto.VoteResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        level_ = 0;

        addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return VoteResultProto.internal_static_VoteResult_descriptor;
      }

      @Override
      public VoteResultProto.VoteResult getDefaultInstanceForType() {
        return VoteResultProto.VoteResult.getDefaultInstance();
      }

      @Override
      public VoteResultProto.VoteResult build() {
        VoteResultProto.VoteResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public VoteResultProto.VoteResult buildPartial() {
        VoteResultProto.VoteResult result = new VoteResultProto.VoteResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.level_ = level_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          addresses_ = addresses_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.addresses_ = addresses_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof VoteResultProto.VoteResult) {
          return mergeFrom((VoteResultProto.VoteResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(VoteResultProto.VoteResult other) {
        if (other == VoteResultProto.VoteResult.getDefaultInstance()) return this;
        if (other.level_ != 0) {
          setLevelValue(other.getLevelValue());
        }
        if (!other.addresses_.isEmpty()) {
          if (addresses_.isEmpty()) {
            addresses_ = other.addresses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAddressesIsMutable();
            addresses_.addAll(other.addresses_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        VoteResultProto.VoteResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (VoteResultProto.VoteResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int level_ = 0;
      /**
       * <pre>
       * 加入节点所在级别
       * </pre>
       *
       * <code>.JoinLevel level = 1;</code>
       */
      public int getLevelValue() {
        return level_;
      }
      /**
       * <pre>
       * 加入节点所在级别
       * </pre>
       *
       * <code>.JoinLevel level = 1;</code>
       */
      public Builder setLevelValue(int value) {
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 加入节点所在级别
       * </pre>
       *
       * <code>.JoinLevel level = 1;</code>
       */
      public cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel getLevel() {
        @SuppressWarnings("deprecation")
        cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel result = cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel.valueOf(level_);
        return result == null ? cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * 加入节点所在级别
       * </pre>
       *
       * <code>.JoinLevel level = 1;</code>
       */
      public Builder setLevel(cn.aberic.bother.entity.proto.enums.JoinLevelProto.JoinLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }

        level_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 加入节点所在级别
       * </pre>
       *
       * <code>.JoinLevel level = 1;</code>
       */
      public Builder clearLevel() {

        level_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureAddressesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getAddressesList() {
        return addresses_.getUnmodifiableView();
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public int getAddressesCount() {
        return addresses_.size();
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public String getAddresses(int index) {
        return addresses_.get(index);
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAddressesBytes(int index) {
        return addresses_.getByteString(index);
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public Builder setAddresses(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
        addresses_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public Builder addAddresses(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
        addresses_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public Builder addAllAddresses(
          Iterable<String> values) {
        ensureAddressesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addresses_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public Builder clearAddresses() {
        addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 节点地址
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public Builder addAddressesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureAddressesIsMutable();
        addresses_.add(value);
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VoteResult)
    }

    // @@protoc_insertion_point(class_scope:VoteResult)
    private static final VoteResultProto.VoteResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new VoteResultProto.VoteResult();
    }

    public static VoteResultProto.VoteResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VoteResult>
        PARSER = new com.google.protobuf.AbstractParser<VoteResult>() {
      @Override
      public VoteResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VoteResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VoteResult> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<VoteResult> getParserForType() {
      return PARSER;
    }

    @Override
    public VoteResultProto.VoteResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VoteResult_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VoteResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\032consensus/VoteResult.proto\032\025enums/Join" +
      "Level.proto\":\n\nVoteResult\022\031\n\005level\030\001 \001(\016" +
      "2\n.JoinLevel\022\021\n\taddresses\030\002 \003(\tB:\n\'cn.ab" +
      "eric.bother.entity.proto.consensusB\017Vote" +
      "ResultProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.aberic.bother.entity.proto.enums.JoinLevelProto.getDescriptor(),
        }, assigner);
    internal_static_VoteResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VoteResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VoteResult_descriptor,
        new String[] { "Level", "Addresses", });
    cn.aberic.bother.entity.proto.enums.JoinLevelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}