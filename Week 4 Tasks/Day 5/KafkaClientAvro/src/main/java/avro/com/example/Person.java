/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.com.example;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8423618237523517726L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"avro.com.example\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of User\",\"default\":\"\"},{\"name\":\"age\",\"type\":\"string\",\"doc\":\"Age of User\",\"default\":\"\"},{\"name\":\"weight\",\"type\":\"string\",\"doc\":\"Weight of User\",\"default\":\"\"},{\"name\":\"address\",\"type\":\"string\",\"doc\":\"Address of User\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Name of User */
   private java.lang.CharSequence name;
  /** Age of User */
   private java.lang.CharSequence age;
  /** Weight of User */
   private java.lang.CharSequence weight;
  /** Address of User */
   private java.lang.CharSequence address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Person() {}

  /**
   * All-args constructor.
   * @param name Name of User
   * @param age Age of User
   * @param weight Weight of User
   * @param address Address of User
   */
  public Person(java.lang.CharSequence name, java.lang.CharSequence age, java.lang.CharSequence weight, java.lang.CharSequence address) {
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
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: age = (java.lang.CharSequence)value$; break;
    case 2: weight = (java.lang.CharSequence)value$; break;
    case 3: address = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of User
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of User
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return Age of User
   */
  public java.lang.CharSequence getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * Age of User
   * @param value the value to set.
   */
  public void setAge(java.lang.CharSequence value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'weight' field.
   * @return Weight of User
   */
  public java.lang.CharSequence getWeight() {
    return weight;
  }

  /**
   * Sets the value of the 'weight' field.
   * Weight of User
   * @param value the value to set.
   */
  public void setWeight(java.lang.CharSequence value) {
    this.weight = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return Address of User
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * Address of User
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Creates a new Person RecordBuilder.
   * @return A new Person RecordBuilder
   */
  public static avro.com.example.Person.Builder newBuilder() {
    return new avro.com.example.Person.Builder();
  }

  /**
   * Creates a new Person RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Person RecordBuilder
   */
  public static avro.com.example.Person.Builder newBuilder(avro.com.example.Person.Builder other) {
    return new avro.com.example.Person.Builder(other);
  }

  /**
   * Creates a new Person RecordBuilder by copying an existing Person instance.
   * @param other The existing instance to copy.
   * @return A new Person RecordBuilder
   */
  public static avro.com.example.Person.Builder newBuilder(avro.com.example.Person other) {
    return new avro.com.example.Person.Builder(other);
  }

  /**
   * RecordBuilder for Person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person>
    implements org.apache.avro.data.RecordBuilder<Person> {

    /** Name of User */
    private java.lang.CharSequence name;
    /** Age of User */
    private java.lang.CharSequence age;
    /** Weight of User */
    private java.lang.CharSequence weight;
    /** Address of User */
    private java.lang.CharSequence address;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.com.example.Person.Builder other) {
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
     * Creates a Builder by copying an existing Person instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.com.example.Person other) {
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
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of User
      * @param value The value of 'name'.
      * @return This builder.
      */
    public avro.com.example.Person.Builder setName(java.lang.CharSequence value) {
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
    public avro.com.example.Person.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age of User
      * @return The value.
      */
    public java.lang.CharSequence getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age of User
      * @param value The value of 'age'.
      * @return This builder.
      */
    public avro.com.example.Person.Builder setAge(java.lang.CharSequence value) {
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
    public avro.com.example.Person.Builder clearAge() {
      age = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight of User
      * @return The value.
      */
    public java.lang.CharSequence getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight of User
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public avro.com.example.Person.Builder setWeight(java.lang.CharSequence value) {
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
    public avro.com.example.Person.Builder clearWeight() {
      weight = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * Address of User
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * Address of User
      * @param value The value of 'address'.
      * @return This builder.
      */
    public avro.com.example.Person.Builder setAddress(java.lang.CharSequence value) {
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
    public avro.com.example.Person.Builder clearAddress() {
      address = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Person build() {
      try {
        Person record = new Person();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.weight = fieldSetFlags()[2] ? this.weight : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.address = fieldSetFlags()[3] ? this.address : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}