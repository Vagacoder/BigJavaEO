package ch10.java8_note_4;

/**
 * Describes any class whose objects can measure other objects.
 */
public interface Measurer {
    /**
     * Computes the measure of an object.
     * 
     * @param anObject
     *            the object to be measured
     * @return the measure
     */
    double measure(Object anObject);
}
