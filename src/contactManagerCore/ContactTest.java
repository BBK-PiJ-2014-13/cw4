package contactManagerCore;

import org.junit.Test;

public class ContactTest extends BasicTest {
	ContactImpl contact = new ContactImpl(10, "John");

	@Test
	public void testsGetId() {
		valueExpected = 10;
		valueActual = contact.getId();
		test();
	}

	@Test
	public void testsGetName() {
		valueExpected = "John";
		valueActual = contact.getName();
		test();
	}

	@Test
	public void testsGetNotes() {
		valueExpected = "";
		valueActual = contact.getNotes();
		test();
	}
	
	@Test
	public void testsAddNotes() {
		contact.addNotes("notes");
		valueExpected = "notes";
		valueActual = contact.getNotes();
		test();
	}
}
