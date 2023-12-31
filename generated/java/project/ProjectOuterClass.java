// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: project/project.proto

// Protobuf Java Version: 3.25.1
package project;

public final class ProjectOuterClass {
  private ProjectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProjectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:project.Project)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 timeline = 2;</code>
     * @return The timeline.
     */
    int getTimeline();

    /**
     * <code>string tutor = 3;</code>
     * @return The tutor.
     */
    java.lang.String getTutor();
    /**
     * <code>string tutor = 3;</code>
     * @return The bytes for tutor.
     */
    com.google.protobuf.ByteString
        getTutorBytes();
  }
  /**
   * Protobuf type {@code project.Project}
   */
  public static final class Project extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:project.Project)
      ProjectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Project.newBuilder() to construct.
    private Project(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Project() {
      name_ = "";
      tutor_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Project();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return project.ProjectOuterClass.internal_static_project_Project_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return project.ProjectOuterClass.internal_static_project_Project_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              project.ProjectOuterClass.Project.class, project.ProjectOuterClass.Project.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMELINE_FIELD_NUMBER = 2;
    private int timeline_ = 0;
    /**
     * <code>int32 timeline = 2;</code>
     * @return The timeline.
     */
    @java.lang.Override
    public int getTimeline() {
      return timeline_;
    }

    public static final int TUTOR_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object tutor_ = "";
    /**
     * <code>string tutor = 3;</code>
     * @return The tutor.
     */
    @java.lang.Override
    public java.lang.String getTutor() {
      java.lang.Object ref = tutor_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tutor_ = s;
        return s;
      }
    }
    /**
     * <code>string tutor = 3;</code>
     * @return The bytes for tutor.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTutorBytes() {
      java.lang.Object ref = tutor_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tutor_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (timeline_ != 0) {
        output.writeInt32(2, timeline_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tutor_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tutor_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (timeline_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, timeline_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tutor_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tutor_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof project.ProjectOuterClass.Project)) {
        return super.equals(obj);
      }
      project.ProjectOuterClass.Project other = (project.ProjectOuterClass.Project) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getTimeline()
          != other.getTimeline()) return false;
      if (!getTutor()
          .equals(other.getTutor())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + TIMELINE_FIELD_NUMBER;
      hash = (53 * hash) + getTimeline();
      hash = (37 * hash) + TUTOR_FIELD_NUMBER;
      hash = (53 * hash) + getTutor().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static project.ProjectOuterClass.Project parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static project.ProjectOuterClass.Project parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static project.ProjectOuterClass.Project parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static project.ProjectOuterClass.Project parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static project.ProjectOuterClass.Project parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static project.ProjectOuterClass.Project parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static project.ProjectOuterClass.Project parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static project.ProjectOuterClass.Project parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static project.ProjectOuterClass.Project parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static project.ProjectOuterClass.Project parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static project.ProjectOuterClass.Project parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static project.ProjectOuterClass.Project parseFrom(
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
    public static Builder newBuilder(project.ProjectOuterClass.Project prototype) {
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
     * Protobuf type {@code project.Project}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:project.Project)
        project.ProjectOuterClass.ProjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return project.ProjectOuterClass.internal_static_project_Project_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return project.ProjectOuterClass.internal_static_project_Project_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                project.ProjectOuterClass.Project.class, project.ProjectOuterClass.Project.Builder.class);
      }

      // Construct using project.ProjectOuterClass.Project.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        timeline_ = 0;
        tutor_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return project.ProjectOuterClass.internal_static_project_Project_descriptor;
      }

      @java.lang.Override
      public project.ProjectOuterClass.Project getDefaultInstanceForType() {
        return project.ProjectOuterClass.Project.getDefaultInstance();
      }

      @java.lang.Override
      public project.ProjectOuterClass.Project build() {
        project.ProjectOuterClass.Project result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public project.ProjectOuterClass.Project buildPartial() {
        project.ProjectOuterClass.Project result = new project.ProjectOuterClass.Project(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(project.ProjectOuterClass.Project result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.timeline_ = timeline_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.tutor_ = tutor_;
        }
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
        if (other instanceof project.ProjectOuterClass.Project) {
          return mergeFrom((project.ProjectOuterClass.Project)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(project.ProjectOuterClass.Project other) {
        if (other == project.ProjectOuterClass.Project.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getTimeline() != 0) {
          setTimeline(other.getTimeline());
        }
        if (!other.getTutor().isEmpty()) {
          tutor_ = other.tutor_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                timeline_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                tutor_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int timeline_ ;
      /**
       * <code>int32 timeline = 2;</code>
       * @return The timeline.
       */
      @java.lang.Override
      public int getTimeline() {
        return timeline_;
      }
      /**
       * <code>int32 timeline = 2;</code>
       * @param value The timeline to set.
       * @return This builder for chaining.
       */
      public Builder setTimeline(int value) {

        timeline_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 timeline = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeline() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timeline_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object tutor_ = "";
      /**
       * <code>string tutor = 3;</code>
       * @return The tutor.
       */
      public java.lang.String getTutor() {
        java.lang.Object ref = tutor_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tutor_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string tutor = 3;</code>
       * @return The bytes for tutor.
       */
      public com.google.protobuf.ByteString
          getTutorBytes() {
        java.lang.Object ref = tutor_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tutor_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tutor = 3;</code>
       * @param value The tutor to set.
       * @return This builder for chaining.
       */
      public Builder setTutor(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        tutor_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string tutor = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTutor() {
        tutor_ = getDefaultInstance().getTutor();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string tutor = 3;</code>
       * @param value The bytes for tutor to set.
       * @return This builder for chaining.
       */
      public Builder setTutorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        tutor_ = value;
        bitField0_ |= 0x00000004;
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


      // @@protoc_insertion_point(builder_scope:project.Project)
    }

    // @@protoc_insertion_point(class_scope:project.Project)
    private static final project.ProjectOuterClass.Project DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new project.ProjectOuterClass.Project();
    }

    public static project.ProjectOuterClass.Project getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Project>
        PARSER = new com.google.protobuf.AbstractParser<Project>() {
      @java.lang.Override
      public Project parsePartialFrom(
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

    public static com.google.protobuf.Parser<Project> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Project> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public project.ProjectOuterClass.Project getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_project_Project_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_project_Project_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025project/project.proto\022\007project\"8\n\007Proj" +
      "ect\022\014\n\004name\030\001 \001(\t\022\020\n\010timeline\030\002 \001(\005\022\r\n\005t" +
      "utor\030\003 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_project_Project_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_project_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_project_Project_descriptor,
        new java.lang.String[] { "Name", "Timeline", "Tutor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
