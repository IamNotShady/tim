// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notify.proto

package cn.timmy.common.protos;

public final class Notify {
  private Notify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NotifyMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cn.timmy.common.protos.NotifyMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 发送方uid
     * </pre>
     *
     * <code>string fromuid = 1;</code>
     */
    java.lang.String getFromuid();
    /**
     * <pre>
     * 发送方uid
     * </pre>
     *
     * <code>string fromuid = 1;</code>
     */
    com.google.protobuf.ByteString
        getFromuidBytes();

    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>uint32 protonum = 2;</code>
     */
    int getProtonum();

    /**
     * <pre>
     * 通知类型
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    java.lang.String getType();
    /**
     * <pre>
     * 通知类型
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <pre>
     * 通知内容
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    java.lang.String getContent();
    /**
     * <pre>
     * 通知内容
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <pre>
     *消息时间
     * </pre>
     *
     * <code>uint64 sendtime = 5;</code>
     */
    long getSendtime();

    /**
     * <pre>
     *消息唯一标示
     * </pre>
     *
     * <code>string msgid = 6;</code>
     */
    java.lang.String getMsgid();
    /**
     * <pre>
     *消息唯一标示
     * </pre>
     *
     * <code>string msgid = 6;</code>
     */
    com.google.protobuf.ByteString
        getMsgidBytes();
  }
  /**
   * <pre>
   *通知消息
   * </pre>
   *
   * Protobuf type {@code cn.timmy.common.protos.NotifyMessage}
   */
  public  static final class NotifyMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cn.timmy.common.protos.NotifyMessage)
      NotifyMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NotifyMessage.newBuilder() to construct.
    private NotifyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NotifyMessage() {
      fromuid_ = "";
      protonum_ = 0;
      type_ = "";
      content_ = "";
      sendtime_ = 0L;
      msgid_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NotifyMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
              java.lang.String s = input.readStringRequireUtf8();

              fromuid_ = s;
              break;
            }
            case 16: {

              protonum_ = input.readUInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 40: {

              sendtime_ = input.readUInt64();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              msgid_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.timmy.common.protos.Notify.internal_static_cn_timmy_common_protos_NotifyMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.timmy.common.protos.Notify.internal_static_cn_timmy_common_protos_NotifyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.timmy.common.protos.Notify.NotifyMessage.class, cn.timmy.common.protos.Notify.NotifyMessage.Builder.class);
    }

    public static final int FROMUID_FIELD_NUMBER = 1;
    private volatile java.lang.Object fromuid_;
    /**
     * <pre>
     * 发送方uid
     * </pre>
     *
     * <code>string fromuid = 1;</code>
     */
    public java.lang.String getFromuid() {
      java.lang.Object ref = fromuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromuid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 发送方uid
     * </pre>
     *
     * <code>string fromuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromuidBytes() {
      java.lang.Object ref = fromuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROTONUM_FIELD_NUMBER = 2;
    private int protonum_;
    /**
     * <pre>
     *消息类型
     * </pre>
     *
     * <code>uint32 protonum = 2;</code>
     */
    public int getProtonum() {
      return protonum_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private volatile java.lang.Object type_;
    /**
     * <pre>
     * 通知类型
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 通知类型
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 4;
    private volatile java.lang.Object content_;
    /**
     * <pre>
     * 通知内容
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 通知内容
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDTIME_FIELD_NUMBER = 5;
    private long sendtime_;
    /**
     * <pre>
     *消息时间
     * </pre>
     *
     * <code>uint64 sendtime = 5;</code>
     */
    public long getSendtime() {
      return sendtime_;
    }

    public static final int MSGID_FIELD_NUMBER = 6;
    private volatile java.lang.Object msgid_;
    /**
     * <pre>
     *消息唯一标示
     * </pre>
     *
     * <code>string msgid = 6;</code>
     */
    public java.lang.String getMsgid() {
      java.lang.Object ref = msgid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *消息唯一标示
     * </pre>
     *
     * <code>string msgid = 6;</code>
     */
    public com.google.protobuf.ByteString
        getMsgidBytes() {
      java.lang.Object ref = msgid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getFromuidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromuid_);
      }
      if (protonum_ != 0) {
        output.writeUInt32(2, protonum_);
      }
      if (!getTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
      }
      if (sendtime_ != 0L) {
        output.writeUInt64(5, sendtime_);
      }
      if (!getMsgidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, msgid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFromuidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromuid_);
      }
      if (protonum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, protonum_);
      }
      if (!getTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
      }
      if (sendtime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, sendtime_);
      }
      if (!getMsgidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, msgid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cn.timmy.common.protos.Notify.NotifyMessage)) {
        return super.equals(obj);
      }
      cn.timmy.common.protos.Notify.NotifyMessage other = (cn.timmy.common.protos.Notify.NotifyMessage) obj;

      boolean result = true;
      result = result && getFromuid()
          .equals(other.getFromuid());
      result = result && (getProtonum()
          == other.getProtonum());
      result = result && getType()
          .equals(other.getType());
      result = result && getContent()
          .equals(other.getContent());
      result = result && (getSendtime()
          == other.getSendtime());
      result = result && getMsgid()
          .equals(other.getMsgid());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FROMUID_FIELD_NUMBER;
      hash = (53 * hash) + getFromuid().hashCode();
      hash = (37 * hash) + PROTONUM_FIELD_NUMBER;
      hash = (53 * hash) + getProtonum();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + SENDTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSendtime());
      hash = (37 * hash) + MSGID_FIELD_NUMBER;
      hash = (53 * hash) + getMsgid().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.timmy.common.protos.Notify.NotifyMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cn.timmy.common.protos.Notify.NotifyMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *通知消息
     * </pre>
     *
     * Protobuf type {@code cn.timmy.common.protos.NotifyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cn.timmy.common.protos.NotifyMessage)
        cn.timmy.common.protos.Notify.NotifyMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.timmy.common.protos.Notify.internal_static_cn_timmy_common_protos_NotifyMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.timmy.common.protos.Notify.internal_static_cn_timmy_common_protos_NotifyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.timmy.common.protos.Notify.NotifyMessage.class, cn.timmy.common.protos.Notify.NotifyMessage.Builder.class);
      }

      // Construct using cn.timmy.common.protos.Notify.NotifyMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fromuid_ = "";

        protonum_ = 0;

        type_ = "";

        content_ = "";

        sendtime_ = 0L;

        msgid_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.timmy.common.protos.Notify.internal_static_cn_timmy_common_protos_NotifyMessage_descriptor;
      }

      @java.lang.Override
      public cn.timmy.common.protos.Notify.NotifyMessage getDefaultInstanceForType() {
        return cn.timmy.common.protos.Notify.NotifyMessage.getDefaultInstance();
      }

      @java.lang.Override
      public cn.timmy.common.protos.Notify.NotifyMessage build() {
        cn.timmy.common.protos.Notify.NotifyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cn.timmy.common.protos.Notify.NotifyMessage buildPartial() {
        cn.timmy.common.protos.Notify.NotifyMessage result = new cn.timmy.common.protos.Notify.NotifyMessage(this);
        result.fromuid_ = fromuid_;
        result.protonum_ = protonum_;
        result.type_ = type_;
        result.content_ = content_;
        result.sendtime_ = sendtime_;
        result.msgid_ = msgid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.timmy.common.protos.Notify.NotifyMessage) {
          return mergeFrom((cn.timmy.common.protos.Notify.NotifyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.timmy.common.protos.Notify.NotifyMessage other) {
        if (other == cn.timmy.common.protos.Notify.NotifyMessage.getDefaultInstance()) return this;
        if (!other.getFromuid().isEmpty()) {
          fromuid_ = other.fromuid_;
          onChanged();
        }
        if (other.getProtonum() != 0) {
          setProtonum(other.getProtonum());
        }
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.getSendtime() != 0L) {
          setSendtime(other.getSendtime());
        }
        if (!other.getMsgid().isEmpty()) {
          msgid_ = other.msgid_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.timmy.common.protos.Notify.NotifyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.timmy.common.protos.Notify.NotifyMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object fromuid_ = "";
      /**
       * <pre>
       * 发送方uid
       * </pre>
       *
       * <code>string fromuid = 1;</code>
       */
      public java.lang.String getFromuid() {
        java.lang.Object ref = fromuid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fromuid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 发送方uid
       * </pre>
       *
       * <code>string fromuid = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFromuidBytes() {
        java.lang.Object ref = fromuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fromuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 发送方uid
       * </pre>
       *
       * <code>string fromuid = 1;</code>
       */
      public Builder setFromuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fromuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 发送方uid
       * </pre>
       *
       * <code>string fromuid = 1;</code>
       */
      public Builder clearFromuid() {
        
        fromuid_ = getDefaultInstance().getFromuid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 发送方uid
       * </pre>
       *
       * <code>string fromuid = 1;</code>
       */
      public Builder setFromuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fromuid_ = value;
        onChanged();
        return this;
      }

      private int protonum_ ;
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>uint32 protonum = 2;</code>
       */
      public int getProtonum() {
        return protonum_;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>uint32 protonum = 2;</code>
       */
      public Builder setProtonum(int value) {
        
        protonum_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息类型
       * </pre>
       *
       * <code>uint32 protonum = 2;</code>
       */
      public Builder clearProtonum() {
        
        protonum_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <pre>
       * 通知类型
       * </pre>
       *
       * <code>string type = 3;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 通知类型
       * </pre>
       *
       * <code>string type = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 通知类型
       * </pre>
       *
       * <code>string type = 3;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 通知类型
       * </pre>
       *
       * <code>string type = 3;</code>
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 通知类型
       * </pre>
       *
       * <code>string type = 3;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <pre>
       * 通知内容
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 通知内容
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 通知内容
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 通知内容
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 通知内容
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private long sendtime_ ;
      /**
       * <pre>
       *消息时间
       * </pre>
       *
       * <code>uint64 sendtime = 5;</code>
       */
      public long getSendtime() {
        return sendtime_;
      }
      /**
       * <pre>
       *消息时间
       * </pre>
       *
       * <code>uint64 sendtime = 5;</code>
       */
      public Builder setSendtime(long value) {
        
        sendtime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息时间
       * </pre>
       *
       * <code>uint64 sendtime = 5;</code>
       */
      public Builder clearSendtime() {
        
        sendtime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object msgid_ = "";
      /**
       * <pre>
       *消息唯一标示
       * </pre>
       *
       * <code>string msgid = 6;</code>
       */
      public java.lang.String getMsgid() {
        java.lang.Object ref = msgid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msgid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *消息唯一标示
       * </pre>
       *
       * <code>string msgid = 6;</code>
       */
      public com.google.protobuf.ByteString
          getMsgidBytes() {
        java.lang.Object ref = msgid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msgid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *消息唯一标示
       * </pre>
       *
       * <code>string msgid = 6;</code>
       */
      public Builder setMsgid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msgid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息唯一标示
       * </pre>
       *
       * <code>string msgid = 6;</code>
       */
      public Builder clearMsgid() {
        
        msgid_ = getDefaultInstance().getMsgid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息唯一标示
       * </pre>
       *
       * <code>string msgid = 6;</code>
       */
      public Builder setMsgidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msgid_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:cn.timmy.common.protos.NotifyMessage)
    }

    // @@protoc_insertion_point(class_scope:cn.timmy.common.protos.NotifyMessage)
    private static final cn.timmy.common.protos.Notify.NotifyMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cn.timmy.common.protos.Notify.NotifyMessage();
    }

    public static cn.timmy.common.protos.Notify.NotifyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NotifyMessage>
        PARSER = new com.google.protobuf.AbstractParser<NotifyMessage>() {
      @java.lang.Override
      public NotifyMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NotifyMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NotifyMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NotifyMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cn.timmy.common.protos.Notify.NotifyMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_timmy_common_protos_NotifyMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_timmy_common_protos_NotifyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014notify.proto\022\026cn.timmy.common.protos\"r" +
      "\n\rNotifyMessage\022\017\n\007fromuid\030\001 \001(\t\022\020\n\010prot" +
      "onum\030\002 \001(\r\022\014\n\004type\030\003 \001(\t\022\017\n\007content\030\004 \001(" +
      "\t\022\020\n\010sendtime\030\005 \001(\004\022\r\n\005msgid\030\006 \001(\tB\010B\006No" +
      "tifyb\006proto3"
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
        }, assigner);
    internal_static_cn_timmy_common_protos_NotifyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cn_timmy_common_protos_NotifyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_timmy_common_protos_NotifyMessage_descriptor,
        new java.lang.String[] { "Fromuid", "Protonum", "Type", "Content", "Sendtime", "Msgid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
