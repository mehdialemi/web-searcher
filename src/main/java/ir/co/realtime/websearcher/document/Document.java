// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: document.proto

package ir.co.realtime.websearcher.document;

public final class Document {
  private Document() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WebOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Web)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string url = 1;</code>
     * @return The url.
     */
    java.lang.String getUrl();
    /**
     * <code>string url = 1;</code>
     * @return The bytes for url.
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    /**
     * <code>bytes content = 2;</code>
     * @return The content.
     */
    com.google.protobuf.ByteString getContent();

    /**
     * <code>uint64 fetch_time = 3;</code>
     * @return The fetchTime.
     */
    long getFetchTime();
  }
  /**
   * Protobuf type {@code Web}
   */
  public  static final class Web extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Web)
      WebOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Web.newBuilder() to construct.
    private Web(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Web() {
      url_ = "";
      content_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Web();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Web(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              url_ = s;
              break;
            }
            case 18: {

              content_ = input.readBytes();
              break;
            }
            case 24: {

              fetchTime_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return ir.co.realtime.websearcher.document.Document.internal_static_Web_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ir.co.realtime.websearcher.document.Document.internal_static_Web_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ir.co.realtime.websearcher.document.Document.Web.class, ir.co.realtime.websearcher.document.Document.Web.Builder.class);
    }

    public static final int URL_FIELD_NUMBER = 1;
    private volatile java.lang.Object url_;
    /**
     * <code>string url = 1;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <code>string url = 1;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString content_;
    /**
     * <code>bytes content = 2;</code>
     * @return The content.
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    public static final int FETCH_TIME_FIELD_NUMBER = 3;
    private long fetchTime_;
    /**
     * <code>uint64 fetch_time = 3;</code>
     * @return The fetchTime.
     */
    public long getFetchTime() {
      return fetchTime_;
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
      if (!getUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
      }
      if (!content_.isEmpty()) {
        output.writeBytes(2, content_);
      }
      if (fetchTime_ != 0L) {
        output.writeUInt64(3, fetchTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
      }
      if (!content_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, content_);
      }
      if (fetchTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, fetchTime_);
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
      if (!(obj instanceof ir.co.realtime.websearcher.document.Document.Web)) {
        return super.equals(obj);
      }
      ir.co.realtime.websearcher.document.Document.Web other = (ir.co.realtime.websearcher.document.Document.Web) obj;

      if (!getUrl()
          .equals(other.getUrl())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (getFetchTime()
          != other.getFetchTime()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + FETCH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFetchTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ir.co.realtime.websearcher.document.Document.Web parseFrom(
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
    public static Builder newBuilder(ir.co.realtime.websearcher.document.Document.Web prototype) {
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
     * Protobuf type {@code Web}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Web)
        ir.co.realtime.websearcher.document.Document.WebOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ir.co.realtime.websearcher.document.Document.internal_static_Web_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ir.co.realtime.websearcher.document.Document.internal_static_Web_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ir.co.realtime.websearcher.document.Document.Web.class, ir.co.realtime.websearcher.document.Document.Web.Builder.class);
      }

      // Construct using ir.co.realtime.websearcher.document.Document.Web.newBuilder()
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
        url_ = "";

        content_ = com.google.protobuf.ByteString.EMPTY;

        fetchTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ir.co.realtime.websearcher.document.Document.internal_static_Web_descriptor;
      }

      @java.lang.Override
      public ir.co.realtime.websearcher.document.Document.Web getDefaultInstanceForType() {
        return ir.co.realtime.websearcher.document.Document.Web.getDefaultInstance();
      }

      @java.lang.Override
      public ir.co.realtime.websearcher.document.Document.Web build() {
        ir.co.realtime.websearcher.document.Document.Web result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ir.co.realtime.websearcher.document.Document.Web buildPartial() {
        ir.co.realtime.websearcher.document.Document.Web result = new ir.co.realtime.websearcher.document.Document.Web(this);
        result.url_ = url_;
        result.content_ = content_;
        result.fetchTime_ = fetchTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ir.co.realtime.websearcher.document.Document.Web) {
          return mergeFrom((ir.co.realtime.websearcher.document.Document.Web)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ir.co.realtime.websearcher.document.Document.Web other) {
        if (other == ir.co.realtime.websearcher.document.Document.Web.getDefaultInstance()) return this;
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
          onChanged();
        }
        if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
          setContent(other.getContent());
        }
        if (other.getFetchTime() != 0L) {
          setFetchTime(other.getFetchTime());
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
        ir.co.realtime.websearcher.document.Document.Web parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ir.co.realtime.websearcher.document.Document.Web) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <code>string url = 1;</code>
       * @return The url.
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string url = 1;</code>
       * @return The bytes for url.
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string url = 1;</code>
       * @param value The url to set.
       * @return This builder for chaining.
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string url = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string url = 1;</code>
       * @param value The bytes for url to set.
       * @return This builder for chaining.
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes content = 2;</code>
       * @return The content.
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <code>bytes content = 2;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes content = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      private long fetchTime_ ;
      /**
       * <code>uint64 fetch_time = 3;</code>
       * @return The fetchTime.
       */
      public long getFetchTime() {
        return fetchTime_;
      }
      /**
       * <code>uint64 fetch_time = 3;</code>
       * @param value The fetchTime to set.
       * @return This builder for chaining.
       */
      public Builder setFetchTime(long value) {
        
        fetchTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 fetch_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFetchTime() {
        
        fetchTime_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Web)
    }

    // @@protoc_insertion_point(class_scope:Web)
    private static final ir.co.realtime.websearcher.document.Document.Web DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ir.co.realtime.websearcher.document.Document.Web();
    }

    public static ir.co.realtime.websearcher.document.Document.Web getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Web>
        PARSER = new com.google.protobuf.AbstractParser<Web>() {
      @java.lang.Override
      public Web parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Web(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Web> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Web> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ir.co.realtime.websearcher.document.Document.Web getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Web_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Web_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016document.proto\"7\n\003Web\022\013\n\003url\030\001 \001(\t\022\017\n\007" +
      "content\030\002 \001(\014\022\022\n\nfetch_time\030\003 \001(\004B%\n#ir." +
      "co.realtime.websearcher.documentb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Web_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Web_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Web_descriptor,
        new java.lang.String[] { "Url", "Content", "FetchTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
