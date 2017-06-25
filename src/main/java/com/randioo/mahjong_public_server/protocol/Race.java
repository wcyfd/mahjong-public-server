// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Race.proto

package com.randioo.mahjong_public_server.protocol;

public final class Race {
  private Race() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class RaceJoinRaceRequest extends
      com.google.protobuf.GeneratedMessage {
    // Use RaceJoinRaceRequest.newBuilder() to construct.
    private RaceJoinRaceRequest() {
      initFields();
    }
    private RaceJoinRaceRequest(boolean noInit) {}
    
    private static final RaceJoinRaceRequest defaultInstance;
    public static RaceJoinRaceRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public RaceJoinRaceRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.randioo.mahjong_public_server.protocol.Race.internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.randioo.mahjong_public_server.protocol.Race.internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_fieldAccessorTable;
    }
    
    // optional int32 raceId = 1;
    public static final int RACEID_FIELD_NUMBER = 1;
    private boolean hasRaceId;
    private int raceId_ = 0;
    public boolean hasRaceId() { return hasRaceId; }
    public int getRaceId() { return raceId_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRaceId()) {
        output.writeInt32(1, getRaceId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRaceId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getRaceId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest result;
      
      // Construct using com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest();
        return builder;
      }
      
      protected com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest.getDescriptor();
      }
      
      public com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest getDefaultInstanceForType() {
        return com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest) {
          return mergeFrom((com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest other) {
        if (other == com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest.getDefaultInstance()) return this;
        if (other.hasRaceId()) {
          setRaceId(other.getRaceId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setRaceId(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional int32 raceId = 1;
      public boolean hasRaceId() {
        return result.hasRaceId();
      }
      public int getRaceId() {
        return result.getRaceId();
      }
      public Builder setRaceId(int value) {
        result.hasRaceId = true;
        result.raceId_ = value;
        return this;
      }
      public Builder clearRaceId() {
        result.hasRaceId = false;
        result.raceId_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.randioo.mahjong_public_server.protocol.RaceJoinRaceRequest)
    }
    
    static {
      defaultInstance = new RaceJoinRaceRequest(true);
      com.randioo.mahjong_public_server.protocol.Race.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.randioo.mahjong_public_server.protocol.RaceJoinRaceRequest)
  }
  
  public static final class RaceJoinRaceResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use RaceJoinRaceResponse.newBuilder() to construct.
    private RaceJoinRaceResponse() {
      initFields();
    }
    private RaceJoinRaceResponse(boolean noInit) {}
    
    private static final RaceJoinRaceResponse defaultInstance;
    public static RaceJoinRaceResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public RaceJoinRaceResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.randioo.mahjong_public_server.protocol.Race.internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.randioo.mahjong_public_server.protocol.Race.internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_fieldAccessorTable;
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse result;
      
      // Construct using com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse();
        return builder;
      }
      
      protected com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse.getDescriptor();
      }
      
      public com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse getDefaultInstanceForType() {
        return com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse) {
          return mergeFrom((com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse other) {
        if (other == com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:com.randioo.mahjong_public_server.protocol.RaceJoinRaceResponse)
    }
    
    static {
      defaultInstance = new RaceJoinRaceResponse(true);
      com.randioo.mahjong_public_server.protocol.Race.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.randioo.mahjong_public_server.protocol.RaceJoinRaceResponse)
  }
  
  public static final class SCRaceJoinRace extends
      com.google.protobuf.GeneratedMessage {
    // Use SCRaceJoinRace.newBuilder() to construct.
    private SCRaceJoinRace() {
      initFields();
    }
    private SCRaceJoinRace(boolean noInit) {}
    
    private static final SCRaceJoinRace defaultInstance;
    public static SCRaceJoinRace getDefaultInstance() {
      return defaultInstance;
    }
    
    public SCRaceJoinRace getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.randioo.mahjong_public_server.protocol.Race.internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.randioo.mahjong_public_server.protocol.Race.internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_fieldAccessorTable;
    }
    
    // optional int32 errorCode = 1 [default = 1];
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private boolean hasErrorCode;
    private int errorCode_ = 1;
    public boolean hasErrorCode() { return hasErrorCode; }
    public int getErrorCode() { return errorCode_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasErrorCode()) {
        output.writeInt32(1, getErrorCode());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasErrorCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getErrorCode());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace result;
      
      // Construct using com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace();
        return builder;
      }
      
      protected com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace.getDescriptor();
      }
      
      public com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace getDefaultInstanceForType() {
        return com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace) {
          return mergeFrom((com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace other) {
        if (other == com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace.getDefaultInstance()) return this;
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setErrorCode(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional int32 errorCode = 1 [default = 1];
      public boolean hasErrorCode() {
        return result.hasErrorCode();
      }
      public int getErrorCode() {
        return result.getErrorCode();
      }
      public Builder setErrorCode(int value) {
        result.hasErrorCode = true;
        result.errorCode_ = value;
        return this;
      }
      public Builder clearErrorCode() {
        result.hasErrorCode = false;
        result.errorCode_ = 1;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.randioo.mahjong_public_server.protocol.SCRaceJoinRace)
    }
    
    static {
      defaultInstance = new SCRaceJoinRace(true);
      com.randioo.mahjong_public_server.protocol.Race.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.randioo.mahjong_public_server.protocol.SCRaceJoinRace)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nRace.proto\022*com.randioo.mahjong_public" +
      "_server.protocol\"%\n\023RaceJoinRaceRequest\022" +
      "\016\n\006raceId\030\001 \001(\005\"\026\n\024RaceJoinRaceResponse\"" +
      "&\n\016SCRaceJoinRace\022\024\n\terrorCode\030\001 \001(\005:\0011"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceRequest_descriptor,
              new java.lang.String[] { "RaceId", },
              com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest.class,
              com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceRequest.Builder.class);
          internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_randioo_mahjong_public_server_protocol_RaceJoinRaceResponse_descriptor,
              new java.lang.String[] { },
              com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse.class,
              com.randioo.mahjong_public_server.protocol.Race.RaceJoinRaceResponse.Builder.class);
          internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_randioo_mahjong_public_server_protocol_SCRaceJoinRace_descriptor,
              new java.lang.String[] { "ErrorCode", },
              com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace.class,
              com.randioo.mahjong_public_server.protocol.Race.SCRaceJoinRace.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}