/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.com.example.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7359723941350447574L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.example.avro\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Name of User\"},{\"name\":\"age\",\"type\":[\"int\",\"null\"],\"doc\":\"Age of User\"},{\"name\":\"weight\",\"type\":[\"int\",\"null\"],\"doc\":\"Weight of User\"},{\"name\":\"address\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Address of User\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Name of User */
  @Deprecated public java.lang.String name;
  /** Age of User */
  @Deprecated public java.lang.Integer age;
  /** Weight of User */
  @Deprecated public java.lang.Integer weight;
  /** Address of User */
  @Deprecated public java.lang.String address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param name Name of User
   * @param age Age of User
   * @param weight Weight of User
   * @param address Address of User
   */
  public User(java.lang.String name, java.lang.Integer age, java.lang.Integer weight, java.lang.String address) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.address = address;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return weight;
    case 3: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: weight = (java.lang.Integer)value$; break;
    case 3: address = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of User
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of User
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return Age of User
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * Age of User
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'weight' field.
   * @return Weight of User
   */
  public java.lang.Integer getWeight() {
    return weight;
  }

  /**
   * Sets the value of the 'weight' field.
   * Weight of User
   * @param value the value to set.
   */
  public void setWeight(java.lang.Integer value) {
    this.weight = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return Address of User
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * Address of User
   * @param value the value to set.
   */
  public void setAddress(java.lang.String value) {
    this.address = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static avro.com.example.avro.User.Builder newBuilder() {
    return new avro.com.example.avro.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static avro.com.example.avro.User.Builder newBuilder(avro.com.example.avro.User.Builder other) {
    return new avro.com.example.avro.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static avro.com.example.avro.User.Builder newBuilder(avro.com.example.avro.User other) {
    return new avro.com.example.avro.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    /** Name of User */
    private java.lang.String name;
    /** Age of User */
    private java.lang.Integer age;
    /** Weight of User */
    private java.lang.Integer weight;
    /** Address of User */
    private java.lang.String address;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.weight)) {
        this.weight = data().deepCopy(fields()[2].schema(), other.weight);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.com.example.avro.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.weight)) {
        this.weight = data().deepCopy(fields()[2].schema(), other.weight);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * Name of User
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of User
      * @param value The value of 'name'.
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Name of User
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * Name of User
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age of User
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age of User
      * @param value The value of 'age'.
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder setAge(java.lang.Integer value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Age of User
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * Age of User
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder clearAge() {
      age = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight of User
      * @return The value.
      */
    public java.lang.Integer getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight of User
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder setWeight(java.lang.Integer value) {
      validate(fields()[2], value);
      this.weight = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'weight' field has been set.
      * Weight of User
      * @return True if the 'weight' field has been set, false otherwise.
      */
    public boolean hasWeight() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'weight' field.
      * Weight of User
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder clearWeight() {
      weight = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * Address of User
      * @return The value.
      */
    public java.lang.String getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * Address of User
      * @param value The value of 'address'.
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder setAddress(java.lang.String value) {
      validate(fields()[3], value);
      this.address = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * Address of User
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'address' field.
      * Address of User
      * @return This builder.
      */
    public avro.com.example.avro.User.Builder clearAddress() {
      address = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.weight = fieldSetFlags()[2] ? this.weight : (java.lang.Integer) defaultValue(fields()[2]);
        record.address = fieldSetFlags()[3] ? this.address : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
