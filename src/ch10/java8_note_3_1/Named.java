package ch10.java8_note_3_1;

public interface Named {
    default String name() {
	return "(NONE)";
    }
}
