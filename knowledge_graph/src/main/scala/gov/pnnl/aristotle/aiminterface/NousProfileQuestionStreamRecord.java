/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package gov.pnnl.aristotle.aiminterface;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NousProfileQuestionStreamRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NousProfileQuestionStreamRecord\",\"namespace\":\"gov.pnnl.aristotle.aiminterface\",\"fields\":[{\"name\":\"version\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"source\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int version;
  @Deprecated public java.lang.String uuid;
  @Deprecated public long timestamp;
  @Deprecated public java.lang.String source;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public NousProfileQuestionStreamRecord() {}

  /**
   * All-args constructor.
   */
  public NousProfileQuestionStreamRecord(java.lang.Integer version, java.lang.String uuid, java.lang.Long timestamp, java.lang.String source) {
    this.version = version;
    this.uuid = uuid;
    this.timestamp = timestamp;
    this.source = source;
  }

  @Override
public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  @Override
public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return version;
    case 1: return uuid;
    case 2: return timestamp;
    case 3: return source;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @Override
@SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: version = (java.lang.Integer)value$; break;
    case 1: uuid = value$.toString(); break;
    case 2: timestamp = (java.lang.Long)value$; break;
    case 3: source = value$.toString(); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'uuid' field.
   */
  public java.lang.String getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.String value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'source' field.
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.String value) {
    this.source = value;
  }

  /** Creates a new NousProfileQuestionStreamRecord RecordBuilder */
  public static gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder newBuilder() {
    return new gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder();
  }
  
  /** Creates a new NousProfileQuestionStreamRecord RecordBuilder by copying an existing Builder */
  public static gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder newBuilder(gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder other) {
    return new gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder(other);
  }
  
  /** Creates a new NousProfileQuestionStreamRecord RecordBuilder by copying an existing NousProfileQuestionStreamRecord instance */
  public static gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder newBuilder(gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord other) {
    return new gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for NousProfileQuestionStreamRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NousProfileQuestionStreamRecord>
    implements org.apache.avro.data.RecordBuilder<NousProfileQuestionStreamRecord> {

    private int version;
    private java.lang.String uuid;
    private long timestamp;
    private java.lang.String source;

    /** Creates a new Builder */
    private Builder() {
      super(gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.uuid)) {
        this.uuid = data().deepCopy(fields()[1].schema(), other.uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source)) {
        this.source = data().deepCopy(fields()[3].schema(), other.source);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing NousProfileQuestionStreamRecord instance */
    private Builder(gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord other) {
            super(gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.uuid)) {
        this.uuid = data().deepCopy(fields()[1].schema(), other.uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source)) {
        this.source = data().deepCopy(fields()[3].schema(), other.source);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'version' field */
    public java.lang.Integer getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder setVersion(int value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'version' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder clearVersion() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'uuid' field */
    public java.lang.String getUuid() {
      return uuid;
    }
    
    /** Sets the value of the 'uuid' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder setUuid(java.lang.String value) {
      validate(fields()[1], value);
      this.uuid = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'uuid' field has been set */
    public boolean hasUuid() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'uuid' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timestamp' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'source' field */
    public java.lang.String getSource() {
      return source;
    }
    
    /** Sets the value of the 'source' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder setSource(java.lang.String value) {
      validate(fields()[3], value);
      this.source = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'source' field has been set */
    public boolean hasSource() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'source' field */
    public gov.pnnl.aristotle.aiminterface.NousProfileQuestionStreamRecord.Builder clearSource() {
      source = null;
      fieldSetFlags()[3] = false;
      return this;
    }


    public NousProfileQuestionStreamRecord build() {
      try {
        NousProfileQuestionStreamRecord record = new NousProfileQuestionStreamRecord();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.Integer) defaultValue(fields()[0]);
        record.uuid = fieldSetFlags()[1] ? this.uuid : (java.lang.String) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.source = fieldSetFlags()[3] ? this.source : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
