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
 *
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: node/NodeElection.proto

package cn.aberic.bother.entity.proto.node;

public final class NodeElectionProto {
  private NodeElectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NodeElectionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NodeElection)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    java.util.List<NodeBaseProto.NodeBase>
        getNodeBasesList();
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    NodeBaseProto.NodeBase getNodeBases(int index);
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    int getNodeBasesCount();
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    java.util.List<? extends NodeBaseProto.NodeBaseOrBuilder>
        getNodeBasesOrBuilderList();
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    NodeBaseProto.NodeBaseOrBuilder getNodeBasesOrBuilder(
            int index);

    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    java.util.List<String>
        getAddressesList();
    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    int getAddressesCount();
    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    String getAddresses(int index);
    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    com.google.protobuf.ByteString
        getAddressesBytes(int index);
  }
  /**
   * <pre>
   * 当前节点竞选对象
   * </pre>
   *
   * Protobuf type {@code NodeElection}
   */
  public  static final class NodeElection extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NodeElection)
      NodeElectionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NodeElection.newBuilder() to construct.
    private NodeElection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NodeElection() {
      nodeBases_ = java.util.Collections.emptyList();
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NodeElection(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                nodeBases_ = new java.util.ArrayList<NodeBaseProto.NodeBase>();
                mutable_bitField0_ |= 0x00000001;
              }
              nodeBases_.add(
                  input.readMessage(NodeBaseProto.NodeBase.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          nodeBases_ = java.util.Collections.unmodifiableList(nodeBases_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          addresses_ = addresses_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NodeElectionProto.internal_static_NodeElection_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NodeElectionProto.internal_static_NodeElection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NodeElectionProto.NodeElection.class, NodeElectionProto.NodeElection.Builder.class);
    }

    public static final int NODEBASES_FIELD_NUMBER = 1;
    private java.util.List<NodeBaseProto.NodeBase> nodeBases_;
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    public java.util.List<NodeBaseProto.NodeBase> getNodeBasesList() {
      return nodeBases_;
    }
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    public java.util.List<? extends NodeBaseProto.NodeBaseOrBuilder>
        getNodeBasesOrBuilderList() {
      return nodeBases_;
    }
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    public int getNodeBasesCount() {
      return nodeBases_.size();
    }
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    public NodeBaseProto.NodeBase getNodeBases(int index) {
      return nodeBases_.get(index);
    }
    /**
     * <pre>
     * 当前选举节点基本信息集合 &lt;= 50
     * </pre>
     *
     * <code>repeated .NodeBase nodeBases = 1;</code>
     */
    public NodeBaseProto.NodeBaseOrBuilder getNodeBasesOrBuilder(
        int index) {
      return nodeBases_.get(index);
    }

    public static final int ADDRESSES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList addresses_;
    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
     * </pre>
     *
     * <code>repeated string addresses = 2;</code>
     */
    public String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <pre>
     * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
      for (int i = 0; i < nodeBases_.size(); i++) {
        output.writeMessage(1, nodeBases_.get(i));
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
      for (int i = 0; i < nodeBases_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, nodeBases_.get(i));
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
      if (!(obj instanceof NodeElectionProto.NodeElection)) {
        return super.equals(obj);
      }
      NodeElectionProto.NodeElection other = (NodeElectionProto.NodeElection) obj;

      boolean result = true;
      result = result && getNodeBasesList()
          .equals(other.getNodeBasesList());
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
      if (getNodeBasesCount() > 0) {
        hash = (37 * hash) + NODEBASES_FIELD_NUMBER;
        hash = (53 * hash) + getNodeBasesList().hashCode();
      }
      if (getAddressesCount() > 0) {
        hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
        hash = (53 * hash) + getAddressesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NodeElectionProto.NodeElection parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NodeElectionProto.NodeElection parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NodeElectionProto.NodeElection parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NodeElectionProto.NodeElection parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NodeElectionProto.NodeElection parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NodeElectionProto.NodeElection parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NodeElectionProto.NodeElection parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NodeElectionProto.NodeElection parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NodeElectionProto.NodeElection parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NodeElectionProto.NodeElection parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NodeElectionProto.NodeElection parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NodeElectionProto.NodeElection parseFrom(
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
    public static Builder newBuilder(NodeElectionProto.NodeElection prototype) {
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
     * 当前节点竞选对象
     * </pre>
     *
     * Protobuf type {@code NodeElection}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NodeElection)
        NodeElectionProto.NodeElectionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NodeElectionProto.internal_static_NodeElection_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NodeElectionProto.internal_static_NodeElection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NodeElectionProto.NodeElection.class, NodeElectionProto.NodeElection.Builder.class);
      }

      // Construct using cn.aberic.bother.entity.proto.node.NodeElectionProto.NodeElection.newBuilder()
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
          getNodeBasesFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (nodeBasesBuilder_ == null) {
          nodeBases_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          nodeBasesBuilder_.clear();
        }
        addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NodeElectionProto.internal_static_NodeElection_descriptor;
      }

      @Override
      public NodeElectionProto.NodeElection getDefaultInstanceForType() {
        return NodeElectionProto.NodeElection.getDefaultInstance();
      }

      @Override
      public NodeElectionProto.NodeElection build() {
        NodeElectionProto.NodeElection result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public NodeElectionProto.NodeElection buildPartial() {
        NodeElectionProto.NodeElection result = new NodeElectionProto.NodeElection(this);
        int from_bitField0_ = bitField0_;
        if (nodeBasesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            nodeBases_ = java.util.Collections.unmodifiableList(nodeBases_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nodeBases_ = nodeBases_;
        } else {
          result.nodeBases_ = nodeBasesBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          addresses_ = addresses_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.addresses_ = addresses_;
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
        if (other instanceof NodeElectionProto.NodeElection) {
          return mergeFrom((NodeElectionProto.NodeElection)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NodeElectionProto.NodeElection other) {
        if (other == NodeElectionProto.NodeElection.getDefaultInstance()) return this;
        if (nodeBasesBuilder_ == null) {
          if (!other.nodeBases_.isEmpty()) {
            if (nodeBases_.isEmpty()) {
              nodeBases_ = other.nodeBases_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNodeBasesIsMutable();
              nodeBases_.addAll(other.nodeBases_);
            }
            onChanged();
          }
        } else {
          if (!other.nodeBases_.isEmpty()) {
            if (nodeBasesBuilder_.isEmpty()) {
              nodeBasesBuilder_.dispose();
              nodeBasesBuilder_ = null;
              nodeBases_ = other.nodeBases_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nodeBasesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNodeBasesFieldBuilder() : null;
            } else {
              nodeBasesBuilder_.addAllMessages(other.nodeBases_);
            }
          }
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
        NodeElectionProto.NodeElection parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NodeElectionProto.NodeElection) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<NodeBaseProto.NodeBase> nodeBases_ =
        java.util.Collections.emptyList();
      private void ensureNodeBasesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          nodeBases_ = new java.util.ArrayList<NodeBaseProto.NodeBase>(nodeBases_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          NodeBaseProto.NodeBase, NodeBaseProto.NodeBase.Builder, NodeBaseProto.NodeBaseOrBuilder> nodeBasesBuilder_;

      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public java.util.List<NodeBaseProto.NodeBase> getNodeBasesList() {
        if (nodeBasesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodeBases_);
        } else {
          return nodeBasesBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public int getNodeBasesCount() {
        if (nodeBasesBuilder_ == null) {
          return nodeBases_.size();
        } else {
          return nodeBasesBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public NodeBaseProto.NodeBase getNodeBases(int index) {
        if (nodeBasesBuilder_ == null) {
          return nodeBases_.get(index);
        } else {
          return nodeBasesBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder setNodeBases(
          int index, NodeBaseProto.NodeBase value) {
        if (nodeBasesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeBasesIsMutable();
          nodeBases_.set(index, value);
          onChanged();
        } else {
          nodeBasesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder setNodeBases(
          int index, NodeBaseProto.NodeBase.Builder builderForValue) {
        if (nodeBasesBuilder_ == null) {
          ensureNodeBasesIsMutable();
          nodeBases_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodeBasesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder addNodeBases(NodeBaseProto.NodeBase value) {
        if (nodeBasesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeBasesIsMutable();
          nodeBases_.add(value);
          onChanged();
        } else {
          nodeBasesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder addNodeBases(
          int index, NodeBaseProto.NodeBase value) {
        if (nodeBasesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeBasesIsMutable();
          nodeBases_.add(index, value);
          onChanged();
        } else {
          nodeBasesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder addNodeBases(
          NodeBaseProto.NodeBase.Builder builderForValue) {
        if (nodeBasesBuilder_ == null) {
          ensureNodeBasesIsMutable();
          nodeBases_.add(builderForValue.build());
          onChanged();
        } else {
          nodeBasesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder addNodeBases(
          int index, NodeBaseProto.NodeBase.Builder builderForValue) {
        if (nodeBasesBuilder_ == null) {
          ensureNodeBasesIsMutable();
          nodeBases_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodeBasesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder addAllNodeBases(
          Iterable<? extends NodeBaseProto.NodeBase> values) {
        if (nodeBasesBuilder_ == null) {
          ensureNodeBasesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nodeBases_);
          onChanged();
        } else {
          nodeBasesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder clearNodeBases() {
        if (nodeBasesBuilder_ == null) {
          nodeBases_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nodeBasesBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public Builder removeNodeBases(int index) {
        if (nodeBasesBuilder_ == null) {
          ensureNodeBasesIsMutable();
          nodeBases_.remove(index);
          onChanged();
        } else {
          nodeBasesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public NodeBaseProto.NodeBase.Builder getNodeBasesBuilder(
          int index) {
        return getNodeBasesFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public NodeBaseProto.NodeBaseOrBuilder getNodeBasesOrBuilder(
          int index) {
        if (nodeBasesBuilder_ == null) {
          return nodeBases_.get(index);  } else {
          return nodeBasesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public java.util.List<? extends NodeBaseProto.NodeBaseOrBuilder>
           getNodeBasesOrBuilderList() {
        if (nodeBasesBuilder_ != null) {
          return nodeBasesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodeBases_);
        }
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public NodeBaseProto.NodeBase.Builder addNodeBasesBuilder() {
        return getNodeBasesFieldBuilder().addBuilder(
            NodeBaseProto.NodeBase.getDefaultInstance());
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public NodeBaseProto.NodeBase.Builder addNodeBasesBuilder(
          int index) {
        return getNodeBasesFieldBuilder().addBuilder(
            index, NodeBaseProto.NodeBase.getDefaultInstance());
      }
      /**
       * <pre>
       * 当前选举节点基本信息集合 &lt;= 50
       * </pre>
       *
       * <code>repeated .NodeBase nodeBases = 1;</code>
       */
      public java.util.List<NodeBaseProto.NodeBase.Builder>
           getNodeBasesBuilderList() {
        return getNodeBasesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          NodeBaseProto.NodeBase, NodeBaseProto.NodeBase.Builder, NodeBaseProto.NodeBaseOrBuilder>
          getNodeBasesFieldBuilder() {
        if (nodeBasesBuilder_ == null) {
          nodeBasesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              NodeBaseProto.NodeBase, NodeBaseProto.NodeBase.Builder, NodeBaseProto.NodeBaseOrBuilder>(
                  nodeBases_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          nodeBases_ = null;
        }
        return nodeBasesBuilder_;
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public int getAddressesCount() {
        return addresses_.size();
      }
      /**
       * <pre>
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
       * </pre>
       *
       * <code>repeated string addresses = 2;</code>
       */
      public String getAddresses(int index) {
        return addresses_.get(index);
      }
      /**
       * <pre>
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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
       * 从其它竞选节点获取其两个子节点的而组成的备用节点集合 &lt;= 100
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


      // @@protoc_insertion_point(builder_scope:NodeElection)
    }

    // @@protoc_insertion_point(class_scope:NodeElection)
    private static final NodeElectionProto.NodeElection DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NodeElectionProto.NodeElection();
    }

    public static NodeElectionProto.NodeElection getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NodeElection>
        PARSER = new com.google.protobuf.AbstractParser<NodeElection>() {
      @Override
      public NodeElection parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NodeElection(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NodeElection> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<NodeElection> getParserForType() {
      return PARSER;
    }

    @Override
    public NodeElectionProto.NodeElection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NodeElection_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NodeElection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027node/NodeElection.proto\032\023node/NodeBase" +
      ".proto\"?\n\014NodeElection\022\034\n\tnodeBases\030\001 \003(" +
      "\0132\t.NodeBase\022\021\n\taddresses\030\002 \003(\tB7\n\"cn.ab" +
      "eric.bother.entity.proto.nodeB\021NodeElect" +
      "ionProtob\006proto3"
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
          NodeBaseProto.getDescriptor(),
        }, assigner);
    internal_static_NodeElection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NodeElection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NodeElection_descriptor,
        new String[] { "NodeBases", "Addresses", });
    NodeBaseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}