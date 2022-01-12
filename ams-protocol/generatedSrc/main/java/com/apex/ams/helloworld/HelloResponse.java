// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.apex.ams.helloworld;

/**
 * <pre>
 *响应消息
 * </pre>
 *
 * Protobuf type {@code first.demo.HelloResponse}
 */
public  final class HelloResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:first.demo.HelloResponse)
    HelloResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloResponse.newBuilder() to construct.
  private HelloResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloResponse() {
    code_ = 0;
    note_ = "";
    count_ = 0;
    records_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloResponse(
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
          case 8: {

            code_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            note_ = s;
            break;
          }
          case 24: {

            count_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              records_ = new java.util.ArrayList<com.apex.ams.helloworld.Record>();
              mutable_bitField0_ |= 0x00000008;
            }
            records_.add(
                input.readMessage(com.apex.ams.helloworld.Record.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        records_ = java.util.Collections.unmodifiableList(records_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.apex.ams.helloworld.Helloworld.internal_static_first_demo_HelloResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.apex.ams.helloworld.Helloworld.internal_static_first_demo_HelloResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.apex.ams.helloworld.HelloResponse.class, com.apex.ams.helloworld.HelloResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>int32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int NOTE_FIELD_NUMBER = 2;
  private volatile java.lang.Object note_;
  /**
   * <code>string note = 2;</code>
   */
  public java.lang.String getNote() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      note_ = s;
      return s;
    }
  }
  /**
   * <code>string note = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNoteBytes() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      note_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private int count_;
  /**
   * <code>int32 count = 3;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int RECORDS_FIELD_NUMBER = 4;
  private java.util.List<com.apex.ams.helloworld.Record> records_;
  /**
   * <code>repeated .first.demo.Record records = 4;</code>
   */
  public java.util.List<com.apex.ams.helloworld.Record> getRecordsList() {
    return records_;
  }
  /**
   * <code>repeated .first.demo.Record records = 4;</code>
   */
  public java.util.List<? extends com.apex.ams.helloworld.RecordOrBuilder> 
      getRecordsOrBuilderList() {
    return records_;
  }
  /**
   * <code>repeated .first.demo.Record records = 4;</code>
   */
  public int getRecordsCount() {
    return records_.size();
  }
  /**
   * <code>repeated .first.demo.Record records = 4;</code>
   */
  public com.apex.ams.helloworld.Record getRecords(int index) {
    return records_.get(index);
  }
  /**
   * <code>repeated .first.demo.Record records = 4;</code>
   */
  public com.apex.ams.helloworld.RecordOrBuilder getRecordsOrBuilder(
      int index) {
    return records_.get(index);
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!getNoteBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, note_);
    }
    if (count_ != 0) {
      output.writeInt32(3, count_);
    }
    for (int i = 0; i < records_.size(); i++) {
      output.writeMessage(4, records_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!getNoteBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, note_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, count_);
    }
    for (int i = 0; i < records_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, records_.get(i));
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
    if (!(obj instanceof com.apex.ams.helloworld.HelloResponse)) {
      return super.equals(obj);
    }
    com.apex.ams.helloworld.HelloResponse other = (com.apex.ams.helloworld.HelloResponse) obj;

    boolean result = true;
    result = result && (getCode()
        == other.getCode());
    result = result && getNote()
        .equals(other.getNote());
    result = result && (getCount()
        == other.getCount());
    result = result && getRecordsList()
        .equals(other.getRecordsList());
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + NOTE_FIELD_NUMBER;
    hash = (53 * hash) + getNote().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (getRecordsCount() > 0) {
      hash = (37 * hash) + RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.apex.ams.helloworld.HelloResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.apex.ams.helloworld.HelloResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.apex.ams.helloworld.HelloResponse parseFrom(
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
  public static Builder newBuilder(com.apex.ams.helloworld.HelloResponse prototype) {
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
   *响应消息
   * </pre>
   *
   * Protobuf type {@code first.demo.HelloResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:first.demo.HelloResponse)
      com.apex.ams.helloworld.HelloResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.apex.ams.helloworld.Helloworld.internal_static_first_demo_HelloResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.apex.ams.helloworld.Helloworld.internal_static_first_demo_HelloResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.apex.ams.helloworld.HelloResponse.class, com.apex.ams.helloworld.HelloResponse.Builder.class);
    }

    // Construct using com.apex.ams.helloworld.HelloResponse.newBuilder()
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
        getRecordsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      note_ = "";

      count_ = 0;

      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.apex.ams.helloworld.Helloworld.internal_static_first_demo_HelloResponse_descriptor;
    }

    @java.lang.Override
    public com.apex.ams.helloworld.HelloResponse getDefaultInstanceForType() {
      return com.apex.ams.helloworld.HelloResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.apex.ams.helloworld.HelloResponse build() {
      com.apex.ams.helloworld.HelloResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.apex.ams.helloworld.HelloResponse buildPartial() {
      com.apex.ams.helloworld.HelloResponse result = new com.apex.ams.helloworld.HelloResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      result.note_ = note_;
      result.count_ = count_;
      if (recordsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          records_ = java.util.Collections.unmodifiableList(records_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.records_ = records_;
      } else {
        result.records_ = recordsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.apex.ams.helloworld.HelloResponse) {
        return mergeFrom((com.apex.ams.helloworld.HelloResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.apex.ams.helloworld.HelloResponse other) {
      if (other == com.apex.ams.helloworld.HelloResponse.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getNote().isEmpty()) {
        note_ = other.note_;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (recordsBuilder_ == null) {
        if (!other.records_.isEmpty()) {
          if (records_.isEmpty()) {
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureRecordsIsMutable();
            records_.addAll(other.records_);
          }
          onChanged();
        }
      } else {
        if (!other.records_.isEmpty()) {
          if (recordsBuilder_.isEmpty()) {
            recordsBuilder_.dispose();
            recordsBuilder_ = null;
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000008);
            recordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecordsFieldBuilder() : null;
          } else {
            recordsBuilder_.addAllMessages(other.records_);
          }
        }
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
      com.apex.ams.helloworld.HelloResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.apex.ams.helloworld.HelloResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int code_ ;
    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object note_ = "";
    /**
     * <code>string note = 2;</code>
     */
    public java.lang.String getNote() {
      java.lang.Object ref = note_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        note_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string note = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNoteBytes() {
      java.lang.Object ref = note_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        note_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string note = 2;</code>
     */
    public Builder setNote(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      note_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string note = 2;</code>
     */
    public Builder clearNote() {
      
      note_ = getDefaultInstance().getNote();
      onChanged();
      return this;
    }
    /**
     * <code>string note = 2;</code>
     */
    public Builder setNoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      note_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 3;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 3;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 3;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.apex.ams.helloworld.Record> records_ =
      java.util.Collections.emptyList();
    private void ensureRecordsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        records_ = new java.util.ArrayList<com.apex.ams.helloworld.Record>(records_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.apex.ams.helloworld.Record, com.apex.ams.helloworld.Record.Builder, com.apex.ams.helloworld.RecordOrBuilder> recordsBuilder_;

    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public java.util.List<com.apex.ams.helloworld.Record> getRecordsList() {
      if (recordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(records_);
      } else {
        return recordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public int getRecordsCount() {
      if (recordsBuilder_ == null) {
        return records_.size();
      } else {
        return recordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public com.apex.ams.helloworld.Record getRecords(int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);
      } else {
        return recordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder setRecords(
        int index, com.apex.ams.helloworld.Record value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.set(index, value);
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder setRecords(
        int index, com.apex.ams.helloworld.Record.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder addRecords(com.apex.ams.helloworld.Record value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder addRecords(
        int index, com.apex.ams.helloworld.Record value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(index, value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder addRecords(
        com.apex.ams.helloworld.Record.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder addRecords(
        int index, com.apex.ams.helloworld.Record.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder addAllRecords(
        java.lang.Iterable<? extends com.apex.ams.helloworld.Record> values) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, records_);
        onChanged();
      } else {
        recordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder clearRecords() {
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public Builder removeRecords(int index) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.remove(index);
        onChanged();
      } else {
        recordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public com.apex.ams.helloworld.Record.Builder getRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public com.apex.ams.helloworld.RecordOrBuilder getRecordsOrBuilder(
        int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);  } else {
        return recordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public java.util.List<? extends com.apex.ams.helloworld.RecordOrBuilder> 
         getRecordsOrBuilderList() {
      if (recordsBuilder_ != null) {
        return recordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(records_);
      }
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public com.apex.ams.helloworld.Record.Builder addRecordsBuilder() {
      return getRecordsFieldBuilder().addBuilder(
          com.apex.ams.helloworld.Record.getDefaultInstance());
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public com.apex.ams.helloworld.Record.Builder addRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().addBuilder(
          index, com.apex.ams.helloworld.Record.getDefaultInstance());
    }
    /**
     * <code>repeated .first.demo.Record records = 4;</code>
     */
    public java.util.List<com.apex.ams.helloworld.Record.Builder> 
         getRecordsBuilderList() {
      return getRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.apex.ams.helloworld.Record, com.apex.ams.helloworld.Record.Builder, com.apex.ams.helloworld.RecordOrBuilder> 
        getRecordsFieldBuilder() {
      if (recordsBuilder_ == null) {
        recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.apex.ams.helloworld.Record, com.apex.ams.helloworld.Record.Builder, com.apex.ams.helloworld.RecordOrBuilder>(
                records_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        records_ = null;
      }
      return recordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:first.demo.HelloResponse)
  }

  // @@protoc_insertion_point(class_scope:first.demo.HelloResponse)
  private static final com.apex.ams.helloworld.HelloResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.apex.ams.helloworld.HelloResponse();
  }

  public static com.apex.ams.helloworld.HelloResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloResponse>
      PARSER = new com.google.protobuf.AbstractParser<HelloResponse>() {
    @java.lang.Override
    public HelloResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.apex.ams.helloworld.HelloResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
