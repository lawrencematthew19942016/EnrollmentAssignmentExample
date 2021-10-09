package org.enrollment.org;

import junit.framework.TestCase;

public class SubjectTest extends TestCase {
	Subject sub= new Subject();
	public void testSetSubjectCode() {
		String[] item=sub.getSubjectCode();
		String theItem=item[3];
		assertEquals("BIT111", theItem);
		String theItems=item[5];
		assertEquals("BIT121", theItems);
	}
		public void testSetSubjectName() {
            String[] item1=sub.getSubjectName();
            String theItem1=item1[3];
            assertEquals("Programming Concepts", theItem1);
            String theItem2=item1[5];
            assertEquals("Network Communication Concepts", theItem2);
    }

    public void testSetSemester() {
            int[] item1=sub.getSemester();
            int theItem1=item1[3];
            assertEquals(1, theItem1);
            int theItem2=item1[5];
            assertEquals(2, theItem2);
    }

}
